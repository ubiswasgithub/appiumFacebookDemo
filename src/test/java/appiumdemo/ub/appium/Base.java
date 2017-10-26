package appiumdemo.ub.appium;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;


public class Base{
	
	private static WebDriver driver = null;
	
	public  Base() throws MalformedURLException, InterruptedException{
		
	}
	
	public static WebDriver getDriver(){
		return driver;
	}

}
