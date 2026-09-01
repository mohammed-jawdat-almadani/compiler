package ast.jinja.expr;

// eqTernary: value if condition else otherwise
public class ConditionalExpr extends ExprNode {
    public final ExprNode value;
    public final ExprNode condition;
    public final ExprNode otherwise;   // may be null
    public ConditionalExpr(int line, int column, ExprNode value, ExprNode condition, ExprNode otherwise) { super(line, column); this.value = value; this.condition = condition; this.otherwise = otherwise; }
    @Override public String toString() { return value + " if " + condition + (otherwise != null ? " else " + otherwise : ""); }
}
