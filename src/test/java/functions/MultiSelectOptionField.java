package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectOptionField {
    public static void dropdownOptions(WebDriver driver, String elementId, String visibleText){
        Select dropdown = new Select(driver.findElement(By.cssSelector(elementId)));
        dropdown.selectByVisibleText(visibleText);
    }

    public static void radioButtons(WebDriver driver){
    }
}
