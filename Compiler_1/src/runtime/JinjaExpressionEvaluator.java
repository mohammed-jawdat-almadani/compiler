package runtime;

import ast.jinja.expr.*;

import java.util.*;
import java.util.function.Function;

import static runtime.PythonContextEvaluator.*;

// Evaluates Jinja expressions against a scope: attributes, indexing, calls with kwargs,
// arithmetic/comparison/boolean operators, ~ concatenation, filters and tests.
public class JinjaExpressionEvaluator {

    // value that must not be HTML-escaped (|safe)
    public static final class SafeString {
        public final String value;
        public SafeString(String v) { value = v; }
        @Override public String toString() { return value; }
    }

    // undefined variable marker, renders as "" like Jinja
    public static final Object UNDEFINED = new Object() { @Override public String toString() { return ""; } };

    private final Map<String, Function<List<Object>, Object>> functions = new HashMap<>();

    public JinjaExpressionEvaluator() {
        functions.put("range", args -> {
            long start = 0, stop, step = 1;
            if (args.size() == 1) stop = toLong(args.get(0));
            else { start = toLong(args.get(0)); stop = toLong(args.get(1)); if (args.size() > 2) step = toLong(args.get(2)); }
            List<Object> out = new ArrayList<>();
            for (long i = start; step > 0 ? i < stop : i > stop; i += step) out.add(i);
            return out;
        });
        functions.put("len", args -> (long) iterate(args.get(0)).size());
    }

    // global function such as url_for; keyword args arrive as a trailing Map
    public void registerFunction(String name, Function<List<Object>, Object> fn) { functions.put(name, fn); }

    // Public API

    // evaluate an expression tree built by HtmlJinjaVisitor
    public Object evaluate(ExprNode node, Scope scope) {
        if (node == null) return UNDEFINED;

        if (node instanceof LiteralExpr) return ((LiteralExpr) node).value;

        if (node instanceof IdentifierExpr) {
            String name = ((IdentifierExpr) node).name;
            if (functions.containsKey(name) && !scope.has(name)) return functions.get(name);
            return scope.get(name);
        }

        if (node instanceof AttributeExpr) {
            AttributeExpr a = (AttributeExpr) node;
            return attribute(evaluate(a.object, scope), a.name);
        }

        if (node instanceof IndexExpr) {
            IndexExpr ix = (IndexExpr) node;
            Object v = getItem(evaluate(ix.object, scope), evaluate(ix.index, scope));
            return v == null ? UNDEFINED : v;
        }

        if (node instanceof CallExpr) {
            CallExpr c = (CallExpr) node;
            List<Object> args = new ArrayList<>();
            for (ExprNode a : c.args) args.add(evaluate(a, scope));
            Map<String, Object> kwargs = new LinkedHashMap<>();
            for (Map.Entry<String, ExprNode> e : c.kwargs.entrySet()) kwargs.put(e.getKey(), evaluate(e.getValue(), scope));
            args.add(kwargs);
            if (c.callee instanceof AttributeExpr) {            // obj.method(...)
                AttributeExpr m = (AttributeExpr) c.callee;
                return callMethod(evaluate(m.object, scope), m.name, args);
            }
            if (c.callee instanceof IdentifierExpr) {           // url_for(...), range(...)
                String name = ((IdentifierExpr) c.callee).name;
                if (functions.containsKey(name) && !scope.has(name)) return functions.get(name).apply(args);
            }
            Object callee = evaluate(c.callee, scope);
            if (callee instanceof Function) return ((Function<List<Object>, Object>) callee).apply(args);
            throw new RuntimeException("'" + c.callee + "' is not callable");
        }

        if (node instanceof FilterExpr) {
            FilterExpr f = (FilterExpr) node;
            List<Object> args = new ArrayList<>();
            for (ExprNode a : f.args) args.add(evaluate(a, scope));
            Map<String, Object> kwargs = new LinkedHashMap<>();
            for (Map.Entry<String, ExprNode> e : f.kwargs.entrySet()) kwargs.put(e.getKey(), evaluate(e.getValue(), scope));
            args.add(kwargs);
            return applyFilter(f.filter, evaluate(f.value, scope), args);
        }

        if (node instanceof UnaryExpr) {
            UnaryExpr u = (UnaryExpr) node;
            Object v = evaluate(u.operand, scope);
            if (u.operator.equals("not")) return !truthyValue(v);
            return v instanceof Double ? -(Double) v : -toLong(v);
        }

        if (node instanceof BinaryExpr) {
            BinaryExpr b = (BinaryExpr) node;
            switch (b.operator) {
                case "and": { Object l = evaluate(b.left, scope); return truthyValue(l) ? evaluate(b.right, scope) : l; }
                case "or":  { Object l = evaluate(b.left, scope); return truthyValue(l) ? l : evaluate(b.right, scope); }
                case "~":   return str(evaluate(b.left, scope)) + str(evaluate(b.right, scope));
                case "in":  return contains(evaluate(b.right, scope), evaluate(b.left, scope));
                default:    return binary(b.operator, evaluate(b.left, scope), evaluate(b.right, scope));
            }
        }

        if (node instanceof TestExpr) {
            TestExpr t = (TestExpr) node;
            boolean r = applyTest(t.test, evaluate(t.value, scope), new ArrayList<>());
            return t.negated ? !r : r;
        }

        if (node instanceof ConditionalExpr) {
            ConditionalExpr c = (ConditionalExpr) node;
            return truthyValue(evaluate(c.condition, scope)) ? evaluate(c.value, scope) : (c.otherwise != null ? evaluate(c.otherwise, scope) : UNDEFINED);
        }

        throw new RuntimeException("unknown expression node " + node.getClass().getSimpleName());
    }

