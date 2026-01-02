package python.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ImportNode extends StatementNode {
    public Map<String, String> modules;

    public ImportNode(Map<String, String> modules, int line) {
        super(line);
        this.modules = modules;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString() + " " + modules.toString();
    }
}
