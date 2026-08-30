package python.ast;
import java.util.ArrayList;
import java.util.List;
public class TernaryOpNode extends ExpressionNode {
    public ASTNode condition;
    public ASTNode trueExpr;
    public ASTNode falseExpr;

    public TernaryOpNode(ASTNode condition, ASTNode trueExpr, ASTNode falseExpr, int line) {
        super(line);
        this.condition = condition;
        this.trueExpr = trueExpr;
        this.falseExpr = falseExpr;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(condition);
        list.add(trueExpr);
        list.add(falseExpr);
        return list;
    }

    @Override
    public String toString() {
        return super.toString() + " [Ternary ?:]";
    }

}
