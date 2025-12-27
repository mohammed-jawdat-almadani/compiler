package ast.jinja;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class ForStatement extends Node {
    public List<String> targets;
    public JinjaExpression iterable;
    public List<Node> body;

    public ForStatement(int line, int column, List<String> targets, JinjaExpression iterable, List<Node> body) {
        super(line, column);
        this.targets = targets;
        this.iterable = iterable;
        this.body = body;
    }

    @Override
    public String toString() {
        String targetStr = String.join(", ", targets);
        return "{% for " + targetStr + " in " + iterable.expression + " %}" +
                body.stream().map(Object::toString).collect(Collectors.joining()) +
                "{% endfor %}";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitForStatement(this);
    }
}
