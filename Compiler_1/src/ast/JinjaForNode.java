package ast;

import java.util.ArrayList;
import java.util.List;

public class JinjaForNode extends Node {
    public String loopVar;
    public String iterable;
    public List<Node> loopBody = new ArrayList<>();

    public JinjaForNode(int line, int column, String loopVar, String iterable) {
        super(line, column);
        this.loopVar = loopVar;
        this.iterable = iterable;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitJinjaForNode(this);
    }
}
