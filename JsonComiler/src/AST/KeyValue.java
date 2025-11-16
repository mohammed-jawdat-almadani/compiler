package AST;

public class KeyValue extends JsonObject {
    String key;
    JsonObject value;

    KeyValue(String key, JsonObject value) {
        this.key = key;
        this.value =value;
    }

    @Override
    public String toString() {
        return key + " : " + value;
    }
}