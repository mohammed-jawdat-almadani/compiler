package python.ast;

import java.util.ArrayList;
import java.util.List;

public class IfNode extends StatementNode {
    public ExpressionNode condition;
    public BlockNode thenBlock;
    public BlockNode elseBlock;

    public IfNode(ExpressionNode condition, BlockNode thenBlock, BlockNode elseBlock, int line) {
        super(line);
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(condition);
        list.add(thenBlock);
        if (elseBlock != null) list.add(elseBlock);
        return list;
    }
}
