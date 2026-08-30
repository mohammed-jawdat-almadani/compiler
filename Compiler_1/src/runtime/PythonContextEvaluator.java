package runtime;

import python.ast.*;

import java.util.*;

/**
 * Generation-phase interpreter for the Flask back end.
 *
 * It does NOT execute Flask. It walks the Python AST produced by the front end,
 * evaluates the module-level data definitions (lists, dicts, literals, imports of
 * other project modules), then interprets every route function to discover the
 * {@code render_template(...)} calls and the exact values passed to each template.
 *
 * The result ({@link RenderCall}) is the "Context Data" that the Jinja renderer
 * substitutes into the templates.
 */
public class PythonContextEvaluator {

    /** One discovered render_template(...) call with its evaluated keyword arguments. */
    public static class RenderCall {
        public final String endpoint;          // Python function name
        public final String routePath;         // e.g. "/edit/<int:product_id>" (may be null)
        public final String template;          // e.g. "index.jinja"
        public final Map<String, Object> context; // evaluated keyword arguments
        public final Map<String, Object> sampleParams; // values used for route parameters

        RenderCall(String endpoint, String routePath, String template,
                   Map<String, Object> context, Map<String, Object> sampleParams) {
            this.endpoint = endpoint;
            this.routePath = routePath;
            this.template = template;
            this.context = context;
            this.sampleParams = sampleParams;
        }
    }

    /** A user-defined Python function together with the globals it closes over. */
    private static class PyFunction {
        final FunctionDefNode def;
        final Map<String, Object> globals;
        PyFunction(FunctionDefNode def, Map<String, Object> globals) { this.def = def; this.globals = globals; }
        @Override public String toString() { return "<function " + def.name + ">"; }
    }

    /** Marker object returned by render_template(...) during interpretation. */
    private static class RenderResult {
        final String template; final Map<String, Object> context;
        RenderResult(String t, Map<String, Object> c) { template = t; context = c; }
        @Override public String toString() { return "<render " + template + ">"; }
    }

    private static class ReturnSignal extends RuntimeException {
        final Object value;
        ReturnSignal(Object v) { super(null, null, false, false); value = v; }
    }
    private static class BreakSignal extends RuntimeException { BreakSignal() { super(null, null, false, false); } }
    private static class ContinueSignal extends RuntimeException { ContinueSignal() { super(null, null, false, false); } }

    /** Placeholder for the Flask application object. */
    private static class FlaskApp { @Override public String toString() { return "<Flask app>"; } }

    private final Map<String, ASTNode> modules;            // module name -> parsed AST
    private final Map<String, Map<String, Object>> moduleGlobals = new HashMap<>();
    private final Map<String, String> routes = new LinkedHashMap<>();   // endpoint -> path
    private final List<RenderCall> renderCalls = new ArrayList<>();
    private final List<String> log;

    private RenderResult lastRender = null;
    private int callDepth = 0;

    public PythonContextEvaluator(Map<String, ASTNode> modules, List<String> log) {
        this.modules = modules;
        this.log = log != null ? log : new ArrayList<>();
    }

    public Map<String, String> getRoutes() { return routes; }
    public List<RenderCall> getRenderCalls() { return renderCalls; }
    public Map<String, Object> getGlobals(String module) { return moduleGlobals.get(module); }

    /* ------------------------------------------------------------------ */
    /*  Entry point                                                        */
    /* ------------------------------------------------------------------ */

    /** Evaluates the given module (usually "app") and interprets its route functions. */
    public void run(String mainModule) {
        Map<String, Object> globals = evaluateModule(mainModule);

        // Interpret every route function (and any other function that renders a template).
        for (Object v : new ArrayList<>(globals.values())) {
            if (!(v instanceof PyFunction)) continue;
            PyFunction fn = (PyFunction) v;
            if (!routes.containsKey(fn.def.name) && !containsRenderCall(fn.def.body)) continue;

            Map<String, Object> sample = sampleArguments(fn, globals);
            lastRender = null;
            try {
                Object result = callFunction(fn, new ArrayList<>(), sample);
                RenderResult rr = result instanceof RenderResult ? (RenderResult) result : lastRender;
                if (rr != null) {
                    renderCalls.add(new RenderCall(fn.def.name, routes.get(fn.def.name), rr.template, rr.context, sample));
                    log.add("render_template('" + rr.template + "') found in " + fn.def.name + "() with context keys " + rr.context.keySet()
                            + (sample.isEmpty() ? "" : " (route parameters sampled as " + sample + ")"));
                } else {
                    log.add(fn.def.name + "() does not render a template on its default (GET) path; skipped.");
                }
            } catch (RuntimeException e) {
                log.add("WARNING: could not interpret " + fn.def.name + "(): " + e.getMessage());
            }
        }
    }

