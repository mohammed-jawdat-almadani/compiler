package python.ast;
import java.util.ArrayList;
import java.util.List;
public class LambdaNode extends ExpressionNode {
    public List<String> parameters;
    public ASTNode body;

    public LambdaNode(List<String> parameters, ASTNode body, int line) {
        super(line);
        this.parameters = parameters != null ? parameters : new ArrayList<>();
        this.body = body;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(body);
        return list;
    }

    @Override
    public String toString() {
        return super.toString() + " [Lambda Params: " + parameters + "]";
    }

}
