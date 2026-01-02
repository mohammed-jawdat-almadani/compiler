package ast.css;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class CssFontFeatureValuesRule extends Node {
    public List<CssFeatureValueBlock> blocks;

    public CssFontFeatureValuesRule(int line, int column, List<CssFeatureValueBlock> blocks) {
        super(line, column);
        this.blocks = blocks;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssFontFeatureValuesRule(this);
    }

    @Override
    public String toString() {
        return blocks.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"));
    }
}
