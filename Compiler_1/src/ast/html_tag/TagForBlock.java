package ast.html_tag;

import ast.NodeVisitor;
import ast.html.HtmlAttribute;
import ast.html.HtmlTagContent;
import ast.jinja.JinjaExpression;

import java.util.List;

public class TagForBlock extends HtmlTagContent {
    public List<HtmlAttribute> attributes;
    public JinjaExpression iterable;

    public TagForBlock(int line, int column, List<HtmlAttribute> attributes, JinjaExpression iterable) {
        super(line, column);
        this.attributes = attributes;
        this.iterable = iterable;
    }

    @Override
    public String toString() {
        return "TagForBlock(iterable=" + iterable + ", attributes=" + attributes + ")";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitTagForBlock(this);
    }
}

