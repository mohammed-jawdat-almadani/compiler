package ast.jinja;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;

public class ElifStatement extends Node {
    public JinjaExpression condition;
    public List<Node> body;

    public ElifStatement(int line, int column, JinjaExpression condition, List<Node> body) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        return "ElifStatement(condition=" + condition + ", body=" + body + ")";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitElifStatement(this);
    }
}

