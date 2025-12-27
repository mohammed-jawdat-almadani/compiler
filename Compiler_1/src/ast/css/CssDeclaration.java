package ast.css;

import ast.Node;
import ast.NodeVisitor;
public class CssDeclaration extends Node {
    public String property;
    public String value;

    public CssDeclaration(int line, int column, String property, String value) {
        super(line, column);
        this.property = property;
        this.value = value;
    }

    @Override
    public String toString() {
        return property + ": " + value;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssDeclaration(this);
    }
}

