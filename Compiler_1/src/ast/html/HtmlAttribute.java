package ast.html;

import ast.Node;
import ast.NodeVisitor;

public class HtmlAttribute extends Node {
    public String name;
    public Object value; // String or JinjaExpression

    public HtmlAttribute(int line, int column, String name, Object value) {
        super(line, column);
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + " = " + value + ")";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlAttribute(this);
    }
}