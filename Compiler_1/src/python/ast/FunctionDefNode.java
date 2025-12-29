package python.ast;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefNode extends StatementNode {
    public String name;
    public List<String> parameters;
    public BlockNode body;
    public List<DecoratorNode> decorators;

    public FunctionDefNode(String name, List<String> parameters, BlockNode body, List<DecoratorNode> decorators, int line) {
        super(line);
        this.name = name;
        this.parameters = parameters;
        this.body = body;
        this.decorators = decorators != null ? decorators : new ArrayList<>();
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.addAll(decorators);
        list.addAll(body.statements);
        return list;
    }

    @Override
    public String toString() {
        return super.toString() + " [Func: " + name + ", Params: " + parameters + "]";
    }
}
