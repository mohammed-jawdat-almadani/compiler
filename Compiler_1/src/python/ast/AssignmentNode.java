package python.ast;

import java.util.ArrayList;
import java.util.List;

public class AssignmentNode extends StatementNode {
    public ASTNode target;
    public ASTNode value;

    public AssignmentNode(ASTNode target, ASTNode value, int line) {
        super(line);
        this.target = target;
        this.value = value;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(target);
        list.add(value);
        return list;
    }
}
