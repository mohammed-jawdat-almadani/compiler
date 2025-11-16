package AST.value;

import AST.JsonObject;
import AST.KeyValue;

import java.util.List;
import java.util.ArrayList;

public class ObjectValue extends JsonObject {
    List<KeyValue> object;

    public ObjectValue() {
        this.object = new ArrayList<>();
    }

    public void addObject(KeyValue pair){
        object.add(pair);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ ");
        for (int i = 0; i < object.size(); i++) {
            if(i != object.size() - 1){
                stringBuilder.append(object.get(i)).append(',');
            } else {
                stringBuilder.append(object.get(i));
            }
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
