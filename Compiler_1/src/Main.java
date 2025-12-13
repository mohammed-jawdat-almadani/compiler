import builder.HtmlVisitor;
import ast.*;
import antlr.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {

        // ------------------ تجربة HTML + Jinja ------------------
        String htmlSample = """
                <html>
                       <body>
                       
                       <p> test p </p> 
                       
                       <h1>test h1</h1>
                     
                       test 
                       {% endif %} 
                       </body></html>
        """;

        // تهيئة Lexer و Parser
        htmlLexer lexer = new htmlLexer(CharStreams.fromString(htmlSample));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        htmlParser parser = new htmlParser(tokens);

        // بناء AST باستخدام HtmlVisitor الجديد
        HtmlVisitor visitor = new HtmlVisitor();
        HtmlDocumentNode htmlAst = (HtmlDocumentNode) visitor.visitHtmlDocument(parser.htmlDocument());

        printHtmlAst(htmlAst, 0);
    }

    // تابع طباعة HTML AST بشكل أوضح
    private static void printHtmlAst(Node node, int indent) {
        String prefix = "  ".repeat(indent);

        if (node instanceof HtmlDocumentNode docNode) {
            System.out.println(prefix + "HtmlDocumentNode {");
            for (Node child : docNode.children) {
                printHtmlAst(child, indent + 1);
            }
            System.out.println(prefix + "}");

        } else if (node instanceof HtmlNode htmlNode) {
            System.out.print(prefix + "HtmlNode: <" + htmlNode.tag);
            if (!htmlNode.attributes.isEmpty()) {
                System.out.print(" [");
                htmlNode.attributes.forEach((k, v) -> System.out.print(k + "=\"" + v + "\" "));
                System.out.print("]");
            }
            System.out.println(">");

            for (Node child : htmlNode.children) {
                printHtmlAst(child, indent + 1);
            }

            System.out.println(prefix + "</" + htmlNode.tag + ">");

        } else if (node instanceof HtmlTextNode textNode) {
            String text = textNode.text.trim();
            if (!text.isEmpty()) {
                System.out.println(prefix + "HtmlTextNode: \"" + text + "\"");
            }

        } else if (node instanceof JinjaNode jinjaNode) {
            System.out.println(prefix + "JinjaNode {");
            for (Node child : jinjaNode.children) {
                printHtmlAst(child, indent + 1);
            }
            System.out.println(prefix + "}");

        } else if (node instanceof JinjaPrintNode printNode) {
            System.out.println(prefix + "JinjaPrintNode: " + printNode.valueToPrint);

        } else if (node instanceof JinjaAssignmentNode assignNode) {
            System.out.println(prefix + "JinjaAssignmentNode: " + assignNode.variableName + " = " + assignNode.expression);

        } else if (node instanceof JinjaExpressionNode exprNode) {
            System.out.println(prefix + "JinjaExpressionNode: " + exprNode.expression);

        } else if (node instanceof JinjaBooleanExpressionNode boolNode) {
            if (boolNode.literalValue != null) {
                System.out.println(prefix + "JinjaBooleanExpressionNode: " + boolNode.literalValue);
            } else {
                System.out.println(prefix + "JinjaBooleanExpressionNode: " + boolNode.left + " " + boolNode.operator + " " + boolNode.right);
            }

        } else if (node instanceof JinjaIfNode ifNode) {
            System.out.println(prefix + "JinjaIfNode: " + ifNode.condition);
            for (Node child : ifNode.ifBody) printHtmlAst(child, indent + 1);
            if (ifNode.followUp != null) printHtmlAst(ifNode.followUp, indent + 1);

        } else if (node instanceof JinjaElifNode elifNode) {
            System.out.println(prefix + "JinjaElifNode: " + elifNode.condition);
            for (Node child : elifNode.elifBody) printHtmlAst(child, indent + 1);
            if (elifNode.followUp != null) printHtmlAst(elifNode.followUp, indent + 1);

        } else if (node instanceof JinjaElseNode elseNode) {
            System.out.println(prefix + "JinjaElseNode {");
            for (Node child : elseNode.elseBody) printHtmlAst(child, indent + 1);
            System.out.println(prefix + "}");

        } else if (node instanceof JinjaForNode forNode) {
            System.out.println(prefix + "JinjaForNode: " + forNode.loopVar + " in " + forNode.iterable);
            for (Node child : forNode.loopBody) printHtmlAst(child, indent + 1);

        } else if (node instanceof JinjaWhileNode whileNode) {
            System.out.println(prefix + "JinjaWhileNode: " + whileNode.condition);
            for (Node child : whileNode.loopBody) printHtmlAst(child, indent + 1);

        } else {
            System.out.println(prefix + node.getClass().getSimpleName() + ": " + node);
        }
    }
}
