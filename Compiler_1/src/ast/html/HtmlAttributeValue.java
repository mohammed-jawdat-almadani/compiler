package ast.html;

import ast.Node;
import ast.NodeVisitor;

public class HtmlAttributeValue extends Node {

    public String value;

    public HtmlAttributeValue(int line, int column, String value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " -> Node: HtmlAttributeValue "+ "line: "+ line;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlAttributeValue(this);
    }
}
