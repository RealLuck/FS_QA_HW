import cucumber.api.java.en.*;
import org.junit.Assert;
import java.io.File;
import java.io.IOException;

public class TestSteps {

    String fileName;


    @Given("^User want to create \"([^\"]*)\" file$")
    public void a_tremendous_desire_to_create_file(String name) {
        fileName = name;
        System.out.println("Given. File to create:\t" + name);

    }

    @When("^User calls the createFile method$")
    public void user_calls_the_createFile_method() {
        Testcontext.file = new Files();
        try {
            Testcontext.file.createFileforTest(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("When. Trying to create:\t" +  Testcontext.file.getFile());

    }

    @Then("^File with this name appears in folder$")
    public void file_with_this_name_appears_in_folder()  {
        File check = new File (fileName);
        Assert.assertTrue(check.isFile());
        System.out.println("Then. File is created:\t" + fileName);

    }
}
