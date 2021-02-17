package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTestSuite;

public class HomePage extends BaseTestSuite {
	
	@FindBy(linkText="Request a demo")
	private WebElement requestADemo_btn;
	@FindBy(xpath="//div[contains(@class,'banner-content')]/descendant-or-self::a[text()='Request a demo']")
	private WebElement bannerContainsRequestBtn;
	
	public HomePage() {
		super();
		PageFactory.initElements(webDriver, this);
	}
	
	public void aodocsUrlGet() {
		String googleUrl = "https://www.aodocs.com";
		webDriver.get(googleUrl);
	}
	
	public String getTitle() {
		return webDriver.getTitle();
	}

	public RequestPage requestADemo() {
		requestADemo_btn.click();
		return new RequestPage();
	}
	// link is in the header banner
	public boolean iSrequestADemoLinkInBannerDisplay() {
		return bannerContainsRequestBtn.isDisplayed();
	}

}
