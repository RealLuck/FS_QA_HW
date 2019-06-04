
import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, JSONException {
            String choise;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You have two json's, make you'r choise \n1 - cat animal \n2 - cat and cherepashka animals\n0 - Exit");
            choise = scanner.nextLine();


            switch (choise) {


                case ("1"):

                    JsonTaker jsonTaker = new JsonTaker();
                    String json = jsonTaker.parsing1();

                    ValidateJsonSchema validateJsonSchema = new ValidateJsonSchema();
                    validateJsonSchema.validated1(json);

                    Deserialized deserialized = new Deserialized();
                    System.out.println("deseralizated json");
                    deserialized.deser1(json);

                    Serializebed serializebed = new Serializebed();
                    System.out.println("json serializated in pretty format");
                    serializebed.seria1(json);

                    break;


                case ("2"):

                    jsonTaker = new JsonTaker();
                    json = jsonTaker.parsing2();

                    validateJsonSchema = new ValidateJsonSchema();
                    validateJsonSchema.validated2(json);

                    deserialized = new Deserialized();
                    System.out.println("deseralizated json");
                    deserialized.deser2(json);

                    serializebed = new Serializebed();
                    System.out.println("json serializated in pretty format");
                    serializebed.seria2(json);

                    break;

                case ("0"):
                    break;

                default:
                    System.out.println("You need to choise carefuly");
                    break;

            }
        }
            while (!choise.equals("0") ) ;


    }
}