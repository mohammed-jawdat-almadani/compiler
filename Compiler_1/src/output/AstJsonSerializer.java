package output;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

// Reflection-based JSON dump of any AST, so every node type is covered.
// Each node becomes {"type": "<ClassName>", "line": n, ...fields}
public class AstJsonSerializer {

    private final IdentityHashMap<Object, Boolean> visiting = new IdentityHashMap<>();

    public String toJson(Object root) {
        StringBuilder sb = new StringBuilder();
        write(root, sb, 0);
        return sb.toString();
    }

    private void write(Object v, StringBuilder sb, int indent) {
        if (v == null) { sb.append("null"); return; }
        if (v instanceof String) { quote((String) v, sb); return; }
        if (v instanceof Number || v instanceof Boolean) { sb.append(v); return; }
        if (v instanceof Enum) { quote(((Enum<?>) v).name(), sb); return; }
        if (v instanceof Character) { quote(String.valueOf(v), sb); return; }

        if (v instanceof Collection) {
            Collection<?> c = (Collection<?>) v;
            if (c.isEmpty()) { sb.append("[]"); return; }
            sb.append("[");
            boolean first = true;
            for (Object o : c) {
                if (!first) sb.append(",");
                first = false;
                newline(sb, indent + 1);
                write(o, sb, indent + 1);
            }
            newline(sb, indent);
            sb.append("]");
            return;
        }

        if (v instanceof Map) {
            Map<?, ?> m = (Map<?, ?>) v;
            if (m.isEmpty()) { sb.append("{}"); return; }
            boolean nodeKeys = false;
            for (Object k : m.keySet()) if (k != null && !(k instanceof String) && !(k instanceof Number) && !(k instanceof Enum)) { nodeKeys = true; break; }
            if (nodeKeys) { // DictNode.entries has node keys -> [{"key":..,"value":..}]
                sb.append("[");
                boolean first = true;
                for (Map.Entry<?, ?> e : m.entrySet()) {
                    if (!first) sb.append(",");
                    first = false;
                    newline(sb, indent + 1);
                    sb.append("{");
                    newline(sb, indent + 2); sb.append("\"key\": "); write(e.getKey(), sb, indent + 2); sb.append(",");
                    newline(sb, indent + 2); sb.append("\"value\": "); write(e.getValue(), sb, indent + 2);
                    newline(sb, indent + 1);
                    sb.append("}");
                }
                newline(sb, indent);
                sb.append("]");
                return;
            }
            sb.append("{");
            boolean first = true;
            for (Map.Entry<?, ?> e : m.entrySet()) {
                if (!first) sb.append(",");
                first = false;
                newline(sb, indent + 1);
                quote(String.valueOf(e.getKey()), sb);
                sb.append(": ");
                write(e.getValue(), sb, indent + 1);
            }
            newline(sb, indent);
            sb.append("}");
            return;
        }

        // AST node: reflect over its fields
        if (visiting.containsKey(v)) { sb.append("\"<cycle>\""); return; }
        visiting.put(v, Boolean.TRUE);
        sb.append("{");
        newline(sb, indent + 1);
        sb.append("\"type\": ");
        quote(v.getClass().getSimpleName(), sb);
        for (Field f : fields(v.getClass())) {
            Object value;
            try { f.setAccessible(true); value = f.get(v); } catch (Exception e) { continue; }
            if (value instanceof StringBuilder || value instanceof java.io.Writer) continue;
            sb.append(",");
            newline(sb, indent + 1);
            quote(jsonName(f.getName()), sb);
            sb.append(": ");
            write(value, sb, indent + 1);
        }
        newline(sb, indent);
        sb.append("}");
        visiting.remove(v);
    }

    private static String jsonName(String field) {
        if (field.equals("lineNumber")) return "line";
        if (field.equals("type")) return "valueType";   // "type" is the node label, so LiteralNode.type becomes valueType
        return field;
    }

    private static List<Field> fields(Class<?> c) {
        List<Field> out = new ArrayList<>();
        Deque<Class<?>> chain = new ArrayDeque<>();
        for (Class<?> k = c; k != null && k != Object.class; k = k.getSuperclass()) chain.push(k);
        for (Class<?> k : chain) {
            for (Field f : k.getDeclaredFields()) {
                if (Modifier.isStatic(f.getModifiers()) || f.isSynthetic()) continue;
                if (f.getName().equals("nodeName")) continue; // same as "type"
                out.add(f);
            }
        }
        return out;
    }

    private static void newline(StringBuilder sb, int indent) {
        sb.append('\n');
        for (int i = 0; i < indent; i++) sb.append("  ");
    }

    private static void quote(String s, StringBuilder sb) {
        sb.append('"');
        for (char c : s.toCharArray()) {
            switch (c) {
                case '"': sb.append("\\\""); break;
                case '\\': sb.append("\\\\"); break;
                case '\n': sb.append("\\n"); break;
                case '\r': sb.append("\\r"); break;
                case '\t': sb.append("\\t"); break;
                default:
                    if (c < 0x20) sb.append(String.format("\\u%04x", (int) c));
                    else sb.append(c);
            }
        }
        sb.append('"');
    }
}
