package ast.jinja;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;

public class ElseStatement extends Node {
    public List<Node> body;

    public ElseStatement(int line, int column, List<Node> body) {
        super(line, column);
        this.body = body;
    }

    @Override
    public String toString() {
        return "ElseStatement(body=" + body + ")";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitElseStatement(this);
    }
}