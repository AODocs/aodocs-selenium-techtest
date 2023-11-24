package methods;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import validations.Compare;

public class OpenGoogleSearchResult {

    public static void openAodocsResult(WebDriver driver, String searchString){
        String aodocsWebpageResultCss = "#rso > div:nth-child(1) > div > div > div > div > div > div > div > div.yuRUbf > div > span > a";
        WebElement aodocsWebpageResult = driver.findElement(By.cssSelector(aodocsWebpageResultCss));
        aodocsWebpageResult.click();
        
        String protocol = "https";
        String subDomain = "www";
        String domainName = searchString;
        String topLevelDomain = "com/";
        Boolean compareResult = Compare.validateUrl(driver, protocol, subDomain, domainName, topLevelDomain, null, null, null).getResult();
        String aodocsUrlString = Compare.validateUrl(driver, protocol, subDomain, domainName, topLevelDomain, null, null, null).getUrl();
        Assertions.assertTrue(compareResult, "ERROR: URL is not " + aodocsUrlString + ". URL is " + driver.getCurrentUrl());
    }
}
