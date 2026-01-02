package python.ast;
import java.util.ArrayList;
import java.util.List;
public class YieldNode extends StatementNode {
    public ASTNode value;
    public boolean isYieldFrom;

    public YieldNode(ASTNode value, boolean isYieldFrom, int line) {
        super(line);
        this.value = value;
        this.isYieldFrom = isYieldFrom;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        if (value != null) list.add(value);
        return list;
    }

    @Override
    public String toString() {
        return super.toString() + (isYieldFrom ? " [From]" : "");
    }
}
