package spiral.ui.api;

import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;

public class PostPage extends PageObject {
    public Response response;

    public void fetchAllPosts() {
        response = SerenityRest.when().get(Serenity.environmentVariables().getProperty("webdriver.api.url"));
    }

    public void verifyResponseStatusCode() {
        response.then().statusCode(200).log().all();
    }

    public void verifyResponseContainsPosts() {
        response.then().body("$", Matchers.hasSize(Matchers.greaterThan(0)));
    }
}
