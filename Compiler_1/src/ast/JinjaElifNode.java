package ast;

import java.util.ArrayList;
import java.util.List;

public class JinjaElifNode extends Node {
    public JinjaBooleanExpressionNode condition;
    public List<Node> elifBody = new ArrayList<>();
    public Node followUp;

    public JinjaElifNode(int line, int column, JinjaBooleanExpressionNode condition) {
        super(line, column);
        this.condition = condition;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitJinjaElifNode(this);
    }
}