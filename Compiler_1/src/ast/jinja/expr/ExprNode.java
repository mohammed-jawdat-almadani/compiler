package ast.jinja.expr;

import ast.Node;
import ast.NodeVisitor;

// Base of the Jinja expression AST, one subclass per labelled alternative of the expression rule.
// Statement-level visitors treat these as leaves (visitGeneric).
public abstract class ExprNode extends Node {
    public ExprNode(int line, int column) { super(line, column); }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) { return visitor.visitGeneric(this); }
}
