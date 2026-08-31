package ast.jinja.expr;

import java.util.List;
import java.util.Map;

/** eqCall: {@code callee(arg, key=value)} — e.g. url_for('static', filename='style.css'). */
public class CallExpr extends ExprNode {
    public final ExprNode callee;
    public final List<ExprNode> args;
    public final Map<String, ExprNode> kwargs;
    public CallExpr(int line, int column, ExprNode callee, List<ExprNode> args, Map<String, ExprNode> kwargs) {
        super(line, column); this.callee = callee; this.args = args; this.kwargs = kwargs;
    }
    @Override public String toString() { return callee + "(" + args + (kwargs.isEmpty() ? "" : ", " + kwargs) + ")"; }
}
