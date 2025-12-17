package ast.html_tag;

import ast.NodeVisitor;
import ast.html.HtmlAttribute;
import ast.html.HtmlTagContent;
import ast.jinja.JinjaExpression;

import java.util.List;

public class TagIfBlock extends HtmlTagContent {
    public JinjaExpression condition;
    public List<HtmlAttribute> attributes;
    public List<TagElifBlock> elifBlocks;
    public TagElseBlock elseBlock;

    public TagIfBlock(int line, int column, JinjaExpression condition,
                      List<HtmlAttribute> attributes,
                      List<TagElifBlock> elifBlocks,
                      TagElseBlock elseBlock) {
        super(line, column);
        this.condition = condition;
        this.attributes = attributes;
        this.elifBlocks = elifBlocks;
        this.elseBlock = elseBlock;
    }

    @Override
    public String toString() {
        return "TagIfBlock(condition=" + condition + ", attributes=" + attributes +
                ", elifBlocks=" + elifBlocks + ", elseBlock=" + elseBlock + ")";
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitTagIfBlock(this);
    }
}
