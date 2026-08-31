package python.ast;
import java.util.ArrayList;
import java.util.List;
public class RaiseNode extends StatementNode {
    public ASTNode exception;

    public RaiseNode(ASTNode exception, int line) {
        super(line);
        this.exception = exception;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        if (exception != null) list.add(exception);
        return list;
    }
}
