package ast;

import ast.html.*;
import ast.html_tag.*;
import ast.jinja.*;

public interface NodeVisitor<T> {
    default T visitGeneric(Node node) { return null; }
    default T visit(Node node) { return node.accept(this); }

    // HTML Nodes
    T visitHtmlDocument(HtmlDocument node);
    T visitHtmlElement(HtmlElement node);
    T visitHtmlContent(HtmlContent node);
    T visitHtmlAttribute(HtmlAttribute node);
    T visitHtmlChardata(HtmlChardata node);
    T visitHtmlComment(HtmlComment node);
    T visitScript(Script node);
    T visitStyle(Style node);

    // Jinja Nodes
    T visitJinjaExpression(JinjaExpression node);
    T visitAssignmentStatement(AssignmentStatement node);
    T visitIfStatement(IfStatement node);
    T visitElifStatement(ElifStatement node);
    T visitElseStatement(ElseStatement node);
    T visitWhileStatement(WhileStatement node);
    T visitForStatement(ForStatement node);

    // Tag-level Jinja
    T visitTagIfBlock(TagIfBlock node);
    T visitTagElifBlock(TagElifBlock node);
    T visitTagElseBlock(TagElseBlock node);
    T visitTagForBlock(TagForBlock node);
    T visitTagWhileBlock(TagWhileBlock node);
}
