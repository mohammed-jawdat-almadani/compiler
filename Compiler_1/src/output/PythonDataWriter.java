package output;

import java.util.List;
import java.util.Map;

// Writes evaluated module data back as Python source (products = [...]).
// DevServer uses it to persist data.py after a route changed it.
public class PythonDataWriter {

    public static String module(Map<String, Object> globals) {
        StringBuilder sb = new StringBuilder();
        sb.append("# Data module - rewritten by the translator's dev server after every change.\n\n");
        for (Map.Entry<String, Object> e : globals.entrySet()) {
            sb.append(e.getKey()).append(" = ");
            write(e.getValue(), sb, 0);
            sb.append("\n\n");
        }
        return sb.toString();
    }

    public static void write(Object v, StringBuilder sb, int indent) {
        if (v == null) { sb.append("None"); return; }
        if (v instanceof Boolean) { sb.append((Boolean) v ? "True" : "False"); return; }
        if (v instanceof Long || v instanceof Integer) { sb.append(v); return; }
        if (v instanceof Double) {
            double d = (Double) v;
            sb.append(d == Math.rint(d) && !Double.isInfinite(d) ? String.format("%.1f", d) : String.valueOf(d));
            return;
        }
        if (v instanceof String) { quote((String) v, sb); return; }
        if (v instanceof List) {
            List<?> l = (List<?>) v;
            if (l.isEmpty()) { sb.append("[]"); return; }
            boolean nested = l.stream().anyMatch(o -> o instanceof Map || o instanceof List);
            if (!nested) {
                sb.append('[');
                for (int i = 0; i < l.size(); i++) { if (i > 0) sb.append(", "); write(l.get(i), sb, indent); }
                sb.append(']');
                return;
            }
            sb.append("[\n");
            for (Object o : l) { pad(sb, indent + 1); write(o, sb, indent + 1); sb.append(",\n"); }
            pad(sb, indent); sb.append(']');
            return;
        }
        if (v instanceof Map) {
            Map<?, ?> m = (Map<?, ?>) v;
            sb.append('{');
            boolean first = true;
            for (Map.Entry<?, ?> e : m.entrySet()) {
                if (!first) sb.append(", ");
                first = false;
                quote(String.valueOf(e.getKey()), sb);
                sb.append(": ");
                write(e.getValue(), sb, indent);
            }
            sb.append('}');
            return;
        }
        quote(String.valueOf(v), sb);
    }

    private static void pad(StringBuilder sb, int indent) { for (int i = 0; i < indent; i++) sb.append("    "); }

    private static void quote(String s, StringBuilder sb) {
        sb.append('"');
        for (char c : s.toCharArray()) {
            switch (c) {
                case '"': sb.append("\\\""); break;
                case '\\': sb.append("\\\\"); break;
                case '\n': sb.append("\\n"); break;
                case '\t': sb.append("\\t"); break;
                default: sb.append(c);
            }
        }
        sb.append('"');
    }
}
