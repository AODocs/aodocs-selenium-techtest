package pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseTestSuite;
import entities.ProspectDetails;

public class RequestPage extends BaseTestSuite{
	
	//Drop down list request type
	@FindBy(xpath="//form/*/div/*/select[@Name='request_type']")
	private WebElement selectElementRT;
	private List<WebElement> listOptionsDdListRequestADemo;
	private WebElement optionDdListRequestADemo;
	//Drop down list compagny size
	@FindBy(xpath="//form/*/div/*/select[@Name='company_size__c']")
	private WebElement selectElementCZ;
	//button Accept Cookie
	@FindBy(id="ccc-notify-accept")
	private WebElement btn_AcceptCookie;
	//Form Fields
	@FindBy(name = "firstname")
	private WebElement fistNameInput;
	@FindBy(name = "lastname")
	private WebElement lastNameInput;
	@FindBy(name = "email")
	private WebElement emailInput;
	//Error messages
	@FindBy(xpath="//form/descendant-or-self::label[@Class='hs-error-msg']")
	private List<WebElement> listErrorMessageField;
	
	public RequestPage() {
		super();
		PageFactory.initElements(webDriver, this);
	}

	// get first element in option list (index 0 is for header)	
	public String optionRequestADemoFirstVisible() {
		listOptionsDdListRequestADemo = selectElementRT.findElements((By.tagName("option")));
		optionDdListRequestADemo = listOptionsDdListRequestADemo.get(1);
		return optionDdListRequestADemo.getText();
	}
	
	public void fillFormWithIncompleteUserData(ProspectDetails prospectDetails) {
		// fill field with first name
		fistNameInput.clear();
		fistNameInput.sendKeys(prospectDetails.getFirstName());
		// fill field with last name
		lastNameInput.clear();
		lastNameInput.sendKeys(prospectDetails.getLastName());
		// fill field with email
		emailInput.clear();
		emailInput.sendKeys(prospectDetails.getEmail());
		//select company size
		selectCompagnySize(prospectDetails);
	}
	
	public void selectCompagnySize(ProspectDetails prospectDetails) {
		// click on accept cookie to see elements in form
		btn_AcceptCookie.click();
		// get info from prospect
		String valueCompagnySize = prospectDetails.getCompagnySize();
		// select right compagny size in Drop down
		Select dropdown = new Select(selectElementCZ);  
	    dropdown.selectByValue(valueCompagnySize);;
	}
	
	public String submitForm() {
		selectElementCZ.submit();
		return webDriver.getCurrentUrl();
	}
	
	public Map<String,String> getMapOfErrorMessageAttributByInput() {
		Map<String, String> mapErrorAndNameField = new HashMap<String, String>();
		for (WebElement webElement : listErrorMessageField) {
			WebElement fieldInputWE = webElement.findElement(By.xpath("ancestor::ul/preceding-sibling::div/input"));
			String StringfieldInputStr = fieldInputWE.getAttribute("name");
			mapErrorAndNameField.put(StringfieldInputStr, webElement.getText());
		}
		return mapErrorAndNameField;
	}
	
	public boolean checkPresenceOfErrorMessage(Map<String, String> map, String fieldSearch) {
		return map.containsKey(fieldSearch);
	}
}
