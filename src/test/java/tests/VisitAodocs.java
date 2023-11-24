package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import methods.GoogleSearch;
import methods.OpenGoogleSearchResult;
import methods.VisitWebpageDirect;

public class VisitAodocs {

    @Test
    public void displayAodocsHomepageFromGoogleSearch(){
        String searchTextString = "aodocs";
        WebDriver driver = GoogleSearch.googleSearch(searchTextString);
        OpenGoogleSearchResult.openAodocsResult(driver, searchTextString);
        driver.quit();
    }

    @Test
    public void displayAodocsHomepageDirect(){
        WebDriver driver = VisitWebpageDirect.visitAodocsHomepage();
        driver.quit();
    }  
}
