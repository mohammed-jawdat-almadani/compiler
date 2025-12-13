package ast;

public class JinjaBooleanExpressionNode extends Node {
    public String left;
    public String operator;
    public String right;
    public Boolean literalValue; // إذا كانت قيمة مباشرة true/false

    public JinjaBooleanExpressionNode(int line, int column) {
        super(line, column);
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitJinjaBooleanExpressionNode(this);
    }
}
