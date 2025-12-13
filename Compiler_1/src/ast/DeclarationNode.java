package ast;

public class DeclarationNode extends Node {
    public String property;
    public String value;

    public DeclarationNode(int line, int column, String property, String value) {
        super(line, column);
        this.property = property;
        this.value = value;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitDeclarationNode(this);
    }
}
