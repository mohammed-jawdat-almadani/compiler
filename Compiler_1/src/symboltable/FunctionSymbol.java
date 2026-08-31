package symboltable;
import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionSymbol extends Symbol implements Scope {
    Map<String, Symbol> arguments = new LinkedHashMap<>();
    Scope enclosingScope;

    public FunctionSymbol(String name, Type type, Scope enclosingScope) {
        super(name, type);
        this.enclosingScope = enclosingScope;
    }

    @Override
    public String getScopeName() { return name; }

    @Override
    public Scope getEnclosingScope() { return enclosingScope; }

    @Override
    public void define(Symbol sym) {
        arguments.put(sym.getName(), sym);
        sym.scope = this;
    }

    @Override
    public Symbol resolve(String name) {
        Symbol s = arguments.get(name);
        if (s != null) return s;
        if (enclosingScope != null) return enclosingScope.resolve(name);
        return null;
    }


    @Override
    public String toString() {
        return "Scope: function " + name + " | Defined Symbols: " + arguments.keySet().toString();
    }

}
