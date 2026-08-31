package ast.jinja.expr;

/** eqNot / eqNeg: {@code not x}, {@code -x}. */
public class UnaryExpr extends ExprNode {
    public final String operator;
    public final ExprNode operand;
    public UnaryExpr(int line, int column, String operator, ExprNode operand) { super(line, column); this.operator = operator; this.operand = operand; }
    @Override public String toString() { return operator + " " + operand; }
}