    /* ------------------------------------------------------------------ */
    /*  Modules                                                            */
    /* ------------------------------------------------------------------ */

    private Map<String, Object> evaluateModule(String name) {
        if (moduleGlobals.containsKey(name)) return moduleGlobals.get(name);
        ASTNode root = modules.get(name);
        Map<String, Object> globals = new LinkedHashMap<>();
        moduleGlobals.put(name, globals);
        if (root == null) { log.add("WARNING: module '" + name + "' not available to the evaluator."); return globals; }
        log.add("Evaluating module '" + name + "'");
        try {
            execBlock(root, globals, globals);
        } catch (ReturnSignal ignored) {
        }
        return globals;
    }

    /* ------------------------------------------------------------------ */
    /*  Statements                                                         */
    /* ------------------------------------------------------------------ */

    private void execBlock(ASTNode block, Map<String, Object> locals, Map<String, Object> globals) {
        if (block == null) return;
        List<? extends ASTNode> stmts = block instanceof BlockNode ? ((BlockNode) block).statements : block.getChildren();
        for (ASTNode s : stmts) exec(s, locals, globals);
    }

    private void exec(ASTNode s, Map<String, Object> locals, Map<String, Object> globals) {
        if (s == null) return;
        if (s instanceof FromImportNode) {
            FromImportNode n = (FromImportNode) s;
            if (modules.containsKey(n.moduleName)) {
                Map<String, Object> other = evaluateModule(n.moduleName);
                for (Map.Entry<String, String> e : n.importedItems.entrySet()) {
                    locals.put(e.getValue(), other.get(e.getKey()));
                }
            } // flask / stdlib imports: names resolve through builtins
        } else if (s instanceof ImportNode) {
            // nothing to do
        } else if (s instanceof AssignmentNode) {
            AssignmentNode n = (AssignmentNode) s;
            Object value = eval(n.value, locals, globals);
            assign(n.target, value, locals, globals);
        } else if (s instanceof AugmentedAssignNode) {
            AugmentedAssignNode n = (AugmentedAssignNode) s;
            Object cur = eval(n.target, locals, globals);
            Object rhs = eval(n.value, locals, globals);
            String op = n.operator == null ? "+" : n.operator.replace("=", "");
            assign(n.target, binary(op, cur, rhs), locals, globals);
        } else if (s instanceof FunctionDefNode) {
            FunctionDefNode n = (FunctionDefNode) s;
            locals.put(n.name, new PyFunction(n, globals));
            for (DecoratorNode d : n.decorators) registerRoute(n.name, d, locals, globals);
        } else if (s instanceof ClassDefNode) {
            // classes are not needed for template data
        } else if (s instanceof IfNode) {
            IfNode n = (IfNode) s;
            if (truthy(eval(n.condition, locals, globals))) execBlock(n.thenBlock, locals, globals);
            else if (n.elseBlock != null) execBlock(n.elseBlock, locals, globals);
        } else if (s instanceof ForNode) {
            ForNode n = (ForNode) s;
            Object iterable = eval(n.iterator, locals, globals);
            for (Object item : iterate(iterable)) {
                assign(n.target, item, locals, globals);
                try { execBlock(n.body, locals, globals); }
                catch (BreakSignal b) { break; }
                catch (ContinueSignal c) { /* next */ }
            }
        } else if (s instanceof WhileNode) {
            WhileNode n = (WhileNode) s;
            int guard = 0;
            while (truthy(eval(n.condition, locals, globals))) {
                if (++guard > 10000) throw new RuntimeException("while loop did not terminate (line " + n.getLineNumber() + ")");
                try { execBlock(n.body, locals, globals); }
                catch (BreakSignal b) { break; }
                catch (ContinueSignal c) { /* next */ }
            }
        } else if (s instanceof ReturnNode) {
            ReturnNode n = (ReturnNode) s;
            if (locals == globals) { // 'return' at module level: reported by the semantic analyzer; keep evaluating
                log.add("WARNING: 'return' outside a function at line " + n.getLineNumber() + " ignored");
                return;
            }
            throw new ReturnSignal(n.expression == null ? null : eval(n.expression, locals, globals));
        } else if (s instanceof FlowControlNode) {
            switch (((FlowControlNode) s).type) {
                case BREAK: throw new BreakSignal();
                case CONTINUE: throw new ContinueSignal();
                default: break;
            }
        } else if (s instanceof TryNode || s instanceof WithNode) {
            for (ASTNode c : s.getChildren()) if (c instanceof BlockNode) { execBlock(c, locals, globals); break; }
        } else if (s instanceof ExpressionNode) {
            eval(s, locals, globals);
        } else {
            // Unsupported statement types (assert, del, raise, ...) are ignored during generation.
        }
    }

