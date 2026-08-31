package python.ast;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FromImportNode extends StatementNode {
    public String moduleName;
    public Map<String, String> importedItems;

    public FromImportNode(String moduleName, Map<String, String> importedItems, int line) {
        super(line);
        this.moduleName = moduleName;
        this.importedItems = importedItems;
    }

    @Override
    public List<ASTNode> getChildren() { return new ArrayList<>(); }

    @Override
    public String toString() {
        return super.toString() + " [From: " + moduleName + "] Items: " + importedItems;
    }
}
