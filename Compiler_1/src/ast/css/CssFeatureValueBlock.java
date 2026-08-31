package ast.css;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class CssFeatureValueBlock extends Node {
    public String featureType;
    public List<CssFeatureValueDefinition> definitions;

    public CssFeatureValueBlock(int line, int column, String featureType, List<CssFeatureValueDefinition> definitions) {
        super(line, column);
        this.featureType = featureType;
        this.definitions = definitions;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssFeatureValueBlock(this);
    }

    @Override
    public String toString() {
        String defs = definitions.stream()
                .map(d -> "  " + d.toString())
                .collect(Collectors.joining(";\n"));
        return featureType + " {\n" + defs + ";\n}" + " -> Node: CssFeatureValueBlock "+ "line: "+ line;
    }
}
