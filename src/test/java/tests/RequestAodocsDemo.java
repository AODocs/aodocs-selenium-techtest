package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import methods.ClickAodocsWebElement;
import methods.GoogleSearch;
import methods.OpenGoogleSearchResult;
import validations.ValidateWebpage;

public class RequestAodocsDemo {

    @Test
    public void displayRequestForm(){
        String searchTextString = "aodocs";
        WebDriver driver = GoogleSearch.googleSearch(searchTextString);
        OpenGoogleSearchResult.openAodocsResult(driver, searchTextString);
        ClickAodocsWebElement.clickHomepageButton(driver, "Request a demo");
        ValidateWebpage.aodocsRequestDemo(driver, "https://www.aodocs.com/contact?request_type=request_demo");
        driver.quit();
    }
}
