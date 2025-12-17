package ast.html_tag;

import ast.NodeVisitor;
import ast.html.HtmlAttribute;
import ast.html.HtmlTagContent;
import ast.jinja.JinjaExpression;

import java.util.List;

public class TagElifBlock extends HtmlTagContent {
    public JinjaExpression condition;
    public List<HtmlAttribute> attributes;

    public TagElifBlock(int line, int column, JinjaExpression condition, List<HtmlAttribute> attributes) {
        super(line, column);
        this.condition = condition;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "TagElifBlock(condition=" + condition + ", attributes=" + attributes + ")";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitTagElifBlock(this);
    }
}
