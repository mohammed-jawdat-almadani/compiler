package ast.jinja.expr;

// eqId: a variable reference such as products
public class IdentifierExpr extends ExprNode {
    public final String name;
    public IdentifierExpr(int line, int column, String name) { super(line, column); this.name = name; }
    @Override public String toString() { return name; }
}
