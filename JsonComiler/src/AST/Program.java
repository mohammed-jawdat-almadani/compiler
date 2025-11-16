package AST;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public JsonObject jsonObject;

    public Program(JsonObject jsonObject){
        this.jsonObject = jsonObject;
    }

    @Override
    public String toString() {
        return jsonObject.toString();
    }
}
