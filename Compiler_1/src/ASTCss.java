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

            CharStream input = fromFileName(path);

            cssLexer lexer = new cssLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            cssParser parser = new cssParser(tokens);

            ParseTree tree = parser.stylesheet();

            CssVisitor visitor = new CssVisitor();
            Node ast = (Node) visitor.visit(tree);

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
