package python.ast;

import java.util.ArrayList;
import java.util.List;

public class WhileNode extends StatementNode {
    public ExpressionNode condition;
    public BlockNode body;

    public WhileNode(ExpressionNode condition, BlockNode body, int line) {
        super(line);
        this.condition = condition;
        this.body = body;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(condition);
        list.add(body);
        return list;
    }
}
