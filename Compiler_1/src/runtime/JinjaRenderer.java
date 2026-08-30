package runtime;

import ast.Node;
import ast.css.CssDeclaration;
import ast.css.CssDeclarationList;
import ast.html.*;
import ast.jinja.*;
import runtime.JinjaExpressionEvaluator.SafeString;
import runtime.JinjaExpressionEvaluator.Scope;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Renders a parsed Jinja template (the HtmlDocument AST) into final HTML by
 * substituting the context data produced by {@link PythonContextEvaluator}.
 *
 * Handles {@code {{ expr }}}, {@code {% for %}}, {@code {% if/elif/else %}},
 * {@code {% set %}}, {@code {% while %}} and template inheritance
 * ({@code {% extends %}} / {@code {% block %}}).
 */
public class JinjaRenderer {

    private final Map<String, Node> templates;      // template name -> parsed AST
    private final JinjaExpressionEvaluator evaluator = new JinjaExpressionEvaluator();
    private final List<String> log;
    private final List<String> warnings = new ArrayList<>();
    private String currentTemplate = "";

    private static final Pattern INLINE_EXPR = Pattern.compile("\\{\\{\\s*(.*?)\\s*\\}\\}");

    public JinjaRenderer(Map<String, Node> templates, List<String> log) {
        this.templates = templates;
        this.log = log != null ? log : new ArrayList<>();
    }

    public JinjaExpressionEvaluator getEvaluator() { return evaluator; }
    public List<String> getWarnings() { return warnings; }

    /** Registers a global function available to every template (e.g. url_for). */
    public void registerFunction(String name, Function<List<Object>, Object> fn) { evaluator.registerFunction(name, fn); }

    /* ------------------------------------------------------------------ */
    /*  Entry point                                                        */
    /* ------------------------------------------------------------------ */

    public String render(String templateName, Map<String, Object> context) {
        Node doc = templates.get(templateName);
        if (doc == null) throw new RuntimeException("template not found: " + templateName);
        Scope scope = new Scope(context);
        StringBuilder out = new StringBuilder();
        currentTemplate = templateName;
        renderDocument(doc, scope, new HashMap<>(), out, templateName);
        return out.toString();
    }

    /**
     * Renders a document. If it {% extends %} a parent, its {% block %}s are collected
     * (child blocks win over blocks already collected from a deeper child) and the
     * parent is rendered instead, exactly like Jinja's inheritance model.
     */
    private void renderDocument(Node doc, Scope scope, Map<String, BlockStatement> blocks, StringBuilder out, String name) {
        List<Node> children = doc instanceof HtmlDocument ? ((HtmlDocument) doc).children : Collections.singletonList(doc);

        String parent = null;
        for (Node c : children) {
            if (c instanceof ExtendsStatement) { parent = unquote(((ExtendsStatement) c).expression); break; }
        }

        if (parent != null) {
            collectBlocks(children, blocks);
            Node parentDoc = templates.get(parent);
            if (parentDoc == null) throw new RuntimeException("parent template not found: " + parent + " (extended by " + name + ")");
            log.add("  " + name + " extends " + parent + " (blocks overridden: " + blockNames(children) + ")");
            String saved = currentTemplate;
            currentTemplate = parent;
            renderDocument(parentDoc, scope, blocks, out, parent);
            currentTemplate = saved;
            return;
        }

        for (Node c : children) renderNode(c, scope, blocks, out);
    }

    private void collectBlocks(List<Node> nodes, Map<String, BlockStatement> blocks) {
        for (Node n : nodes) {
            if (n instanceof BlockStatement) {
                BlockStatement b = (BlockStatement) n;
                if (b.getName() != null && !blocks.containsKey(b.getName())) blocks.put(b.getName(), b);
            }
        }
    }

    private static List<String> blockNames(List<Node> nodes) {
        List<String> out = new ArrayList<>();
        for (Node n : nodes) if (n instanceof BlockStatement) out.add(((BlockStatement) n).getName());
        return out;
    }

    /* ------------------------------------------------------------------ */
    /*  Node rendering                                                     */
    /* ------------------------------------------------------------------ */

    private void renderNodes(List<Node> nodes, Scope scope, Map<String, BlockStatement> blocks, StringBuilder out) {
        if (nodes == null) return;
        for (Node n : nodes) renderNode(n, scope, blocks, out);
    }

