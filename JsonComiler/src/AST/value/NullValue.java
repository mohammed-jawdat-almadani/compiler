package AST.value;

import AST.JsonObject;

public class NullValue extends JsonObject {
    String value;

    public NullValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
