import antlr.HtmlJinjaLexer;
import antlr.HtmlJinjaParser;
import ast.Node;
import builder.ASTBuilder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import semantic.SymbolTableVisitor;
import semantic.JinjaSemanticAnalyzer;

import java.io.IOException;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class ASTHtmlJinja {
    public static void parseFile(String path, List<String> pythonGlobals) throws Exception {
        try {
            CharStream input = fromFileName(path);
            HtmlJinjaLexer lexer = new HtmlJinjaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            HtmlJinjaParser parser = new HtmlJinjaParser(tokens);

            ParseTree tree = parser.htmlDocument();
            ASTBuilder builder = new ASTBuilder();
            Node ast = builder.buildHtml(tree);

            System.out.println("============================== [ AST ] ==============================");
            System.out.println(ast);

            System.out.println("============================== [ ST & Semantic ] ==============================");
            JinjaSemanticAnalyzer analyzer = new JinjaSemanticAnalyzer();
            analyzer.injectGlobals(pythonGlobals);
            analyzer.visit(ast);
            analyzer.getSymbolTable().dump();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
