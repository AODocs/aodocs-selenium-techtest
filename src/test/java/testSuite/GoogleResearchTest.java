package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import base.BaseTestSuite;
import pages.GooglePage;

@TestInstance(Lifecycle.PER_CLASS)
public class GoogleResearchTest extends BaseTestSuite{
	
	public void setUpRoute() {
		googlePage = new GooglePage();
		// go to www.google.com
        googlePage.googleUrlGet();
        // focus on cookie agreement pop up
        googlePage.switchCookiePopUp();
        // accept cookies
        googlePage.acceptCookie();
	}
	
	@Test
	public void isAodocsFirstResult() {
		setUpRoute();
		researchGooglePage = googlePage.fillAODocsUrl();
		Assertions.assertEquals(researchGooglePage.firstResult(), "AODocs: Cloud Document Services Platform");
 
	}
}
