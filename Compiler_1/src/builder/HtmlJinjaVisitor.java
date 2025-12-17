package builder;

import antlr.HtmlJinjaParserBaseVisitor;
import ast.*;
import ast.html.*;
import ast.html_tag.*;
import ast.jinja.*;

import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
import antlr.HtmlJinjaParser.*;

public class HtmlJinjaVisitor extends HtmlJinjaParserBaseVisitor<Node> {

    /* ---------------- HTML Document ---------------- */
    @Override
    public Node visitHtmlDocument(HtmlDocumentContext ctx) {
        List<Node> children = new ArrayList<>();
        for (var c : ctx.children) {
            Node n = visit(c);
            if (n != null) children.add(n);
        }
        return new HtmlDocument(ctx.start.getLine(), ctx.start.getCharPositionInLine(), children);
    }

    /* ---------------- HTML Element ---------------- */
    @Override
    public Node visitHtmlElement(HtmlElementContext ctx) {
        if (ctx.jinjaExpression() != null) return visit(ctx.jinjaExpression());
        if (ctx.jinja_statement() != null) return visit(ctx.jinja_statement());
        if (ctx.SCRIPTLET() != null) return new HtmlChardata(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.SCRIPTLET().getText());
        if (ctx.script() != null) return visit(ctx.script());
        if (ctx.style() != null) return visit(ctx.style());

        if (ctx.TAG_OPEN() != null) {
            String tagName = ctx.TAG_NAME(0).getText();
            List<HtmlTagContent> attrs = new ArrayList<>();
            if (ctx.htmlTagContent() != null) {
                for (var a : ctx.htmlTagContent()) {
                    Node n = visit(a);
                    if (n instanceof HtmlTagContent htc) attrs.add(htc);
                }
            }
            List<Node> children = new ArrayList<>();
            if (ctx.TAG_CLOSE() != null && ctx.htmlContent() != null) {
                Node contentNode = visit(ctx.htmlContent());
                if (contentNode instanceof HtmlContent hc) children.addAll(hc.nodes);
            }
            return new HtmlElement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), tagName, attrs, children);
        }
        return null;
    }

    /* ---------------- HTML Content ---------------- */
    @Override
    public Node visitHtmlContent(HtmlContentContext ctx) {
        List<Node> nodes = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) nodes.add(n);
        }
        return new HtmlContent(ctx.start.getLine(), ctx.start.getCharPositionInLine(), nodes);
    }

    @Override
    public Node visitHtmlChardata(HtmlChardataContext ctx) {
        if (ctx.HTML_TEXT() != null) return new HtmlChardata(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.HTML_TEXT().getText());
        if (ctx.SEA_WS() != null) return new HtmlChardata(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.SEA_WS().getText());
        return null;
    }

    @Override
    public Node visitHtmlComment(HtmlCommentContext ctx) {
        return new HtmlComment(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.HTML_COMMENT().getText());
    }

    @Override
    public Node visitScript(ScriptContext ctx) {
        return new Script(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.SCRIPT_BODY().getText());
    }

    @Override
    public Node visitStyle(StyleContext ctx) {
        return new Style(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.STYLE_BODY().getText());
    }

    @Override
    public Node visitHtmlAttribute(HtmlAttributeContext ctx) {
        String name = ctx.TAG_NAME().getText();
        Object value = null;
        if (ctx.ATTVALUE_VALUE() != null) value = ctx.ATTVALUE_VALUE().getText();
        return new HtmlAttribute(ctx.start.getLine(), ctx.start.getCharPositionInLine(), name, value);
    }

    /* ---------------- Jinja Expressions ---------------- */
    @Override
    public Node visitJinjaExpression(JinjaExpressionContext ctx) {
        return new JinjaExpression(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.getText());
    }

    /* ---------------- Jinja Statements ---------------- */
    @Override
    public Node visitAssignment_statement(Assignment_statementContext ctx) {
        return new AssignmentStatement(
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine(),
                ctx.JINJA_ID().getText(),
                ctx.expression().getText()
        );
    }

    @Override
    public Node visitIf_statement(If_statementContext ctx) {
        JinjaExpression condition = null;
        if (ctx.if_fragment().expression() != null) {
            Node condNode = visit(ctx.if_fragment().expression());
            if (condNode instanceof JinjaExpression je) condition = je;
        }

        List<Node> body = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) body.add(n);
        }

        List<ElifStatement> elifs = new ArrayList<>();
        if (ctx.elif_statement() != null) {
            Node n = visit(ctx.elif_statement());
            if (n instanceof ElifStatement es) elifs.add(es);
        }

        ElseStatement elseStmt = null;
        if (ctx.else_statement() != null) {
            Node n = visit(ctx.else_statement());
            if (n instanceof ElseStatement es) elseStmt = es;
        }

        return new IfStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), condition, body, elifs, elseStmt);
    }

    @Override
    public Node visitElif_statement(Elif_statementContext ctx) {
        JinjaExpression condition = null;
        if (ctx.elif_fragment().expression() != null) {
            Node condNode = visit(ctx.elif_fragment().expression());
            if (condNode instanceof JinjaExpression je) condition = je;
        }

        List<Node> body = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) body.add(n);
        }

        return new ElifStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), condition, body);
    }

    @Override
    public Node visitElse_statement(Else_statementContext ctx) {
        List<Node> body = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) body.add(n);
        }
        return new ElseStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), body);
    }

    @Override
    public Node visitWhile_statement(While_statementContext ctx) {
        JinjaExpression condition = null;
        if (ctx.while_fragment().expression() != null) {
            Node condNode = visit(ctx.while_fragment().expression());
            if (condNode instanceof JinjaExpression je) condition = je;
        }

        List<Node> body = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) body.add(n);
        }

        return new WhileStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), condition, body);
    }

    @Override
    public Node visitFor_statement(For_statementContext ctx) {
        List<String> targets = new ArrayList<>();
        for (TerminalNode id : ctx.for_fragment().for_target().JINJA_ID()) targets.add(id.getText());

        JinjaExpression iterable = null;
        if (ctx.for_fragment().expression() != null) {
            Node n = visit(ctx.for_fragment().expression());
            if (n instanceof JinjaExpression je) iterable = je;
        }

        List<Node> body = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) body.add(n);
        }

        return new ForStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), targets, iterable, body);
    }

    /* ---------------- Tag-level Jinja Blocks ---------------- */
    @Override
    public Node visitTagIfBlock(TagIfBlockContext ctx) {
        // استخراج الشرط من النص
        String blockText = ctx.TAG_JINJA_BLOCK(0).getText();
        String conditionText = blockText.replaceAll("\\{\\%\\s*if\\s*", "")
                .replaceAll("\\s*\\%\\}", "")
                .trim();
        JinjaExpression condition = new JinjaExpression(ctx.start.getLine(), ctx.start.getCharPositionInLine(), conditionText);

        // زيارة attributes
        List<HtmlAttribute> attributes = new ArrayList<>();
        for (var attrCtx : ctx.htmlAttribute()) {
            Node n = visit(attrCtx);
            if (n instanceof HtmlAttribute ha) attributes.add(ha);
        }

        // زيارة nested elif blocks
        List<TagElifBlock> elifBlocks = new ArrayList<>();
        for (var elifCtx : ctx.tagElifBlock()) {
            Node n = visit(elifCtx);
            if (n instanceof TagElifBlock te) elifBlocks.add(te);
        }

        // زيارة else block إذا موجود
        TagElseBlock elseBlock = null;
        if (ctx.tagElseBlock() != null) {
            Node n = visit(ctx.tagElseBlock());
            if (n instanceof TagElseBlock te) elseBlock = te;
        }

        return new TagIfBlock(ctx.start.getLine(), ctx.start.getCharPositionInLine(), condition, attributes, elifBlocks, elseBlock);
    }

    @Override
    public Node visitTagElifBlock(TagElifBlockContext ctx) {
        String blockText = ctx.TAG_JINJA_BLOCK().getText();
        String conditionText = blockText.replaceAll("\\{\\%\\s*elif\\s*", "")
                .replaceAll("\\s*\\%\\}", "")
                .trim();
        JinjaExpression condition = new JinjaExpression(ctx.start.getLine(), ctx.start.getCharPositionInLine(), conditionText);

        List<HtmlAttribute> attributes = new ArrayList<>();
        for (var attrCtx : ctx.htmlAttribute()) {
            Node n = visit(attrCtx);
            if (n instanceof HtmlAttribute ha) attributes.add(ha);
        }

        return new TagElifBlock(ctx.start.getLine(), ctx.start.getCharPositionInLine(), condition, attributes);
    }

    @Override
    public Node visitTagElseBlock(TagElseBlockContext ctx) {
        List<HtmlAttribute> attributes = new ArrayList<>();
        for (var attrCtx : ctx.htmlAttribute()) {
            Node n = visit(attrCtx);
            if (n instanceof HtmlAttribute ha) attributes.add(ha);
        }
        return new TagElseBlock(ctx.start.getLine(), ctx.start.getCharPositionInLine(), attributes);
    }

    @Override
    public Node visitTagForBlock(TagForBlockContext ctx) {
        String blockText = ctx.TAG_JINJA_BLOCK(0).getText();
        JinjaExpression iterable = new JinjaExpression(ctx.start.getLine(), ctx.start.getCharPositionInLine(), blockText);

        List<HtmlAttribute> attributes = new ArrayList<>();
        for (var attrCtx : ctx.htmlAttribute()) {
            Node n = visit(attrCtx);
            if (n instanceof HtmlAttribute ha) attributes.add(ha);
        }

        return new TagForBlock(ctx.start.getLine(), ctx.start.getCharPositionInLine(), attributes, iterable);
    }

    @Override
    public Node visitTagWhileBlock(TagWhileBlockContext ctx) {
        String blockText = ctx.TAG_JINJA_BLOCK(0).getText();
        JinjaExpression condition = new JinjaExpression(ctx.start.getLine(), ctx.start.getCharPositionInLine(), blockText);

        List<HtmlAttribute> attributes = new ArrayList<>();
        for (var attrCtx : ctx.htmlAttribute()) {
            Node n = visit(attrCtx);
            if (n instanceof HtmlAttribute ha) attributes.add(ha);
        }

        return new TagWhileBlock(ctx.start.getLine(), ctx.start.getCharPositionInLine(), attributes, condition);
    }

}
