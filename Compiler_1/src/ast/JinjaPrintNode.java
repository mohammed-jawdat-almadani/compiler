package ast;

public class JinjaPrintNode extends Node {
    public Node valueToPrint;

    public JinjaPrintNode(int line, int column, Node valueToPrint) {
        super(line, column);
        this.valueToPrint = valueToPrint;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitJinjaPrintNode(this);
    }
}
