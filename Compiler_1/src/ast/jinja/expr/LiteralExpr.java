package ast.jinja.expr;

/** eqInt / eqDouble / eqString / eqBool / eqNone: a constant. kind is int, float, string, bool or none. */
public class LiteralExpr extends ExprNode {
    public final Object value;
    public final String kind;
    public LiteralExpr(int line, int column, Object value, String kind) { super(line, column); this.value = value; this.kind = kind; }
    @Override public String toString() { return kind.equals("string") ? "'" + value + "'" : String.valueOf(value); }
}
