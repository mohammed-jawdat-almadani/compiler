package builder;

import ast.*;
import antlr.*; // افترضنا هنا ANTLR-generated parsers
import org.antlr.v4.runtime.tree.ParseTree;

public class ASTBuilder {

    /* ---------------- HTML ---------------- */
    public HtmlDocumentNode buildHtml(ParseTree tree) {
        HtmlVisitor visitor = new HtmlVisitor();
        return (HtmlDocumentNode) visitor.visit(tree);
    }

    /* ---------------- CSS (معلقة) ---------------- */
//    public CssNode buildCss(ParseTree tree) {
//        CssVisitor visitor = new CssVisitor();
//        return visitor.visit(tree);
//    }

    /* ---------------- Jinja2 ---------------- */
    public JinjaNode buildJinja(ParseTree tree) {
        JinjaVisitor visitor = new JinjaVisitor();
        return (JinjaNode) visitor.visit(tree);
    }
}