    private static boolean truthyValue(Object v) { return v != UNDEFINED && truthy(v); }

    // evaluate expression text ({{ }} inside attribute text or script bodies)
    public Object evaluate(String expression, Scope scope) {
        List<Token> tokens = tokenize(expression);
        Parser p = new Parser(tokens, scope);
        Object v = p.parseExpression();
        if (p.peek().type != T.END) throw new RuntimeException("unexpected '" + tokens.get(p.pos).text + "' in expression: " + expression);
        return v;
    }

    // scope chain used while rendering
    public static class Scope {
        private final Map<String, Object> vars = new LinkedHashMap<>();
        private final Scope parent;
        public Scope(Scope parent) { this.parent = parent; }
        public Scope(Map<String, Object> initial) { this.parent = null; if (initial != null) vars.putAll(initial); }
        public void set(String name, Object value) { vars.put(name, value); }
        public boolean has(String name) { return vars.containsKey(name) || (parent != null && parent.has(name)); }
        public Object get(String name) {
            if (vars.containsKey(name)) return vars.get(name);
            return parent != null ? parent.get(name) : UNDEFINED;
        }
        public Set<String> names() { Set<String> s = new LinkedHashSet<>(); if (parent != null) s.addAll(parent.names()); s.addAll(vars.keySet()); return s; }
    }

    // Tokenizer

    private enum T { NUM, STR, ID, OP, END }

    private static class Token {
        final T type; final String text;
        Token(T t, String s) { type = t; text = s; }
        @Override public String toString() { return type + ":" + text; }
    }

    private static final String[] OPS = { "==", "!=", "<=", ">=", "//", "**", "~", "+", "-", "*", "/", "%", "<", ">", "(", ")", "[", "]", "{", "}", ".", ",", ":", "|", "=" };

