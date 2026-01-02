package ast.css;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class CssFontFaceRule extends Node {
    public List<CssDeclaration> declarations;

    public CssFontFaceRule(int line, int column, List<CssDeclaration> declarations) {
        super(line, column);
        this.declarations = declarations;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssFontFaceRule(this);
    }

    @Override
    public String toString() {
        String decls = declarations.stream()
                .map(d -> "  " + d.toString())
                .collect(Collectors.joining(";\n"));
        return "@font-face {\n" + decls + ";\n}" + " -> Node: CssFontFaceRule "+ "line: "+ line;
    }
}
