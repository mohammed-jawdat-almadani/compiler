package ast;

public interface NodeVisitor<T> {
    // HTML
    T visitHtmlNode(HtmlNode node);
    T visitHtmlTextNode(HtmlTextNode node);
    T visitHtmlDocumentNode(HtmlDocumentNode node);

    // CSS
    T visitCssNode(CssNode node);
    T visitDeclarationNode(DeclarationNode node);

    // Jinja2
    T visitJinjaNode(JinjaNode node);
    T visitJinjaExpressionNode(JinjaExpressionNode node);
    T visitJinjaBooleanExpressionNode(JinjaBooleanExpressionNode node);
    T visitJinjaPrintNode(JinjaPrintNode node);
    T visitJinjaAssignmentNode(JinjaAssignmentNode node);
    T visitJinjaIfNode(JinjaIfNode node);
    T visitJinjaElifNode(JinjaElifNode node);
    T visitJinjaElseNode(JinjaElseNode node);
    T visitJinjaWhileNode(JinjaWhileNode node);
    T visitJinjaCommentNode(JinjaCommentNode node);
    T visitJinjaForNode(JinjaForNode node);
    T visitJinjaTextNode(JinjaTextNode node);

    default T visitGeneric(Node node) { return null; }
    default T visit(Node node) { return node.accept(this); }


}
