package symboltable;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class BaseScope implements Scope {
    Scope enclosingScope;
    Map<String, Symbol> symbols = new LinkedHashMap<>();

    public BaseScope(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
    }


    @Override
    public Symbol resolve(String name) {
        Symbol s = symbols.get(name);
        if (s != null) return s;
        if (enclosingScope != null) return enclosingScope.resolve(name);
        return null;
    }

    @Override
    public void define(Symbol sym) {
        symbols.put(sym.getName(), sym);
        sym.scope = this;
    }

    @Override
    public Scope getEnclosingScope() { return enclosingScope; }

    @Override
    public String toString() {
        return "Scope: " + getScopeName() + " | Defined Symbols: " + symbols.keySet().toString();
    }
}
