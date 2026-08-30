package python.ast;

import java.util.ArrayList;
import java.util.List;

public class ReturnNode extends StatementNode {
    public ExpressionNode expression;

    public ReturnNode(ExpressionNode expression, int line) {
        super(line);
        this.expression = expression;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        if (expression != null) list.add(expression);
        return list;
    }
}
