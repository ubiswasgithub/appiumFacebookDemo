package appiumdemo.ub.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookHome {
	private static WebDriver driver;
	By element_login_create_account_button = new By.ById(
			"com.facebook.katana:id/login_create_account_button");
	By element_login_username = new By.ById(
			"com.facebook.katana:id/login_username");
	By element_login_password = new By.ById(
			"com.facebook.katana:id/login_password");
	By element_login_login = new By.ById("com.facebook.katana:id/login_login");
	By element_login_forgot_password = new By.ById(
			"com.facebook.katana:id/login_forgot_password");

	public FacebookHome(WebDriver drv) {
		driver = drv;

	}

	public void clickAndOpenSignUpWindow() {
		UiHelper.click(element_login_create_account_button);
	}

	public boolean verifyLoginFieldIsDisplayed() {
		return UiHelper.isVisibleAndDisplayed(element_login_username)
				&& UiHelper.isVisibleAndDisplayed(element_login_password)
				&& UiHelper
						.isVisibleAndDisplayed(element_login_create_account_button);

	}
	
	public String getButtonText(){
		return UiHelper.getText(element_login_create_account_button);
	}

}
