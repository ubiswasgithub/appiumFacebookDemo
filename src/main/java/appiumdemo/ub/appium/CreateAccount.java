package appiumdemo.ub.appium;

import org.openqa.selenium.By;

import org.testng.Assert;

public class CreateAccount {

	By element_login_create_account_button = new By.ById("com.facebook.katana:id/login_create_account_button");
	By element_Phone_input = new By.ById("com.facebook.katana:id/phone_input");
	By element_country_name_selector = new By.ById("com.facebook.katana:id/country_name_selector");
	By element_finish_button_next = new By.ById("com.facebook.katana:id/finish_button");
	By element_finish_button_continue = new By.ById("com.facebook.katana:id/finish_button_test");
	By element_finish_button_getting_started = new By.ById("com.facebook.katana:id/finish_button_test");
	By element_switch_to_email_button = new By.ById("com.facebook.katana:id/switch_to_email_button");
	By element_country_search_edit_text = new By.ById("com.facebook.katana:id/country_search_edit_text");
	By element_country_name = new By.ById("com.facebook.katana:id/country_name");
	By element_header_text = new By.ById("com.facebook.katana:id/header_text");
	By element_info_text = new By.ById("com.facebook.katana:id/info_text");
	By element_dialog_container = new By.ById("com.android.packageinstaller:id/dialog_container");
	By element_permission_message = new By.ById("com.android.packageinstaller:id/permission_message");
	By element_permission_allow_button = new By.ById("com.android.packageinstaller:id/permission_allow_button");
	By element_permission_deny_button = new By.ById("com.android.packageinstaller:id/permission_deny_button");
	By element_runtime_permission_title = new By.ById("com.facebook.katana:id/runtime_permission_title");
	By element_first_name_input = new By.ById("com.facebook.katana:id/first_name_input");
	By element_last_name_input = new By.ById("com.facebook.katana:id/last_name_input");
	By element_full_name_input = new By.ById("com.facebook.katana:id/full_name_input");
	By element_birthday_confirm_button = new By.ById("com.facebook.katana:id/button1");
	By element_birthday_alert_title = new By.ById("com.facebook.katana:id/alertTitle");
	By element_gender_male = new By.ById("com.facebook.katana:id/gender_male");
	By element_gender_female = new By.ById("com.facebook.katana:id/gender_female");
	By element_password_input = new By.ById("com.facebook.katana:id/password_input");
	By element_terms_and_conditions_title = new By.ById("com.facebook.katana:id/title");
	By element_finish_button = new By.ById("com.facebook.katana:id/finish_button");
	By element_finish_without_contacts = new By.ById("com.facebook.katana:id/finish_without_contacts");
	By element_finish_signingup = new By.ByName("Finish Signing Up");
	By element_age_alert_title = new By.ById("com.facebook.katana:id/alertTitle");
	By element_alert_age_confirm_button = new By.ById("com.facebook.katana:id/button1");

	private String header_text = "Join Facebook";
	private String info_text = "We'll help you create a new account in a few easy steps.";
	private String dialog_container_text1 = "Allow Facebook to access your contacts?";
	private String dialog_container_text2 = "Allow Facebook to access information about your contacts?";
	private String dialog_container_text3 = "What's Your Name?";	
	private String facebook_firstname = "Rahim2";
	private String facebook_lastname = "Tester2";
	private String dialog_container_text4 = "What's Your Birthday?";
	private String dialoag_container_birthdaytxt = "Confirm Your Birthday";
	private String dialog_container_text5 = "Enter Your Mobile Number";
	private String dialog_container_text6 = "What's Your Gender?";
	private String dialog_container_text8 = "Select Your Country";
	private String dialog_container_text9 = "Enter Your Name";
	private String user_phone_number = "1234567890";
	private String user_country = "Bangladesh";
	private String user_password = "test123";
	private String dialog_container_text7 = "Choose a Password";
	private String terms_condition_title = "Terms & Privacy";
	private String finish_without_contacts_button_text = "Sign up without uploading my contacts";
	private String finish_Signingup_text = "Finish Signing Up";
	private String age_confirm_text = "Confirm Your Age";
	

	////////////////////

	private String sign_up_button_text = "Create New Facebook Account";

	public void selectCreateButtonToSignup() {
		Log.logVerify("Check that " + sign_up_button_text + " button is clikable");
		if (UiHelper.isVisibleAndDisplayed(element_login_create_account_button)) {
			Log.logPass(sign_up_button_text + " button is clikable");
			Log.logVerify("Select " + sign_up_button_text + " button");
			UiHelper.click(element_login_create_account_button);
			Log.logPass(sign_up_button_text + " butotn is clicked");
		} else
			Log.logFail(sign_up_button_text + "button is not clikable");

	}