    private void registerRoute(String fnName, DecoratorNode d, Map<String, Object> locals, Map<String, Object> globals) {
        // @app.route("/path", methods=[...])
        if (d.name instanceof FunctionCallNode) {
            FunctionCallNode call = (FunctionCallNode) d.name;
            if (call.functionName instanceof AttributeAccessNode
                    && ((AttributeAccessNode) call.functionName).attributeName.equals("route")
                    && !call.arguments.isEmpty()) {
                Object path = eval(call.arguments.get(0), locals, globals);
                routes.put(fnName, String.valueOf(path));
            }
        }
    }

    private void assign(ASTNode target, Object value, Map<String, Object> locals, Map<String, Object> globals) {
        if (target instanceof IdentifierNode) {
            locals.put(((IdentifierNode) target).name, value);
        } else if (target instanceof SubscriptNode) {
            SubscriptNode t = (SubscriptNode) target;
            Object container = eval(t.container, locals, globals);
            Object index = eval(t.index, locals, globals);
            setItem(container, index, value);
        } else if (target instanceof AttributeAccessNode) {
            AttributeAccessNode t = (AttributeAccessNode) target;
            Object obj = eval(t.object, locals, globals);
            if (obj instanceof Map) ((Map<String, Object>) obj).put(t.attributeName, value);
        } else if (target instanceof ListNode) { // tuple unpacking: for k, v in ...
            List<Object> items = iterate(value);
            List<ExpressionNode> els = ((ListNode) target).elements;
            for (int i = 0; i < els.size() && i < items.size(); i++) assign(els.get(i), items.get(i), locals, globals);
        }
    }

    /* ------------------------------------------------------------------ */
    /*  Expressions                                                        */
    /* ------------------------------------------------------------------ */

    public Object eval(ASTNode e, Map<String, Object> locals, Map<String, Object> globals) {
        if (e == null) return null;

        if (e instanceof LiteralNode) return literal((LiteralNode) e);

        if (e instanceof IdentifierNode) {
            String name = ((IdentifierNode) e).name;
            if (locals.containsKey(name)) return locals.get(name);
            if (globals.containsKey(name)) return globals.get(name);
            return builtin(name);
        }

        if (e instanceof ListNode) {
            List<Object> out = new ArrayList<>();
            for (ExpressionNode el : ((ListNode) e).elements) out.add(eval(el, locals, globals));
            return out;
        }

        if (e instanceof DictNode) {
            Map<String, Object> out = new LinkedHashMap<>();
            for (Map.Entry<ASTNode, ASTNode> en : ((DictNode) e).entries.entrySet()) {
                out.put(String.valueOf(eval(en.getKey(), locals, globals)), eval(en.getValue(), locals, globals));
            }
            return out;
        }

        if (e instanceof BinaryOpNode) {
            BinaryOpNode b = (BinaryOpNode) e;
            if (b.operator.equals("and")) { Object l = eval(b.left, locals, globals); return truthy(l) ? eval(b.right, locals, globals) : l; }
            if (b.operator.equals("or"))  { Object l = eval(b.left, locals, globals); return truthy(l) ? l : eval(b.right, locals, globals); }
            return binary(b.operator, eval(b.left, locals, globals), eval(b.right, locals, globals));
        }

        if (e instanceof UnaryOpNode) {
            UnaryOpNode u = (UnaryOpNode) e;
            Object v = eval(u.expression, locals, globals);
            switch (u.operator) {
                case "not": return !truthy(v);
                case "-": return v instanceof Double ? -(Double) v : -toLong(v);
                default: return v;
            }
        }

        if (e instanceof TernaryOpNode) {
            TernaryOpNode t = (TernaryOpNode) e;
            return truthy(eval(t.condition, locals, globals)) ? eval(t.trueExpr, locals, globals) : eval(t.falseExpr, locals, globals);
        }

        if (e instanceof SubscriptNode) {
            SubscriptNode s = (SubscriptNode) e;
            return getItem(eval(s.container, locals, globals), eval(s.index, locals, globals));
        }

        if (e instanceof AttributeAccessNode) {
            AttributeAccessNode a = (AttributeAccessNode) e;
            Object obj = eval(a.object, locals, globals);
            return getAttribute(obj, a.attributeName);
        }

        if (e instanceof KeywordArgumentNode) {
            return eval(((KeywordArgumentNode) e).value, locals, globals);
        }

        if (e instanceof FunctionCallNode) return call((FunctionCallNode) e, locals, globals);

        if (e instanceof LambdaNode) return null;

        return null;
    }

