package ast.css;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;
import java.util.stream.Collectors;
public class CssMediaRule extends Node {
    public String media;
    public List<Node> rules;

    public CssMediaRule(int line, int column, String media, List<Node> rules) {
        super(line, column);
        this.media = media;
        this.rules = rules;
    }

    @Override
    public String toString() {
        String body = rules.stream().map(r -> "  " + r.toString().replace("\n", "\n  ")).collect(Collectors.joining("\n"));
        return "@media " + media + " {\n" + body + "\n}"+ " -> Node: CssMediaRule "+ "line: "+ line;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssMediaRule(this);
    }
}

