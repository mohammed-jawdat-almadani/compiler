package ast.html;

import ast.Node;
import ast.NodeVisitor;

public class HtmlComment extends Node {
    public String text;

    public HtmlComment(int line, int column, String text) {
        super(line, column);
        this.text = text;
    }

    @Override
    public String toString() {
        return "<!-- " + text + " -->" + " -> Node: HtmlComment "+ "line: "+ line;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlComment(this);
    }
}