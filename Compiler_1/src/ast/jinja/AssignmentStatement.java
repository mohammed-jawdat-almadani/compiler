package ast.jinja;

import ast.Node;
import ast.NodeVisitor;

public class AssignmentStatement extends Node {
    public String variable;
    public String expression;

    public AssignmentStatement(int line, int column, String variable, String expression) {
        super(line, column);
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "AssignmentStatement(variable=" + variable + ", expression=" + expression + ")";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitAssignmentStatement(this);
    }
}