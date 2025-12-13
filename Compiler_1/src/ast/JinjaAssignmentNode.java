package ast;

public class JinjaAssignmentNode extends Node {
    public String variableName;
    public Node expression;

    public JinjaAssignmentNode(int line, int column, String variableName, Node expression) {
        super(line, column);
        this.variableName = variableName;
        this.expression = expression;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitJinjaAssignmentNode(this);
    }
}
