package ast.jinja;

import ast.Node;
import ast.NodeVisitor;

import java.util.List;

public class BlockStatement extends Node {
    private final String name;      // can be null if not provided
    public final List<Node> body;

    public BlockStatement(int line, int column, String name, List<Node> body) {
        super(line, column);
        this.name = name;
        this.body = body;
    }

    public String getName() { return name; }
    public List<Node> getBody() { return body; }

    public void printTree(String indent) {
        String blockName = (name == null || name.trim().isEmpty()) ? "<anonymous>" : name;
        System.out.println(indent + "BlockStatement \"" + blockName + "\""
                + " (line " + line + ", col " + column + ")");
        if (body != null && !body.isEmpty()) {
            String childIndent = indent + "  ";
            for (Node child : body) {
                if (child == null) continue;
                try {
                    // if the child node has its own printTree(indent) method
                    child.getClass().getMethod("printTree", String.class)
                            .invoke(child, childIndent);
                } catch (Exception e) {
                    // fallback: print child.toString()
                    System.out.println(childIndent + child.toString());
                }
            }
        }
    }

@Override
public String toString() {
    String blockName = (name == null || name.trim().isEmpty()) ? "<anonymous>" : name;

    StringBuilder sb = new StringBuilder();
    sb.append("BlockStatement")
      .append("(name=\"").append(blockName).append("\", ")
      .append("line=").append(line).append(", ")
      .append("col=").append(column).append(")");

    // Body
    sb.append("\n");
    sb.append("  body:");

    if (body == null || body.isEmpty()) {
        sb.append(" <empty>");
        return sb.toString();
    }

    for (int i = 0; i < body.size(); i++) {
        Node child = body.get(i);
        sb.append("\n");
        sb.append("    "); // indent for each child line

        if (child == null) {
            sb.append("<null>");
            continue;
        }

        // Child string (may itself be multi-line)
        String childStr = child.toString();
        if (childStr == null) childStr = "<null-toString>";

        // Indent multi-line child outputs nicely
        sb.append(indentMultiline(childStr, "    "));
    }

    return sb.toString();
}

private static String indentMultiline(String s, String indent) {
    // First line should not get extra indent (already appended by caller),
    // but subsequent lines should.
    int idx = s.indexOf('\n');
    if (idx < 0) return s;

    String[] lines = s.split("\\R", -1); // keep trailing empty lines if any
    StringBuilder out = new StringBuilder();
    out.append(lines[0]);
    for (int i = 1; i < lines.length; i++) {
        out.append("\n").append(indent).append(lines[i]);
    }
    return out.toString();
}

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitBlockStatement(this);
    }
}
