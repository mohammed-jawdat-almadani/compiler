package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HtmlNode extends Node {
    public String tag;
    public Map<String, String> attributes = new HashMap<>();
    public List<Node> children = new ArrayList<>();

    public HtmlNode(int line, int column, String tag) {
        super(line, column);
        this.tag = tag;
    }

    public void addAttribute(String key, String value) {
        attributes.put(key, value);
    }

    public void addChild(Node node) {
        children.add(node);
    }

    @Override
    public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visitHtmlNode(this);
    }
}
