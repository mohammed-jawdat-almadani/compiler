package python.ast;

import java.util.ArrayList;
import java.util.List;

public class UnaryOpNode extends ExpressionNode {
    public String operator;
    public ASTNode expression;

    public UnaryOpNode(String operator, ASTNode expression, int line) {
        super(line);
        this.operator = operator;
        this.expression = expression;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(expression);
        return list;
    }

    @Override
    public String toString() {
        return super.toString() + " [Op: " + operator + "]";
    }
}
