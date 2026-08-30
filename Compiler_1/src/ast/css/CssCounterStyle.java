package ast.css;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class CssCounterStyle extends Node {
    public String name;
    public List<CssDeclaration> declarations;

    public CssCounterStyle(int line, int column, String name, List<CssDeclaration> declarations) {
        super(line, column);
        this.name = name;
        this.declarations = declarations;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssCounterStyle(this);
    }

    @Override
    public String toString() {
        String decls = declarations.stream()
                .map(d -> "  " + d.toString())
                .collect(Collectors.joining(";\n"));
        return "@counter-style " + name + " {\n" + decls + ";\n} -> Node: CssCounterStyle " + "line: " +line;
    }
}
