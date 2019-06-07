import io.restassured.http.ContentType;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.*;
import java.io.IOException;
import java.util.List;
import static Constans.Credentials.USER;
import forTests.Deser;
import model.Issue;
import model.IssueList;
import model.Repo;


public class RestAssuredTest extends BaseTest {

    static String myRepo;

    static String path;


    @BeforeAll
    public static void makeRepo(){

        myRepo = "TestRest";

        Repo repo = new Repo(myRepo, "test example");

        prepareRequest().contentType(ContentType.JSON)

                .body(repo)

                .post("user/repos");

        path = "repos/" + USER + "/" + myRepo + "/issues";

    }

    @Test
    public void firstTest() throws IOException {


        Issue issue1 = prepareRequest().contentType(ContentType.JSON)

                .body(Deser.jsonString("src\\test\\resources\\json1.json"))

                .post(path)

                .body()

                .as(Issue.class);

        List<Issue> issuesList = prepareRequest().get(path).as(IssueList.class);

        System.out.println("List of issues");

        System.out.println(issuesList);

        assertThat(issuesList).extracting("id").contains(issue1.id);

    }



    @Test
    public void secondTest()throws IOException {

        Issue issue2 = prepareRequest().contentType(ContentType.JSON)

                .body(Deser.jsonString("src\\test\\resources\\json2.json"))

                .post(path)

                .body()

                .as(Issue.class);


        prepareRequest().contentType(ContentType.JSON)

                .body(Deser.jsonString("src\\test\\resources\\json3.json"))

                .patch(issue2.url);

        Issue issue3 = prepareRequest().get(issue2.url).body().as(Issue.class);

        assertThat(issue2.body).isNotEqualTo(issue3.body);

    }


    @Test
    public void thirdTest()throws IOException {

        Issue issue4 = prepareRequest().contentType(ContentType.JSON)

                .body(Deser.jsonString("src\\test\\resources\\json4.json"))

                .post(path)

                .body()

                .as(Issue.class);

        String lock = issue4.url + "/lock";

        prepareRequest().contentType(ContentType.JSON)

                .body(Deser.jsonString("src\\test\\resources\\json5.json"))

                .put(lock).then().statusCode(204);

        Issue issue5 = prepareRequest().contentType(ContentType.JSON).get(issue4.url).body().as(Issue.class);

        assertThat(issue5.locked).isTrue();

    }


    @AfterAll
    public static void delRepo(){

        String path = "/repos/" + USER + "/" + myRepo;

        prepareRequest().delete(path);

    }

}