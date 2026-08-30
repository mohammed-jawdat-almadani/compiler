package python.ast;

import java.util.ArrayList;
import java.util.List;

public class TryNode extends StatementNode {
    public BlockNode tryBody;
    public List<ExceptHandlerNode> handlers;
    public BlockNode finallyBody;
    public BlockNode elseBody;

    public TryNode(BlockNode tryBody, List<ExceptHandlerNode> handlers, BlockNode finallyBody, BlockNode elseBody, int line) {
        super(line);
        this.tryBody = tryBody;
        this.handlers = handlers != null ? handlers : new ArrayList<>();
        this.finallyBody = finallyBody;
        this.elseBody = elseBody;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(tryBody);
        list.addAll(handlers);
        if (elseBody != null) list.add(elseBody);
        if (finallyBody != null) list.add(finallyBody);
        return list;
    }
}
