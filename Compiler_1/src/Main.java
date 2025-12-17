import antlr.HtmlJinjaLexer;
import antlr.HtmlJinjaParser;
import ast.Node;
import builder.ASTBuilder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "<div class=\"test\">{{ user.name }}{% if user.isAdmin %}Admin{% endif %}</div>";

        CharStream cs = CharStreams.fromString(input);
        HtmlJinjaLexer lexer = new HtmlJinjaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HtmlJinjaParser parser = new HtmlJinjaParser(tokens);

        ParseTree tree = parser.htmlDocument();

        ASTBuilder builder = new ASTBuilder();
        Node ast = builder.buildHtml(tree);

        // كل Node لديه toString() واضح
        System.out.println(ast);
    }
}
