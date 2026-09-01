package semantic;

import ast.Node;
import ast.css.CssDeclaration;
import ast.css.CssDeclarationList;
import ast.html.*;
import ast.jinja.*;
import ast.jinja.expr.*;
import symboltable.SymbolTable;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Semantic checks for templates. A name is valid if Python passes it through render_template,
// it is a for/set variable in an enclosing scope, it is a Jinja/Flask builtin, or the symbol table knows it.
public class JinjaSemanticAnalyzer extends SymbolTableVisitor {

    private static final Set<String> BUILTINS = new HashSet<>(Arrays.asList(
            "url_for", "loop", "request", "range", "config", "session", "g", "self", "super",
            "true", "false", "none", "True", "False", "None", "dict", "namespace", "lipsum", "cycler", "joiner", "len"));

    private static final Pattern INLINE_EXPR = Pattern.compile("\\{\\{\\s*(.*?)\\s*\\}\\}");
    private static final Pattern IDENT = Pattern.compile("[A-Za-z_][A-Za-z0-9_]*");

    private final Set<String> contextVars;
    private final List<String> errors = new ArrayList<>();

    public JinjaSemanticAnalyzer(SymbolTable symtab) {
        this(symtab, Collections.emptySet());
    }

    public JinjaSemanticAnalyzer(SymbolTable symtab, Set<String> contextVars) {
        super(symtab);
        this.contextVars = contextVars != null ? contextVars : Collections.emptySet();
    }

    public List<String> getErrors() { return errors; }

    private void reportError(int line, int col, String message) {
        errors.add("line " + line + ":" + col + " " + message);
    }

    private boolean isDefined(String name) {
        return BUILTINS.contains(name) || contextVars.contains(name) || getSymbolTable().resolve(name) != null;
    }

    // free variable names of an expression text: identifiers that are not keywords, attributes,
    // filter/test names or keyword-argument names
    static List<String> freeVariables(String expr) {
        List<String> out = new ArrayList<>();
        if (expr == null) return out;
        String cleaned = expr.replaceAll("\"(\\\\.|[^\"\\\\])*\"", "\"\"").replaceAll("'(\\\\.|[^'\\\\])*'", "''");
        Matcher m = IDENT.matcher(cleaned);
        Set<String> keywords = new HashSet<>(Arrays.asList("and", "or", "not", "in", "is", "if", "else", "true", "false", "none", "True", "False", "None"));
        while (m.find()) {
            String id = m.group();
            int start = m.start(), end = m.end();
            if (keywords.contains(id)) continue;
            int p = start - 1;
            while (p >= 0 && Character.isWhitespace(cleaned.charAt(p))) p--;
            if (p >= 0 && cleaned.charAt(p) == '.') continue;          // attribute access
            if (p >= 0 && cleaned.charAt(p) == '|') continue;          // filter name
            String before = cleaned.substring(0, start).trim();
            if (before.endsWith(" is") || before.endsWith(" is not") || before.equals("is")) continue; // test name
            int q = end;
            while (q < cleaned.length() && Character.isWhitespace(cleaned.charAt(q))) q++;
            if (q < cleaned.length() && cleaned.charAt(q) == '=' && (q + 1 >= cleaned.length() || cleaned.charAt(q + 1) != '=')) continue; // kwarg
            if (!out.contains(id)) out.add(id);
        }
        return out;
    }

