import ast.Node;
import output.AstJsonSerializer;
import output.CompilerReport;
import python.ast.ASTNode;
import runtime.JinjaRenderer;
import runtime.PythonContextEvaluator;
import runtime.PythonContextEvaluator.RenderCall;
import symboltable.SymbolTable;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * Flask + Jinja translator.
 *
 * Input  (project folder):  app.py [+ other .py modules], templates/*.jinja, static/style.css, static/script.js
 * Output (output/):         one generated .html per rendered template + app.py, style.css, script.js copied as-is
 *         (compiler_output/): ast_python.json, ast_jinja.json, semantic_report.txt, generation_log.txt
 *
 * Pipeline:  Python -> parser -> AST -> semantic analysis -> evaluator (context data)
 *            Jinja  -> parser -> AST -> semantic analysis -> renderer (variables substituted) -> HTML
 *
 * Usage: java Main [projectDir] [outputRoot] [--verbose] [--force]
 *   projectDir  folder with app.py, templates/, static/           (default: ../PROJECT1)
 *   outputRoot  where output/ and compiler_output/ are created   (default: parent of projectDir)
 *   --verbose   print the ASTs and the symbol table to the console
 *   --force     generate HTML even if semantic errors were found
 */
public class Main {

    /** Everything a caller (the test scripts, DevServer) may need after a compilation. */
    public static class CompileResult {
        public int exitCode;
        public CompilerReport report;
        public PythonContextEvaluator evaluator;
        public Map<String, RenderCall> pages = new LinkedHashMap<>();   // generated page name -> the call that produced it
        public Map<String, String> endpointToPage = new LinkedHashMap<>(); // endpoint -> unsuffixed page name
        public Map<String, String> endpointToTemplate = new LinkedHashMap<>(); // endpoint -> template it renders
    }

    public static void main(String[] args) {
        String projectArg = null, outputArg = null;
        boolean verbose = false, force = false;
        for (String a : args) {
            if (a.equals("--verbose")) verbose = true;
            else if (a.equals("--force")) force = true;
            else if (projectArg == null) projectArg = a;
            else outputArg = a;
        }
        Path project = Paths.get(projectArg != null ? projectArg : "../PROJECT1").toAbsolutePath().normalize();
        Path outputRoot = outputArg != null ? Paths.get(outputArg).toAbsolutePath().normalize()
                : (project.getParent() != null ? project.getParent() : project);

        try {
            int exit = compile(project, outputRoot, verbose, force).exitCode;
            System.exit(exit);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(2);
        }
    }

    public static CompileResult compile(Path project, Path outputRoot, boolean verbose, boolean force) throws IOException {
        CompileResult result = new CompileResult();
        CompilerReport report = new CompilerReport();
        result.report = report;
        SymbolTable globalSymTab = new SymbolTable();
        Path outputDir = outputRoot.resolve("output");
        Path compilerOutputDir = outputRoot.resolve("compiler_output");
        Files.createDirectories(outputDir);
        Files.createDirectories(compilerOutputDir);

        report.log("Project folder : " + project);
        report.log("Output folder  : " + outputDir);
        report.log("Reports folder : " + compilerOutputDir);

        /* ---------------- 1. Discover input files ---------------- */
        Path appPy = project.resolve("app.py");
        if (!Files.exists(appPy)) {
            report.syntaxError("app.py", "not found in " + project);
            finish(report, compilerOutputDir);
            result.exitCode = 1;
            return result;
        }
        List<Path> pythonFiles = new ArrayList<>();
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(project, "*.py")) { for (Path p : ds) pythonFiles.add(p); }
        pythonFiles.sort(Comparator.comparing(p -> p.getFileName().toString()));

        List<Path> templateFiles = new ArrayList<>();
        Path templatesDir = project.resolve("templates");
        if (Files.isDirectory(templatesDir)) {
            try (DirectoryStream<Path> ds = Files.newDirectoryStream(templatesDir, "*.{jinja,jinja2,html,htm}")) { for (Path p : ds) templateFiles.add(p); }
        }
        templateFiles.sort(Comparator.comparing(p -> p.getFileName().toString()));

