package validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import utils.UrlResult;

public class Urls {
    public static UrlResult urlParts(
        WebDriver driver,
        String protocol,
        String subDomain,
        String domainName,
        String topLevelDomain,
        String pathName,
        String queryCharacter,
        String parameterStrings
        ){

            String expUrl = protocol + "://" + subDomain + "." + domainName + "." + topLevelDomain;
        
            Boolean result = Compare.currentUrlAndExpUrl(driver, expUrl);
    
            // Return both the comparison result & the exepected URL string constructed here
            return new UrlResult(expUrl, result);
    }
    
    public static void aodocsRequestDemo(WebDriver driver, String expUrl){
        Compare.currentUrlAndExpUrl(driver, expUrl);
        String expectedTitle = "Connect with Us | AODocs";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(actualTitle, expectedTitle);
    }
}
