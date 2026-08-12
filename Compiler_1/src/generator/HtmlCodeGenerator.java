package generator;

import ast.*;
import ast.html.*;
import ast.jinja.*;
import ast.css.*;

import java.io.StringWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class HtmlCodeGenerator {
    private final StringWriter stringWriter = new StringWriter();
    private final PrintWriter emit = new PrintWriter(stringWriter);
    
    private static final Map<String, String> CLASS_TO_STYLE = new HashMap<>();
    static {
        CLASS_TO_STYLE.put("container-box", "width: 100%; max-width: 500px; padding: 15px; background: #ffffff;");
        CLASS_TO_STYLE.put("row-layout", "display: flex; flex-direction: row; align-items: center; gap: 10px;");
        CLASS_TO_STYLE.put("column-layout", "display: flex; flex-direction: column; gap: 12px;");
        CLASS_TO_STYLE.put("pad-10", "padding: 10px; margin: 10px;");
        CLASS_TO_STYLE.put("spacer-h20", "height: 20px;");
        CLASS_TO_STYLE.put("ui-card", "box-shadow: 0 4px 8px rgba(0,0,0,0.1);");
        CLASS_TO_STYLE.put("list-tile", "display: flex;");
    }

    public void generate(Node htmlRoot) {
        if (htmlRoot == null) return;
        visit(htmlRoot);
    }

    public String getGeneratedCode() {
        return stringWriter.toString();
    }

    private void visit(Node node) {
        if (node == null) return;

        if (node instanceof HtmlDocument) {
            for (Node child : ((HtmlDocument) node).children) {
                visit(child);
            }
        } else if (node instanceof HtmlElement) {
            HtmlElement el = (HtmlElement) node;
            emit.print("<" + el.tagName);
            
            boolean isInput = el.tagName.equalsIgnoreCase("input");
            boolean hasType = false;
            String inputName = null;
            
            StringBuilder styleAttr = new StringBuilder();
            for (Node attrNode : el.attributes) {
                if (attrNode instanceof HtmlAttribute) {
                    HtmlAttribute attr = (HtmlAttribute) attrNode;
                    if (attr.name.equalsIgnoreCase("class") && attr.value instanceof HtmlAttributeValue) {
                        String className = ((HtmlAttributeValue)attr.value).value;
                        if (CLASS_TO_STYLE.containsKey(className)) {
                            styleAttr.append(CLASS_TO_STYLE.get(className)).append(" ");
                        } else {
                            emit.print(" class=\"" + className + "\"");
                        }
                    } else if (attr.name.equalsIgnoreCase("style") && attr.value instanceof CssDeclarationList) {
                        CssDeclarationList decls = (CssDeclarationList) attr.value;
                        for (Node declNode : decls.declarations) {
                            CssDeclaration decl = (CssDeclaration) declNode;
                            styleAttr.append(decl.property).append(": ").append(decl.value).append("; ");
                        }
                    } else {
                        emit.print(" " + attr.name);
                        if (attr.value != null) {
                            if (attr.value instanceof HtmlAttributeValue) {
                                emit.print("=\"" + ((HtmlAttributeValue)attr.value).value + "\"");
                            } else if (attr.value instanceof JinjaExpression) {
                                emit.print("=\"{{ " + ((JinjaExpression)attr.value).expression + " }}\"");
                            }
                        }
                        if (isInput && attr.name.equalsIgnoreCase("name") && attr.value instanceof HtmlAttributeValue) {
                            inputName = ((HtmlAttributeValue)attr.value).value;
                        }
                        if (isInput && attr.name.equalsIgnoreCase("type")) hasType = true;
                    }
                }
            }
            
            if (styleAttr.length() > 0) {
                emit.print(" style=\"" + styleAttr.toString().trim() + "\"");
            }
            
            if (isInput && inputName != null) {
                boolean hasValue = el.attributes.stream().anyMatch(a -> a instanceof HtmlAttribute && ((HtmlAttribute)a).name.equalsIgnoreCase("value"));
                if (!hasValue) {
                    emit.print(" value=\"{{ request.form.get('" + inputName + "', '') }}\"");
                }
            }
            
            emit.print(">");
            
            if (!isVoidElement(el.tagName)) {
                for (Node child : el.children) {
                    visit(child);
                }
                emit.print("</" + el.tagName + ">");
            }
        } else if (node instanceof HtmlChardata) {
            emit.print(((HtmlChardata) node).text);
        } else if (node instanceof JinjaExpression) {
            emit.print("{{ " + ((JinjaExpression) node).expression + " }}");
        } else if (node instanceof ExtendsStatement) {
            emit.print("{% extends " + ((ExtendsStatement) node).expression + " %}\n");
        } else if (node instanceof BlockStatement) {
            BlockStatement bNode = (BlockStatement) node;
            emit.print("{% block " + bNode.getName() + " %}\n");
            for (Node child : bNode.getBody()) {
                visit(child);
            }
            emit.print("\n{% endblock %}\n");
        } else if (node instanceof ForStatement) {
            ForStatement fNode = (ForStatement) node;
            emit.print("{% for " + String.join(", ", fNode.targets) + " in " + fNode.iterable.expression + " %}");
            for (Node child : fNode.body) {
                visit(child);
            }
            emit.print("{% endfor %}");
        } else if (node instanceof IfStatement) {
            IfStatement ifNode = (IfStatement) node;
            emit.print("{% if " + ifNode.condition.expression + " %}");
            for (Node child : ifNode.body) {
                visit(child);
            }
            for (ElifStatement elif : ifNode.elifBlocks) {
                emit.print("{% elif " + elif.condition.expression + " %}");
                for (Node child : elif.body) {
                    visit(child);
                }
            }
            if (ifNode.elseBlock != null) {
                emit.print("{% else %}");
                for (Node child : ifNode.elseBlock.body) {
                    visit(child);
                }
            }
            emit.print("{% endif %}");
        } else {
            // Unhandled node, we should ideally traverse children or implement them.
        }
    }
    
    private boolean isVoidElement(String tagName) {
        String t = tagName.toLowerCase();
        return t.equals("area") || t.equals("base") || t.equals("br") || t.equals("col") ||
               t.equals("embed") || t.equals("hr") || t.equals("img") || t.equals("input") ||
               t.equals("link") || t.equals("meta") || t.equals("param") || t.equals("source") ||
               t.equals("track") || t.equals("wbr");
    }
}