    private Object literal(LiteralNode lit) {
        String text = String.valueOf(lit.value);
        switch (lit.type) {
            case "int":
                try { return Long.parseLong(text.replace("_", "")); } catch (NumberFormatException ex) { return Double.parseDouble(text); }
            case "float": return Double.parseDouble(text);
            case "bool": return text.equals("True");
            case "none": return null;
            case "string": return unquote(text);
            default: return text;
        }
    }

    private static String unquote(String s) {
        if (s == null) return null;
        s = s.trim();
        // strip prefixes like f"", r""
        while (!s.isEmpty() && Character.isLetter(s.charAt(0))) s = s.substring(1);
        if (s.startsWith("\"\"\"") && s.endsWith("\"\"\"") && s.length() >= 6) s = s.substring(3, s.length() - 3);
        else if (s.startsWith("'''") && s.endsWith("'''") && s.length() >= 6) s = s.substring(3, s.length() - 3);
        else if (s.length() >= 2 && (s.charAt(0) == '"' || s.charAt(0) == '\'') && s.charAt(s.length() - 1) == s.charAt(0)) s = s.substring(1, s.length() - 1);
        return s.replace("\\n", "\n").replace("\\t", "\t").replace("\\\"", "\"").replace("\\'", "'");
    }

    /* ------------------------------------------------------------------ */
    /*  Calls                                                              */
    /* ------------------------------------------------------------------ */

    private Object call(FunctionCallNode c, Map<String, Object> locals, Map<String, Object> globals) {
        List<Object> args = new ArrayList<>();
        Map<String, Object> kwargs = new LinkedHashMap<>();
        for (ExpressionNode a : c.arguments) {
            if (a instanceof KeywordArgumentNode) kwargs.put(((KeywordArgumentNode) a).name, eval(((KeywordArgumentNode) a).value, locals, globals));
            else args.add(eval(a, locals, globals));
        }

        // Method call: obj.method(...)
        if (c.functionName instanceof AttributeAccessNode) {
            AttributeAccessNode a = (AttributeAccessNode) c.functionName;
            Object obj = eval(a.object, locals, globals);
            if (obj instanceof PyFunction) return callFunction((PyFunction) obj, args, kwargs);
            return callMethod(obj, a.attributeName, args, kwargs);
        }

        // Plain call: name(...)
        if (c.functionName instanceof IdentifierNode) {
            String name = ((IdentifierNode) c.functionName).name;
            Object target = locals.containsKey(name) ? locals.get(name) : globals.get(name);
            if (target instanceof PyFunction) return callFunction((PyFunction) target, args, kwargs);
            return callBuiltin(name, args, kwargs);
        }

        Object target = eval(c.functionName, locals, globals);
        if (target instanceof PyFunction) return callFunction((PyFunction) target, args, kwargs);
        return null;
    }

    private Object callFunction(PyFunction fn, List<Object> args, Map<String, Object> kwargs) {
        if (++callDepth > 200) { callDepth--; throw new RuntimeException("recursion too deep in " + fn.def.name); }
        Map<String, Object> locals = new LinkedHashMap<>();
        List<String> params = fn.def.parameters;
        for (int i = 0; i < params.size(); i++) {
            String p = params.get(i);
            if (i < args.size()) locals.put(p, args.get(i));
            else if (kwargs.containsKey(p)) locals.put(p, kwargs.get(p));
            else locals.put(p, null);
        }
        try {
            execBlock(fn.def.body, locals, fn.globals);
            return null;
        } catch (ReturnSignal r) {
            return r.value;
        } finally {
            callDepth--;
        }
    }

