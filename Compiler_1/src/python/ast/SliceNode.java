package python.ast;
import java.util.ArrayList;
import java.util.List;
public class SliceNode extends ExpressionNode {
    public ASTNode start;
    public ASTNode stop;
    public ASTNode step;

    public SliceNode(ASTNode start, ASTNode stop, ASTNode step, int line) {
        super(line);
        this.start = start;
        this.stop = stop;
        this.step = step;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> list = new ArrayList<>();
        if (start != null) list.add(start);
        if (stop != null) list.add(stop);
        if (step != null) list.add(step);
        return list;
    }

    @Override
    public String toString() {
        return super.toString() + " [Slice]";
    }
}
