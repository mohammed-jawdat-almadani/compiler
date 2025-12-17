package ast.html_tag;

import ast.NodeVisitor;
import ast.html.HtmlAttribute;
import ast.html.HtmlTagContent;

import java.util.List;

public class TagElseBlock extends HtmlTagContent {
    public List<HtmlAttribute> attributes;

    public TagElseBlock(int line, int column, List<HtmlAttribute> attributes) {
        super(line, column);
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "TagElseBlock(attributes=" + attributes + ")";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitTagElseBlock(this);
    }
}
