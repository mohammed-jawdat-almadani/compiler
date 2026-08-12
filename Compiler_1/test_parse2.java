import ast.Node;
import ast.html.HtmlDocument;
public class test_parse2 {
    public static void main(String[] args) throws Exception {
        symboltable.SymbolTable globalSymTab = new symboltable.SymbolTable();
        Node root = ASTHtmlJinja.parseFile("../PROJECT1/templates/add_product.html", globalSymTab);
        generator.HtmlCodeGenerator gen = new generator.HtmlCodeGenerator();
        gen.generate(root);
        System.out.println(gen.getGeneratedCode());
    }
}
