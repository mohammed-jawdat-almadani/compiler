import antlr.PythonLexer;
import antlr.PythonParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import output.CompilerReport;
import python.ast.ASTNode;
import python.semantic.PythonSemanticAnalyzer;
import python.visitor.ASTBuilder;
import symboltable.SymbolTable;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

// Front end for Python files: lexer -> parser -> AST -> semantic analysis
public class ASTPython {

    // old entry point, prints the AST to the console
    public static ASTNode ParseFile(String path, SymbolTable globalSymTab) {
        CompilerReport report = new CompilerReport();
        ASTNode node = parseFile(path, globalSymTab, report, true);
        return node;
    }

    public static ASTNode parseFile(String path, SymbolTable globalSymTab, CompilerReport report, boolean printTree) {
        String fileName = new java.io.File(path).getName();
        try {
            CharStream input = fromFileName(path);
            PythonLexer lexer = new PythonLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(report.listenerFor(fileName));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PythonParser parser = new PythonParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(report.listenerFor(fileName));

            ParseTree tree = parser.file_input();
            ASTNode astNode = new ASTBuilder().visit(tree);
            if (printTree && astNode != null) astNode.printTree("");
            report.fileAnalyzed(fileName);

            if (astNode != null) {
                PythonSemanticAnalyzer analyzer = new PythonSemanticAnalyzer(globalSymTab);
                analyzer.analyze(astNode);
                for (String err : analyzer.getErrors()) report.semanticError(fileName, err);
            }
            return astNode;
        } catch (IOException e) {
            report.syntaxError(fileName, "cannot read file: " + e.getMessage());
            return null;
        } catch (RuntimeException e) {
            // a broken parse tree (after syntax errors) can crash the builder
            if (report.getSyntaxErrors().isEmpty()) report.syntaxError(fileName, "could not build AST: " + e.getClass().getSimpleName() + (e.getMessage() != null ? " - " + e.getMessage() : ""));
            else report.log("AST for " + fileName + " not built because of the syntax errors above");
            return null;
        }
    }
}
