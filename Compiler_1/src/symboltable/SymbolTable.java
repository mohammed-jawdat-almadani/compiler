package symboltable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    private Scope currentScope;
    private List<Scope> allScopes = new ArrayList<>();

    public SymbolTable() {
        this.currentScope = new GlobalScope();
        allScopes.add(currentScope);
        initBuiltIns();
    }

    protected void initBuiltIns() {
        define(new Symbol("int", new BuiltInTypeSymbol("int")));
        define(new Symbol("float", new BuiltInTypeSymbol("float")));
        define(new Symbol("string", new BuiltInTypeSymbol("string")));
        define(new Symbol("void", new BuiltInTypeSymbol("void")));
    }


    public void enterScope(Scope scope) {
        currentScope = scope;
        allScopes.add(scope);
    }

    public void exitScope() {
        if (currentScope.getEnclosingScope() != null) {
            currentScope = currentScope.getEnclosingScope();
        }
    }


    public void define(Symbol sym) {
        currentScope.define(sym);
    }

    public Symbol resolve(String name) {
        return currentScope.resolve(name);
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void printSymbolTable() {
        System.out.println("\n================ SYMBOL TABLE DUMP ================");
        for (Scope scope : allScopes) {
            System.out.println(scope.toString());
            System.out.println("---------------------------------------------------");
        }
        System.out.println("===================================================\n");
    }


    public static class BuiltInTypeSymbol extends Symbol implements Type {
        public BuiltInTypeSymbol(String name) { super(name); }
    }
}