    private Object callBuiltin(String name, List<Object> args, Map<String, Object> kwargs) {
        switch (name) {
            case "render_template": {
                String template = args.isEmpty() ? "" : String.valueOf(args.get(0));
                RenderResult rr = new RenderResult(template, new LinkedHashMap<>(kwargs));
                lastRender = rr;
                return rr;
            }
            case "redirect": return args.isEmpty() ? "" : args.get(0);
            case "url_for": return args.isEmpty() ? "" : "/" + args.get(0);
            case "Flask": return new FlaskApp();
            case "len": return (long) iterate(args.get(0)).size();
            case "str": return args.isEmpty() ? "" : stringify(args.get(0));
            case "int": return args.isEmpty() ? 0L : toLong(args.get(0));
            case "float": return args.isEmpty() ? 0.0 : toDouble(args.get(0));
            case "bool": return !args.isEmpty() && truthy(args.get(0));
            case "list": return args.isEmpty() ? new ArrayList<>() : new ArrayList<>(iterate(args.get(0)));
            case "dict": return new LinkedHashMap<>(kwargs);
            case "range": {
                long start = 0, stop, step = 1;
                if (args.size() == 1) stop = toLong(args.get(0));
                else { start = toLong(args.get(0)); stop = toLong(args.get(1)); if (args.size() > 2) step = toLong(args.get(2)); }
                List<Object> out = new ArrayList<>();
                for (long i = start; step > 0 ? i < stop : i > stop; i += step) out.add(i);
                return out;
            }
            case "enumerate": {
                List<Object> out = new ArrayList<>(); long i = 0;
                for (Object o : iterate(args.get(0))) out.add(new ArrayList<>(Arrays.asList(i++, o)));
                return out;
            }
            case "sorted": {
                List<Object> out = new ArrayList<>(iterate(args.get(0)));
                out.sort((x, y) -> compare(x, y));
                if (truthy(kwargs.get("reverse"))) Collections.reverse(out);
                return out;
            }
            case "min": case "max": {
                List<Object> items = args.size() == 1 ? iterate(args.get(0)) : args;
                Object best = null;
                for (Object o : items) if (best == null || (name.equals("min") ? compare(o, best) < 0 : compare(o, best) > 0)) best = o;
                return best;
            }
            case "sum": { double d = 0; boolean isInt = true; for (Object o : iterate(args.get(0))) { if (o instanceof Double) isInt = false; d += toDouble(o); } return isInt ? (Object) (long) d : (Object) d; }
            case "abs": return args.get(0) instanceof Double ? Math.abs((Double) args.get(0)) : Math.abs(toLong(args.get(0)));
            case "round": return args.size() > 1 ? (Object) (Math.round(toDouble(args.get(0)) * Math.pow(10, toLong(args.get(1)))) / Math.pow(10, toLong(args.get(1)))) : (Object) Math.round(toDouble(args.get(0)));
            case "isinstance": return true;
            case "print": return null;
            default:
                log.add("WARNING: call to unknown function '" + name + "' evaluated as None");
                return null;
        }
    }

