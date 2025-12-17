package ast.jinja;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;

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
        return "ForStatement(targets=" + targets + ", iterable=" + iterable + ", body=" + body + ")";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitForStatement(this);
    }
}
