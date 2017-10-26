package appiumdemo.ub.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AppiumGoogleTest {
	private static WebDriver driver = null;
	@Test
	public void verifyGoogleTest() throws InterruptedException {
//		driver.navigate().to("https://www.google.com");
//		Assert.assertEquals("Google", driver.getTitle());
		
		driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
		driver.findElement(By.id("com.android.calculator2:id/op_mul")).click();
		driver.findElement(By.id("com.android.calculator2:id/digit_6")).click();
		driver.findElement(By.id("com.android.calculator2:id/eq")).click();

		String txt = driver.findElement(By.id("com.android.calculator2:id/formula")).getText().toString();
		Assert.assertEquals("48",txt );

	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws MalformedURLException, InterruptedException {
		
		// android app settings....
//		File classpathRoot = new File(System.getProperty("user.dir"));
//		File appDir = new File(classpathRoot, "/Apps/");
//		File app = new File(appDir, "Calculator.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		capabilities.setCapability("deviceName", "192.168.55.101:5555");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "Android");
		
		// android settings 2...
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(10000);
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		driver.quit();
	}

}
