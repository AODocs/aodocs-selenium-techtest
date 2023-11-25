package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterText {
    public static void viaCssSelectorsAndEnter(WebDriver driver, String inputText, String selector){
        WebElement inputField = driver.findElement(By.cssSelector(selector));
        inputField.sendKeys(inputText + Keys.ENTER);
    }
    
    public static void viaCssSelectorsAndTab(WebDriver driver, String inputText, String selector){
        WebElement inputField = driver.findElement(By.cssSelector(selector));
        inputField.sendKeys(inputText + Keys.TAB);
    }
    
    public static void viaCssSelectors(WebDriver driver, String inputText, String selector){
        WebElement inputField = driver.findElement(By.cssSelector(selector));
        inputField.sendKeys(inputText);
    }
}
