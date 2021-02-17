package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTestSuite;

public class ResearchGooglePage extends BaseTestSuite{

	@FindBy(xpath="//a[@href='https://www.aodocs.com/']")
	private WebElement aodocs_link_result;
	
	@FindBy(xpath="//div[@id='rso']/descendant-or-self::h3[1]/span")
	private WebElement first_result;

    public ResearchGooglePage() {
    	super();
        PageFactory.initElements(webDriver, this);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    
    public String firstResult() {
		return first_result.getText();
	}
    
    public HomePage findResultAODocsUrl() {
 		aodocs_link_result.click();
 		aodocs_link_result.submit();
 		return new HomePage();
 	}
}
