package python.ast;
import java.util.ArrayList;
import java.util.List;
public class FlowControlNode extends StatementNode {
    public enum Type { BREAK, CONTINUE, PASS }
    public Type type;

    public FlowControlNode(Type type, int line) {
        super(line);
        this.type = type;
    }

    @Override
    public List<ASTNode> getChildren() { return new ArrayList<>(); }

    @Override
    public String toString() {
        return super.toString() + " [" + type + "]";
    }
}
