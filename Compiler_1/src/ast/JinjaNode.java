package ast;

import java.util.ArrayList;
import java.util.List;

public class JinjaNode extends Node {
    public List<Node> children = new ArrayList<>();
    public String expression; // يمكن استخدامه لتمثيل نص العقدة الأساسية أو expression

    public JinjaNode(int line, int column) {
        super(line, column);
    }

    public void addChild(Node node) {
        children.add(node);
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitJinjaNode(this);
    }
}
