package appiumdemo.ub.appium;

import org.testng.annotations.Test;

public class FacebookLoginTest extends AbstractTest {
	FacebookHome objHome = new FacebookHome(driver);

	@Test
	public void verifyFacebookLoginTest() {

		objHome.enterUsernameToEmailorPhoneField();
		objHome.enterUserPasswordToPasswordField();
		objHome.selectLoginButton();

	}
}
