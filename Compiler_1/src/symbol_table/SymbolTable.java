package symbol_table;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class SymbolTable {
    public String name;
    public String type;
    public int line;
    public int column;
    public SymbolKind kind;

    public SymbolTable(String name, String type, int line, int column, SymbolKind kind) {
        this.name = name;
        this.type = type;
        this.line = line;
        this.column = column;
        this.kind = kind;
    }

    @Override
    public String toString() {
        return name + " (" + kind + ") at line " + line + ", col " + column;
    }
}

class Scope {
    public Map<String, SymbolTable> symbols = new HashMap<>();
    public Scope parent;
    public boolean isGlobal;

    public Scope(Scope parent, boolean isGlobal) {
        this.parent = parent;
        this.isGlobal = isGlobal;
    }

    public void define(SymbolTable sym) {
        symbols.put(sym.name, sym);
    }

    public SymbolTable resolve(String name) {
        SymbolTable sym = symbols.get(name);
        if (sym != null) return sym;
        if (parent != null) return parent.resolve(name);
        return null;
    }
}
