package ast.jinja.expr;

/** eqAttr: {@code object.name}. */
public class AttributeExpr extends ExprNode {
    public final ExprNode object;
    public final String name;
    public AttributeExpr(int line, int column, ExprNode object, String name) { super(line, column); this.object = object; this.name = name; }
    @Override public String toString() { return object + "." + name; }
}
