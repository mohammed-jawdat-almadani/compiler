package python.ast;
import java.util.ArrayList;
import java.util.List;
public class ScopeDefNode extends StatementNode {
    public List<String> names;
    public boolean isGlobal;

    public ScopeDefNode(List<String> names, boolean isGlobal, int line) {
        super(line);
        this.names = names;
        this.isGlobal = isGlobal;
    }

    @Override
    public List<ASTNode> getChildren() { return new ArrayList<>(); }

    @Override
    public String toString() {
        return super.toString() + " [" + (isGlobal ? "Global" : "Nonlocal") + ": " + names + "]";
    }
}