    private static List<Token> tokenize(String s) {
        List<Token> out = new ArrayList<>();
        int i = 0, n = s.length();
        while (i < n) {
            char c = s.charAt(i);
            if (Character.isWhitespace(c)) { i++; continue; }
            if (c == '"' || c == '\'') {
                int j = i + 1; StringBuilder sb = new StringBuilder();
                while (j < n && s.charAt(j) != c) {
                    if (s.charAt(j) == '\\' && j + 1 < n) { j++; char e = s.charAt(j); sb.append(e == 'n' ? '\n' : e == 't' ? '\t' : e); }
                    else sb.append(s.charAt(j));
                    j++;
                }
                out.add(new Token(T.STR, sb.toString()));
                i = j + 1; continue;
            }
            if (Character.isDigit(c)) {
                int j = i; while (j < n && (Character.isDigit(s.charAt(j)) || s.charAt(j) == '.')) j++;
                out.add(new Token(T.NUM, s.substring(i, j))); i = j; continue;
            }
            if (Character.isLetter(c) || c == '_') {
                int j = i; while (j < n && (Character.isLetterOrDigit(s.charAt(j)) || s.charAt(j) == '_')) j++;
                out.add(new Token(T.ID, s.substring(i, j))); i = j; continue;
            }
            boolean matched = false;
            for (String op : OPS) {
                if (s.startsWith(op, i)) { out.add(new Token(T.OP, op)); i += op.length(); matched = true; break; }
            }
            if (!matched) throw new RuntimeException("unexpected character '" + c + "' in expression: " + s);
        }
        out.add(new Token(T.END, ""));
        return out;
    }

    // Recursive-descent parser that evaluates as it goes

    private class Parser {
        final List<Token> toks; final Scope scope; int pos = 0;
        Parser(List<Token> t, Scope s) { toks = t; scope = s; }

        Token peek() { return toks.get(pos); }
        boolean isOp(String s) { return peek().type == T.OP && peek().text.equals(s); }
        boolean isId(String s) { return peek().type == T.ID && peek().text.equals(s); }
        Token next() { return toks.get(pos++); }
        void expect(String op) { if (!isOp(op)) throw new RuntimeException("expected '" + op + "' but found '" + peek().text + "'"); pos++; }

        Object parseExpression() { return parseTernary(); }

        Object parseTernary() {
            Object v = parseOr();
            if (isId("if")) {                    // a if cond else b
                next();
                Object cond = parseOr();
                Object other = null;
                if (isId("else")) { next(); other = parseTernary(); }
                return truthy(cond) ? v : other;
            }
            return v;
        }

        Object parseOr() {
            Object l = parseAnd();
            while (isId("or")) { next(); Object r = parseAnd(); l = truthy(l) ? l : r; }
            return l;
        }

        Object parseAnd() {
            Object l = parseNot();
            while (isId("and")) { next(); Object r = parseNot(); l = truthy(l) ? r : l; }
            return l;
        }

        Object parseNot() {
            if (isId("not")) { next(); return !truthy(parseNot()); }
            return parseComparison();
        }

        Object parseComparison() {
            Object l = parseConcat();
            while (true) {
                if (peek().type == T.OP && Arrays.asList("==", "!=", "<", ">", "<=", ">=").contains(peek().text)) {
                    String op = next().text; Object r = parseConcat(); l = binary(op, l, r);
                } else if (isId("in")) {
                    next(); Object r = parseConcat(); l = contains(r, l);
                } else if (isId("not") && pos + 1 < toks.size() && toks.get(pos + 1).text.equals("in")) {
                    next(); next(); Object r = parseConcat(); l = !contains(r, l);
                } else if (isId("is")) {
                    next(); boolean negate = false;
                    if (isId("not")) { next(); negate = true; }
                    String test = next().text;
                    List<Object> args = new ArrayList<>();
                    if (isOp("(")) { next(); if (!isOp(")")) { args.add(parseExpression()); while (isOp(",")) { next(); args.add(parseExpression()); } } expect(")"); }
                    else if (peek().type == T.NUM || peek().type == T.STR) args.add(parsePrimary());
                    boolean res = applyTest(test, l, args);
                    l = negate ? !res : res;
                } else break;
            }
            return l;
        }

        Object parseConcat() {
            Object l = parseAdd();
            while (isOp("~")) { next(); Object r = parseAdd(); l = str(l) + str(r); }
            return l;
        }

        Object parseAdd() {
            Object l = parseMul();
            while (isOp("+") || isOp("-")) { String op = next().text; Object r = parseMul(); l = binary(op, l, r); }
            return l;
        }

