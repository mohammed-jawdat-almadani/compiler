package ast;

import java.util.ArrayList;
import java.util.List;

public class JinjaElseNode extends Node {
    public List<Node> elseBody = new ArrayList<>();

    public JinjaElseNode(int line, int column) {
        super(line, column);
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitJinjaElseNode(this);
    }
}