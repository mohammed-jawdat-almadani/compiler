package ast.html;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class HtmlDocument extends Node {
    public List<Node> children;

    public HtmlDocument(int line, int column, List<Node> children) {
        super(line, column);
        this.children = children;
    }

    public String toString() {
        return children.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlDocument(this);
    }
}
