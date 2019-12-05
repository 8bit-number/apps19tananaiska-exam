package json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {
    private JsonPair[] pairs;

    public JsonObject(JsonPair... jsonPairs) {
        this.pairs = jsonPairs;

    }

    @Override
    public String toJson() {
        if (this.pairs.length != 0) {
            StringBuilder b = new StringBuilder("{");
            for (JsonPair p : this.pairs) {
                b.append("'" + p.key + "'");
                b.append(": ");
                b.append(p.value.toJson());
                b.append(",");
            }
            b.deleteCharAt(b.length() - 1);
            b.append("}");
            return b.toString();
        }
        return "{}";
    }

    public void add(JsonPair jsonPair) {
//        todo
    }

    public Json find(String name) {
        // ToDo
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        return null;
    }

//    public static void main(String[] args) {
////        JsonPair jSurname = new JsonPair("surname", new JsonString("Nik"));
////        JsonPair jActive = new JsonPair("active", new JsonBoolean(true));
//        JsonObject jsonObject = new JsonObject();
//        System.out.println(jsonObject.toJson());
////        String expectedJSON = "{'surname': 'Nik', 'active': true}";
//    }
}