        Object parseMul() {
            Object l = parseUnary();
            while (isOp("*") || isOp("/") || isOp("//") || isOp("%")) { String op = next().text; Object r = parseUnary(); l = binary(op, l, r); }
            return l;
        }

        Object parseUnary() {
            if (isOp("-")) { next(); Object v = parseUnary(); return v instanceof Double ? -(Double) v : -toLong(v); }
            if (isOp("+")) { next(); return parseUnary(); }
            return parsePower();
        }

        Object parsePower() {
            Object l = parsePostfix();
            if (isOp("**")) { next(); Object r = parseUnary(); return binary("**", l, r); }
            return l;
        }

        Object parsePostfix() {
            Object v = parsePrimary();
            String lastName = toks.get(pos - 1).type == T.ID ? toks.get(pos - 1).text : null;
            while (true) {
                if (isOp(".")) {
                    next(); String attr = next().text;
                    if (isOp("(")) { v = callMethod(v, attr, parseArgs()); }
                    else v = attribute(v, attr);
                    lastName = null;
                } else if (isOp("[")) {
                    next(); Object idx = parseExpression(); expect("]");
                    v = getItem(v, idx); if (v == null) v = UNDEFINED;
                    lastName = null;
                } else if (isOp("(")) {
                    List<Object> args = parseArgs();
                    if (lastName != null && functions.containsKey(lastName)) v = functions.get(lastName).apply(args);
                    else if (v instanceof Function) v = ((Function<List<Object>, Object>) v).apply(args);
                    else throw new RuntimeException("'" + (lastName != null ? lastName : str(v)) + "' is not callable");
                    lastName = null;
                } else if (isOp("|")) {
                    next(); String filter = next().text;
                    List<Object> args = isOp("(") ? parseArgs() : new ArrayList<>();
                    v = applyFilter(filter, v, args);
                    lastName = null;
                } else break;
            }
            return v;
        }

        // "(a, b, key=value)" -> positional args then one Map of keyword args
        List<Object> parseArgs() {
            expect("(");
            List<Object> args = new ArrayList<>();
            Map<String, Object> kwargs = new LinkedHashMap<>();
            while (!isOp(")")) {
                if (peek().type == T.ID && toks.get(pos + 1).type == T.OP && toks.get(pos + 1).text.equals("=")) {
                    String key = next().text; next();
                    kwargs.put(key, parseExpression());
                } else args.add(parseExpression());
                if (isOp(",")) next(); else break;
            }
            expect(")");
            args.add(kwargs);
            return args;
        }

        Object parsePrimary() {
            Token t = next();
            switch (t.type) {
                case NUM: return t.text.contains(".") ? (Object) Double.parseDouble(t.text) : (Object) Long.parseLong(t.text);
                case STR: return t.text;
                case ID:
                    switch (t.text) {
                        case "true": case "True": return true;
                        case "false": case "False": return false;
                        case "none": case "None": return null;
                        default:
                            if (functions.containsKey(t.text) && !scope.has(t.text)) return functions.get(t.text);
                            return scope.get(t.text);
                    }
                case OP:
                    if (t.text.equals("(")) { Object v = parseExpression(); expect(")"); return v; }
                    if (t.text.equals("[")) {
                        List<Object> list = new ArrayList<>();
                        while (!isOp("]")) { list.add(parseExpression()); if (isOp(",")) next(); else break; }
                        expect("]"); return list;
                    }
                    if (t.text.equals("{")) {
                        Map<String, Object> map = new LinkedHashMap<>();
                        while (!isOp("}")) { Object k = parseExpression(); expect(":"); map.put(str(k), parseExpression()); if (isOp(",")) next(); else break; }
                        expect("}"); return map;
                    }
                    throw new RuntimeException("unexpected '" + t.text + "'");
                default: throw new RuntimeException("unexpected end of expression");
            }
        }
    }

    // Attribute / method access on runtime values

