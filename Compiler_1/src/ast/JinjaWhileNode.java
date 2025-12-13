package ast;

import java.util.ArrayList;
import java.util.List;

public class JinjaWhileNode extends Node {
    public JinjaBooleanExpressionNode condition;
    public List<Node> loopBody = new ArrayList<>();

    public JinjaWhileNode(int line, int column, JinjaBooleanExpressionNode condition) {
        super(line, column);
        this.condition = condition;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitJinjaWhileNode(this);
    }
}
