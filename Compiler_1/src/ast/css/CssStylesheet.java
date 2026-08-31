package ast.css;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class CssStylesheet extends Node {
    public List<Node> rules;

    public CssStylesheet(int line, int column, List<Node> rules) {
        super(line, column);
        this.rules = rules;
    }

    @Override
    public String toString() {
        return rules.stream().map(Object::toString).collect(Collectors.joining("\n"));
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssStylesheet(this);
    }
}
