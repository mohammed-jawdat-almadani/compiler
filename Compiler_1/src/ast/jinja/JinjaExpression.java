package ast.jinja;

import ast.Node;
import ast.NodeVisitor;

public class JinjaExpression extends Node {
    public String expression;

    public JinjaExpression(int line, int column, String expression) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "{{ " + expression + " }}" + " -> Node: JinjaExpression "+ "line: "+ line;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitJinjaExpression(this);
    }
}