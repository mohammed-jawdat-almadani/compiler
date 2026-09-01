package ast.jinja.expr;

// eqIndex: object[index]
public class IndexExpr extends ExprNode {
    public final ExprNode object;
    public final ExprNode index;
    public IndexExpr(int line, int column, ExprNode object, ExprNode index) { super(line, column); this.object = object; this.index = index; }
    @Override public String toString() { return object + "[" + index + "]"; }
}
