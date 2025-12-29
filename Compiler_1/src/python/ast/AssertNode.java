package python.ast;
import java.util.ArrayList;
import java.util.List;
public class AssertNode extends StatementNode {
    public ASTNode condition;
    public ASTNode message;

    public AssertNode(ASTNode condition, ASTNode message, int line) {
        super(line);
        this.condition = condition;
        this.message = message;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(condition);
        if (message != null) list.add(message);
        return list;
    }
}
