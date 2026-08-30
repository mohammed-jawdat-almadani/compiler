package ast.jinja.expr;

/** eqMul / eqAdd / eqConcat / eqCompare / eqIn / eqAnd / eqOr: {@code left op right}. */
public class BinaryExpr extends ExprNode {
    public final String operator;
    public final ExprNode left;
    public final ExprNode right;
    public BinaryExpr(int line, int column, ExprNode left, String operator, ExprNode right) { super(line, column); this.left = left; this.operator = operator; this.right = right; }
    @Override public String toString() { return "(" + left + " " + operator + " " + right + ")"; }
}
