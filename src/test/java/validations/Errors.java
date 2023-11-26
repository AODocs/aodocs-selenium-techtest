package validations;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Errors {
    public static void completeRequiredField(WebDriver driver){
        String errorMsg = "Please complete this required field";
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + errorMsg + "')]"));
        Assertions.assertTrue(list.size() > 0,"ERROR: Error message (" + errorMsg + ") not found!");
    }

    public static void emailFormatIncorrect(WebDriver driver){
        String errorMsg = "Email must be formatted correctly.";
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + errorMsg + "')]"));
        Assertions.assertTrue(list.size() > 0,"ERROR: Error message (" + errorMsg + ") not found!");
    }
}
