package spiral.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import spiral.ui.SearchPage;

public class SearchSteps {
    SearchPage searchPage;

    @Step("Open Google Home Page")
    public void openGoogle() {
        searchPage.open();
    }

    @Step("Open Google Home Page and search Ducks")
    public void searchInGoogleValue(String searchValue) {
        searchPage.enterValue(searchValue);
        searchPage.clickGoogleSearchBtn();
    }

    @Step("Verify Search result in the Google")
    public void checkURLSearchResult(String searchValue) {
        Assert.assertTrue(searchPage.parseUrl().contains(searchValue));
    }

    @Step("Verify search result in the search line: {string}")
    public void verifySearchLineResult(String searchValue) {
        Assert.assertTrue(searchPage.verifySearchLine().contains(searchValue));
    }

    @Step("Verify each search result result in the search contains: {string}")
    public void verifyTitleSearchResult(String linkSearchValue) {
        searchPage.verifyTitleSearchResult(linkSearchValue);
    }
}
