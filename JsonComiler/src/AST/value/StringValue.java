package AST.value;

import AST.JsonObject;

public class StringValue extends JsonObject {
    String value;

    public StringValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
