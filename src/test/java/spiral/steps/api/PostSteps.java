package spiral.steps.api;

import net.thucydides.core.annotations.Step;
import spiral.ui.api.PostPage;

public class PostSteps {
    PostPage postPage;

    @Step("Client fetches all posts")
    public void fetchAllPosts() {
        postPage.fetchAllPosts();
    }

    @Step("Verify response status code 200")
    public void verifyRespStatusCode() {
        postPage.verifyResponseStatusCode();
    }

    @Step("Verify response posts")
    public void verifyPosts() {
        postPage.verifyResponseContainsPosts();
    }
}
