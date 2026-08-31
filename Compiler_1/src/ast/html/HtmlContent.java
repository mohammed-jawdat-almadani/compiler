package ast.html;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class HtmlContent extends Node {
    public List<Node> nodes;

    public HtmlContent(int line, int column, List<Node> nodes) {
        super(line, column);
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        if (nodes == null) return "";
        return nodes.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlContent(this);
    }
}