    private Object callMethod(Object obj, String method, List<Object> args, Map<String, Object> kwargs) {
        if (obj instanceof List) {
            List<Object> list = (List<Object>) obj;
            switch (method) {
                case "append": list.add(args.get(0)); return null;
                case "extend": list.addAll(iterate(args.get(0))); return null;
                case "insert": list.add((int) toLong(args.get(0)), args.get(1)); return null;
                case "remove": list.remove(args.get(0)); return null;
                case "pop": return list.isEmpty() ? null : list.remove(args.isEmpty() ? list.size() - 1 : (int) toLong(args.get(0)));
                case "clear": list.clear(); return null;
                case "index": return (long) list.indexOf(args.get(0));
                case "count": return (long) Collections.frequency(list, args.get(0));
                case "copy": return new ArrayList<>(list);
                case "sort": list.sort((x, y) -> compare(x, y)); if (truthy(kwargs.get("reverse"))) Collections.reverse(list); return null;
                case "reverse": Collections.reverse(list); return null;
            }
        }
        if (obj instanceof Map) {
            Map<String, Object> map = (Map<String, Object>) obj;
            switch (method) {
                case "get": { Object v = map.get(String.valueOf(args.get(0))); return v != null ? v : (args.size() > 1 ? args.get(1) : null); }
                case "keys": return new ArrayList<Object>(map.keySet());
                case "values": return new ArrayList<>(map.values());
                case "items": { List<Object> out = new ArrayList<>(); for (Map.Entry<String, Object> e : map.entrySet()) out.add(new ArrayList<>(Arrays.asList(e.getKey(), e.getValue()))); return out; }
                case "update": if (!args.isEmpty() && args.get(0) instanceof Map) map.putAll((Map<String, Object>) args.get(0)); map.putAll(kwargs); return null;
                case "pop": return map.remove(String.valueOf(args.get(0)));
                case "copy": return new LinkedHashMap<>(map);
                case "setdefault": { String k = String.valueOf(args.get(0)); if (!map.containsKey(k)) map.put(k, args.size() > 1 ? args.get(1) : null); return map.get(k); }
            }
        }
        if (obj instanceof String) {
            String s = (String) obj;
            switch (method) {
                case "upper": return s.toUpperCase();
                case "lower": return s.toLowerCase();
                case "strip": return s.trim();
                case "title": return title(s);
                case "capitalize": return s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
                case "replace": return s.replace(String.valueOf(args.get(0)), String.valueOf(args.get(1)));
                case "split": { List<Object> out = new ArrayList<>(); String sep = args.isEmpty() ? "\\s+" : java.util.regex.Pattern.quote(String.valueOf(args.get(0))); for (String p : s.trim().split(sep)) out.add(p); return out; }
                case "join": { StringBuilder sb = new StringBuilder(); boolean first = true; for (Object o : iterate(args.get(0))) { if (!first) sb.append(s); sb.append(stringify(o)); first = false; } return sb.toString(); }
                case "startswith": return s.startsWith(String.valueOf(args.get(0)));
                case "endswith": return s.endsWith(String.valueOf(args.get(0)));
                case "format": { String out = s; for (Object a : args) out = out.replaceFirst("\\{\\}", java.util.regex.Matcher.quoteReplacement(stringify(a))); for (Map.Entry<String, Object> e : kwargs.entrySet()) out = out.replace("{" + e.getKey() + "}", stringify(e.getValue())); return out; }
                case "isdigit": return !s.isEmpty() && s.chars().allMatch(Character::isDigit);
            }
        }
        if (obj instanceof FlaskApp) {
            // app.route(...) used as a decorator -> identity; app.run() -> nothing
            return null;
        }
        log.add("WARNING: unsupported method '" + method + "' on " + typeName(obj) + " evaluated as None");
        return null;
    }

    private Object builtin(String name) {
        switch (name) {
            case "__name__": return "__main__";
            case "request": {
                // Generation happens on the default GET path with no submitted form.
                Map<String, Object> req = new LinkedHashMap<>();
                req.put("method", "GET");
                req.put("form", new LinkedHashMap<String, Object>());
                req.put("args", new LinkedHashMap<String, Object>());
                req.put("path", "/");
                return req;
            }
            case "True": return true;
            case "False": return false;
            case "None": return null;
            default: return null;
        }
    }

    /* ------------------------------------------------------------------ */
    /*  Sample route parameters                                            */
    /* ------------------------------------------------------------------ */

    /**
     * Route functions such as edit_product(product_id) need a value for their parameter.
     * We pick a representative value from the data: for "<x>_id" look for a global list
     * whose items are dicts with an "id" key and use the first id; otherwise use 1.
     */
    private Map<String, Object> sampleArguments(PyFunction fn, Map<String, Object> globals) {
        Map<String, Object> sample = new LinkedHashMap<>();
        for (String p : fn.def.parameters) {
            Object value = null;
            if (p.endsWith("_id")) {
                String base = p.substring(0, p.length() - 3);
                for (Map.Entry<String, Object> g : globals.entrySet()) {
                    if (!(g.getValue() instanceof List)) continue;
                    if (!(g.getKey().startsWith(base))) continue;
                    List<Object> list = (List<Object>) g.getValue();
                    if (!list.isEmpty() && list.get(0) instanceof Map && ((Map<?, ?>) list.get(0)).containsKey("id")) {
                        value = ((Map<?, ?>) list.get(0)).get("id");
                        break;
                    }
                }
                if (value == null) value = 1L;
            } else {
                // any list-typed global whose singular form matches the parameter name
                for (Map.Entry<String, Object> g : globals.entrySet()) {
                    if (g.getValue() instanceof List && g.getKey().startsWith(p) && !((List<?>) g.getValue()).isEmpty()) {
                        value = ((List<?>) g.getValue()).get(0);
                        break;
                    }
                }
                if (value == null) value = 1L;
            }
            sample.put(p, value);
        }
        return sample;
    }