        Path staticDir = project.resolve("static");
        List<Path> cssFiles = new ArrayList<>();
        if (Files.isDirectory(staticDir)) {
            try (DirectoryStream<Path> ds = Files.newDirectoryStream(staticDir, "*.css")) { for (Path p : ds) cssFiles.add(p); }
        }
        if (Files.exists(project.resolve("style.css"))) cssFiles.add(project.resolve("style.css"));

        report.log("Python files   : " + names(pythonFiles));
        report.log("Templates      : " + names(templateFiles));
        report.log("CSS files      : " + names(cssFiles));

        /* ---------------- 2. Python: parse + semantic analysis ---------------- */
        report.log("");
        report.log("=== Phase 1: Python (Flask) parsing and semantic analysis ===");
        Map<String, ASTNode> pythonAsts = new LinkedHashMap<>();
        // parse app.py last so that imported modules (data.py) are already in the symbol table
        List<Path> ordered = new ArrayList<>(pythonFiles);
        ordered.remove(appPy); ordered.add(appPy);
        for (Path p : ordered) {
            String module = stripExt(p.getFileName().toString());
            ASTNode ast = ASTPython.parseFile(p.toString(), globalSymTab, report, verbose);
            pythonAsts.put(module, ast);
            report.log("parsed " + p.getFileName() + (ast != null ? "" : " (failed)"));
        }

        /* ---------------- 3. Jinja: parse ---------------- */
        report.log("");
        report.log("=== Phase 2: Jinja template parsing ===");
        Map<String, Node> templateAsts = new LinkedHashMap<>();
        for (Path t : templateFiles) {
            String name = t.getFileName().toString();
            try {
                Node ast = ASTHtmlJinja.parseOnly(t.toString(), report, verbose);
                templateAsts.put(name, ast);
                report.log("parsed " + name);
            } catch (IOException e) {
                report.syntaxError(name, "cannot read file: " + e.getMessage());
            }
        }

        /* ---------------- 4. CSS: parse ---------------- */
        for (Path c : cssFiles) {
            try {
                ASTCss.parseFile(c.toString(), globalSymTab, report, verbose);
                report.log("parsed " + c.getFileName());
            } catch (IOException e) {
                report.syntaxError(c.getFileName().toString(), "cannot read file: " + e.getMessage());
            }
        }

        /* ---------------- 5. Evaluate Python -> context data ---------------- */
        report.log("");
        report.log("=== Phase 3: Evaluating Python data and render_template() calls ===");
        List<String> evalLog = new ArrayList<>();
        PythonContextEvaluator evaluator = new PythonContextEvaluator(pythonAsts, evalLog);
        result.evaluator = evaluator;
        if (pythonAsts.get("app") != null) {
            try { evaluator.run("app"); }
            catch (RuntimeException e) { report.semanticError("app.py", "evaluation failed: " + e.getMessage()); }
        }
        for (String l : evalLog) report.log("  " + l);
        for (Map.Entry<String, String> r : evaluator.getRoutes().entrySet()) report.log("  route " + r.getValue() + " -> " + r.getKey() + "()");

        // template name -> variables provided by Python
        Map<String, Set<String>> contextVars = new LinkedHashMap<>();
        Set<String> allVars = new LinkedHashSet<>();
        for (RenderCall rc : evaluator.getRenderCalls()) {
            contextVars.computeIfAbsent(rc.template, k -> new LinkedHashSet<>()).addAll(rc.context.keySet());
            allVars.addAll(rc.context.keySet());
        }

        /* ---------------- 6. Jinja: semantic analysis with the real context ---------------- */
        report.log("");
        report.log("=== Phase 4: Jinja semantic analysis ===");
        for (Map.Entry<String, Node> e : templateAsts.entrySet()) {
            String name = e.getKey();
            Set<String> vars = contextVars.get(name);
            if (vars == null) {
                // base/partial templates are never rendered directly: check them against everything any page receives
                vars = allVars;
                report.log("  " + name + " is not rendered directly (layout/partial); checked against " + vars);
            } else {
                report.log("  " + name + " context: " + vars);
            }
            ASTHtmlJinja.analyze(e.getValue(), name, globalSymTab, vars, report);
        }
        for (RenderCall rc : evaluator.getRenderCalls()) {
            if (!templateAsts.containsKey(rc.template)) report.semanticError("app.py", rc.endpoint + "() renders '" + rc.template + "' but that template does not exist in templates/");
        }
        if (verbose) globalSymTab.printSymbolTable();