    private static Object attribute(Object v, String name) {
        if (v == null || v == UNDEFINED) return UNDEFINED;
        if (v instanceof Map) { Map<?, ?> m = (Map<?, ?>) v; return m.containsKey(name) ? m.get(name) : UNDEFINED; }
        if (v instanceof List) {
            List<?> l = (List<?>) v;
            if (name.equals("length")) return (long) l.size();
        }
        return UNDEFINED;
    }

    private static Object callMethod(Object v, String name, List<Object> args) {
        Map<String, Object> kwargs = (Map<String, Object>) args.remove(args.size() - 1);
        if (v instanceof Map) {
            Map<String, Object> m = (Map<String, Object>) v;
            switch (name) {
                case "get": { Object r = m.get(str(args.get(0))); return r != null ? r : (args.size() > 1 ? args.get(1) : UNDEFINED); }
                case "items": { List<Object> out = new ArrayList<>(); for (Map.Entry<String, Object> e : m.entrySet()) out.add(new ArrayList<>(Arrays.asList(e.getKey(), e.getValue()))); return out; }
                case "keys": return new ArrayList<Object>(m.keySet());
                case "values": return new ArrayList<>(m.values());
            }
        }
        if (v instanceof String) {
            String s = (String) v;
            switch (name) {
                case "upper": return s.toUpperCase();
                case "lower": return s.toLowerCase();
                case "strip": return s.trim();
                case "title": return title(s);
                case "capitalize": return s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
                case "replace": return s.replace(str(args.get(0)), str(args.get(1)));
                case "startswith": return s.startsWith(str(args.get(0)));
                case "endswith": return s.endsWith(str(args.get(0)));
                case "split": { List<Object> out = new ArrayList<>(); for (String p : s.split(args.isEmpty() ? "\\s+" : java.util.regex.Pattern.quote(str(args.get(0))))) out.add(p); return out; }
                case "join": { StringBuilder sb = new StringBuilder(); boolean first = true; for (Object o : iterate(args.get(0))) { if (!first) sb.append(s); sb.append(str(o)); first = false; } return sb.toString(); }
                case "format": { String out = s; for (Object a : args) out = out.replaceFirst("\\{\\}", java.util.regex.Matcher.quoteReplacement(str(a))); for (Map.Entry<String, Object> e : kwargs.entrySet()) out = out.replace("{" + e.getKey() + "}", str(e.getValue())); return out; }
            }
        }
        if (v instanceof List) {
            List<Object> l = (List<Object>) v;
            switch (name) {
                case "count": return (long) Collections.frequency(l, args.get(0));
                case "index": return (long) l.indexOf(args.get(0));
            }
        }
        throw new RuntimeException("unknown method '" + name + "' on " + typeName(v));
    }

    // Filters and tests

