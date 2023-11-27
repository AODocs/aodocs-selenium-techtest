package validations;

import org.openqa.selenium.WebDriver;

public class Compare {
    public static Boolean currentUrlAndExpUrl(WebDriver driver, String expUrl){
        Boolean result = false;
        if(driver.getCurrentUrl().equalsIgnoreCase(expUrl)){
            result = true;
        }

        return result;
    }
}