        /* ---------------- 7. Analysis outputs ---------------- */
        writeJson(compilerOutputDir.resolve("ast_python.json"), pythonAsts, report);
        writeJson(compilerOutputDir.resolve("ast_jinja.json"), templateAsts, report);

        report.log("");
        report.log("Syntax errors: " + report.getSyntaxErrors().size() + ", semantic errors: " + report.getSemanticErrors().size());

        boolean canGenerate = report.getSyntaxErrors().isEmpty() && (report.getSemanticErrors().isEmpty() || force);
        if (!canGenerate) {
            report.log("Code generation skipped because of errors (see semantic_report.txt)." + (report.getSyntaxErrors().isEmpty() ? " Use --force to generate anyway." : ""));
            finish(report, compilerOutputDir);
            result.exitCode = 1;
            return result;
        }
        if (!report.getSemanticErrors().isEmpty()) report.log("--force: generating despite semantic errors");

        /* ---------------- 8. Generation: render templates with the context data ---------------- */
        report.log("");
        report.log("=== Phase 5: Code generation (Jinja AST + context data -> HTML) ===");
        List<String> renderLog = new ArrayList<>();
        JinjaRenderer renderer = new JinjaRenderer(templateAsts, renderLog);

        // url_for(endpoint, **values): static files are copied next to the pages; pages link to the generated html.
        // A route with a parameter has one page per value: edit_product_1.html, edit_product_2.html, ...
        Map<String, String> endpointToTemplate = new LinkedHashMap<>();
        for (RenderCall rc : evaluator.getRenderCalls()) endpointToTemplate.putIfAbsent(rc.endpoint, rc.template);
        for (Map.Entry<String, String> e : endpointToTemplate.entrySet()) result.endpointToPage.put(e.getKey(), htmlName(e.getValue()));
        result.endpointToTemplate.putAll(endpointToTemplate);
        Map<String, String> routes = evaluator.getRoutes();
        renderer.registerFunction("url_for", fargs -> {
            List<Object> a = new ArrayList<>(fargs);
            Map<String, Object> kw = !a.isEmpty() && a.get(a.size() - 1) instanceof Map ? (Map<String, Object>) a.remove(a.size() - 1) : new LinkedHashMap<>();
            String endpoint = a.isEmpty() ? "" : String.valueOf(a.get(0));
            if (endpoint.equals("static")) return String.valueOf(kw.getOrDefault("filename", ""));
            if (endpointToTemplate.containsKey(endpoint)) return pageName(endpointToTemplate.get(endpoint), kw);
            String path = routes.getOrDefault(endpoint, "/" + endpoint);
            for (Map.Entry<String, Object> e : kw.entrySet()) path = path.replaceAll("<[^>]*:" + e.getKey() + ">|<" + e.getKey() + ">", String.valueOf(e.getValue()));
            return path;
        });

        int generated = 0;
        Set<String> unsuffixedWritten = new HashSet<>();
        for (RenderCall rc : evaluator.getRenderCalls()) {
            String outName = pageName(rc.template, rc.sampleParams);
            report.log("rendering " + rc.template + " -> " + outName + "   [context: " + describe(rc.context) + "]");
            renderLog.clear();
            try {
                String html = renderer.render(rc.template, rc.context);
                Files.write(outputDir.resolve(outName), html.getBytes(StandardCharsets.UTF_8));
                result.pages.put(outName, rc);
                for (String l : renderLog) report.log(l);
                report.log("  wrote " + outName + " (" + html.length() + " chars)");
                generated++;
                // the spec names the page after the template (edit_product.html): keep that name for the first value
                String plain = htmlName(rc.template);
                if (!plain.equals(outName) && unsuffixedWritten.add(plain)) {
                    Files.write(outputDir.resolve(plain), html.getBytes(StandardCharsets.UTF_8));
                    result.pages.put(plain, rc);
                    report.log("  also wrote " + plain + " (same content as " + outName + ")");
                }
            } catch (RuntimeException e) {
                for (String l : renderLog) report.log(l);
                report.semanticError(rc.template, "rendering failed: " + e.getMessage());
            }
        }
        for (String w : renderer.getWarnings()) report.warning("generation", w);

