package ast;

public class HtmlJinjaNode extends Node {
    public Node jinjaAst; // مرجع لأي Jinja AST ناتج عن JinjaVisitor

    public HtmlJinjaNode(int line, int column, Node jinjaAst) {
        super(line, column);
        this.jinjaAst = jinjaAst;
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        // يمكنك إضافة visitHtmlJinjaNode في NodeVisitor إذا أردت دعم خاص
        return visitor.visitGeneric(this);
    }

    @Override
    public String toString() {
        return "HtmlJinjaNode(line=" + line + ", col=" + column + ", jinjaAst=" + jinjaAst + ")";
    }
}
