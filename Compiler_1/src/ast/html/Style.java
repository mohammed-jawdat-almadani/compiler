package ast.html;

import ast.Node;
import ast.NodeVisitor;

public class Style extends Node {
    public String content;

    public Style(int line, int column, String content) {
        super(line, column);
        this.content = content;
    }

    @Override
    public String toString() {
        return "Style(content=\"" + content + "\")";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitStyle(this);
    }
}