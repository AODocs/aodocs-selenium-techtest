package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import methods.GoogleSearch;
import methods.OpenGoogleSearchResult;

public class VisitAodocs {

    @Test
    public void visitAodocsFromGoogleSearch(){
        String searchTextString = "aodocs";
        WebDriver driver = GoogleSearch.googleSearch(searchTextString);
        OpenGoogleSearchResult.openAodocsResult(driver, searchTextString);
        driver.quit();
    }

    @Test
    public void visitAodocsDirect(){

    }
    
}
