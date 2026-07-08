package builder;

import python.ast.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class CodeGeneratorVisitor {
    private StringBuilder sb;
    private int indentLevel = 0;

    public CodeGeneratorVisitor() {
        this.sb = new StringBuilder();
    }

    private void indent() {
        for (int i = 0; i < indentLevel; i++) {
            sb.append("    ");
        }
    }

    private void emit(String text) {
        indent();
        sb.append(text).append("\n");
    }

    public void generate(ASTNode pythonRoot) {
        sb.append("import java.util.*;\n\n");
        sb.append("public class GeneratedApp {\n\n");
        
        indentLevel++;
        
        // Define global variables mapping for simulated flask app
        emit("public static List<Map<String, Object>> products = new ArrayList<>();");
        emit("");
        
        visit(pythonRoot);
        
        emit("public static void main(String[] args) {");
        indentLevel++;
        emit("// Initialize products with some data if it's not initialized in AST");
        emit("System.out.println(\"Generated App Started.\");");
        emit("System.out.println(\"Generating HTML for /products ...\");");
        emit("display_products();");
        indentLevel--;
        emit("}");
        
        indentLevel--;
        sb.append("}\n");

        try (PrintWriter out = new PrintWriter(new FileWriter("out/GeneratedApp.java"))) {
            out.println(sb.toString());
            System.out.println("Code generation completed: out/GeneratedApp.java");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void visit(ASTNode node) {
        if (node == null) return;

        if (node instanceof BlockNode) {
            for (StatementNode stmt : ((BlockNode) node).statements) {
                visit(stmt);
            }
        } else if (node instanceof FunctionDefNode) {
            FunctionDefNode fNode = (FunctionDefNode) node;
            emit("public static void " + fNode.name + "() {");
            indentLevel++;
            visit(fNode.body);
            indentLevel--;
            emit("}\n");
        } else if (node instanceof AssignmentNode) {
            AssignmentNode aNode = (AssignmentNode) node;
            if (aNode.target instanceof IdentifierNode) {
                String varName = ((IdentifierNode) aNode.target).name;
                // very basic java translation
                // For a real compiler we'd evaluate the AST or generate true Java statements
                // Here we just emit comments or simple assignments if it's the global list
            }
        } else if (node instanceof FunctionCallNode) {
            FunctionCallNode call = (FunctionCallNode) node;
            if (call.functionName instanceof IdentifierNode) {
                String name = ((IdentifierNode) call.functionName).name;
                if (name.equals("render_template")) {
                    emit("System.out.println(\"<html><body><h1>Simulated render_template output</h1></body></html>\");");
                }
            }
        } else if (node instanceof ReturnNode) {
            ReturnNode ret = (ReturnNode) node;
            visit(ret.expression);
            emit("return;");
        } else {
            for (ASTNode child : node.getChildren()) {
                visit(child);
            }
        }
    }
}
