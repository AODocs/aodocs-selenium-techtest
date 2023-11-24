package methods;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import selenium.driver.Browser;
import selenium.driver.WebDriverUtility;
import validations.Compare;

public class VisitWebpageDirect {
    public static WebDriver visitAodocsHomepage(){
        WebDriver driver = WebDriverUtility.getWebDriver(Browser.CHROME);
        driver.get("https://www.aodocs.com/");
        String protocol = "https";
        String subDomain = "www";
        String domainName = "aodocs";
        String topLevelDomain = "com/";
        Boolean compareResult = Compare.validateUrl(driver, protocol, subDomain, domainName, topLevelDomain, null, null, null).getResult();
        String aodocsUrlString = Compare.validateUrl(driver, protocol, subDomain, domainName, topLevelDomain, null, null, null).getUrl();
        Assertions.assertTrue(compareResult, "ERROR: URL is not " + aodocsUrlString + ". URL is " + driver.getCurrentUrl());

        return driver;
    }
}
