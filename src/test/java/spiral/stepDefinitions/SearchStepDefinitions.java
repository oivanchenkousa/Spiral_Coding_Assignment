package spiral.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchStepDefinitions {
    @Steps
    spiral.steps.SearchSteps searchSteps;

    @Given("Open Google Search")
    public void openGoogleSearch() {
        searchSteps.openGoogle();
    }

    @When("Search in Google: {string}")
    public void searchInGoogle(String searchValue) {
        searchSteps.searchInGoogleValue(searchValue);
    }

    @Then("Verify search result in the URL: {string}")
    public void verifySearchResult(String searchValue) {
        searchSteps.checkURLSearchResult(searchValue);
    }

    @And("Verify search result in the search line: {string}")
    public void verifySearchLineResult(String searchValue) {
        searchSteps.verifySearchLineResult(searchValue);
    }

    @And("Verify each search result: {string}")
    public void verifyEachSearchResult(String linkSearchValue) {
        searchSteps.verifyTitleSearchResult(linkSearchValue);
    }
}
