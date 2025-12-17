package ast.html;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;

public class HtmlContent extends Node {
    public List<Node> nodes;

    public HtmlContent(int line, int column, List<Node> nodes) {
        super(line, column);
        this.nodes = nodes;
    }

    public String toString() {
        return "HtmlContent(nodes=" + nodes + ")";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlContent(this);
    }
}
