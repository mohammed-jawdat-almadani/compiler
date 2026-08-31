package ast.jinja.expr;

import ast.Node;
import ast.NodeVisitor;

/**
 * Base class of the Jinja expression AST. One subclass per labelled alternative of the
 * {@code expression} rule in HtmlJinjaParser.g4 (eqAdd, eqCall, eqFilter, ...).
 * Expression nodes are leaves for the statement-level visitors, so they accept through
 * {@link NodeVisitor#visitGeneric(Node)}.
 */
public abstract class ExprNode extends Node {
    public ExprNode(int line, int column) { super(line, column); }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) { return visitor.visitGeneric(this); }
}
