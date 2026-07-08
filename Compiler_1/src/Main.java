import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
             List<String> pythonVars = new ArrayList<>();
             python.ast.ASTNode pythonRoot = ASTPython.ParseFile("PROJECT1/app.py", pythonVars);
             ASTPython.ParseFile("PROJECT1/data.py", pythonVars);
             
             ASTCss.parseFile("PROJECT1/static/style.css");
             ASTHtmlJinja.parseFile("PROJECT1/templates/add_product.html", pythonVars);
             ASTHtmlJinja.parseFile("PROJECT1/templates/base.html", pythonVars);
             ASTHtmlJinja.parseFile("PROJECT1/templates/product_details.html", pythonVars);
             ASTHtmlJinja.parseFile("PROJECT1/templates/products.html", pythonVars);
             
             System.out.println("\n=== Code Generation ===");
             builder.CodeGeneratorVisitor generator = new builder.CodeGeneratorVisitor();
             if (pythonRoot != null) {
                 // passing the python data to code generator (the generator simulates passing to jinja)
                 generator.generate(pythonRoot);
             }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
