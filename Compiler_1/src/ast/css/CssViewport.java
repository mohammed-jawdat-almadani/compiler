package ast.css;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class CssViewport extends Node {
    public List<CssDeclaration> declarations;

    public CssViewport(int line, int column, List<CssDeclaration> declarations) {
        super(line, column);
        this.declarations = declarations;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssViewport(this);
    }

    @Override
    public String toString() {
        String decls = declarations.stream()
                .map(d -> "  " + d.toString())
                .collect(Collectors.joining(";\n"));
        return "@viewport {\n" + decls + ";\n}"+ " -> Node: CssViewport "+ "line: "+ line;
    }
}
