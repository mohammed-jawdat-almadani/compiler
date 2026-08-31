package python.ast;

import java.util.ArrayList;
import java.util.List;

public class BinaryOpNode extends ExpressionNode {
    public ASTNode left;
    public ASTNode right;
    public String operator;

    public BinaryOpNode(ASTNode left, String operator, ASTNode right, int line) {
        super(line);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(left);
        list.add(right);
        return list;
    }

    @Override
    public String toString() {
        return super.toString() + " [Op: " + operator + "]";
    }
}
