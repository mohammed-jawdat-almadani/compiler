package python.ast;
import java.util.ArrayList;
import java.util.List;
public class AttributeAccessNode extends ExpressionNode {
    public ASTNode object;
    public String attributeName;

    public AttributeAccessNode(ASTNode object, String attributeName, int line) {
        super(line);
        this.object = object;
        this.attributeName = attributeName;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        list.add(object);
        return list;
    }

    @Override
    public String toString() {
        return super.toString() + " [Attr: ." + attributeName + "]";
    }
}
