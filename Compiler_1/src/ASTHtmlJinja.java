import antlr.HtmlJinjaLexer;
import antlr.HtmlJinjaParser;
import ast.Node;
import builder.ASTBuilder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import output.CompilerReport;
import semantic.JinjaSemanticAnalyzer;
import symboltable.SymbolTable;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

// Front end for HTML/Jinja templates: lexer -> parser -> AST -> semantic analysis
public class ASTHtmlJinja {

    // old entry point
    public static Node parseFile(String path, SymbolTable globalSymTab) throws Exception {
        return parseFile(path, globalSymTab, new CompilerReport(), true);
    }

    // parse only: the semantic check needs the context first
    public static Node parseOnly(String path, CompilerReport report, boolean printTree) throws IOException {
        String fileName = new java.io.File(path).getName();
        CharStream input = fromFileName(path);
        HtmlJinjaLexer lexer = new HtmlJinjaLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(report.listenerFor(fileName));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HtmlJinjaParser parser = new HtmlJinjaParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(report.listenerFor(fileName));

        ParseTree tree = parser.htmlDocument();
        Node ast = new ASTBuilder().buildHtml(tree);
        report.fileAnalyzed(fileName);
        if (printTree) {
            System.out.println("============================== [ AST: " + fileName + " ] ==============================");
            System.out.println(ast);
        }
        return ast;
    }

    // Jinja semantic check with the variables Python passes to this template
    public static void analyze(Node ast, String fileName, SymbolTable globalSymTab, Set<String> contextVars, CompilerReport report) {
        if (ast == null) return;
        JinjaSemanticAnalyzer analyzer = new JinjaSemanticAnalyzer(globalSymTab, contextVars);
        analyzer.visit(ast);
        for (String err : analyzer.getErrors()) report.semanticError(fileName, err);
    }

    public static Node parseFile(String path, SymbolTable globalSymTab, CompilerReport report, boolean printTree) throws IOException {
        Node ast = parseOnly(path, report, printTree);
        analyze(ast, new java.io.File(path).getName(), globalSymTab, Collections.emptySet(), report);
        return ast;
    }
}
