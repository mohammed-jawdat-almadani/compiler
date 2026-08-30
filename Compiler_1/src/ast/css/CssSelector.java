package ast.css;

import ast.Node;
import ast.NodeVisitor;

public class CssSelector extends Node {
    public String name;

    public CssSelector(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n"+name +  " -> Node: CssSelector "+ "line: "+ line;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssSelector(this);
    }
}

