import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collection;

public class Deserialized {

    public void deser1(String json) {

        GsonBuilder builder = new GsonBuilder();

        Gson gson = builder.create();

        CatAnimal test = gson.fromJson(json, CatAnimal.class);

        System.out.println(test);
    }

    public void deser2(String json){

        GsonBuilder builder = new GsonBuilder();

        Gson gson = builder.create();

        Type collectionType = new TypeToken<Collection<Animals>>(){}.getType();

        Collection<Animals> animalsCollection = gson.fromJson(json, collectionType);



        System.out.println(animalsCollection);


    }
}
