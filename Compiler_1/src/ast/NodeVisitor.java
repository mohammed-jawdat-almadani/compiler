package ast;

import ast.css.*;
import ast.html.*;
import ast.jinja.*;

public interface NodeVisitor<T> {
    default T visitGeneric(Node node) {
        return null;
    }

    default T visit(Node node) {
        if (node == null) return null;
        return node.accept(this);
    }

    T visitHtmlDocument(HtmlDocument node);

    T visitHtmlElement(HtmlElement node);

    T visitHtmlContent(HtmlContent node);

    T visitHtmlTagContent(HtmlTagContent node);

    T visitHtmlAttribute(HtmlAttribute node);

    T visitHtmlChardata(HtmlChardata node);

    T visitHtmlComment(HtmlComment node);

    T visitScript(Script node);

    T visitStyle(Style node);

    T visitHtmlAttributeValue(HtmlAttributeValue node);

    T visitHtmlStyleAttribute(HtmlStyleAttribute node);

    // Jinja Nodes
    T visitExtendsStatement(ExtendsStatement node);

    T visitJinjaExpression(JinjaExpression node);

    T visitBlockStatement(ast.jinja.BlockStatement node);

    T visitAssignmentStatement(AssignmentStatement node);

    T visitIfStatement(IfStatement node);

    T visitElifStatement(ElifStatement node);

    T visitElseStatement(ElseStatement node);

    T visitWhileStatement(WhileStatement node);

    T visitForStatement(ForStatement node);

    // Css
    T visitCssStylesheet(CssStylesheet node);

    T visitCssRuleSet(CssRuleSet node);

    T visitCssSelector(CssSelector node);

    T visitCssDeclaration(CssDeclaration node);

    T visitCssDeclarationList(CssDeclarationList node);

    T visitCssMediaRule(CssMediaRule node);

    T visitCssFontFaceRule(CssFontFaceRule node);

    T visitCssKeyframesRule(CssKeyframesRule node);

    T visitCssKeyframeBlock(CssKeyframeBlock node);

    T visitCssSupportsRule(CssSupportsRule node);

    T visitCssViewport(CssViewport node);

    T visitCssCounterStyle(CssCounterStyle node);

    T visitCssFontFeatureValuesRule(CssFontFeatureValuesRule node);

    T visitCssFeatureValueBlock(CssFeatureValueBlock node);

    T visitCssFeatureValueDefinition(CssFeatureValueDefinition node);

}
