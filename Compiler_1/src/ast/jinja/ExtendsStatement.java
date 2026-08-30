package ast.jinja;

import ast.Node;
import ast.NodeVisitor;

public class ExtendsStatement extends Node {
    public String expression;

    public ExtendsStatement(int line, int column, String expression) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "{% extends " + expression + " %}" + " -> Node: ExtendsStatement "+ "line: "+ line +"\n";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitExtendsStatement(this);
    }
}
