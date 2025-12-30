package ast.css;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class CssSupportsRule extends Node {
    public String condition;
    public List<Node> rules;

    public CssSupportsRule(int line, int column, String condition, List<Node> rules) {
        super(line, column);
        this.condition = condition;
        this.rules = rules;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssSupportsRule(this);
    }

    @Override
    public String toString() {
        String inner = rules.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"));
        return "@supports " + condition + " {\n" + inner + "\n}"+ " -> Node: CssSupportsRule "+ "line: "+ line;
    }
}
