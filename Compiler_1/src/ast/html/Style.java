package ast.html;

import ast.Node;
import ast.NodeVisitor;

public class Style extends Node {
    public Node node;
    public String rawCss;

    public Style(int line, int column, Node node) {
        super(line, column);
        this.node = node;
    }

    @Override
    public String toString() {
        return "<style>" + node.toString() + "</style>"+ " -> Node: Style "+ "line: "+ line;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitStyle(this);
    }
}