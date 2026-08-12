package python.ast;

import java.util.Collections;
import java.util.List;

public class KeywordArgumentNode extends ExpressionNode {
    public String name;
    public ExpressionNode value;

    public KeywordArgumentNode(String name, ExpressionNode value, int line) {
        super(line);
        this.name = name;
        this.value = value;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.singletonList(value);
    }
}