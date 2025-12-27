package ast.jinja;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class ElseStatement extends Node {
    public List<Node> body;

    public ElseStatement(int line, int column, List<Node> body) {
        super(line, column);
        this.body = body;
    }

    @Override
    public String toString() {
        return "{% else %}" + body.stream().map(Object::toString).collect(Collectors.joining());
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitElseStatement(this);
    }
}