    private boolean containsRenderCall(ASTNode node) {
        if (node == null) return false;
        if (node instanceof FunctionCallNode) {
            FunctionCallNode c = (FunctionCallNode) node;
            if (c.functionName instanceof IdentifierNode && ((IdentifierNode) c.functionName).name.equals("render_template")) return true;
        }
        for (ASTNode child : node.getChildren()) if (containsRenderCall(child)) return true;
        return false;
    }

    /* ------------------------------------------------------------------ */
    /*  Value helpers (shared with the Jinja evaluator)                    */
    /* ------------------------------------------------------------------ */

    public static Object getAttribute(Object obj, String name) {
        if (obj instanceof Map) return ((Map<?, ?>) obj).get(name);
        return null;
    }

    public static Object getItem(Object container, Object index) {
        if (container instanceof Map) return ((Map<?, ?>) container).get(String.valueOf(index));
        if (container instanceof List) {
            List<?> l = (List<?>) container;
            int i = (int) toLong(index);
            if (i < 0) i += l.size();
            return i >= 0 && i < l.size() ? l.get(i) : null;
        }
        if (container instanceof String) {
            String s = (String) container;
            int i = (int) toLong(index);
            if (i < 0) i += s.length();
            return i >= 0 && i < s.length() ? String.valueOf(s.charAt(i)) : "";
        }
        return null;
    }

    private static void setItem(Object container, Object index, Object value) {
        if (container instanceof Map) ((Map<String, Object>) container).put(String.valueOf(index), value);
        else if (container instanceof List) {
            List<Object> l = (List<Object>) container;
            int i = (int) toLong(index);
            if (i < 0) i += l.size();
            if (i >= 0 && i < l.size()) l.set(i, value);
        }
    }

    public static List<Object> iterate(Object v) {
        if (v == null) return new ArrayList<>();
        if (v instanceof List) return (List<Object>) v;
        if (v instanceof Map) return new ArrayList<>(((Map<String, Object>) v).keySet());
        if (v instanceof String) { List<Object> out = new ArrayList<>(); for (char c : ((String) v).toCharArray()) out.add(String.valueOf(c)); return out; }
        return new ArrayList<>();
    }

    public static boolean truthy(Object v) {
        if (v == null) return false;
        if (v instanceof Boolean) return (Boolean) v;
        if (v instanceof Long) return (Long) v != 0;
        if (v instanceof Double) return (Double) v != 0.0;
        if (v instanceof String) return !((String) v).isEmpty();
        if (v instanceof List) return !((List<?>) v).isEmpty();
        if (v instanceof Map) return !((Map<?, ?>) v).isEmpty();
        return true;
    }

    public static long toLong(Object v) {
        if (v == null) return 0;
        if (v instanceof Long) return (Long) v;
        if (v instanceof Double) return (long) (double) (Double) v;
        if (v instanceof Boolean) return (Boolean) v ? 1 : 0;
        try { return Long.parseLong(String.valueOf(v).trim()); } catch (NumberFormatException e) { return (long) toDouble(v); }
    }

    public static double toDouble(Object v) {
        if (v == null) return 0;
        if (v instanceof Long) return (Long) v;
        if (v instanceof Double) return (Double) v;
        if (v instanceof Boolean) return (Boolean) v ? 1 : 0;
        try { return Double.parseDouble(String.valueOf(v).trim()); } catch (NumberFormatException e) { return 0; }
    }

    public static String stringify(Object v) {
        if (v == null) return "None";
        if (v instanceof Boolean) return (Boolean) v ? "True" : "False";
        if (v instanceof Double) {
            double d = (Double) v;
            if (d == Math.rint(d) && !Double.isInfinite(d)) return String.format("%.1f", d);
            return String.valueOf(d);
        }
        if (v instanceof List) {
            StringBuilder sb = new StringBuilder("[");
            boolean first = true;
            for (Object o : (List<?>) v) { if (!first) sb.append(", "); sb.append(repr(o)); first = false; }
            return sb.append("]").toString();
        }
        if (v instanceof Map) {
            StringBuilder sb = new StringBuilder("{");
            boolean first = true;
            for (Map.Entry<?, ?> e : ((Map<?, ?>) v).entrySet()) { if (!first) sb.append(", "); sb.append(repr(e.getKey())).append(": ").append(repr(e.getValue())); first = false; }
            return sb.append("}").toString();
        }
        return String.valueOf(v);
    }

