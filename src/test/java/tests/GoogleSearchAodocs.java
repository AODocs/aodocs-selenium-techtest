package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import methods.GoogleSearch;

public class GoogleSearchAodocs {
    
    @Test
    public void googleSearchAodocs(){
        WebDriver driver = GoogleSearch.googleSearch("AODocs");
        driver.quit();
    }

    @Test
    public void googleSearchAodocsDescription(){
        WebDriver driver = GoogleSearch.googleSearch("google workspace ai document management system");
        driver.quit();
    }
}
