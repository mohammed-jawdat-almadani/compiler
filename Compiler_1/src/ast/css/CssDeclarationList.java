package ast.css;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;

public class CssDeclarationList extends Node {
    public List<Node> declarations;

    public CssDeclarationList(int line, int column, List<Node> declarations) {
        super(line, column);
        this.declarations = declarations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node decl : declarations) {
            sb.append(decl.toString()).append("; ");
        }
        return sb.toString().trim();
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssDeclarationList(this);
    }
}
