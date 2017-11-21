package appiumdemo.ub.appium;

import io.appium.java_client.android.AndroidDriver;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CalculatorTest {

	private static AndroidDriver driver = null;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "04cd746200741e45");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("browserName", "Android");
		
		// android settings 2...
//		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		driver.quit();

	}

}
