package appiumdemo.ub.appium;


import org.testng.annotations.Test;

import pdfreport.PdfLog;

import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class FacebookCreateAccountTest{
	CreateAccount objStep = new CreateAccount();
	

	@Test(groups = "SignUp", description = "Test case to sign up as new user")
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

	@BeforeMethod (alwaysRun = true)
	public void beforeMethod(Method method) {
		Log.logTestMethodStart(method);
		PdfLog.clearActionResultStatusList();

	}

	@AfterMethod
	public void afterMethod(Method method, ITestResult result) {
		Log.logTestMethodEnd(method, result);
	}

}
