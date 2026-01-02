package python.ast;
import java.util.ArrayList;
import java.util.List;
public class AugmentedAssignNode extends StatementNode {
    public ASTNode target;
    public String operator;
    public ASTNode value;

    public AugmentedAssignNode(ASTNode target, String operator, ASTNode value, int line) {
        super(line);
        this.target = target;
        this.operator = operator;
        this.value = value;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(target);
        list.add(value);
        return list;
    }

    @Override
    public String toString() {
        return super.toString() + " [Op: " + operator + "]";
    }
}
