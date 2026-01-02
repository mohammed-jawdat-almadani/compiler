package ast.html;

import ast.Node;
import ast.NodeVisitor;

public class HtmlAttribute extends Node {
    public String name;
    public Node value; // HtmlAttributeValue | JinjaExpression | CssDeclarationList

    public HtmlAttribute(int line, int column, String name, Node value) {
        super(line, column);
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == null) return name;
        return name + "=\"" + value.toString() + "\""+ " -> Node: HtmlAttribute "+ "line: "+ line;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlAttribute(this);
    }
}
