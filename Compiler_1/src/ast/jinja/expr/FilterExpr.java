package ast.jinja.expr;

import java.util.List;
import java.util.Map;

/** eqFilter: {@code value|filter(args)} — e.g. products|length, price|round(2). */
public class FilterExpr extends ExprNode {
    public final ExprNode value;
    public final String filter;
    public final List<ExprNode> args;
    public final Map<String, ExprNode> kwargs;
    public FilterExpr(int line, int column, ExprNode value, String filter, List<ExprNode> args, Map<String, ExprNode> kwargs) {
        super(line, column); this.value = value; this.filter = filter; this.args = args; this.kwargs = kwargs;
    }
    @Override public String toString() { return value + "|" + filter + (args.isEmpty() && kwargs.isEmpty() ? "" : "(" + args + ")"); }
}
