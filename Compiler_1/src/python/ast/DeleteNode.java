package python.ast;
import java.util.ArrayList;
import java.util.List;
public class DeleteNode extends StatementNode {
    public List<ASTNode> targets;

    public DeleteNode(List<ASTNode> targets, int line) {
        super(line);
        this.targets = targets;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(targets);
    }
}
