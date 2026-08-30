package ast.jinja;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

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
        String cond = (condition != null) ? condition.expression : "";
        String result = "{% if " + cond + " %}";

        if (body != null) {
            result += body.stream().map(Object::toString).collect(Collectors.joining());
        }

        if (elifBlocks != null) {
            for (ElifStatement elif : elifBlocks) {
                result += (elif != null) ? elif.toString() : "";
            }
        }

        if (elseBlock != null) {
            result += elseBlock.toString();
        }

        result += "{% endif %}";
        return result+ " -> Node: IfStatement "+ "line: "+ line;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitIfStatement(this);
    }
}
