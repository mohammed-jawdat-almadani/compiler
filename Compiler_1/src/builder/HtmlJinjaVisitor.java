package builder;

import antlr.*;
import ast.*;
import ast.css.CssDeclaration;
import ast.css.CssDeclarationList;
import ast.html.*;
import ast.jinja.*;
import ast.jinja.expr.*;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlJinjaVisitor extends HtmlJinjaParserBaseVisitor<Node> {

    // original source text of a rule, whitespace kept (getText() drops it)
    private static String src(org.antlr.v4.runtime.ParserRuleContext ctx) {
        if (ctx == null || ctx.start == null) return "";
        int a = ctx.start.getStartIndex();
        int b = ctx.stop != null ? ctx.stop.getStopIndex() : a;
        if (b < a) return ctx.getText();
        return ctx.start.getInputStream().getText(org.antlr.v4.runtime.misc.Interval.of(a, b)).trim();
    }

    // Jinja expression helpers

    // JinjaExpression node carrying both the source text and the expression tree
    private JinjaExpression expressionNode(int line, int column, HtmlJinjaParser.ExpressionContext ctx) {
        JinjaExpression e = new JinjaExpression(line, column, src(ctx));
        e.tree = ctx == null ? null : (ExprNode) visit(ctx);
        return e;
    }

    // parse a {{ ... }} found inside an attribute value
    private JinjaExpression parseExpressionText(int line, int column, String inner) {
        try {
            HtmlJinjaLexer lexer = new HtmlJinjaLexer(CharStreams.fromString("{{ " + inner + " }}"));
            lexer.removeErrorListeners();
            HtmlJinjaParser parser = new HtmlJinjaParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();
            HtmlJinjaParser.JinjaExpressionContext ctx = parser.jinjaExpression();
            JinjaExpression e = new JinjaExpression(line, column, inner.trim());
            if (parser.getNumberOfSyntaxErrors() == 0 && ctx.expression() != null) {
                e.tree = (ExprNode) visit(ctx.expression());
                relocate(e.tree, line, column);   // re-parsed snippet positions -> position of the attribute in the template
            }
            return e;
        } catch (RuntimeException ex) {
            return new JinjaExpression(line, column, inner.trim());
        }
    }

    // stamp every node of the tree with the given template position
    private static void relocate(Node n, int line, int column) {
        if (n == null) return;
        n.line = line;
        n.column = column;
        for (java.lang.reflect.Field f : n.getClass().getDeclaredFields()) {
            try {
                f.setAccessible(true);
                Object v = f.get(n);
                if (v instanceof Node) relocate((Node) v, line, column);
                else if (v instanceof java.util.Collection) { for (Object o : (java.util.Collection<?>) v) if (o instanceof Node) relocate((Node) o, line, column); }
                else if (v instanceof Map) { for (Object o : ((Map<?, ?>) v).values()) if (o instanceof Node) relocate((Node) o, line, column); }
            } catch (IllegalAccessException ignored) { }
        }
    }

    // split "(a, b, key=value)" into positional and keyword args
    private void collectArguments(HtmlJinjaParser.ArgumentsContext ctx, List<ExprNode> args, Map<String, ExprNode> kwargs) {
        if (ctx == null) return;
        for (HtmlJinjaParser.ArgumentContext a : ctx.argument()) {
            if (a instanceof HtmlJinjaParser.KwArgumentContext) {
                HtmlJinjaParser.KwArgumentContext kw = (HtmlJinjaParser.KwArgumentContext) a;
                kwargs.put(kw.JINJA_ID().getText(), (ExprNode) visit(kw.expression()));
            } else {
                args.add((ExprNode) visit(a));
            }
        }
    }

    private static String unquote(String s) {
        if (s.length() >= 2 && (s.charAt(0) == '"' || s.charAt(0) == '\'')) s = s.substring(1, s.length() - 1);
        return s.replace("\\n", "\n").replace("\\t", "\t").replace("\\\"", "\"").replace("\\'", "'");
    }

    // Jinja expression AST: one method per labelled alternative

    @Override public Node visitEqPar(HtmlJinjaParser.EqParContext ctx) { return visit(ctx.expression()); }

    @Override public Node visitEqAttr(HtmlJinjaParser.EqAttrContext ctx) {
        return new AttributeExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), (ExprNode) visit(ctx.expression()), ctx.JINJA_ID().getText());
    }

    @Override public Node visitEqIndex(HtmlJinjaParser.EqIndexContext ctx) {
        return new IndexExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), (ExprNode) visit(ctx.expression(0)), (ExprNode) visit(ctx.expression(1)));
    }

    @Override public Node visitEqCall(HtmlJinjaParser.EqCallContext ctx) {
        List<ExprNode> args = new ArrayList<>(); Map<String, ExprNode> kwargs = new LinkedHashMap<>();
        collectArguments(ctx.arguments(), args, kwargs);
        return new CallExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), (ExprNode) visit(ctx.expression()), args, kwargs);
    }

    @Override public Node visitEqFilter(HtmlJinjaParser.EqFilterContext ctx) {
        List<ExprNode> args = new ArrayList<>(); Map<String, ExprNode> kwargs = new LinkedHashMap<>();
        collectArguments(ctx.arguments(), args, kwargs);
        return new FilterExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), (ExprNode) visit(ctx.expression()), ctx.JINJA_ID().getText(), args, kwargs);
    }

    @Override public Node visitEqNot(HtmlJinjaParser.EqNotContext ctx) {
        return new UnaryExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "not", (ExprNode) visit(ctx.expression()));
    }

    @Override public Node visitEqNeg(HtmlJinjaParser.EqNegContext ctx) {
        return new UnaryExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "-", (ExprNode) visit(ctx.expression()));
    }

    private Node binary(HtmlJinjaParser.ExpressionContext ctx, HtmlJinjaParser.ExpressionContext l, String op, HtmlJinjaParser.ExpressionContext r) {
        return new BinaryExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), (ExprNode) visit(l), op, (ExprNode) visit(r));
    }

    @Override public Node visitEqMul(HtmlJinjaParser.EqMulContext ctx)         { return binary(ctx, ctx.left, ctx.operator.getText(), ctx.right); }
    @Override public Node visitEqAdd(HtmlJinjaParser.EqAddContext ctx)         { return binary(ctx, ctx.left, ctx.operator.getText(), ctx.right); }
    @Override public Node visitEqConcat(HtmlJinjaParser.EqConcatContext ctx)   { return binary(ctx, ctx.left, "~", ctx.right); }
    @Override public Node visitEqCompare(HtmlJinjaParser.EqCompareContext ctx) { return binary(ctx, ctx.left, ctx.operator.getText(), ctx.right); }
    @Override public Node visitEqIn(HtmlJinjaParser.EqInContext ctx)           { return binary(ctx, ctx.left, "in", ctx.right); }
    @Override public Node visitEqAnd(HtmlJinjaParser.EqAndContext ctx)         { return binary(ctx, ctx.left, "and", ctx.right); }
    @Override public Node visitEqOr(HtmlJinjaParser.EqOrContext ctx)           { return binary(ctx, ctx.left, "or", ctx.right); }

    @Override public Node visitEqIs(HtmlJinjaParser.EqIsContext ctx) {
        return new TestExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), (ExprNode) visit(ctx.left), ctx.JINJA_ID().getText(), ctx.JINJA_NOT() != null);
    }

    @Override public Node visitEqTernary(HtmlJinjaParser.EqTernaryContext ctx) {
        ExprNode otherwise = ctx.expression().size() > 2 ? (ExprNode) visit(ctx.expression(2)) : null;
        return new ConditionalExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), (ExprNode) visit(ctx.expression(0)), (ExprNode) visit(ctx.expression(1)), otherwise);
    }

    @Override public Node visitEqDouble(HtmlJinjaParser.EqDoubleContext ctx) { return new LiteralExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), Double.parseDouble(ctx.getText()), "float"); }
    @Override public Node visitEqInt(HtmlJinjaParser.EqIntContext ctx)       { return new LiteralExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), Long.parseLong(ctx.getText()), "int"); }
    @Override public Node visitEqString(HtmlJinjaParser.EqStringContext ctx) { return new LiteralExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), unquote(ctx.getText()), "string"); }
    @Override public Node visitEqBool(HtmlJinjaParser.EqBoolContext ctx)     { return new LiteralExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.getText().equalsIgnoreCase("true"), "bool"); }
    @Override public Node visitEqNone(HtmlJinjaParser.EqNoneContext ctx)     { return new LiteralExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), null, "none"); }
    @Override public Node visitEqId(HtmlJinjaParser.EqIdContext ctx)         { return new IdentifierExpr(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.getText()); }

    @Override public Node visitPosArgument(HtmlJinjaParser.PosArgumentContext ctx) { return visit(ctx.expression()); }
    @Override public Node visitKwArgument(HtmlJinjaParser.KwArgumentContext ctx)   { return visit(ctx.expression()); }

    // Top-level whitespace / comments
    @Override
    public Node visitHtmlMisc(HtmlJinjaParser.HtmlMiscContext ctx) {
        if (ctx.SEA_WS() != null) return new HtmlChardata(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.SEA_WS().getText());
        return visitChildren(ctx);
    }

    // Document type declaration
    @Override
    public Node visitTerminal(TerminalNode node) {
        if (node.getSymbol().getType() == HtmlJinjaLexer.DTD) {
            return new HtmlChardata(node.getSymbol().getLine(), node.getSymbol().getCharPositionInLine(), node.getText());
        }
        return null;
    }

    // HTML Document
    @Override
    public Node visitHtmlDocument(HtmlJinjaParser.HtmlDocumentContext ctx) {
        List<Node> children = new ArrayList<>();
        for (var c : ctx.children) {
            Node n = visit(c);
            if (n != null) children.add(n);
        }
        return new HtmlDocument(ctx.start.getLine(), ctx.start.getCharPositionInLine(), children);
    }

    // HTML Element
    @Override
    public Node visitHtmlElement(HtmlJinjaParser.HtmlElementContext ctx) {
        if (ctx.jinjaExpression() != null) {
            return visit(ctx.jinjaExpression());
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

    // HTML Content
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
        Script sc = new Script(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.SCRIPT_BODY().getText());
        sc.openTag = ctx.SCRIPT_OPEN().getText();
        return sc;
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

            Style st = new Style(
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine(),
                    cssAst
            );
            st.rawCss = cssText;
            return st;

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
                        valueNode = parseExpressionText(ctx.start.getLine(), ctx.start.getCharPositionInLine(), extractInnerJinja(val));
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
                            val
                    ));
                }
                value = new CssDeclarationList(ctx.start.getLine(), ctx.start.getCharPositionInLine(), decls);
            }

            else {
                Matcher whole = Pattern.compile("^\\s*\\{\\{\\s*(.*?)\\s*}}\\s*$").matcher(attrValue);
                if (whole.matches()) {
                    // the whole attribute value is one Jinja expression, e.g. href="{{ url_for('index') }}"
                    value = parseExpressionText(ctx.start.getLine(), ctx.start.getCharPositionInLine(), whole.group(1));
                } else {
                    // plain text, possibly mixing literals and {{ }} (substituted by the renderer)
                    value = new HtmlAttributeValue(
                            ctx.start.getLine(),
                            ctx.start.getCharPositionInLine(),
                            attrValue
                    );
                }
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
        // capture everything between {{ and }}
        Matcher m = Pattern.compile("\\{\\{\\s*(.*?)\\s*}}").matcher(value);

        if (m.find()) {
            return m.group(1).trim(); // group(1) is the content inside {{ }}
        }
        return null;
    }

    // Extends Statement

    @Override
    public Node visitExtends_statement(HtmlJinjaParser.Extends_statementContext ctx) {
        return new ExtendsStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.JINJA_STRING().getText());
    }

    // Jinja Expressions
    @Override
    public Node visitJinjaExpression(HtmlJinjaParser.JinjaExpressionContext ctx) {
        return expressionNode(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.expression());
    }

    // Jinja Statements
    @Override
    public Node visitAssignment_statement(HtmlJinjaParser.Assignment_statementContext ctx) {
        AssignmentStatement a = new AssignmentStatement(
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine(),
                ctx.JINJA_ID().getText(),
                src(ctx.expression())
        );
        a.tree = (ExprNode) visit(ctx.expression());
        return a;
    }

    @Override
    public Node visitIf_statement(HtmlJinjaParser.If_statementContext ctx) {
        JinjaExpression condition = expressionNode(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.if_fragment() != null ? ctx.if_fragment().expression() : null);

        List<Node> body = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) body.add(n);
        }

        // the grammar nests each elif/else inside the previous one; flatten the chain
        List<ElifStatement> elifs = new ArrayList<>();
        ElseStatement elseStmt = null;
        HtmlJinjaParser.Elif_statementContext elifCtx = ctx.elif_statement();
        HtmlJinjaParser.Else_statementContext elseCtx = ctx.else_statement();
        while (elifCtx != null) {
            Node n = visit(elifCtx);
            if (n instanceof ElifStatement es) elifs.add(es);
            elseCtx = elifCtx.else_statement();
            elifCtx = elifCtx.elif_statement();
        }
        if (elseCtx != null) {
            Node n = visit(elseCtx);
            if (n instanceof ElseStatement es) elseStmt = es;
        }

        return new IfStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), condition, body, elifs, elseStmt);
    }

    @Override
    public Node visitElif_statement(HtmlJinjaParser.Elif_statementContext ctx) {
        // full text of the elif fragment
        JinjaExpression condition = expressionNode(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.elif_fragment() != null ? ctx.elif_fragment().expression() : null);

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
        // full text of the while fragment
        JinjaExpression condition = expressionNode(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.while_fragment() != null ? ctx.while_fragment().expression() : null);

        List<Node> body = new ArrayList<>();
        for (var c : ctx.templateContent()) {
            Node n = visit(c);
            if (n != null) body.add(n);
        }

        return new WhileStatement(ctx.start.getLine(), ctx.start.getCharPositionInLine(), condition, body);
    }

    @Override
    public Node visitFor_statement(HtmlJinjaParser.For_statementContext ctx) {
        // collect the loop targets
        List<String> targets = new ArrayList<>();
        for (TerminalNode id : ctx.for_fragment().for_target().JINJA_ID()) targets.add(id.getText());

        JinjaExpression iterable = expressionNode(ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.for_fragment() != null ? ctx.for_fragment().expression() : null);

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

        // collect the inner template content
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
