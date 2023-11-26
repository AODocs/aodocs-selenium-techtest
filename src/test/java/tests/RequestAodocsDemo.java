package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import functions.ClickAodocsWebElement;
import functions.FillDemoRequestForm;
import functions.GoogleSearch;
import functions.OpenGoogleSearchResult;
import functions.VisitWebpageDirect;
import selenium.driver.Browser;
import selenium.driver.WebDriverUtility;
import utils.RandomGenerator;
import validations.Errors;
import validations.Urls;

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
    public void displayRequestForm(){
        String searchTextString = "aodocs";
        GoogleSearch.googleSearch(driver, searchTextString);
        OpenGoogleSearchResult.openAodocsResult(driver, searchTextString);
        ClickAodocsWebElement.clickHomepageButton(driver, "Request a demo");
        Urls.aodocsRequestDemo(driver, "https://www.aodocs.com/contact?request_type=request_demo");
    }

    @Test
    public void fillInRequestFormForTechTest(){
        VisitWebpageDirect.visitAodocsHomepage(driver);
        ClickAodocsWebElement.clickHomepageButton(driver, "Request a demo");
        String randomEmailString = RandomGenerator.generateRandomAlphanumericString10();
        FillDemoRequestForm.enterFirstName(driver, "Ray");
        FillDemoRequestForm.enterLastNameAndTab(driver, "");
        Errors.completeRequiredField(driver);
        FillDemoRequestForm.enterYourEmailAndTab(driver, randomEmailString);
        Errors.emailFormatIncorrect(driver);
        FillDemoRequestForm.selectCompanySize(driver, "0-4 employees");
    }

    @Test
    public void fillInRequestFormTextFieldsOnly(){
        
    }

    @Test
    public void clickSubmitOnEmptyRequestForm(){
        
    }

    @Test
    public void sqlInjectionFirstNameField(){
        VisitWebpageDirect.visitAodocsHomepage(driver);
        ClickAodocsWebElement.clickHomepageButton(driver, "Request a demo");
        FillDemoRequestForm.enterFirstName(driver, "SELECT * FROM Users WHERE UserId = 105 OR 1=1;");
    }

    @Test
    public void invalidEmailFormat(){
        
    }

    @Test
    public void invalidPhoneNumber(){
        
    }
}
