package ast;

public class JinjaExpressionNode extends Node {
    public String expression; // نص الـ expression

    public JinjaExpressionNode(int line, int column, String expression) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitJinjaExpressionNode(this);
    }
}
