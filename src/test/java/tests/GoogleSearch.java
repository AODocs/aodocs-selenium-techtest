package tests;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
    
    @Test
    public void googleSearchAodocs(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        String searchText = "AODocs";

        WebElement searchBoxElement = driver.findElement(By.cssSelector("#APjFqb"));
        searchBoxElement.sendKeys(searchText + Keys.ENTER);

        String searchResultTitleText = searchText;

        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + searchResultTitleText + "')]"));
        Assertions.assertTrue(list.size() > 0,"Text not found!");
    }
}
