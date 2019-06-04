import com.google.gson.*;

public class Serializebed {

    public void seria1(String json){

        JsonParser parser = new JsonParser();

        JsonObject jsonPretty = parser.parse(json).getAsJsonObject();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String jsonPrint = gson.toJson(jsonPretty);

        System.out.println(jsonPrint);

    }

    public void  seria2(String json){

        JsonParser parser = new JsonParser();

        JsonArray jsonPretty = parser.parse(json).getAsJsonArray();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String jsonPrint = gson.toJson(jsonPretty);

        System.out.println(jsonPrint);


    }
}
