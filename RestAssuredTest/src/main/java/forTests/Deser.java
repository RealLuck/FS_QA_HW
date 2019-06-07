package forTests;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.Path;

public class Deser {

    public static String jsonString (String file) throws IOException{

        String json;

        Path path = Paths.get(file);

        byte[] data = Files.readAllBytes(path);

        json = new String(data, StandardCharsets.UTF_8);

        return json;

    }

}

