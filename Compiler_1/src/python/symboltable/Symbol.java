package python.symboltable;

public class Symbol {
    protected String name;
    protected Type type;
    public Scope scope;

    public Symbol(String name) {
        this.name = name;
    }

    public Symbol(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() { return name; }
    public Type getType() { return type; }

    public String toString() {
        if (type != null) return "<" + name + ":" + type.getName() + ">";
        return name;
    }
}
