package python.ast;

import java.util.List;

public abstract class ASTNode {
    protected int lineNumber;
    protected String nodeName;

    public ASTNode(int lineNumber) {
        this.lineNumber = lineNumber;
        this.nodeName = this.getClass().getSimpleName();
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public abstract List<ASTNode> getChildren();

    public void printTree(String indent) {
        System.out.println(indent + "├── " + this.toString());
        List<ASTNode> children = getChildren();
        for (ASTNode child : children) {
            if (child != null) {
                child.printTree(indent + "│   ");
            }
        }
    }

    @Override
    public String toString() {
        return String.format("\u001B[34m%s\u001B[0m (Line: %d)", nodeName, lineNumber);
    }
}
