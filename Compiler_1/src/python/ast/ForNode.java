package python.ast;
import java.util.ArrayList;
import java.util.List;
public class ForNode extends StatementNode {
    public ASTNode target;
    public ASTNode iterator;
    public BlockNode body;
    public BlockNode elseBlock;

    public ForNode(ASTNode target, ASTNode iterator, BlockNode body, BlockNode elseBlock, int line) {
        super(line);
        this.target = target;
        this.iterator = iterator;
        this.body = body;
        this.elseBlock = elseBlock;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(target);
        list.add(iterator);
        list.add(body);
        if (elseBlock != null) list.add(elseBlock);
        return list;
    }
}

