import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import output.PythonDataWriter;
import runtime.PythonContextEvaluator;
import runtime.PythonContextEvaluator.RenderCall;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Dev server for the generated site. GET serves output/; a POST to a generated page (or a GET
// to a redirect-only route such as /delete/3) runs the route with our evaluator, rewrites data.py,
// regenerates the site and redirects. Usage: java DevServer [projectDir] [outputRoot] [port]
public class DevServer {

    private final Path project, outputRoot, outputDir;
    private Main.CompileResult current;

    public static void main(String[] args) throws Exception {
        Path project = Paths.get(args.length > 0 ? args[0] : "../PROJECT1").toAbsolutePath().normalize();
        Path outputRoot = args.length > 1 ? Paths.get(args[1]).toAbsolutePath().normalize() : project.getParent();
        int port = args.length > 2 ? Integer.parseInt(args[2]) : 8000;
        new DevServer(project, outputRoot).start(port);
    }

    DevServer(Path project, Path outputRoot) {
        this.project = project;
        this.outputRoot = outputRoot;
        this.outputDir = outputRoot.resolve("output");
    }

    void start(int port) throws IOException {
        System.out.println("=== Initial compilation ===");
        current = Main.compile(project, outputRoot, false, false);
        if (current.exitCode != 0) System.out.println("WARNING: the project has errors; fix them and reload.");

        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", this::handle);
        server.setExecutor(Executors.newSingleThreadExecutor());   // one request at a time, compiles must not overlap
        server.start();
        System.out.println("\nLive site: http://localhost:" + port + "/   (Ctrl+C to stop)");
        System.out.println("Every add / edit / delete runs the route in the evaluator, rewrites the data module, regenerates output/ and redirects.\n");
    }

    private void handle(HttpExchange ex) throws IOException {
        String method = ex.getRequestMethod();
        String path = ex.getRequestURI().getPath();
        try {
            if (path.equals("/")) { redirect(ex, "/index.html"); return; }
            String name = path.substring(1);

            // 1. form posted to a generated page: run the route that produced it
            if (method.equalsIgnoreCase("POST") && current.pages.containsKey(name)) {
                RenderCall rc = current.pages.get(name);
                Map<String, Object> form = parseForm(new String(ex.getRequestBody().readAllBytes(), StandardCharsets.UTF_8));
                runRouteAndRegenerate(ex, rc.endpoint, rc.sampleParams, "POST", form);
                return;
            }

            // 2. a route path such as /delete/3
            Map.Entry<String, Map<String, Object>> match = matchRoute(path);
            if (match != null) {
                runRouteAndRegenerate(ex, match.getKey(), match.getValue(), method, new LinkedHashMap<>());
                return;
            }

            // 3. plain file from output/
            Path file = outputDir.resolve(name).normalize();
            if (!file.startsWith(outputDir) || !Files.isRegularFile(file)) { send(ex, 404, "text/plain", "Not found: " + path); return; }
            byte[] body = Files.readAllBytes(file);
            ex.getResponseHeaders().set("Content-Type", contentType(name));
            ex.getResponseHeaders().set("Cache-Control", "no-store");
            ex.sendResponseHeaders(200, body.length);
            try (OutputStream os = ex.getResponseBody()) { os.write(body); }
        } catch (Exception e) {
            e.printStackTrace();
            send(ex, 500, "text/plain", "Error: " + e.getMessage());
        }
    }

    // run the route, persist the data module, regenerate, redirect
    private void runRouteAndRegenerate(HttpExchange ex, String endpoint, Map<String, Object> params, String method, Map<String, Object> form) throws IOException {
        System.out.println("\n=== " + method + " " + ex.getRequestURI().getPath() + " -> " + endpoint + "(" + params + ")" + (form.isEmpty() ? "" : " form=" + form) + " ===");

        // fresh evaluator so module state matches what is on disk
        PythonContextEvaluator evaluator = new PythonContextEvaluator(current.evaluator.getModules(), new ArrayList<>());
        Object result = evaluator.invokeRoute(endpoint, params, method, form);

        // persist every data module (every .py except app.py)
        int persisted = 0;
        for (String module : current.evaluator.getModules().keySet()) {
            if (module.equals("app")) continue;
            Map<String, Object> data = evaluator.snapshotModule(module);
            if (data == null || data.isEmpty()) continue;
            Files.write(project.resolve(module + ".py"), PythonDataWriter.module(data).getBytes(StandardCharsets.UTF_8));
            System.out.println("persisted " + module + ".py");
            persisted++;
        }
        if (persisted == 0) System.out.println("WARNING: no data module to persist (put the data in data.py) - the change will not survive regeneration");

        // regenerate from the updated sources
        current = Main.compile(project, outputRoot, false, false);
        if (current.exitCode != 0) {
            String report = new String(Files.readAllBytes(outputRoot.resolve("compiler_output/semantic_report.txt")), StandardCharsets.UTF_8);
            send(ex, 500, "text/plain", "Regeneration failed:\n\n" + report);
            return;
        }

        // redirect to the page the route redirected to, else the one it rendered
        String target = "/index.html";
        String redirectedTo = evaluator.getLastRedirect();
        if (redirectedTo != null && current.endpointToTemplate.containsKey(redirectedTo))
            target = "/" + Main.pageName(current.endpointToTemplate.get(redirectedTo), evaluator.getLastRedirectParams());
        else if (result != null && result.toString().startsWith("<render ")) target = "/" + Main.pageName(result.toString().substring(8, result.toString().length() - 1), params);
        System.out.println("redirect -> " + target);
        redirect(ex, target);
    }

    private Map.Entry<String, Map<String, Object>> matchRoute(String path) {
        for (Map.Entry<String, String> r : current.evaluator.getRoutes().entrySet()) {
            String pattern = r.getValue();
            List<String> names = new ArrayList<>();
            Matcher m = Pattern.compile("<(?:(\\w+):)?(\\w+)>").matcher(pattern);
            StringBuffer regex = new StringBuffer();
            while (m.find()) { names.add(m.group(2)); m.appendReplacement(regex, "int".equals(m.group(1)) ? "(\\\\d+)" : "([^/]+)"); }
            m.appendTail(regex);
            Matcher pm = Pattern.compile("^" + regex + "/?$").matcher(path);
            if (!pm.matches()) continue;
            Map<String, Object> params = new LinkedHashMap<>();
            for (int i = 0; i < names.size(); i++) {
                String v = pm.group(i + 1);
                params.put(names.get(i), v.matches("-?\\d+") ? (Object) Long.parseLong(v) : v);
            }
            return new AbstractMap.SimpleEntry<>(r.getKey(), params);
        }
        return null;
    }

    private static Map<String, Object> parseForm(String body) throws IOException {
        Map<String, Object> form = new LinkedHashMap<>();
        if (body == null || body.isEmpty()) return form;
        for (String pair : body.split("&")) {
            int eq = pair.indexOf('=');
            String k = URLDecoder.decode(eq < 0 ? pair : pair.substring(0, eq), "UTF-8");
            String v = eq < 0 ? "" : URLDecoder.decode(pair.substring(eq + 1), "UTF-8");
            form.put(k, v);
        }
        return form;
    }

    private static void redirect(HttpExchange ex, String location) throws IOException {
        ex.getResponseHeaders().set("Location", location);
        ex.sendResponseHeaders(303, -1);
        ex.close();
    }

    private static void send(HttpExchange ex, int status, String type, String text) throws IOException {
        byte[] b = text.getBytes(StandardCharsets.UTF_8);
        ex.getResponseHeaders().set("Content-Type", type + "; charset=utf-8");
        ex.sendResponseHeaders(status, b.length);
        try (OutputStream os = ex.getResponseBody()) { os.write(b); }
    }

    private static String contentType(String name) {
        String n = name.toLowerCase();
        if (n.endsWith(".html")) return "text/html; charset=utf-8";
        if (n.endsWith(".css")) return "text/css";
        if (n.endsWith(".js")) return "application/javascript";
        if (n.endsWith(".png")) return "image/png";
        if (n.endsWith(".jpg") || n.endsWith(".jpeg")) return "image/jpeg";
        if (n.endsWith(".svg")) return "image/svg+xml";
        if (n.endsWith(".py")) return "text/plain; charset=utf-8";
        return "application/octet-stream";
    }
}
