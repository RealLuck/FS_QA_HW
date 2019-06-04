


import org.apache.commons.io.IOUtils;

import java.io.*;



public class JsonTaker {


    public String parsing1() throws IOException {


        FileInputStream fileInputStream = new FileInputStream(new File("src/json1.json"));
        String encoded = IOUtils.toString(fileInputStream);


            return new String(encoded);

    }
    public String parsing2() throws IOException {


        FileInputStream fileInputStream = new FileInputStream(new File("src/json2.json"));
        String encoded = IOUtils.toString(fileInputStream);


        return new String(encoded);

    }
}
