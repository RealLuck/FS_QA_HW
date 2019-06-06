import org.junit.jupiter.api.Test;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.Charset;

import static org.assertj.core.api.Assertions.assertThat;

public class TestFile {

    @Test
    void assertFile(){
        File xFile = writeFile("xFile", "Expected");

        assertThat(xFile)
                .exists()
                .isFile()
                .canRead()
                .canWrite();
    }

    private File writeFile(String fileName, String fileContent) {
        return writeFile(fileName, fileContent, Charset.defaultCharset());
    }

    private File writeFile(String fileName, String fileContent, Charset charset) {
        File file = new File("src/test/resources/" + fileName);

        try {
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
            out.write(fileContent);
            out.close();
        } catch (IOException e) {}
        return file;
    }

    @Test
    void coffetype() throws IOException {
        File xFile = writeFile("xFile", "Coffee{type=Latte, beans=7, milk=227}");
        Coffee coffee = new Coffee(CoffeeType.Latte, 7,227);
        String expectedCoffee = coffee.toString();
        FileInputStream fileInputStream = new FileInputStream(xFile);
        String expectedFile = IOUtils.toString(fileInputStream);

        assertThat(expectedFile).isEqualTo(expectedCoffee);

    }
}

