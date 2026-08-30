package ast.html;

import ast.Node;
import ast.NodeVisitor;
import ast.css.CssDeclaration;

import java.util.List;

public class HtmlStyleAttribute extends Node {

    public List<CssDeclaration> declarations;

    public HtmlStyleAttribute(int line, int column, List<CssDeclaration> declarations) {
        super(line, column);
        this.declarations = declarations;
    }

    @Override
    public String toString() {
        return declarations
                .stream()
                .map(CssDeclaration::toString)
                .reduce((a, b) -> a + "; " + b)
                .orElse("");
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlStyleAttribute(this);
    }
}
