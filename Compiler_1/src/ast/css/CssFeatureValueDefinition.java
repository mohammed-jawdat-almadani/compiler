package ast.css;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class CssFeatureValueDefinition extends Node {
    public String name;
    public List<String> values;

    public CssFeatureValueDefinition(int line, int column, String name, List<String> values) {
        super(line, column);
        this.name = name;
        this.values = values;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssFeatureValueDefinition(this);
    }

    @Override
    public String toString() {
        return name + ": " + String.join(" ", values) + " -> Node: CssFeatureValueDefinition "+ "line: "+ line;
    }
}