    private void renderNode(Node node, Scope scope, Map<String, BlockStatement> blocks, StringBuilder out) {
        if (node == null) return;

        if (node instanceof HtmlDocument) {
            renderNodes(((HtmlDocument) node).children, scope, blocks, out);

        } else if (node instanceof HtmlContent) {
            renderNodes(((HtmlContent) node).nodes, scope, blocks, out);

        } else if (node instanceof HtmlElement) {
            HtmlElement el = (HtmlElement) node;
            out.append('<').append(el.tagName);
            if (el.attributes != null) for (Node a : el.attributes) renderAttribute(a, scope, out);
            out.append('>');
            if (!isVoidElement(el.tagName)) {
                renderNodes(el.children, scope, blocks, out);
                out.append("</").append(el.tagName).append('>');
            }

        } else if (node instanceof HtmlChardata) {
            out.append(((HtmlChardata) node).text);

        } else if (node instanceof HtmlTagContent) {
            out.append(((HtmlTagContent) node).text);

        } else if (node instanceof HtmlComment) {
            out.append(((HtmlComment) node).text);

        } else if (node instanceof Script) {
            Script s = (Script) node;
            out.append(substituteInline(s.openTag, scope)).append(substituteInline(s.content, scope));

        } else if (node instanceof Style) {
            Style s = (Style) node;
            out.append("<style>").append(s.rawCss != null ? s.rawCss : String.valueOf(s.node)).append("</style>");

        } else if (node instanceof JinjaExpression) {
            out.append(escape(eval(((JinjaExpression) node).expression, scope, node)));

        } else if (node instanceof ExtendsStatement) {
            // handled in renderDocument

        } else if (node instanceof BlockStatement) {
            BlockStatement b = (BlockStatement) node;
            BlockStatement override = b.getName() != null ? blocks.get(b.getName()) : null;
            renderNodes(override != null ? override.getBody() : b.getBody(), scope, blocks, out);

        } else if (node instanceof AssignmentStatement) {
            AssignmentStatement a = (AssignmentStatement) node;
            scope.set(a.variable, eval(a.expression, scope, node));

        } else if (node instanceof ForStatement) {
            renderFor((ForStatement) node, scope, blocks, out);

        } else if (node instanceof IfStatement) {
            IfStatement s = (IfStatement) node;
            if (truthy(eval(s.condition.expression, scope, node))) {
                renderNodes(s.body, new Scope(scope), blocks, out);
                return;
            }
            if (s.elifBlocks != null) {
                for (ElifStatement e : s.elifBlocks) {
                    if (truthy(eval(e.condition.expression, scope, e))) { renderNodes(e.body, new Scope(scope), blocks, out); return; }
                }
            }
            if (s.elseBlock != null) renderNodes(s.elseBlock.body, new Scope(scope), blocks, out);

        } else if (node instanceof ElifStatement) {
            ElifStatement e = (ElifStatement) node;
            if (truthy(eval(e.condition.expression, scope, node))) renderNodes(e.body, new Scope(scope), blocks, out);

        } else if (node instanceof ElseStatement) {
            renderNodes(((ElseStatement) node).body, new Scope(scope), blocks, out);

        } else if (node instanceof WhileStatement) {
            WhileStatement w = (WhileStatement) node;
            int guard = 0;
            while (truthy(eval(w.condition.expression, scope, node))) {
                if (++guard > 10000) { warn(node, "while loop exceeded 10000 iterations; stopped"); break; }
                renderNodes(w.body, scope, blocks, out);
            }

        } else {
            warn(node, "unsupported node " + node.getClass().getSimpleName() + " skipped");
        }
    }

    private void renderFor(ForStatement f, Scope scope, Map<String, BlockStatement> blocks, StringBuilder out) {
        Object iterable = eval(f.iterable.expression, scope, f);
        List<Object> items;
        if (iterable instanceof Map && f.targets.size() == 2) {
            items = new ArrayList<>();
            for (Map.Entry<?, ?> e : ((Map<?, ?>) iterable).entrySet()) items.add(new ArrayList<>(Arrays.asList(e.getKey(), e.getValue())));
        } else {
            items = PythonContextEvaluator.iterate(iterable == JinjaExpressionEvaluator.UNDEFINED ? null : iterable);
        }
        int n = items.size();
        for (int i = 0; i < n; i++) {
            Scope inner = new Scope(scope);
            Object item = items.get(i);
            if (f.targets.size() == 1) inner.set(f.targets.get(0), item);
            else {
                List<Object> parts = PythonContextEvaluator.iterate(item);
                for (int t = 0; t < f.targets.size(); t++) inner.set(f.targets.get(t), t < parts.size() ? parts.get(t) : null);
            }
            Map<String, Object> loop = new LinkedHashMap<>();
            loop.put("index", (long) (i + 1));
            loop.put("index0", (long) i);
            loop.put("revindex", (long) (n - i));
            loop.put("revindex0", (long) (n - i - 1));
            loop.put("first", i == 0);
            loop.put("last", i == n - 1);
            loop.put("length", (long) n);
            inner.set("loop", loop);
            renderNodes(f.body, inner, blocks, out);
        }
    }

