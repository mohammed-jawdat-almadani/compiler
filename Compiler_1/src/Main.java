import symboltable.SymbolTable;

public class Main {
    public static void main(String[] args) {
        try {
             SymbolTable globalSymTab = new SymbolTable();
             
             python.ast.ASTNode pythonRoot = ASTPython.ParseFile("PROJECT1/app.py", globalSymTab);
             ASTPython.ParseFile("PROJECT1/data.py", globalSymTab);
             
             globalSymTab.printSymbolTable(); // Dump python table
             
             ASTCss.parseFile("PROJECT1/static/style.css", globalSymTab);
             ASTHtmlJinja.parseFile("PROJECT1/templates/add_product.html", globalSymTab);
             ASTHtmlJinja.parseFile("PROJECT1/templates/base.html", globalSymTab);
             ASTHtmlJinja.parseFile("PROJECT1/templates/product_details.html", globalSymTab);
             ASTHtmlJinja.parseFile("PROJECT1/templates/products.html", globalSymTab);
             
             System.out.println("\n=== Code Generation ===");
             builder.CodeGeneratorVisitor generator = new builder.CodeGeneratorVisitor();
             if (pythonRoot != null) {
                 generator.generate(pythonRoot);
             }
             
             System.out.println("\n=== Final Symbol Table ===");
             globalSymTab.printSymbolTable();
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
