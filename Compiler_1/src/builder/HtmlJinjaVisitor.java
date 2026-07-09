package builder;

import antlr.*;
import ast.*;
import ast.css.CssDeclaration;
import ast.css.CssDeclarationList;
import ast.html.*;
import ast.jinja.*;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        String cssText = ctx.STYLE_BODY().getText()
                .replaceFirst("</style>$", "")
                .trim();


        try {
            CssVisitor cssVisitor = new CssVisitor();
            cssParser parser = new cssParser(
                    new CommonTokenStream(
                            new cssLexer(CharStreams.fromString(cssText))
                    )
            );

            Node cssAst = cssVisitor.visit(parser.stylesheet());

            return new Style(
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine(),
                    cssAst
            );

        } catch (Exception e) {
            return new HtmlChardata(
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine(),
                    cssText
            );
        }
    }

    @Override
    public Node visitHtmlTagContent(HtmlJinjaParser.HtmlTagContentContext ctx) {
        if (ctx.htmlAttribute() != null) {
            return visit(ctx.htmlAttribute());
        }
        else {
            return visit(ctx.TAG_JINJA_VAR());
        }
    }

    @Override
    public Node visitHtmlAttribute(HtmlJinjaParser.HtmlAttributeContext ctx) {

        String name = ctx.TAG_NAME().getText();
        Node value = null;

        if (ctx.ATTVALUE_VALUE() != null) {

            String raw = ctx.ATTVALUE_VALUE().getText();
            String attrValue = raw.replaceAll("^['\"]|['\"]$", "");

            if ("style".equalsIgnoreCase(name)) {
                List<Node> decls = new ArrayList<>();
                String[] parts = attrValue.split(";");
                for (String part : parts) {
                    part = part.trim();
                    if (part.isEmpty()) continue;
                    String[] kv = part.split(":", 2);
                    if (kv.length < 2) continue;
                    String property = kv[0].trim();
                    String val = kv[1].trim();

                    Node valueNode;
                    if (isPureJinja(val)) {
                        valueNode = new JinjaExpression(
                                ctx.start.getLine(),
                                ctx.start.getCharPositionInLine(),
                                extractInnerJinja(val)
                        );
                    } else {
                        valueNode = new HtmlAttributeValue(
                                ctx.start.getLine(),
                                ctx.start.getCharPositionInLine(),
                                val
                        );
                    }

                    decls.add(new CssDeclaration(
                            ctx.start.getLine(),
                            ctx.start.getCharPositionInLine(),
                            property,
                            valueNode.toString()
                    ));
                }
                value = new CssDeclarationList(ctx.start.getLine(), ctx.start.getCharPositionInLine(), decls);
            }

            else {
                value = new HtmlAttributeValue(
                        ctx.start.getLine(),
                        ctx.start.getCharPositionInLine(),
                        attrValue
                );
            }
        }

        return new HtmlAttribute(
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine(),
                name,
                value
        );
    }

    private boolean isPureJinja(String value) {
        return value.matches(".*\\{\\{.*?}}.*");
    }

    private String extractInnerJinja(String value) {
        // \\{\\{\\s*(.*?)\\s*}}  → يلتقط كل شيء داخل الأقواس
        Matcher m = Pattern.compile("\\{\\{\\s*(.*?)\\s*}}").matcher(value);

        if (m.find()) {
            return m.group(1).trim(); // group(1) هو المحتوى داخل {{ ... }}
        }
        return null;
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

        String iterableText = "";
        if (ctx.for_fragment() != null && ctx.for_fragment().expression() != null) {
            iterableText = ctx.for_fragment().expression().getText();
        }

        JinjaExpression iterable = new JinjaExpression(ctx.start.getLine(), ctx.start.getCharPositionInLine(), iterableText);

        List<Node> body = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) body.add(n);
        }

        return new ForStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), targets, iterable, body);
    }

    @Override
    public Node visitBlock_statement(HtmlJinjaParser.Block_statementContext ctx) {
        String name = null;
        if (ctx.block_open().JINJA_ID() != null) {
            name = ctx.block_open().JINJA_ID().getText();
        }

        // Collect the inner template content
        List<Node> body = new ArrayList<>();
        for (var contentCtx : ctx.templateContent()) {
            Node n = visit(contentCtx);
            if (n != null) body.add(n);
        }

        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        return new ast.jinja.BlockStatement(line, column, name, body);
    }

}
