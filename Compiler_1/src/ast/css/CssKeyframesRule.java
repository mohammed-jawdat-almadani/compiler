package ast.css;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class CssKeyframesRule extends Node {
    public String name;
    public List<CssKeyframeBlock> blocks;

    public CssKeyframesRule(int line, int column, String name, List<CssKeyframeBlock> blocks) {
        super(line, column);
        this.name = name;
        this.blocks = blocks;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssKeyframesRule(this);
    }

    @Override
    public String toString() {
        String inner = blocks.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"));
        return "@keyframes " + name + " {\n" + inner + "\n}";
    }
}

