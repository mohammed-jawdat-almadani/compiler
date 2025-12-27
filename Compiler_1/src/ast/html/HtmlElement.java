package ast.html;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class HtmlElement extends Node {
    public String tagName;
    public List<Node> attributes;
    public List<Node> children;

    public HtmlElement(int line, int column, String tagName, List<Node> attributes, List<Node> children) {
        super(line, column);
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
    }

    @Override
    public String toString() {
        String attrs = "";
        if (attributes != null && !attributes.isEmpty()) {
            attrs = attributes.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" ", " ", ""));
        }

        String content = "";
        if (children != null && !children.isEmpty()) {
            content = children.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining());
        }

        return "<" + tagName + attrs + ">" + content + "</" + tagName + ">";
    }



    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlElement(this);
    }
}
