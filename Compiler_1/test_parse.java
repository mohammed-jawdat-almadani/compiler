import ast.Node;
import ast.html.HtmlDocument;
public class test_parse {
    public static void main(String[] args) throws Exception {
        symboltable.SymbolTable globalSymTab = new symboltable.SymbolTable();
        Node root = ASTHtmlJinja.parseFile("test.html", globalSymTab);
        System.out.println(root);
    }
}
