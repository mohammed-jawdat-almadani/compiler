package python.ast;

import java.util.ArrayList;
import java.util.List;

public class LiteralNode extends ExpressionNode {
    public Object value;
    public String type;

    public LiteralNode(Object value, String type, int line) {
        super(line);
        this.value = value;
        this.type = type;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString() + " [Value: " + value + ", Type: " + type + "]";
    }
}
