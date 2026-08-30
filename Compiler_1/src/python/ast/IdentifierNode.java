package python.ast;

import java.util.ArrayList;
import java.util.List;

public class IdentifierNode extends ExpressionNode {
    public String name;

    public IdentifierNode(String name, int line) {
        super(line);
        this.name = name;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString() + " [ID: " + name + "]";
    }
}
