package spiral.ui;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.junit.Assert.assertTrue;

@DefaultUrl("/")
public class SearchPage extends PageObject {
    @FindBy(id = "APjFqb")
    WebElement searchInput;

    @FindBy(name = "btnK")
    WebElement googleSerachBtn;

    @FindBy(id = "APjFqb")
    WebElement googleSearchLine;

    @FindBy(xpath = "//div[@class='g Ww4FFb vt6azd tF2Cxc asEBEc']/descendant::h3")
    List<WebElement> eachLink;


    public void waitSearchInputField() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(searchInput));
    }

    public void enterValue(String searchValue) {
        waitSearchInputField();
        searchInput.clear();
        searchInput.sendKeys(searchValue);
    }

    public void clickGoogleSearchBtn() {
        googleSerachBtn.click();
        waitABit(2500);
    }

    public String parseUrl() {
        String currentURL = getDriver().getCurrentUrl();
        String[] parsedUrl = currentURL.split("q=");
        return parsedUrl[1].split("&")[0];
    }

    public String verifySearchLine() {
        return googleSearchLine.getText();
    }

    public void verifyTitleSearchResult(String linkSearchValue) {
        for (WebElement ele : eachLink) {
            assertTrue(ele.getText().contains(linkSearchValue));
        }
    }
}
