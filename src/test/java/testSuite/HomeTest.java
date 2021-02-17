package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import base.BaseTestSuite;
import pages.HomePage;

@TestInstance(Lifecycle.PER_CLASS)
public class HomeTest extends BaseTestSuite{
	
	public void setUpRoute() {
		homePage = new HomePage();
		// go to www.aodocs.com
        homePage.aodocsUrlGet();
	}
	
	@Test
	public void openAodocsWeb() {
		setUpRoute();
		Assertions.assertEquals(homePage.getTitle(), "Cloud Document Services Platform | AODocs");
	}
	
	@Test
	public void requestDemoVisibleOnHeaderBanner() {
		Assertions.assertTrue(homePage.iSrequestADemoLinkInBannerDisplay());
	}
	
	
	
}