    // free variables of an expression tree: every IdentifierExpr
    static void freeVariables(ExprNode n, List<String> out) {
        if (n == null) return;
        if (n instanceof IdentifierExpr) { String id = ((IdentifierExpr) n).name; if (!out.contains(id)) out.add(id); }
        else if (n instanceof AttributeExpr) freeVariables(((AttributeExpr) n).object, out);
        else if (n instanceof IndexExpr) { freeVariables(((IndexExpr) n).object, out); freeVariables(((IndexExpr) n).index, out); }
        else if (n instanceof CallExpr) { CallExpr c = (CallExpr) n; freeVariables(c.callee, out); for (ExprNode a : c.args) freeVariables(a, out); for (ExprNode a : c.kwargs.values()) freeVariables(a, out); }
        else if (n instanceof FilterExpr) { FilterExpr f = (FilterExpr) n; freeVariables(f.value, out); for (ExprNode a : f.args) freeVariables(a, out); for (ExprNode a : f.kwargs.values()) freeVariables(a, out); }
        else if (n instanceof UnaryExpr) freeVariables(((UnaryExpr) n).operand, out);
        else if (n instanceof BinaryExpr) { freeVariables(((BinaryExpr) n).left, out); freeVariables(((BinaryExpr) n).right, out); }
        else if (n instanceof TestExpr) freeVariables(((TestExpr) n).value, out);
        else if (n instanceof ConditionalExpr) { ConditionalExpr c = (ConditionalExpr) n; freeVariables(c.value, out); freeVariables(c.condition, out); freeVariables(c.otherwise, out); }
    }

    private void checkExpression(JinjaExpression node, String what) {
        if (node.tree != null) {
            List<String> vars = new ArrayList<>();
            freeVariables(node.tree, vars);
            for (String var : vars) {
                if (!isDefined(var)) {
                    reportError(node.line, node.column, "Undefined " + what + " '" + var + "' in {{ " + node.expression + " }}"
                            + (contextVars.isEmpty() ? "" : " (template context provides " + contextVars + ")"));
                }
            }
        } else {
            checkExpression(node.expression, node.line, node.column, what);
        }
    }

    private void checkExpression(String expr, int line, int col, String what) {
        for (String var : freeVariables(expr)) {
            if (!isDefined(var)) {
                reportError(line, col, "Undefined " + what + " '" + var + "' in {{ " + expr + " }}"
                        + (contextVars.isEmpty() ? "" : " (template context provides " + contextVars + ")"));
            }
        }
    }

    @Override
    public Void visitJinjaExpression(JinjaExpression node) {
        checkExpression(node, "variable");
        return super.visitJinjaExpression(node);
    }

    @Override
    public Void visitHtmlElement(HtmlElement node) {
        if (node.attributes != null) {
            for (Node a : node.attributes) {
                if (a instanceof HtmlAttribute) {
                    HtmlAttribute attr = (HtmlAttribute) a;
                    if (attr.value instanceof HtmlAttributeValue) checkInline(((HtmlAttributeValue) attr.value).value, attr);
                    else if (attr.value instanceof JinjaExpression) checkExpression((JinjaExpression) attr.value, "variable");
                    else if (attr.value instanceof CssDeclarationList) {
                        for (Node d : ((CssDeclarationList) attr.value).declarations)
                            if (d instanceof CssDeclaration) checkInline(((CssDeclaration) d).value, attr);
                    }
                }
            }
        }
        return super.visitHtmlElement(node);
    }

    private void checkInline(String text, Node at) {
        if (text == null || !text.contains("{{")) return;
        Matcher m = INLINE_EXPR.matcher(text);
        while (m.find()) checkExpression(m.group(1), at.line, at.column, "variable");
    }

    @Override
    public Void visitForStatement(ForStatement node) {
        // the iterable is checked by visitJinjaExpression; super opens a scope and defines the targets
        return super.visitForStatement(node);
    }

    // if / elif / while conditions are JinjaExpression nodes, the base visitor routes them there

    @Override
    public Void visitAssignmentStatement(AssignmentStatement node) {
        if (node.tree != null) { List<String> vars = new ArrayList<>(); freeVariables(node.tree, vars); for (String v : vars) if (!isDefined(v)) reportError(node.line, node.column, "Undefined variable '" + v + "' in {% set " + node.variable + " = " + node.expression + " %}"); }
        else checkExpression(node.expression, node.line, node.column, "variable");
        return super.visitAssignmentStatement(node);   // defines the variable
    }

    @Override
    public Void visitExtendsStatement(ExtendsStatement node) {
        return null;
    }
}
