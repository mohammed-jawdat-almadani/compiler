package ast.css;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class CssKeyframeBlock extends Node {
    public List<String> selectors; // FROM, TO, or percentage
    public List<CssDeclaration> declarations;

    public CssKeyframeBlock(int line, int column, List<String> selectors, List<CssDeclaration> declarations) {
        super(line, column);
        this.selectors = selectors;
        this.declarations = declarations;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssKeyframeBlock(this);
    }

    @Override
    public String toString() {
        String sel = String.join(", ", selectors);
        String decls = declarations.stream()
                .map(d -> "  " + d.toString())
                .collect(Collectors.joining(";\n"));
        return sel + " {\n" + decls + ";\n}"+ " -> Node: CssKeyframeBlock "+ "line: "+ line;
    }
}
