package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import methods.GoogleSearch;
import selenium.driver.Browser;
import selenium.driver.WebDriverUtility;

public class GoogleSearchAodocs {
    
    private static WebDriver driver;
    
    @BeforeEach
    public void startWebBrowserSession(){
        driver = WebDriverUtility.getWebDriver(Browser.CHROME);
    }

    public static WebDriver shareDriver() {
        return GoogleSearchAodocs.driver;
    }

    @AfterEach
    public void endWebSession(){
        WebDriverUtility.closeWebDriver(driver);
    }
    
    @Test
    public void displayAodocsGoogleSearchResults(){
        GoogleSearch.googleSearch(driver, "AODocs");
    }

    @Test
    public void displayAodocsDescriptionGoogleSearchResults(){
        GoogleSearch.googleSearch(driver, "google workspace ai document management system");
    }
}
