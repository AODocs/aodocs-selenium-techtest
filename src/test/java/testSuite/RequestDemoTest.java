package testSuite;

import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

import base.BaseTestSuite;
import entities.CompagnySize;
import entities.ProspectDetails;
import pages.HomePage;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class RequestDemoTest extends BaseTestSuite{
	
	private Map<String,String> mapErrorAndNameField;

	public void requestDemoRoute() {
		// go to https://www.aodocs.com/contact?request_type=request_demo
		homePage = new HomePage();
		homePage.aodocsUrlGet();
		requestPage = homePage.requestADemo();
	}
	
	@Test
	@Order(1)
	public void iSrequestADemoFirstVisible() {
		// is "Request Demo" first field in drop down menu list of request types ? 
		requestDemoRoute();
		Assertions.assertEquals("Request a Demo",requestPage.optionRequestADemoFirstVisible());
	}
	
	@Test
	@Order(2)
	public void fillFormWithIncompleteUserData() {
		//fill the form with user name,  blank last name, incorrect mail and third pick company size
		ProspectDetails prospect = new ProspectDetails("Eric", "", "testFalseEmail", CompagnySize.EMP_51_350.getValue());
		requestPage.fillFormWithIncompleteUserData(prospect);
	}
	
	@Test
	@Order(5)
	// for email, two cases are filled out : email is empty and email got wrong pattern (with "@" + ".xx")
	public void checkErrorMessageOnIncompleteUser() {
		mapErrorAndNameField = requestPage.getMapOfErrorMessageAttributByInput();
		Boolean isLastNameOnError = requestPage.checkPresenceOfErrorMessage(mapErrorAndNameField, "lastname");
		Boolean isEmailOnError = requestPage.checkPresenceOfErrorMessage(mapErrorAndNameField, "email");
		Boolean isFirstNameOnError = requestPage.checkPresenceOfErrorMessage(mapErrorAndNameField, "firstname");
		Assertions.assertFalse(isFirstNameOnError);
		Assertions.assertTrue(isLastNameOnError);
		Assertions.assertTrue(isEmailOnError);
	}
	
	@Test
	@Order(6)
	// for email, only case are filled out : email is empty and email got wrong pattern (without "@" + ".xx")
	public void checkErrorMessageLabel() {
		String lastNameErrorMsg = mapErrorAndNameField.get("lastname");
		String emailErrorMsg = mapErrorAndNameField.get("email");
		Assertions.assertEquals("Please complete this required field.", lastNameErrorMsg);
		Assertions.assertEquals("Email must be formatted correctly.", emailErrorMsg);
	}

	@Test
	//TODO: To complete with API tests / or DB tests
	@Order(7)
	public void isFormNonSubmitableWithIncompleteData() {
		Assertions.assertEquals("https://www.aodocs.com/contact?request_type=request_demo",requestPage.submitForm());
	}
}