	public void verifyHomepageTextIsCorrect() {

		Log.logVerify(
				"Check that Sign Up Page contains header text as" + header_text + " and sugesstion as" + info_text);

		boolean t = UiHelper.getText(element_header_text).equalsIgnoreCase(header_text)
				&& UiHelper.getText(element_info_text).equalsIgnoreCase(info_text);
		if (t) {
			Log.logPass("Both " + header_text + "and " + info_text + " are present");
			Assert.assertTrue(t);
		} else
			Log.logFail("Text are missing on Sign up page");

	}

	public void selectNextButtonToProceed() {
		Log.logVerify("Check that Next or Continue or Getting Started button is present to Proceed forward");
		if (UiHelper.isVisibleAndDisplayed(element_finish_button_next)) {
			Log.logPass("Next button is present to move forward");
			Log.logVerify("Click on Next button ");
			UiHelper.click(element_finish_button_next);
			Log.logPass("Next button is clicked");
		} else if (UiHelper.isVisibleAndDisplayed(element_finish_button_continue) && UiHelper.getText(element_finish_button_continue).equalsIgnoreCase("Continue")) {
			Log.logPass("Continue button is present to move forward");
			Log.logVerify("Click on Continue button ");
			UiHelper.click(element_finish_button_continue);
			Log.logPass("Continue button is clicked");
		}else if(UiHelper.isVisibleAndDisplayed(element_finish_button_getting_started) && UiHelper.getText(element_finish_button_getting_started).equalsIgnoreCase("Getting Started")){
			Log.logPass("Getting Started button is present to move forward");
			Log.logVerify("Click on Getting Started button ");
			UiHelper.click(element_finish_button_getting_started);
			Log.logPass("Getting Started button is clicked");
		}else Log.logFail("Buttons are missing to click");

	}

	public void verifyDialogContainerIsDisplayed() {
		Assert.assertTrue(UiHelper.isVisibleAndDisplayed(element_dialog_container));
	}

	public void verifyPermissionMessagIsCorrect() {
		Assert.assertEquals(UiHelper.getText(element_permission_message), dialog_container_text1);
	}

	public void selectDenyButtonToProceed() {
		Log.logVerify("Click on Deny button");
		if (UiHelper.isVisibleAndDisplayed(element_permission_deny_button)) {
			UiHelper.click(element_permission_deny_button);
			Log.logPass("Deny button is clicked");
		} else
			Log.logFail("Deny button is not found and fail to click on it");

	}

	public void selectAllowButtonToProceed() {
		Log.logVerify("Click on Allow button");
		if (UiHelper.isVisibleAndDisplayed(element_permission_allow_button)) {
			UiHelper.click(element_permission_allow_button);
			Log.logPass("Allow button is clicked");
		} else
			Log.logFail("Allow button is not found and fail to click on it");

	}

	public void verifyRuntimePermissionMessageIsCorrect() {
		Assert.assertEquals(UiHelper.getText(element_runtime_permission_title), dialog_container_text2);
	}

	public void verifyHeaderTextIsCorrect() {
		if (UiHelper.matchedToHeader(element_header_text, dialog_container_text3)) {
			Assert.assertEquals(UiHelper.getText(element_header_text), dialog_container_text3);
		} else if (UiHelper.matchedToHeader(element_header_text, dialog_container_text1)) {
			Assert.assertEquals(UiHelper.getText(element_header_text), dialog_container_text2);
		} else if (UiHelper.matchedToHeader(element_header_text, dialog_container_text4)) {
			Assert.assertEquals(UiHelper.getText(element_header_text), dialog_container_text4);
		} else if (UiHelper.matchedToHeader(element_header_text, dialog_container_text5)) {
			Assert.assertEquals(UiHelper.getText(element_header_text), dialog_container_text5);
		} else if (UiHelper.matchedToHeader(element_header_text, dialog_container_text6)) {
			Assert.assertEquals(UiHelper.getText(element_header_text), dialog_container_text6);
		} else if (UiHelper.matchedToHeader(element_header_text, dialog_container_text7)) {
			Assert.assertEquals(UiHelper.getText(element_header_text), dialog_container_text7);
		}

	}

	public void enterFirstName() {
		// TODO Auto-generated method stub
		Log.logVerify("Enter user first name");
		if (UiHelper.isVisibleAndDisplayed(element_first_name_input)) {
			UiHelper.enterText(element_first_name_input, facebook_firstname);
			Log.logPass("User has entered " + facebook_firstname + " as Firstname");
		}else Log.logFail("Failed to enter user first name");

	}

