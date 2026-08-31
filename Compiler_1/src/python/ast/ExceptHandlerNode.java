package python.ast;
import java.util.ArrayList;
import java.util.List;
public class ExceptHandlerNode extends ASTNode {
    public ASTNode exceptionType;
    public String variableName;
    public BlockNode body;

    public ExceptHandlerNode(ASTNode exceptionType, String variableName, BlockNode body, int line) {
        super(line);
        this.exceptionType = exceptionType;
        this.variableName = variableName;
        this.body = body;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        if (exceptionType != null) list.add(exceptionType);
        list.add(body);
        return list;
    }

    @Override
    public String toString() {
        String info = variableName != null ? " [As: " + variableName + "]" : "";
        return super.toString() + info;
    }
}

