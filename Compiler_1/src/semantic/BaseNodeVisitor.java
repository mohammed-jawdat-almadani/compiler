package semantic;

import ast.*;
import ast.html.*;
import ast.jinja.*;

public abstract class BaseNodeVisitor<T> implements NodeVisitor<T> {

    protected T defaultVisit(Node node) {
        return null;
    }

    /* ================= HTML ================= */

    @Override
    public T visitHtmlDocument(HtmlDocument n) {
        for (Node c : n.children) visit(c);
        return defaultVisit(n);
    }

    @Override
    public T visitHtmlElement(HtmlElement n) {
        if (n.attributes != null)
            for (Node a : n.attributes) visit(a);

        if (n.children != null)
            for (Node c : n.children) visit(c);

        return defaultVisit(n);
    }

    @Override
    public T visitHtmlContent(HtmlContent n) {
        for (Node c : n.nodes) visit(c);
        return defaultVisit(n);
    }

    @Override public T visitHtmlAttribute(HtmlAttribute n) { return defaultVisit(n); }
    @Override public T visitHtmlChardata(HtmlChardata n) { return defaultVisit(n); }
    @Override public T visitHtmlComment(HtmlComment n) { return defaultVisit(n); }
    @Override public T visitScript(Script n) { return defaultVisit(n); }
    @Override public T visitStyle(Style n) { return defaultVisit(n); }

    /* ================= JINJA ================= */

    @Override public T visitJinjaExpression(JinjaExpression n) { return defaultVisit(n); }

    @Override public T visitAssignmentStatement(AssignmentStatement n) {
        return defaultVisit(n);
    }

    @Override
    public T visitIfStatement(IfStatement n) {
        visit(n.condition);

        if (n.body != null)
            for (Node c : n.body) visit(c);

        if (n.elifBlocks != null)
            for (ElifStatement e : n.elifBlocks) visit(e);

        if (n.elseBlock != null)
            visit(n.elseBlock);

        return defaultVisit(n);
    }

    @Override
    public T visitElifStatement(ElifStatement n) {
        visit(n.condition);
        for (Node c : n.body) visit(c);
        return defaultVisit(n);
    }

    @Override
    public T visitElseStatement(ElseStatement n) {
        for (Node c : n.body) visit(c);
        return defaultVisit(n);
    }

    @Override
    public T visitWhileStatement(WhileStatement n) {
        visit(n.condition);
        for (Node c : n.body) visit(c);
        return defaultVisit(n);
    }

    @Override
    public T visitForStatement(ForStatement n) {
        visit(n.iterable);
        for (Node c : n.body) visit(c);
        return defaultVisit(n);
    }
}
