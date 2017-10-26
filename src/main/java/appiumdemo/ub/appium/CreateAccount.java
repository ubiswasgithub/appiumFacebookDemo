package appiumdemo.ub.appium;

import org.openqa.selenium.By;

import org.testng.Assert;

public class CreateAccount {


	By element_login_create_account_button = new By.ById("com.facebook.katana:id/login_create_account_button");	
	By element_Phone_input = new By.ById("com.facebook.katana:id/phone_input");	
	By element_country_name_selector = new By.ById("com.facebook.katana:id/country_name_selector");
	By element_finish_button_next = new By.ById("com.facebook.katana:id/finish_button");
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
	By element_birthday_confirm_button = new By.ById("com.facebook.katana:id/button1");
	By element_birthday_alert_title = new By.ById("com.facebook.katana:id/alertTitle");
	By element_gender_male = new By.ById("com.facebook.katana:id/gender_male");
	By element_gender_female = new By.ById("com.facebook.katana:id/gender_female");
	By element_password_input = new By.ById("com.facebook.katana:id/password_input");
	By element_terms_and_conditions_title = new By.ById("com.facebook.katana:id/title");
	By element_finish_button = new By.ById("com.facebook.katana:id/finish_button");
	

	
	
	private  String header_text = "Join Facebook";
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
	private String user_phone_number = "1234567890";
	private String user_country = "Bangladesh";
	private String user_password = "test123";
	private String dialog_container_text7 = "Choose a Password";
	private String terms_condition_title = "Terms & Privacy";	
	
	public void selectCreateButtonToSignup(){
		System.out.println("Create New account button is clicked");
		UiHelper.click(element_login_create_account_button);	
	}
	
	public void verifyHomepageTextIsCorrect(){
		
		Assert.assertEquals(UiHelper.getText(element_header_text), header_text);
		Assert.assertEquals(UiHelper.getText(element_info_text),info_text);
		
	}
	
	public void selectNextButtonToProceed(){
		System.out.println("Next button is clicked");
		UiHelper.click(element_finish_button_next);
	}
	
	public void verifyDialogContainerIsDisplayed(){
		Assert.assertTrue(UiHelper.isVisibleAndDisplayed(element_dialog_container));
	}
	
	public void verifyPermissionMessagIsCorrect(){
		Assert.assertEquals(UiHelper.getText(element_permission_message), dialog_container_text1);
	}
	
	public void selectDenyButtonToProceed(){
		System.out.println("Deny button is clicked");
		UiHelper.click(element_permission_deny_button);
	}
	
	public void selectAllowButtonToProceed(){
		System.out.println("Allow button is clicked");
		UiHelper.click(element_permission_allow_button);
	}
	
	public void verifyRuntimePermissionMessageIsCorrect(){
		Assert.assertEquals(UiHelper.getText(element_runtime_permission_title), dialog_container_text2);
	}
	
	public void verifyHeaderTextIsCorrect(){
		if(UiHelper.matchedToHeader(element_header_text, dialog_container_text3)){
			Assert.assertEquals(UiHelper.getText(element_header_text),dialog_container_text3 );
		}else if (UiHelper.matchedToHeader(element_header_text, dialog_container_text1)){
			Assert.assertEquals(UiHelper.getText(element_header_text), dialog_container_text2);
		}else if(UiHelper.matchedToHeader(element_header_text, dialog_container_text4)){
			Assert.assertEquals(UiHelper.getText(element_header_text), dialog_container_text4);
		}else if(UiHelper.matchedToHeader(element_header_text, dialog_container_text5)){
			Assert.assertEquals(UiHelper.getText(element_header_text), dialog_container_text5);
		}else if(UiHelper.matchedToHeader(element_header_text, dialog_container_text6)){
			Assert.assertEquals(UiHelper.getText(element_header_text), dialog_container_text6);
		}else if(UiHelper.matchedToHeader(element_header_text, dialog_container_text7)){
			Assert.assertEquals(UiHelper.getText(element_header_text), dialog_container_text7);
		}
		
	}

	public void enterFirstName() {
		// TODO Auto-generated method stub
		
		UiHelper.enterText(element_first_name_input, facebook_firstname);
		
	}

	public void enterLastName() {
		// TODO Auto-generated method stub
		UiHelper.enterText(element_last_name_input, facebook_lastname);
	}
	
	public void veifyBirthdayHeaderText(){
		Assert.assertEquals(UiHelper.getText(element_birthday_alert_title),dialoag_container_birthdaytxt);
	}
	
	public void selectConfirmButtonForBirthday(){
		UiHelper.click(element_birthday_confirm_button);
	}
	
	public void selectCountry(){
		UiHelper.click(element_country_name_selector);
		UiHelper.enterText(element_country_search_edit_text, user_country);
		if(UiHelper.matchedSelectedCountry(element_country_name,user_country )){
			UiHelper.click(element_country_name);
		}
		
	}

	public void enterUserData() {
		// TODO Auto-generated method stub
		
		if(UiHelper.getText(element_header_text).equalsIgnoreCase(dialog_container_text5)){		
			this.selectCountry();
			this.enterMoibleNumber();
		}else if(UiHelper.getText(element_header_text).equalsIgnoreCase(dialog_container_text3)){
			this.enterFirstName();
			this.enterLastName();
		}else if (UiHelper.getText(element_header_text).equalsIgnoreCase(dialog_container_text7)){
			this.enterPassword();
		}
		
	}
	
	private void enterPassword() {
		// TODO Auto-generated method stub
		UiHelper.enterText(element_password_input, user_password);
	}

	private void enterMoibleNumber() {
		// TODO Auto-generated method stub
		
		UiHelper.enterText(element_Phone_input, user_phone_number);
		
	}

	public void selectGender(){
		UiHelper.click(element_gender_male);
	}
	
	public void verifyTermsAndConditionPageIsDisplayed(){
		Assert.assertEquals(UiHelper.getText(element_terms_and_conditions_title),terms_condition_title , "Passed: Terms and condition page is displayed");
	}
	
	public void selectSignupFinishButton(){
		UiHelper.click(element_finish_button);
	}


}
