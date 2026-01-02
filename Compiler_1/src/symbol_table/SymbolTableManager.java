package symbol_table;

import java.util.Stack;

public class SymbolTableManager {
    private Stack<Scope> scopeStack = new Stack<>();

    public SymbolTableManager() {
        scopeStack.push(new Scope(null, true));
    }

    public void enterScope() {
        scopeStack.push(new Scope(currentScope(), false));
    }

    public void exitScope() {
        if (!scopeStack.isEmpty()) scopeStack.pop();
    }

    public Scope currentScope() {
        return scopeStack.peek();
    }

    public void define(String name, String type, int line, int column) {
        Scope scope = currentScope();
        SymbolKind kind = scope.isGlobal ? SymbolKind.GLOBAL : SymbolKind.LOCAL;

        SymbolTable sym = new SymbolTable(name, type, line, column, kind);
        scope.define(sym);
    }

    public SymbolTable resolve(String name) {
        return currentScope().resolve(name);
    }

    public void dump() {
        dumpScope(scopeStack.peek(), 0);
    }

    private void dumpScope(Scope scope, int level) {
        if (scope == null) return;

        System.out.println("  ".repeat(level) + "Scope {");
        for (var sym : scope.symbols.values()) {
            System.out.println(
                    "  ".repeat(level + 1) + sym
            );
        }
        System.out.println("  ".repeat(level) + "}");
    }


}
