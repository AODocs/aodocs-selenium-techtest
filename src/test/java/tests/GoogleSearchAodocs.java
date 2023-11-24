package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import methods.GoogleSearch;

public class GoogleSearchAodocs {
    
    @Test
    public void displayAodocsGoogleSearchResults(){
        WebDriver driver = GoogleSearch.googleSearch("AODocs");
        driver.quit();
    }

    @Test
    public void displayAodocsDescriptionGoogleSearchResults(){
        WebDriver driver = GoogleSearch.googleSearch("google workspace ai document management system");
        driver.quit();
    }
}
