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
}