    private static Object applyFilter(String name, Object v, List<Object> args) {
        Map<String, Object> kwargs = args.isEmpty() ? new LinkedHashMap<>() : (Map<String, Object>) args.remove(args.size() - 1);
        switch (name) {
            case "length": case "count": return (long) (v instanceof String ? ((String) v).length() : iterate(v).size());
            case "upper": return str(v).toUpperCase();
            case "lower": return str(v).toLowerCase();
            case "title": return title(str(v));
            case "capitalize": { String s = str(v); return s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase(); }
            case "trim": return str(v).trim();
            case "string": return str(v);
            case "int": return v == UNDEFINED ? 0L : toLong(v);
            case "float": return v == UNDEFINED ? 0.0 : toDouble(v);
            case "abs": return v instanceof Double ? Math.abs((Double) v) : Math.abs(toLong(v));
            case "round": { int prec = args.isEmpty() ? 0 : (int) toLong(args.get(0)); double f = Math.pow(10, prec); double r = Math.round(toDouble(v) * f) / f; return prec == 0 ? (Object) (long) r : (Object) r; }
            case "default": case "d": {
                boolean bool = args.size() > 1 && truthy(args.get(1)) || truthy(kwargs.get("boolean"));
                return (v == UNDEFINED || v == null || (bool && !truthy(v))) ? (args.isEmpty() ? "" : args.get(0)) : v;
            }
            case "join": { String sep = args.isEmpty() ? "" : str(args.get(0)); StringBuilder sb = new StringBuilder(); boolean first = true; for (Object o : iterate(v)) { if (!first) sb.append(sep); sb.append(str(o)); first = false; } return sb.toString(); }
            case "first": { List<Object> l = iterate(v); return l.isEmpty() ? UNDEFINED : l.get(0); }
            case "last": { List<Object> l = iterate(v); return l.isEmpty() ? UNDEFINED : l.get(l.size() - 1); }
            case "reverse": { List<Object> l = new ArrayList<>(iterate(v)); Collections.reverse(l); return l; }
            case "sort": { List<Object> l = new ArrayList<>(iterate(v)); Object attr = kwargs.get("attribute"); l.sort((a, b) -> attr != null ? compare(attribute(a, str(attr)), attribute(b, str(attr))) : compare(a, b)); if (truthy(kwargs.get("reverse")) || (!args.isEmpty() && truthy(args.get(0)))) Collections.reverse(l); return l; }
            case "list": return new ArrayList<>(iterate(v));
            case "min": { Object best = null; for (Object o : iterate(v)) if (best == null || compare(o, best) < 0) best = o; return best; }
            case "max": { Object best = null; for (Object o : iterate(v)) if (best == null || compare(o, best) > 0) best = o; return best; }
            case "sum": { double d = 0; boolean isInt = true; Object attr = kwargs.get("attribute"); for (Object o : iterate(v)) { Object x = attr != null ? attribute(o, str(attr)) : o; if (x instanceof Double) isInt = false; d += toDouble(x); } return isInt ? (Object) (long) d : (Object) d; }
            case "replace": return str(v).replace(str(args.get(0)), str(args.get(1)));
            case "truncate": { String s = str(v); int n = args.isEmpty() ? 255 : (int) toLong(args.get(0)); return s.length() <= n ? s : s.substring(0, Math.max(0, n - 3)) + "..."; }
            case "safe": return new SafeString(str(v));
            case "escape": case "e": return new SafeString(escapeHtml(str(v)));
            case "striptags": return str(v).replaceAll("<[^>]*>", "");
            case "wordcount": return (long) str(v).trim().split("\\s+").length;
            case "tojson": return stringify(v).replace("'", "\"");
            default: throw new RuntimeException("unknown filter '" + name + "'");
        }
    }

    private static boolean applyTest(String name, Object v, List<Object> args) {
        switch (name) {
            case "defined": return v != UNDEFINED;
            case "undefined": return v == UNDEFINED;
            case "none": return v == null;
            case "string": return v instanceof String;
            case "number": return v instanceof Number;
            case "iterable": case "sequence": return v instanceof List || v instanceof Map || v instanceof String;
            case "mapping": return v instanceof Map;
            case "even": return toLong(v) % 2 == 0;
            case "odd": return toLong(v) % 2 != 0;
            case "true": return Boolean.TRUE.equals(v);
            case "false": return Boolean.FALSE.equals(v);
            case "equalto": case "eq": return equal(v, args.get(0));
            case "divisibleby": return toLong(v) % toLong(args.get(0)) == 0;
            case "lower": return v instanceof String && ((String) v).equals(((String) v).toLowerCase());
            case "upper": return v instanceof String && ((String) v).equals(((String) v).toUpperCase());
            default: throw new RuntimeException("unknown test '" + name + "'");
        }
    }

    // Output helpers

    // output string form: None -> "None", floats like Python
    public static String str(Object v) {
        if (v == UNDEFINED) return "";
        if (v instanceof SafeString) return ((SafeString) v).value;
        return stringify(v);
    }

    public static String escapeHtml(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            switch (c) {
                case '&': sb.append("&amp;"); break;
                case '<': sb.append("&lt;"); break;
                case '>': sb.append("&gt;"); break;
                case '"': sb.append("&#34;"); break;
                case '\'': sb.append("&#39;"); break;
                default: sb.append(c);
            }
        }
        return sb.toString();
    }
}
