package ast;

public class JinjaTextNode extends Node {
    public String text;

    public JinjaTextNode(int line, int column, String text) {
        super(line, column);
        this.text = text;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitJinjaTextNode(this);
    }
}
