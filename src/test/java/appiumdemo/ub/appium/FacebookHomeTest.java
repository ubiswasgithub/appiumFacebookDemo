package appiumdemo.ub.appium;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class FacebookHomeTest extends AbstractTest {
	
	FacebookHome objHome = new FacebookHome(driver);

	@Test
	public void facbookHomeTest() {
		Assert.assertTrue(objHome.verifyLoginFieldIsDisplayed());
		Assert.assertEquals(objHome.getButtonText(),
				"Create New Facebook Account");

	}

	@BeforeMethod
	public void beforeMethod() {
		
	}

	@AfterMethod
	public void afterMethod() {
	}

}