    private static String repr(Object v) {
        if (v instanceof String) return "'" + v + "'";
        return stringify(v);
    }

    public static String typeName(Object v) {
        if (v == null) return "None";
        if (v instanceof Boolean) return "bool";
        if (v instanceof Long) return "int";
        if (v instanceof Double) return "float";
        if (v instanceof String) return "str";
        if (v instanceof List) return "list";
        if (v instanceof Map) return "dict";
        return v.getClass().getSimpleName();
    }

    public static int compare(Object a, Object b) {
        if (a instanceof String && b instanceof String) return ((String) a).compareTo((String) b);
        if ((a instanceof Number || a instanceof Boolean) && (b instanceof Number || b instanceof Boolean)) return Double.compare(toDouble(a), toDouble(b));
        return String.valueOf(a).compareTo(String.valueOf(b));
    }

    public static boolean equal(Object a, Object b) {
        if (a == null || b == null) return a == b;
        if (a instanceof Number && b instanceof Number) return toDouble(a) == toDouble(b);
        return a.equals(b);
    }

    public static Object binary(String op, Object l, Object r) {
        switch (op) {
            case "+":
                if (l instanceof String || r instanceof String) return stringify(l) + stringify(r);
                if (l instanceof List && r instanceof List) { List<Object> out = new ArrayList<>((List<Object>) l); out.addAll((List<Object>) r); return out; }
                return arith(op, l, r);
            case "-": case "*": case "/": case "//": case "%": case "**":
                if (op.equals("*") && (l instanceof String || r instanceof String)) {
                    String s = l instanceof String ? (String) l : (String) r; long n = toLong(l instanceof String ? r : l);
                    StringBuilder sb = new StringBuilder(); for (long i = 0; i < n; i++) sb.append(s); return sb.toString();
                }
                return arith(op, l, r);
            case "==": return equal(l, r);
            case "!=": return !equal(l, r);
            case "<": return compare(l, r) < 0;
            case ">": return compare(l, r) > 0;
            case "<=": return compare(l, r) <= 0;
            case ">=": return compare(l, r) >= 0;
            case "in": return contains(r, l);
            case "notin": case "not in": return !contains(r, l);
            case "is": return l == r || equal(l, r);
            case "isnot": case "is not": return !(l == r || equal(l, r));
            case "and": return truthy(l) ? r : l;
            case "or": return truthy(l) ? l : r;
            default: return null;
        }
    }

    public static boolean contains(Object container, Object item) {
        if (container instanceof Map) return ((Map<?, ?>) container).containsKey(String.valueOf(item));
        if (container instanceof List) { for (Object o : (List<?>) container) if (equal(o, item)) return true; return false; }
        if (container instanceof String) return ((String) container).contains(String.valueOf(item));
        return false;
    }

    private static Object arith(String op, Object l, Object r) {
        boolean isFloat = l instanceof Double || r instanceof Double || op.equals("/");
        if (isFloat) {
            double a = toDouble(l), b = toDouble(r);
            switch (op) {
                case "+": return a + b;
                case "-": return a - b;
                case "*": return a * b;
                case "/": return b == 0 ? 0.0 : a / b;
                case "//": return b == 0 ? 0.0 : Math.floor(a / b);
                case "%": return b == 0 ? 0.0 : a % b;
                case "**": return Math.pow(a, b);
            }
        }
        long a = toLong(l), b = toLong(r);
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "//": return b == 0 ? 0L : Math.floorDiv(a, b);
            case "%": return b == 0 ? 0L : Math.floorMod(a, b);
            case "**": return (long) Math.pow(a, b);
        }
        return null;
    }

    public static String title(String s) {
        StringBuilder sb = new StringBuilder();
        boolean up = true;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) { sb.append(up ? Character.toUpperCase(c) : Character.toLowerCase(c)); up = false; }
            else { sb.append(c); up = true; }
        }
        return sb.toString();
    }
}
