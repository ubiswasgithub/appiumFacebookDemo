package appiumdemo.ub.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AbstractTest{

	protected static WebDriver driver = null;
	
	@BeforeSuite(alwaysRun = true)	
	public void beforeSuite(ITestContext testContext) {

	}

	@BeforeTest(alwaysRun = true)
	public void appiumTestSetUp() throws MalformedURLException, InterruptedException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", Configuration.testDeviceName);
		capabilities.setCapability("platformVersion",
				Configuration.testPlatformVersion);
		capabilities.setCapability("platformName",
				Configuration.testPlatformName);

		capabilities.setCapability("appPackage", Configuration.testAppPackage);
		capabilities
				.setCapability("appActivity", Configuration.testAppActivity);

		driver = new RemoteWebDriver(new URL(Configuration.testAppiumServer),
				capabilities);
		Utils.waitForDuration(driver, 10);
		Utils.pauseDriverForDuration(1000);
		
	}

	@AfterTest
	public void appiumTestTearDown() {
		
		if(driver !=null){
			driver.quit();
		}
		
	}

	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

}
