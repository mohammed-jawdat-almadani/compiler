package python.ast;

import java.util.ArrayList;
import java.util.List;

public class BlockNode extends StatementNode {
    public List<StatementNode> statements;

    public BlockNode(int line) {
        super(line);
        this.statements = new ArrayList<>();
    }

    public void addStatement(StatementNode stmt) {
        this.statements.add(stmt);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(statements);
    }
}
