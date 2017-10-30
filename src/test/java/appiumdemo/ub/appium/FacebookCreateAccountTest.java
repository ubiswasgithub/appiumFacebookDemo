package appiumdemo.ub.appium;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class FacebookCreateAccountTest{
	CreateAccount objStep = new CreateAccount();
	

	@Test
	public void createAccountTest() {
		objStep.selectCreateButtonToSignup();
		objStep.verifyHomepageTextIsCorrect();
		objStep.selectNextButtonToProceed();	
		objStep.verifyDialogContainerIsDisplayed();
		objStep.verifyPermissionMessagIsCorrect();
		objStep.selectDenyButtonToProceed();
		objStep.verifyDialogContainerIsDisplayed();
		objStep.selectDenyButtonToProceed();
		objStep.enterUserData();
		objStep.verifyHeaderTextIsCorrect();
		
		objStep.selectNextButtonToProceed();
		objStep.verifyHeaderTextIsCorrect();
		objStep.selectNextButtonToProceed();
		objStep.veifyBirthdayHeaderText();
		objStep.selectConfirmButtonForBirthday();	
		
		objStep.verifyHeaderTextIsCorrect();
		objStep.selectGender();
		objStep.selectNextButtonToProceed();
		objStep.enterUserData();		
		objStep.selectNextButtonToProceed();
		objStep.verifyHeaderTextIsCorrect();
		objStep.enterUserData();
		objStep.selectNextButtonToProceed();
		objStep.verifyTermsAndConditionPageIsDisplayed();
		objStep.verifySignupWithoutUploadingMyContactsButtonIsDisplayed();
		objStep.selectSignupFinishButton();
		
		
		
	
	}

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {

	}

}
