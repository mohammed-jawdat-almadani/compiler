package python.ast;
import java.util.ArrayList;
import java.util.List;
public class DecoratorNode extends ASTNode {
    public ASTNode name;

    public DecoratorNode(ASTNode name, int line) {
        super(line);
        this.name = name;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(name);
        return list;
    }
}
