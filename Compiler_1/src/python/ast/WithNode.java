package python.ast;
import java.util.ArrayList;
import java.util.List;
public class WithNode extends StatementNode {
    public ASTNode contextExpr;
    public ASTNode optionalTarget;
    public BlockNode body;

    public WithNode(ASTNode contextExpr, ASTNode optionalTarget, BlockNode body, int line) {
        super(line);
        this.contextExpr = contextExpr;
        this.optionalTarget = optionalTarget;
        this.body = body;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(contextExpr);
        if (optionalTarget != null) list.add(optionalTarget);
        list.add(body);
        return list;
    }
}
