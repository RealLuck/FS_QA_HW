import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class ValidateJsonSchema {


    public void validated1(String json) throws IOException, JSONException {


    try{
        File file = new File("src/json1schema.json");
        String jsonStr = FileUtils.readFileToString(file, Charset.defaultCharset());
        JSONObject schemaObject = new JSONObject(jsonStr);
        Schema schema = SchemaLoader.load(schemaObject);
        schema.validate(new JSONObject(json));
        System.out.println("this json is validated to json schema");
            } catch (ValidationException e) {
                System.out.println("smth went wrong");
            }


    }

    public void validated2(String json) throws IOException {

        try{
            File file = new File("src/json2schema.json");
            String jsonStr = FileUtils.readFileToString(file, Charset.defaultCharset());
            JSONObject schemaObject = new JSONObject(jsonStr);
            Schema schema = SchemaLoader.load(schemaObject);
            schema.validate(new JSONArray(json));
            System.out.println("this json is validated to json schema");
        } catch (ValidationException e) {
            System.out.println("smth went wrong");
        }
    }

}