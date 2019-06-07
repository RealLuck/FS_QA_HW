import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import static Constans.Path.*;
import static Constans.Credentials.*;



public class BaseTest {

    static RequestSpecification prepareRequest(){

        return given()

                .auth()

                .preemptive()

                .basic(USER, PASSWORD)

                .filter(new RequestLoggingFilter())

                .filter(new ResponseLoggingFilter())

                .baseUri(BASE_URL);

    }

}