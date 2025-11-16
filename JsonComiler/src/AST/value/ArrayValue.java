package AST.value;

import AST.JsonObject;

import java.util.List;
import java.util.ArrayList;

public class ArrayValue extends JsonObject {
    List<JsonObject> arrayValue;

    public ArrayValue() {
        this.arrayValue = new ArrayList<>();
    }

    public void addValue(JsonObject object){
        arrayValue.add(object);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        for (int i = 0; i < arrayValue.size(); i++) {
            if(i != arrayValue.size() - 1) {
                stringBuilder.append(arrayValue.get(i)).append(',');
            } else {
                stringBuilder.append(arrayValue.get(i));
            }
        }
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }
}
