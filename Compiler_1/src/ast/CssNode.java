package ast;

import java.util.ArrayList;
import java.util.List;

public class CssNode extends Node {
    public String selector;
    public List<DeclarationNode> declarations = new ArrayList<>();

    public CssNode(int line, int column, String selector) {
        super(line, column);
        this.selector = selector;
    }

    public void addDeclaration(DeclarationNode declarationNode) {
        declarations.add(declarationNode);
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssNode(this);
    }
}
