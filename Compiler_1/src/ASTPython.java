import antlr.PythonLexer;
import antlr.PythonParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import python.ast.ASTNode;
import python.visitor.ASTBuilder;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ASTPython {
    public static void ParseFile(String path) {
        try {
            //String path = "src/python/test/test1.txt";
            CharStream input = fromFileName(path);
            PythonLexer lexer = new PythonLexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);

            PythonParser parser = new PythonParser(token);

            parser.removeErrorListeners();

            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line, int charPositionInLine,
                                        String msg,
                                        RecognitionException e) {
                    System.err.println("SYNTAX ERROR at " + line + ":" + charPositionInLine + " -> " + msg);
                }
            });

            ParseTree tree = parser.file_input();
            ASTBuilder astBuilder = new ASTBuilder();
            ASTNode astNode = astBuilder.visit(tree);
            astNode.printTree("");

            System.out.println("\n=== Symbol Table ===");
            astBuilder.getSymbolTable().printSymbolTable();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

