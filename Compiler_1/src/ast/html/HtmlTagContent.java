package ast.html;

import ast.Node;
import ast.NodeVisitor;

public class HtmlTagContent extends Node {
    public String text;
    public HtmlTagContent(int line, int column,String text) { super(line, column);this.text=text; }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlTagContent(this);
    }
}