	public void enterLastName() {
		// TODO Auto-generated method stub
		Log.logVerify("Enter user Last name");
		if (UiHelper.isVisibleAndDisplayed(element_last_name_input)) {
			UiHelper.enterText(element_last_name_input, facebook_lastname);
			Log.logPass("User has entered " + facebook_lastname + " as Lastname");
		} else
			Log.logFail("Failed to enter user last name");

	}

	public void veifyBirthdayHeaderText() {
		Assert.assertEquals(UiHelper.getText(element_birthday_alert_title), dialoag_container_birthdaytxt);
	}

	public void selectConfirmButtonForBirthday() {
		Log.logVerify("Select Confirm button to select User birthday");
		if (UiHelper.isVisibleAndDisplayed(element_birthday_confirm_button)) {
			UiHelper.click(element_birthday_confirm_button);
			Log.logPass("Confirm button is selected");
			if(UiHelper.isVisibleAndDisplayed(element_age_alert_title) && UiHelper.isVisibleAndDisplayed(element_alert_age_confirm_button)){
				UiHelper.click(element_alert_age_confirm_button);
			}
		} else
			Log.logFail("Failed to select confirm button");

	}

	public void selectCountry() {
		Log.logVerify("Select Country");
		UiHelper.click(element_country_name_selector);
		UiHelper.enterText(element_country_search_edit_text, user_country);
		if (UiHelper.matchedSelectedCountry(element_country_name, user_country)) {
			UiHelper.click(element_country_name);
			Log.logPass("Country has been selected");
		} else
			Log.logFail("Country is not found to select");

	}

	public void enterUserData() {
		// TODO Auto-generated method stub

		if (UiHelper.getText(element_header_text).equalsIgnoreCase(dialog_container_text8)) {
			this.selectCountry();
			
		} else if (UiHelper.getText(element_header_text).equalsIgnoreCase(dialog_container_text5)){
			this.enterMoibleNumber();
		}else if (UiHelper.getText(element_header_text).equalsIgnoreCase(dialog_container_text3) || UiHelper.getText(element_header_text).equalsIgnoreCase(dialog_container_text9)) {
			if(UiHelper.isVisibleAndDisplayed(element_full_name_input)){
				this.enterFullName();
			}else{
				this.enterFirstName();
				this.enterLastName();
			}
			
		} else if (UiHelper.getText(element_header_text).equalsIgnoreCase(dialog_container_text7)) {
			this.enterPassword();
		}

	}

	private void enterFullName() {
		// TODO Auto-generated method stub
		Log.logVerify("Enter user full name");
		if (UiHelper.isVisibleAndDisplayed(element_full_name_input)) {
			UiHelper.enterText(element_full_name_input, facebook_firstname+" "+ facebook_lastname);
			Log.logPass("User has entered " + facebook_firstname+" "+ facebook_lastname + " as his full name");
		} else
			Log.logFail("Failed to enter user full name");
		
	}

	private void enterPassword() {
		// TODO Auto-generated method stub
		Log.logVerify("Enter user password");
		if (UiHelper.isVisibleAndDisplayed(element_password_input)) {
			UiHelper.enterText(element_password_input, user_password);
			Log.logPass("User has entered " + user_password + " as his password");
		} else
			Log.logFail("Failed to enter user Password");

	}

	private void enterMoibleNumber() {
		// TODO Auto-generated method stub
		Log.logVerify("Enter user Phone number");
		if (UiHelper.isVisibleAndDisplayed(element_Phone_input)) {
			UiHelper.enterText(element_Phone_input, user_phone_number);
			Log.logPass("User has entered " + user_phone_number + " as his Phone number");
		} else
			Log.logFail("Failed to enter user Phone number");

	}

	public void selectGender() {
		Log.logVerify("Select User gender");
		if (UiHelper.isVisibleAndDisplayed(element_gender_male)) {
			UiHelper.click(element_gender_male);
			Log.logPass("User gender is selected");
		} else
			Log.logFail("Failed to select User gender");

	}

	public void verifyTermsAndConditionPageIsDisplayed() {
		Assert.assertEquals(UiHelper.getText(element_terms_and_conditions_title), terms_condition_title,
				"Passed: Terms and condition page is displayed");
	}

	public void selectSignupFinishButton() {
		Log.logVerify("Click Sign up finish button");
		if (UiHelper.isVisibleAndDisplayed(element_finish_button)) {
			UiHelper.click(element_finish_button);
			Log.logPass("Sign up finish button is clicked");
		} else
			Log.logFail("Sign up finish button is not found and fail to click on it");
	}

	public void verifySignupWithoutUploadingMyContactsButtonIsDisplayed() {
		boolean t = UiHelper.getText(element_finish_without_contacts).equalsIgnoreCase(finish_without_contacts_button_text) || UiHelper.getText(element_finish_signingup).equalsIgnoreCase(finish_Signingup_text);
		Assert.assertTrue(t);
	}

}
