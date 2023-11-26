package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import functions.ClickAodocsWebElement;
import functions.FillDemoRequestForm;
import functions.GoogleSearch;
import functions.OpenGoogleSearchResult;
import selenium.driver.Browser;
import selenium.driver.WebDriverUtility;
import utils.RandomGenerator;
import validations.Errors;

public class RequestAodocsDemo {

    private static WebDriver driver;
    
    @BeforeEach
    public void startWebBrowserSession(){
        driver = WebDriverUtility.getWebDriver(Browser.CHROME);
    }

    public static WebDriver shareDriver() {
        return RequestAodocsDemo.driver;
    }

    @AfterEach
    public void endWebSession(){
        WebDriverUtility.closeWebDriver(driver);
    }
    
    @Test
    public void fillInRequestFormForTechTest(){
        String searchTextString = "aodocs";
        GoogleSearch.googleSearch(driver, searchTextString);
        OpenGoogleSearchResult.openAodocsResult(driver, searchTextString);
        ClickAodocsWebElement.clickHomepageButton(driver, "Request a demo");
        String randomEmailString = RandomGenerator.generateRandomAlphanumericString10();
        FillDemoRequestForm.enterFirstName(driver, "Ray");
        FillDemoRequestForm.enterLastNameAndTab(driver, "");
        Errors.completeRequiredField(driver);
        FillDemoRequestForm.enterYourEmailAndTab(driver, randomEmailString);
        Errors.emailFormatIncorrect(driver);
        FillDemoRequestForm.selectCompanySize(driver, "0-4 employees");
    }
}