    /* ------------------------------------------------------------------ */
    /*  Attributes                                                         */
    /* ------------------------------------------------------------------ */

    private void renderAttribute(Node a, Scope scope, StringBuilder out) {
        if (!(a instanceof HtmlAttribute)) {
            if (a instanceof JinjaExpression) out.append(' ').append(escape(eval(((JinjaExpression) a).expression, scope, a)));
            return;
        }
        HtmlAttribute attr = (HtmlAttribute) a;
        out.append(' ').append(attr.name);
        if (attr.value == null) return;

        String value;
        if (attr.value instanceof HtmlAttributeValue) {
            value = substituteInline(((HtmlAttributeValue) attr.value).value, scope);
        } else if (attr.value instanceof JinjaExpression) {
            value = escape(eval(((JinjaExpression) attr.value).expression, scope, attr.value));
        } else if (attr.value instanceof CssDeclarationList) {
            StringBuilder sb = new StringBuilder();
            for (Node d : ((CssDeclarationList) attr.value).declarations) {
                if (d instanceof CssDeclaration) {
                    CssDeclaration decl = (CssDeclaration) d;
                    if (sb.length() > 0) sb.append(' ');
                    sb.append(decl.property).append(": ").append(substituteInline(decl.value, scope)).append(';');
                }
            }
            value = sb.toString();
        } else {
            value = substituteInline(String.valueOf(attr.value), scope);
        }
        out.append("=\"").append(value.replace("\"", "&#34;")).append('"');
    }

    /** Replaces every {{ expr }} occurrence inside raw text (attribute values, script bodies). */
    private String substituteInline(String text, Scope scope) {
        if (text == null || !text.contains("{{")) return text == null ? "" : text;
        Matcher m = INLINE_EXPR.matcher(text);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            String replacement = escape(eval(m.group(1), scope, null));
            m.appendReplacement(sb, Matcher.quoteReplacement(replacement));
        }
        m.appendTail(sb);
        return sb.toString();
    }

    /* ------------------------------------------------------------------ */
    /*  Helpers                                                            */
    /* ------------------------------------------------------------------ */

    private Object eval(String expression, Scope scope, Node at) {
        try {
            return evaluator.evaluate(expression, scope);
        } catch (RuntimeException e) {
            warn(at, "cannot evaluate '" + expression + "': " + e.getMessage());
            return JinjaExpressionEvaluator.UNDEFINED;
        }
    }

    private void warn(Node at, String message) {
        String where = currentTemplate + (at != null ? " line " + at.line + ":" + at.column : "");
        warnings.add(where + " -> " + message);
        log.add("  WARNING [" + where + "] " + message);
    }

    private static boolean truthy(Object v) {
        return v != JinjaExpressionEvaluator.UNDEFINED && PythonContextEvaluator.truthy(v);
    }

    private static String escape(Object v) {
        if (v instanceof SafeString) return ((SafeString) v).value;
        return JinjaExpressionEvaluator.escapeHtml(JinjaExpressionEvaluator.str(v));
    }

    private static String unquote(String s) {
        s = s.trim();
        if (s.length() >= 2 && (s.charAt(0) == '"' || s.charAt(0) == '\'') && s.charAt(s.length() - 1) == s.charAt(0)) return s.substring(1, s.length() - 1);
        return s;
    }

    private static boolean isVoidElement(String tagName) {
        switch (tagName.toLowerCase()) {
            case "area": case "base": case "br": case "col": case "embed": case "hr": case "img": case "input":
            case "link": case "meta": case "param": case "source": case "track": case "wbr":
                return true;
            default:
                return false;
        }
    }
}
