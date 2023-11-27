package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickAodocsWebElement {
    public static void clickHomepageButton(WebDriver driver, String buttonText){
        String xpathString = "//*[contains(text(),'";
        WebElement requestDemoElement = driver.findElement(By.xpath(xpathString + buttonText + "')]"));
        requestDemoElement.click();
    }
}
