package semantic;

import ast.Node;
import ast.html.*;
import ast.jinja.*;
import symbol_table.SymbolTableManager;

public class JinjaSemanticAnalyzer extends SymbolTableVisitor {
    private int errorCount = 0;

    public void injectGlobals(java.util.List<String> globals) {
        for (String g : globals) {
            getSymbolTable().define(g, "python-var", 0, 0);
        }
    }

    private void reportError(int line, int col, String message) {
        System.err.println("JINJA SEMANTIC ERROR at line " + line + ":" + col + " -> " + message);
        errorCount++;
    }

    @Override
    public Void visitJinjaExpression(JinjaExpression node) {
        String expr = node.expression.trim();
        String baseVar = expr.split("\\.")[0].split("\\s")[0].split("\\(")[0].trim();
        
        if (baseVar.equals("url_for") || baseVar.equals("loop")) return super.visitJinjaExpression(node);
        
        if (!baseVar.isEmpty() && !baseVar.startsWith("'") && !baseVar.startsWith("\"") && !isNumeric(baseVar)) {
            if (getSymbolTable().resolve(baseVar) == null) {
                 reportError(node.line, node.column, "Undefined Jinja variable: " + baseVar);
            }
        }
        return super.visitJinjaExpression(node);
    }

    @Override
    public Void visitForStatement(ForStatement node) {
        String iter = node.iterable.expression.trim();
        if (getSymbolTable().resolve(iter) == null) {
            reportError(node.line, node.column, "Undefined iterable in Jinja 'for' loop: " + iter);
        }
        return super.visitForStatement(node);
    }
    
    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
