package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import functions.ClickAodocsWebElement;
import functions.GoogleSearch;
import functions.OpenGoogleSearchResult;
import selenium.driver.Browser;
import selenium.driver.WebDriverUtility;
import validations.Urls;

public class RequestAodocsDemo {

    private static WebDriver driver;
    
    @BeforeEach
    public void startWebBrowserSession(){
        driver = WebDriverUtility.getWebDriver(Browser.CHROME);
    }

    public static WebDriver shareDriver() {
        return RequestAodocsDemo.driver;
    }

    @AfterEach
    public void endWebSession(){
        WebDriverUtility.closeWebDriver(driver);
    }
    
    @Test
    public void displayRequestForm(){
        String searchTextString = "aodocs";
        GoogleSearch.googleSearch(driver, searchTextString);
        OpenGoogleSearchResult.openAodocsResult(driver, searchTextString);
        ClickAodocsWebElement.clickHomepageButton(driver, "Request a demo");
        Urls.aodocsRequestDemo(driver, "https://www.aodocs.com/contact?request_type=request_demo");
    }
}
