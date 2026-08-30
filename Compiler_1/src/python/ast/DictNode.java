package python.ast;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DictNode extends ExpressionNode {
    public Map<ASTNode, ASTNode> entries;

    public DictNode(int line) {
        super(line);
        this.entries = new LinkedHashMap<>();
    }

    public void addEntry(ASTNode key, ASTNode value) {
        this.entries.put(key, value);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        for (Map.Entry<ASTNode, ASTNode> entry : entries.entrySet()) {
            list.add(entry.getKey());
            list.add(entry.getValue());
        }
        return list;
    }
}
