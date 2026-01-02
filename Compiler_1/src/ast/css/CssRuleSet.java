package ast.css;

import ast.Node;
import ast.NodeVisitor;
import ast.css.CssDeclaration;
import ast.css.CssSelector;

import java.util.List;
import java.util.stream.Collectors;

public class CssRuleSet extends Node {
    public List<CssSelector> selectors;
    public List<CssDeclaration> declarations;

    public CssRuleSet(int line, int column, List<CssSelector> selectors, List<CssDeclaration> declarations) {
        super(line, column);
        this.selectors = selectors;
        this.declarations = declarations;
    }

    @Override
    public String toString() {
        String sel = selectors.stream().map(Object::toString).collect(Collectors.joining(", "));
        String decls = declarations.stream().map(d -> "  " + d.toString()).collect(Collectors.joining(";\n"));
        return sel + " {\n" + decls + (decls.isEmpty() ? "" : ";") + "\n}" +  " -> Node: CssRuleSet "+ "line: "+ line + "\n";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitCssRuleSet(this);
    }
}
