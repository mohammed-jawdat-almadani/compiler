package ast;

import java.util.ArrayList;
import java.util.List;

public class JinjaIfNode extends Node {
    public JinjaBooleanExpressionNode condition;
    public List<Node> ifBody = new ArrayList<>();
    public Node followUp; // يمكن أن يكون elif أو else

    public JinjaIfNode(int line, int column, JinjaBooleanExpressionNode condition) {
        super(line, column);
        this.condition = condition;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitJinjaIfNode(this);
    }
}