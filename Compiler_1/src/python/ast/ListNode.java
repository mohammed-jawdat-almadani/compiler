package python.ast;

import java.util.ArrayList;
import java.util.List;

public class ListNode extends ExpressionNode {
    public List<ExpressionNode> elements;

    public ListNode(List<ExpressionNode> elements, int line) {
        super(line);
        this.elements = elements;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(elements);
    }
}
