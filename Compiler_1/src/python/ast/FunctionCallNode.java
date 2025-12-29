package python.ast;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallNode extends ExpressionNode {
    public ASTNode functionName;
    public List<ExpressionNode> arguments;

    public FunctionCallNode(ASTNode functionName, List<ExpressionNode> arguments, int line) {
        super(line);
        this.functionName = functionName;
        this.arguments = arguments != null ? arguments : new ArrayList<>();
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(functionName);
        list.addAll(arguments);
        return list;
    }
}
