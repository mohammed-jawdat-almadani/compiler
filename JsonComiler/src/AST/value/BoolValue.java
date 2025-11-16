package AST.value;

import AST.JsonObject;

public class BoolValue extends JsonObject {
    Boolean value;

    public BoolValue(Boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Boolean.toString(value);
    }
}
