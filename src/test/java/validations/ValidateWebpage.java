package validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ValidateWebpage {
    public static void aodocsRequestDemo(WebDriver driver, String webpageString){
        Compare.validateUrlComplete(driver, webpageString);
        String expectedTitle = "AODocs";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(actualTitle, expectedTitle);
    }
}
