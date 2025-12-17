package ast.html_tag;

import ast.NodeVisitor;
import ast.html.HtmlAttribute;
import ast.html.HtmlTagContent;
import ast.jinja.JinjaExpression;

import java.util.List;

public class TagWhileBlock extends HtmlTagContent {
    public List<HtmlAttribute> attributes;
    public JinjaExpression condition;

    public TagWhileBlock(int line, int column, List<HtmlAttribute> attributes, JinjaExpression condition) {
        super(line, column);
        this.attributes = attributes;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "TagWhileBlock(condition=" + condition + ", attributes=" + attributes + ")";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitTagWhileBlock(this);
    }
}