package builder;

import antlr.*;
import ast.*;
import ast.html.*;
import ast.jinja.*;

import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;

public class HtmlJinjaVisitor extends HtmlJinjaParserBaseVisitor<Node> {

    /* ---------------- HTML Document ---------------- */
    @Override
    public Node visitHtmlDocument(HtmlJinjaParser.HtmlDocumentContext ctx) {
        List<Node> children = new ArrayList<>();
        for (var c : ctx.children) {
            Node n = visit(c);
            if (n != null) children.add(n);
        }
        return new HtmlDocument(ctx.start.getLine(), ctx.start.getCharPositionInLine(), children);
    }

    /* ---------------- HTML Element ---------------- */
    @Override
    public Node visitHtmlElement(HtmlJinjaParser.HtmlElementContext ctx) {
        if (ctx.jinjaExpression() != null) {
            String raw = ctx.getText();        // {{name}}
            String inner = raw
                    .replaceFirst("^\\{\\{", "")
                    .replaceFirst("\\}\\}$", "")
                    .trim();
            return new JinjaExpression(
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine(),
                    inner          // name فقط
            );
        }
        if (ctx.jinja_statement() != null) return visit(ctx.jinja_statement());
        if (ctx.SCRIPTLET() != null) return new HtmlChardata(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.SCRIPTLET().getText());
        if (ctx.script() != null) return visit(ctx.script());
        if (ctx.style() != null) return visit(ctx.style());

        if (ctx.TAG_OPEN() != null) {
            String tagName = ctx.TAG_NAME(0).getText();
            List<Node> attrs = new ArrayList<>();
            for (var a : ctx.htmlTagContent()) {
                Node n = visit(a);
                if (n != null) {
                    attrs.add(n);
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
    public Node visitHtmlContent(HtmlJinjaParser.HtmlContentContext ctx) {
        List<Node> nodes = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) nodes.add(n);
        }
        return new HtmlContent(ctx.start.getLine(), ctx.start.getCharPositionInLine(), nodes);
    }

    @Override
    public Node visitHtmlChardata(HtmlJinjaParser.HtmlChardataContext ctx) {
        if (ctx.HTML_TEXT() != null) return new HtmlChardata(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.HTML_TEXT().getText());
        if (ctx.SEA_WS() != null) return new HtmlChardata(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.SEA_WS().getText());
        return null;
    }

    @Override
    public Node visitHtmlComment(HtmlJinjaParser.HtmlCommentContext ctx) {
        return new HtmlComment(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.HTML_COMMENT().getText());
    }

    @Override
    public Node visitScript(HtmlJinjaParser.ScriptContext ctx) {
        return new Script(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.SCRIPT_BODY().getText());
    }

    @Override
    public Node visitStyle(HtmlJinjaParser.StyleContext ctx) {

        String cssText = ctx.STYLE_BODY().getText();
        if (cssText.trim().endsWith("</style>")) {
            cssText = cssText.substring(0, cssText.lastIndexOf("</style>")).trim();
        }

        CssVisitor cssVisitor = new CssVisitor();
        Node cssNode;
        try {
            antlr.cssParser parser = new antlr.cssParser(
                    new org.antlr.v4.runtime.CommonTokenStream(
                            new antlr.cssLexer(
                                    org.antlr.v4.runtime.CharStreams.fromString(cssText)
                            )
                    )
            );
            cssNode = cssVisitor.visitStylesheet(parser.stylesheet());
        } catch (Exception e) {
            cssNode = new HtmlChardata(ctx.start.getLine(), ctx.start.getCharPositionInLine(), cssText);
        }
        String test = "<style>\n" + cssNode.toString() + "\n</style>";
        return new HtmlChardata(ctx.start.getLine(), ctx.start.getCharPositionInLine(), test);
    }

    @Override
    public Node visitHtmlTagContent(HtmlJinjaParser.HtmlTagContentContext ctx) {
       return new HtmlTagContent(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.getText());
    }

    @Override
    public Node visitHtmlAttribute(HtmlJinjaParser.HtmlAttributeContext ctx) {
        String name = ctx.TAG_NAME().getText();
        Object value = null;

        if (ctx.ATTVALUE_VALUE() != null) {
            String attrValue = ctx.ATTVALUE_VALUE().getText();

            // إذا كان اسم الـ attribute هو "style"، نرسل القيمة لـ CssVisitor
            if ("style".equalsIgnoreCase(name)) {
                CssVisitor cssVisitor = new CssVisitor();
                try {
                    antlr.cssParser parser = new antlr.cssParser(
                            new org.antlr.v4.runtime.CommonTokenStream(
                                    new antlr.cssLexer(
                                            org.antlr.v4.runtime.CharStreams.fromString(attrValue)
                                    )
                            )
                    );
                    // تحليل CSS وإرجاع Node الخاص بالـ CSS
                    Node cssNode = cssVisitor.visitStylesheet(parser.stylesheet());
                    value = cssNode; // نخزن AST الخاص بالـ CSS بدلاً من النص
                } catch (Exception e) {
                    // إذا حدث خطأ، نترك النص كما هو
                    value = attrValue;
                }
            } else {
                // لل attributes الأخرى نترك النص كما هو
                value = attrValue;
            }
        }

        return new HtmlAttribute(ctx.start.getLine(), ctx.start.getCharPositionInLine(), name, value);
    }


    /* ---------------- Extends Statement ---------------- */

    @Override
    public Node visitExtends_statement(HtmlJinjaParser.Extends_statementContext ctx) {
        return new ExtendsStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.JINJA_STRING().getText());
    }

    /* ---------------- Jinja Expressions ---------------- */
    @Override
    public Node visitJinjaExpression(HtmlJinjaParser.JinjaExpressionContext ctx) {
        return new JinjaExpression(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.getText());
    }

    /* ---------------- Jinja Statements ---------------- */
    @Override
    public Node visitAssignment_statement(HtmlJinjaParser.Assignment_statementContext ctx) {
        return new AssignmentStatement(
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine(),
                ctx.JINJA_ID().getText(),
                ctx.expression().getText()
        );
    }

    @Override
    public Node visitIf_statement(HtmlJinjaParser.If_statementContext ctx) {
        // دائماً خذ النص الكامل للشرط
        String condText = "";
        if (ctx.if_fragment() != null)
            condText = ctx.if_fragment().getText().replaceAll("\\{\\%\\s*if\\s*", "")
                    .replaceAll("\\s*\\%\\}", "").trim();

        JinjaExpression condition = new JinjaExpression(ctx.start.getLine(), ctx.start.getCharPositionInLine(), condText);

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
    public Node visitElif_statement(HtmlJinjaParser.Elif_statementContext ctx) {
        // استخدم النص الكامل من elif_fragment
        String condText = "";
        if (ctx.elif_fragment() != null)
            condText = ctx.elif_fragment().getText().replaceAll("\\{\\%\\s*elif\\s*", "")
                    .replaceAll("\\s*\\%\\}", "").trim();

        JinjaExpression condition = new JinjaExpression(ctx.start.getLine(), ctx.start.getCharPositionInLine(), condText);

        List<Node> body = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) body.add(n);
        }

        return new ElifStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), condition, body);
    }

    @Override
    public Node visitElse_statement(HtmlJinjaParser.Else_statementContext ctx) {
        List<Node> body = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) body.add(n);
        }
        return new ElseStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), body);
    }

    @Override
    public Node visitWhile_statement(HtmlJinjaParser.While_statementContext ctx) {
        // استخدم النص الكامل من while_fragment
        String condText = "";
        if (ctx.while_fragment() != null)
            condText = ctx.while_fragment().getText().replaceAll("\\{\\%\\s*while\\s*", "")
                    .replaceAll("\\s*\\%\\}", "").trim();

        JinjaExpression condition = new JinjaExpression(ctx.start.getLine(), ctx.start.getCharPositionInLine(), condText);

        List<Node> body = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) body.add(n);
        }

        return new WhileStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), condition, body);
    }

    @Override
    public Node visitFor_statement(HtmlJinjaParser.For_statementContext ctx) {
        // جمع المتغيرات المستهدفة
        List<String> targets = new ArrayList<>();
        for (TerminalNode id : ctx.for_fragment().for_target().JINJA_ID()) targets.add(id.getText());

        // خذ النص الكامل للتكرار كـ JinjaExpression
        String iterableText = "";
        if (ctx.for_fragment() != null)
            iterableText = ctx.for_fragment().getText().replaceAll("\\{\\%\\s*for\\s*", "")
                    .replaceAll("\\s*\\%\\}", "").trim();

        JinjaExpression iterable = new JinjaExpression(ctx.start.getLine(), ctx.start.getCharPositionInLine(), iterableText);

        List<Node> body = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) body.add(n);
        }

        return new ForStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), targets, iterable, body);
    }
}
