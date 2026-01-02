package ast;

public abstract class Node {
    public int line;
    public int column;

    public Node(int line, int column) {
        this.line = line;
        this.column = column;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(line=" + line + ", col=" + column + ")";
    }

    public abstract <T> T accept(NodeVisitor<T> visitor);
}
