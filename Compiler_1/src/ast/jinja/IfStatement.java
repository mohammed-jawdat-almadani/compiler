package ast.jinja;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;

public class IfStatement extends Node {
    public JinjaExpression condition;
    public List<Node> body;
    public List<ElifStatement> elifBlocks;
    public ElseStatement elseBlock;

    public IfStatement(int line, int column, JinjaExpression condition, List<Node> body,
                       List<ElifStatement> elifBlocks, ElseStatement elseBlock) {
        super(line, column);
        this.condition = condition;
        this.body = body;
        this.elifBlocks = elifBlocks;
        this.elseBlock = elseBlock;
    }

    @Override
    public String toString() {
        return "IfStatement(condition=" + condition + ", body=" + body + ", elifBlocks=" + elifBlocks + ", elseBlock=" + elseBlock + ")";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitIfStatement(this);
    }
}
