package ast;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocumentNode extends Node {
    public List<Node> children = new ArrayList<>();

    public HtmlDocumentNode(int line, int column) {
        super(line, column);
    }

    public void addChild(Node node) {
        children.add(node);
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlDocumentNode(this);
    }
}
