import antlr.HtmlJinjaLexer;
import antlr.HtmlJinjaParser;
import ast.Node;
import builder.ASTBuilder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import semantic.SymbolTableVisitor;
import semantic.JinjaSemanticAnalyzer;
import symboltable.SymbolTable;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class ASTHtmlJinja {
    public static Node parseFile(String path, SymbolTable globalSymTab) throws Exception {
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

            System.out.println("============================== [ Semantic ] ==============================");
            JinjaSemanticAnalyzer analyzer = new JinjaSemanticAnalyzer(globalSymTab);
            analyzer.visit(ast);
            return ast;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
