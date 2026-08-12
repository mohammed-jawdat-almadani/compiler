import symboltable.SymbolTable;
import generator.PythonCodeGenerator;
import generator.HtmlCodeGenerator;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
             SymbolTable globalSymTab = new SymbolTable();
             
             System.out.println("=== Parsing Python Files ===");
             python.ast.ASTNode pythonRoot = ASTPython.ParseFile("../PROJECT1/app.py", globalSymTab);
             python.ast.ASTNode dataRoot = ASTPython.ParseFile("../PROJECT1/data.py", globalSymTab);
             
             System.out.println("\n=== Parsing HTML Files ===");
             Map<String, ast.Node> htmlTrees = new HashMap<>();
             htmlTrees.put("add_product.html", ASTHtmlJinja.parseFile("../PROJECT1/templates/add_product.html", globalSymTab));
             htmlTrees.put("base.html", ASTHtmlJinja.parseFile("../PROJECT1/templates/base.html", globalSymTab));
             htmlTrees.put("product_details.html", ASTHtmlJinja.parseFile("../PROJECT1/templates/product_details.html", globalSymTab));
             htmlTrees.put("products.html", ASTHtmlJinja.parseFile("../PROJECT1/templates/products.html", globalSymTab));
             
             System.out.println("\n=== Parsing CSS Files ===");
             ASTCss.parseFile("../PROJECT1/static/style.css", globalSymTab);
             
             System.out.println("\n=== Python AST ===");
             System.out.println(pythonRoot);

             System.out.println("\n=== Code Generation ===");
             
             File outDir = new File("out/generated_app");
             if (!outDir.exists()) outDir.mkdirs();
             
             File templatesDir = new File(outDir, "templates");
             if (!templatesDir.exists()) templatesDir.mkdirs();
             
             // Copy static directory
             System.out.println("\n=== Copying Static Assets ===");
             Process p = Runtime.getRuntime().exec("cmd /c xcopy /s /y ..\\PROJECT1\\static out\\generated_app\\static\\");
             p.waitFor();

             // Python Generation
             PythonCodeGenerator pyGen = new PythonCodeGenerator();
             pyGen.generate(pythonRoot);
             String generatedPy = pyGen.getGeneratedCode();
             try (PrintWriter out = new PrintWriter(new FileWriter(new File(outDir, "app.py")))) {
                 out.println(generatedPy);
             }
             System.out.println("Generated app.py successfully.");
             
             PythonCodeGenerator dataGen = new PythonCodeGenerator();
             dataGen.generate(dataRoot);
             String generatedData = dataGen.getGeneratedCode();
             try (PrintWriter out = new PrintWriter(new FileWriter(new File(outDir, "data.py")))) {
                 out.println(generatedData);
             }
             System.out.println("Generated data.py successfully.");
             
             // HTML Generation
             for (Map.Entry<String, ast.Node> entry : htmlTrees.entrySet()) {
                 HtmlCodeGenerator htmlGen = new HtmlCodeGenerator();
                 htmlGen.generate(entry.getValue());
                 String generatedHtml = htmlGen.getGeneratedCode();
                 try (PrintWriter out = new PrintWriter(new FileWriter(new File(templatesDir, entry.getKey())))) {
                     out.println(generatedHtml);
                 }
                 System.out.println("Generated " + entry.getKey() + " successfully.");
             }
             
             System.out.println("\nCode generation completed. Output is in Compiler_1/out/generated_app/");
             
             System.out.println("\n=== Final Symbol Table ===");
             globalSymTab.printSymbolTable();
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}