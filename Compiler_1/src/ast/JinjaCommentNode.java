package ast;

public class JinjaCommentNode extends Node {
    public String commentText;

    public JinjaCommentNode(int line, int column, String commentText) {
        super(line, column);
        this.commentText = commentText;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitJinjaCommentNode(this);
    }
}
