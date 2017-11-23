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

	private String user_loginname = "";
	private String user_loginpassword = "";
	
	private String login_create_button = "Create New Facebook Account";

	public FacebookHome(WebDriver drv) {
		driver = drv;

	}

	public void clickAndOpenSignUpWindow() {
		UiHelper.click(element_login_create_account_button);
	}

	public boolean verifyLoginFieldIsDisplayed() {
		Log.logVerify("Check that Home page contains login fields and button to create facebook account");
		boolean t = UiHelper.isVisibleAndDisplayed(element_login_username)
				&& UiHelper.isVisibleAndDisplayed(element_login_password)
				&& UiHelper
						.isVisibleAndDisplayed(element_login_create_account_button);
		if(t){
			Log.logPass("Page contains login fields and button to create facebook account");
		}else Log.logFail("Page doesn't contain login fields and button to create facebook account");
		return t;

	}

	public String getButtonText() {
		Log.logVerify("Check that Button text is 'Create New Facebook Account'");
		String txt = UiHelper.getText(element_login_create_account_button);
		if (login_create_button.equalsIgnoreCase(txt)){
			Log.logPass("Text of the button is "+txt);
		}else Log.logFail("Text of the button is "+ txt);
		return txt;
	}

	public void enterUsernameToEmailorPhoneField() {
		UiHelper.enterText(element_login_username, user_loginname);
	}

	public void enterUserPasswordToPasswordField() {
		UiHelper.enterText(element_login_password, user_loginpassword);
	}

	public void selectLoginButton() {
		UiHelper.click(element_login_login);
	}
	
	

}
