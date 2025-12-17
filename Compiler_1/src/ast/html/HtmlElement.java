package ast.html;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;

public class HtmlElement extends Node {
    public String tagName;
    public List<HtmlTagContent> attributes;
    public List<Node> children;

    public HtmlElement(int line, int column, String tagName, List<HtmlTagContent> attributes, List<Node> children) {
        super(line, column);
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
    }

    @Override
    public String toString() {
        return "<" + tagName + attributes + ", ch:" + children;
    }


    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlElement(this);
    }
}
