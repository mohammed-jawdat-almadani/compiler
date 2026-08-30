package symboltable;

public class LocalScope extends BaseScope {
    public LocalScope(Scope parent) { super(parent); }
    @Override public String getScopeName() { return "locals"; }
    @Override
    public String toString() {
        return getScopeName() + " " + symbols.keySet().toString();
    }

}
