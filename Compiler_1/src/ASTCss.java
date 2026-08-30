import antlr.cssLexer;
import antlr.cssParser;
import ast.Node;
import builder.CssVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import output.CompilerReport;
import semantic.SymbolTableVisitor;
import symboltable.SymbolTable;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

/** Front end for CSS files: lexer -> parser -> AST -> symbol collection. */
public class ASTCss {

    public static Node parseFile(String path, SymbolTable globalSymTab) throws Exception {
        return parseFile(path, globalSymTab, new CompilerReport(), true);
    }

    public static Node parseFile(String path, SymbolTable globalSymTab, CompilerReport report, boolean printTree) throws IOException {
        String fileName = new java.io.File(path).getName();
        CharStream input = fromFileName(path);
        cssLexer lexer = new cssLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(report.listenerFor(fileName));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        cssParser parser = new cssParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(report.listenerFor(fileName));

        ParseTree tree = parser.stylesheet();
        Node ast = (Node) new CssVisitor().visit(tree);
        report.fileAnalyzed(fileName);
        if (printTree) {
            System.out.println("============================== [ CSS AST: " + fileName + " ] ==============================");
            System.out.println(ast);
        }
        if (ast != null) new SymbolTableVisitor(globalSymTab).visit(ast);
        return ast;
    }
}
