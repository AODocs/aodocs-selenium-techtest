package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTestSuite;

public class GooglePage extends BaseTestSuite {
	@FindBy(id="introAgreeButton")
	private WebElement cookieAgreement_btn;
	@FindBy(xpath="//input[@name='q' and @type='text']")
	private WebElement google_search_bar;
	
	public GooglePage() {
		super();
	    PageFactory.initElements(webDriver, this);
	}

	public void googleUrlGet() {
		String googleUrl = "https://www.google.com";
		webDriver.get(googleUrl);
	}
	
	public void switchCookiePopUp() {
		WebDriverWait wait = new WebDriverWait(webDriver, 5);
		// Cookie agreement is in frame
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
	}
	
	public void acceptCookie() {
		cookieAgreement_btn.click();
	}
	
	public ResearchGooglePage fillAODocsUrl() {
		webDriver.navigate().refresh();
		google_search_bar.sendKeys("AODocs");
		google_search_bar.submit();
		return new ResearchGooglePage();
	}
	
}
