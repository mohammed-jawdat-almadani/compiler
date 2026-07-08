import antlr.PythonLexer;
import antlr.PythonParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import python.ast.ASTNode;
import python.visitor.ASTBuilder;
import python.semantic.PythonSemanticAnalyzer;
import builder.CodeGeneratorVisitor;
import python.symboltable.SymbolTable;

import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class ASTPython {
    public static ASTNode ParseFile(String path, java.util.List<String> globalVarsOut) {
        try {
            CharStream input = fromFileName(path);
            PythonLexer lexer = new PythonLexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);
            PythonParser parser = new PythonParser(token);
            parser.removeErrorListeners();

            ParseTree tree = parser.file_input();
            ASTBuilder astBuilder = new ASTBuilder();
            ASTNode astNode = astBuilder.visit(tree);
            astNode.printTree("");

            System.out.println("\n=== Symbol Table ===");
            astBuilder.getSymbolTable().printSymbolTable();
            
            System.out.println("\n=== Semantic Analysis ===");
            PythonSemanticAnalyzer analyzer = new PythonSemanticAnalyzer();
            analyzer.analyze(astNode);

            // Add top-level variables to globalVarsOut
            SymbolTable st = analyzer.getSymbolTable(); // Assuming we can get it, wait we can't easily.
            // Let's just collect identifiers from Assignments at top level
            for (ASTNode child : astNode.getChildren()) {
                if (child instanceof python.ast.AssignmentNode) {
                    python.ast.AssignmentNode assign = (python.ast.AssignmentNode) child;
                    if (assign.target instanceof python.ast.IdentifierNode) {
                        globalVarsOut.add(((python.ast.IdentifierNode) assign.target).name);
                    }
                }
            }

            return astNode;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
