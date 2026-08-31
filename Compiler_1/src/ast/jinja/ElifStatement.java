package ast.jinja;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class ElifStatement extends Node {
    public JinjaExpression condition;
    public List<Node> body;

    public ElifStatement(int line, int column, JinjaExpression condition, List<Node> body) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        String cond = (condition != null) ? condition.expression : "";
        String result = "{% elif " + cond + " %}";
        if (body != null) {
            result += body.stream().map(Object::toString).collect(Collectors.joining());
        }
        return result+ " -> Node: ElifStatement "+ "line: "+ line;
    }


    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitElifStatement(this);
    }
}

