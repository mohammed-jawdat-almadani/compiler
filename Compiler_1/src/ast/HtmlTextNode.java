package ast;

public class HtmlTextNode extends Node {
    public String text;

    public HtmlTextNode(int line, int column, String text) {
        super(line, column);
        this.text = text;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlTextNode(this);
    }
}
