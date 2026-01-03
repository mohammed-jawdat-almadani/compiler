import antlr.cssLexer;
import antlr.cssParser;
import ast.Node;
import builder.CssVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import semantic.SymbolTableVisitor;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class ASTCss {

    public static void parseFile(String path) throws Exception {
        try {

            // 1. تحويل النص إلى CharStream
            CharStream input = fromFileName(path);

            // 2. تهيئة Lexer و Parser
            cssLexer lexer = new cssLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            cssParser parser = new cssParser(tokens);

            // 3. بناء ParseTree
            ParseTree tree = parser.stylesheet();

            // 4. استخدام CssVisitor لبناء AST
            CssVisitor visitor = new CssVisitor();
            Node ast = (Node) visitor.visit(tree);

            // 5. طباعة AST
            System.out.println("============================== [ CSS AST ] ==============================");
            System.out.println(ast);

            System.out.println("============================== [ Symbol Table ] ==============================");
            SymbolTableVisitor symVisitor = new SymbolTableVisitor();
            symVisitor.visit(ast);
            symVisitor.getSymbolTable().dump();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
