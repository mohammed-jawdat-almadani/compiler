package ast.html;


import ast.Node;
import ast.NodeVisitor;

public class HtmlChardata extends Node {
    public String text;

    public HtmlChardata(int line, int column, String text) {
        super(line, column);
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }



    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlChardata(this);
    }
}