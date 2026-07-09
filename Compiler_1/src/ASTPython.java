import antlr.PythonLexer;
import antlr.PythonParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import python.ast.ASTNode;
import python.visitor.ASTBuilder;
import python.semantic.PythonSemanticAnalyzer;
import builder.CodeGeneratorVisitor;
import symboltable.SymbolTable;

import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class ASTPython {
    public static ASTNode ParseFile(String path, SymbolTable globalSymTab) {
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

            System.out.println("\n=== Semantic Analysis ===");
            PythonSemanticAnalyzer analyzer = new PythonSemanticAnalyzer(globalSymTab);
            analyzer.analyze(astNode);

            return astNode;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
