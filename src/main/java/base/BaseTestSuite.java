package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import pages.GooglePage;
import pages.HomePage;
import pages.RequestPage;
import pages.ResearchGooglePage;
import selenium.driver.Browser;
import selenium.driver.WebDriverUtility;
import util.PropertyReader;

public class BaseTestSuite {
	public static WebDriver webDriver;
	public static PropertyReader propertyReader;
	public GooglePage googlePage;
	public ResearchGooglePage researchGooglePage;
	public HomePage homePage;
	public RequestPage requestPage;
	
	public BaseTestSuite() {
		propertyReader = new PropertyReader();
	}
	
	@BeforeAll
	public static void setUp() {
		String browser = propertyReader.readProperty("browser");
		switch (browser) {
			case "chrome":
				webDriver = WebDriverUtility.getWebDriver(Browser.CHROME);
				break;
			case "firefox":
				webDriver = WebDriverUtility.getWebDriver(Browser.FIREFOX);
                break;
            default:
                throw new WebDriverException();
		}
	}
	
	@AfterAll
	public static void tearDown() {
		WebDriverUtility.closeWebDriver(webDriver);
	}
	
	
}

