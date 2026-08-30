package ast.jinja.expr;

/** eqIs: {@code value is [not] test} — e.g. loop.index is odd, x is not defined. */
public class TestExpr extends ExprNode {
    public final ExprNode value;
    public final String test;
    public final boolean negated;
    public TestExpr(int line, int column, ExprNode value, String test, boolean negated) { super(line, column); this.value = value; this.test = test; this.negated = negated; }
    @Override public String toString() { return value + " is " + (negated ? "not " : "") + test; }
}
