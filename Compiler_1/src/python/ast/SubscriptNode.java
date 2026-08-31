package python.ast;
import java.util.ArrayList;
import java.util.List;
public class SubscriptNode extends ExpressionNode {
    public ASTNode container;
    public ASTNode index;

    public SubscriptNode(ASTNode container, ASTNode index, int line) {
        super(line);
        this.container = container;
        this.index = index;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(container);
        list.add(index);
        return list;
    }
}