        /* ---------------- 9. Copy the supporting files untouched ---------------- */
        report.log("");
        report.log("=== Phase 6: Copying supporting files (not processed) ===");
        for (Path p : pythonFiles) copy(p, outputDir.resolve(p.getFileName().toString()), report);
        if (Files.isDirectory(staticDir)) copyTree(staticDir, outputDir, report);
        for (String extra : new String[] { "style.css", "script.js" }) {
            Path src = project.resolve(extra);
            if (Files.exists(src) && !Files.exists(outputDir.resolve(extra))) copy(src, outputDir.resolve(extra), report);
        }

        report.log("");
        report.log("Done: " + generated + " page(s) generated in " + outputDir);
        finish(report, compilerOutputDir);
        result.exitCode = report.hasErrors() ? 1 : 0;
        return result;
    }

    /** index.jinja -> index.html ; edit_product.jinja + {product_id=2} -> edit_product_2.html */
    static String pageName(String template, Map<String, Object> params) {
        StringBuilder sb = new StringBuilder(stripExt(template));
        if (params != null) for (Object v : params.values()) if (v != null) sb.append('_').append(String.valueOf(v).replaceAll("[^A-Za-z0-9_-]", "_"));
        return sb + ".html";
    }

    /* ------------------------------------------------------------------ */

    private static void finish(CompilerReport report, Path compilerOutputDir) throws IOException {
        report.writeSemanticReport(compilerOutputDir.resolve("semantic_report.txt"));
        report.writeGenerationLog(compilerOutputDir.resolve("generation_log.txt"));
        System.out.println("\nReports written to " + compilerOutputDir);
    }

    private static void writeJson(Path path, Map<String, ?> asts, CompilerReport report) throws IOException {
        String json = new AstJsonSerializer().toJson(asts);
        Files.write(path, json.getBytes(StandardCharsets.UTF_8));
        report.log("wrote " + path.getFileName() + " (" + json.length() + " chars)");
    }

    private static void copy(Path src, Path dst, CompilerReport report) throws IOException {
        Files.createDirectories(dst.getParent());
        Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
        report.log("copied " + src.getFileName() + " -> " + dst.getFileName());
    }

    private static void copyTree(Path srcDir, Path dstDir, CompilerReport report) throws IOException {
        try (java.util.stream.Stream<Path> s = Files.walk(srcDir)) {
            for (Path p : (Iterable<Path>) s::iterator) {
                if (Files.isDirectory(p)) continue;
                Path rel = srcDir.relativize(p);
                Path dst = dstDir.resolve(rel.toString());
                Files.createDirectories(dst.getParent());
                Files.copy(p, dst, StandardCopyOption.REPLACE_EXISTING);
                String r = rel.toString().replace(File.separatorChar, '/');
                report.log("copied static/" + r + " -> " + r);
            }
        }
    }

    private static String htmlName(String template) { return stripExt(template) + ".html"; }
    private static String stripExt(String name) { int i = name.lastIndexOf('.'); return i > 0 ? name.substring(0, i) : name; }
    private static List<String> names(List<Path> ps) { List<String> out = new ArrayList<>(); for (Path p : ps) out.add(p.getFileName().toString()); return out; }

    private static String describe(Map<String, Object> ctx) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> e : ctx.entrySet()) {
            if (sb.length() > 0) sb.append(", ");
            Object v = e.getValue();
            String desc = v instanceof List ? "list[" + ((List<?>) v).size() + "]" : v instanceof Map ? "dict" + ((Map<?, ?>) v).keySet() : PythonContextEvaluator.stringify(v);
            sb.append(e.getKey()).append('=').append(desc);
        }
        return sb.toString();
    }
}
