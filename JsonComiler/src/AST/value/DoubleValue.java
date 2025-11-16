package AST.value;

import AST.JsonObject;

public class DoubleValue extends JsonObject {
    double value;

    public DoubleValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
