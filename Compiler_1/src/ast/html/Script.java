package ast.html;

import ast.Node;
import ast.NodeVisitor;

public class Script extends Node {
    public String content;
    public String openTag = "<script>";

    public Script(int line, int column, String content) {
        super(line, column);
        this.content = content;
    }

    @Override
    public String toString() {
        return "<script>" + content + "</script>"+ " -> Node: Script "+ "line: "+ line;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitScript(this);
    }
}