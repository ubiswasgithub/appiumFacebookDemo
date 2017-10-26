package appiumdemo.ub.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UiHelper {
	
	private static WebDriver driver = AbstractTest.getDriver();
	
	

	public static void click( By el) {
		driver.findElement(el).click();
	}

	public static boolean isVisibleAndDisplayed(By el) {
		if (driver.findElement(el).isDisplayed()
				&& driver.findElement(el).isEnabled()) {
			return true;
		} else {
			return false;
		}

	}

	public static String getText(By el) {
		// TODO Auto-generated method stub
		return driver.findElement(el).getText();
	}

	public static void enterText(By el, String txt) {
		// TODO Auto-generated method stub		
		if(driver.findElement(el).isDisplayed()){
			driver.findElement(el).clear();
			driver.findElement(el).sendKeys(txt);
		}
		
	}

	
	static boolean matchedToHeader(By el, String txt){	
		boolean b =false;
		try{
			if(UiHelper.getText(el).equalsIgnoreCase(txt)){
				b = true;
			}
		}catch(Exception e){
			b = false;
		}
		
		return b;
		
	}

	public static boolean matchedSelectedCountry(By el,
			String txt) {
		boolean b =false;
		try{
			if(UiHelper.getText(el).equalsIgnoreCase(txt)){
				b = true;
			}
		}catch(Exception e){
			b = false;
		}
		
		return b;
	}

}
