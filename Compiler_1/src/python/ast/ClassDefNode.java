package python.ast;

import java.util.ArrayList;
import java.util.List;

public class ClassDefNode extends StatementNode {
    public String className;
    public BlockNode body;
    public List<DecoratorNode> decorators;


    public ClassDefNode(String className, BlockNode body,  List<DecoratorNode> decorators, int line) {
        super(line);
        this.className = className;
        this.body = body;
        this.decorators = decorators;
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
        return super.toString() + " [Class: " + className + "]";
    }
}
