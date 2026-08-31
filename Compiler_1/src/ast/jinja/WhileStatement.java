package ast.jinja;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class WhileStatement extends Node {
    public JinjaExpression condition;
    public List<Node> body;

    public WhileStatement(int line, int column, JinjaExpression condition, List<Node> body) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        return "{% while " + condition.expression + " %}" +
                body.stream().map(Object::toString).collect(Collectors.joining()) +
                "{% endwhile %}"+ " -> Node: WhileStatement "+ "line: "+ line;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitWhileStatement(this);
    }
}
