package appiumdemo.ub.appium;


import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import pdfreport.PdfLog;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class FacebookHomeTest extends AbstractTest {
	
	FacebookHome objHome = new FacebookHome(driver);

	@Test (groups = "FacebookHome", description = "Test case to verify Facebook home page")
	public void facbookHomeTest(Method method) {
		Log.logTestMethodStart(method);
		Assert.assertTrue(objHome.verifyLoginFieldIsDisplayed());
		Assert.assertEquals(objHome.getButtonText(),
				"Create New Facebook Account");

	}

	@BeforeMethod (alwaysRun = true)
	public void beforeMethod() {
		PdfLog.clearActionResultStatusList();
	}

	@AfterMethod
	public void afterMethod(Method method, ITestResult result) {
		Log.logTestMethodEnd(method,result);
	}

}
