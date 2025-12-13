package builder;

import antlr.*;
import ast.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class HtmlVisitor extends htmlParserBaseVisitor<Node> {

    private JinjaVisitor jinjaVisitor = new JinjaVisitor();

    // ---------------- HTML Document ----------------
    @Override
    public HtmlDocumentNode visitHtmlDocument(htmlParser.HtmlDocumentContext ctx) {
        HtmlDocumentNode document = new HtmlDocumentNode(
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine()
        );

        for (htmlParser.HtmlElementsContext elemCtx : ctx.htmlElements()) {
            Node node = visit(elemCtx);
            if (node != null) document.addChild(node);
        }

        return document;
    }

    @Override
    public Node visitHtmlElements(htmlParser.HtmlElementsContext ctx) {
        if (ctx.htmlElement() != null) return visit(ctx.htmlElement());
        return null;
    }

    // ---------------- HTML Element ----------------
    @Override
    public Node visitHtmlElement(htmlParser.HtmlElementContext ctx) {
        if (ctx.TAG_NAME() != null) {
            String tagName = ctx.TAG_NAME(0).getText();
            HtmlNode htmlNode = new HtmlNode(
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine(),
                    tagName
            );

            // Attributes
            for (htmlParser.HtmlAttributeContext attrCtx : ctx.htmlAttribute()) {
                String attrName = attrCtx.TAG_NAME().getText();
                String attrValue = attrCtx.ATTVALUE_VALUE() != null ? attrCtx.ATTVALUE_VALUE().getText() : "";
                htmlNode.addAttribute(attrName, attrValue);
            }

            // Children / Content
            if (ctx.htmlContent() != null) {
                // نصوص HTML
                for (htmlParser.HtmlChardataContext chCtx : ctx.htmlContent().getRuleContexts(htmlParser.HtmlChardataContext.class)) {
                    Node child = visitHtmlChardata(chCtx);
                    if (child != null) htmlNode.addChild(child);
                }

                // عناصر HTML متداخلة
                for (htmlParser.HtmlElementContext childElem : ctx.htmlContent().getRuleContexts(htmlParser.HtmlElementContext.class)) {
                    Node childNode = visit(childElem);
                    if (childNode != null) htmlNode.addChild(childNode);
                }
            }

            return htmlNode;
        }

        // Script / Style
        else if (ctx.script() != null || ctx.style() != null) {
            String text = ctx.script() != null ? ctx.script().getText() : ctx.style().getText();
            return new HtmlTextNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), text);
        }

        // دمج Jinja من داخل SCRIPTLET
//        else if (ctx.SCRIPTLET() != null) {
//            return handleJinja(ctx.SCRIPTLET().getText(), ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
//        }

        return null;
    }

    // ---------------- HTML Char Data ----------------
    @Override
    public Node visitHtmlChardata(htmlParser.HtmlChardataContext ctx) {
        return new HtmlTextNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.getText());
    }

    // ---------------- HTML Comments ----------------
    @Override
    public Node visitHtmlComment(htmlParser.HtmlCommentContext ctx) {
        return new HtmlTextNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ctx.HTML_COMMENT().getText());
    }
}
