package builder;

import ast.Node;
import ast.css.CssStylesheet;
import ast.html.HtmlDocument;
import org.antlr.v4.runtime.tree.ParseTree;

public class ASTBuilder {

    public Node buildHtml(ParseTree tree) {
        HtmlJinjaVisitor visitor = new HtmlJinjaVisitor();
        return (HtmlDocument) visitor.visit(tree);
    }

    public Node buildCss(ParseTree tree) {
        HtmlJinjaVisitor visitor = new HtmlJinjaVisitor();
        return (CssStylesheet) visitor.visit(tree);
    }
}
