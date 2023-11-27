package functions;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {
    
    public static WebDriver googleSearch(WebDriver driver, String searchText){
        
        driver.get("https://www.google.com/");

        // CSS for Reject All on Google Search without login:
        WebElement rejectAllCookiesElement = driver.findElement(By.cssSelector("#W0wltc"));
        rejectAllCookiesElement.click(); 

        EnterText.viaCssSelectorsAndEnter(driver, searchText, "#APjFqb");

        String searchResultTitleText = searchText;

        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + searchResultTitleText + "')]"));
        Assertions.assertTrue(list.size() > 0,"ERROR: Text not found!");

        return driver;
        
    }
}
