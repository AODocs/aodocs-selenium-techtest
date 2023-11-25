package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import functions.GoogleSearch;
import functions.OpenGoogleSearchResult;
import functions.VisitWebpageDirect;
import selenium.driver.Browser;
import selenium.driver.WebDriverUtility;

public class VisitAodocs {

    private static WebDriver driver;
    
    @BeforeEach
    public void startWebBrowserSession(){
        driver = WebDriverUtility.getWebDriver(Browser.CHROME);
    }

    public static WebDriver shareDriver() {
        return VisitAodocs.driver;
    }

    @AfterEach
    public void endWebSession(){
        WebDriverUtility.closeWebDriver(driver);
    }
    
    @Test
    public void displayAodocsHomepageFromGoogleSearch(){
        String searchTextString = "aodocs";
        GoogleSearch.googleSearch(driver, searchTextString);
        OpenGoogleSearchResult.openAodocsResult(driver, searchTextString);
    }

    @Test
    public void displayAodocsHomepageDirect(){
        VisitWebpageDirect.visitAodocsHomepage(driver);
    }  
}
