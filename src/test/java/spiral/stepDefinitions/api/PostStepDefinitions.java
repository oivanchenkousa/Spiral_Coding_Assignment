package spiral.stepDefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import spiral.steps.api.PostSteps;

public class PostStepDefinitions {
    @Steps
    PostSteps postSteps;

    @Given("The client fetches all posts")
    public void openGoogleSearch() {
        postSteps.fetchAllPosts();
    }

    @Then("The response status code should be 200")
    public void theResponseStatusCodeShouldBe() {
        postSteps.verifyRespStatusCode();
    }

    @Then("The response should contain posts")
    public void verifyResponsePosts() {
        postSteps.verifyPosts();
    }
}
