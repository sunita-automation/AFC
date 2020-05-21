package com.ndfs.afc.idm;

import org.testng.annotations.Test;

import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.pages.MyProfilePage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class MyProfileResetPasswordSEG_004Test extends AfcTestCaseHelper {
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private MyProfilePage myProfilePage;
	
	
	private String password,Newpassword,ConfirmPassword;
	
	@Test
	public void createUserService() throws Exception
	{
		int i=1;
		password=propertyReader.getCellData(8, i, 0);
		Newpassword=propertyReader.getCellData(8, i, 1);
		ConfirmPassword=propertyReader.getCellData(8, i, 1);
		
		
		 repoterLog = extent.createTest("User Service Page");
		 
			
			loginPage = applicationSetup();
			logger.info("Launching application");
			repoterLog.log(Status.INFO, "Application setup completed");
			dashboardPage = loginPage.login();
			logger.info("Log in to application");
			

			dashboardPage.mouseOverToWelcomeIcon();
			myProfilePage=dashboardPage.clickOnMyProfile();
			myProfilePage.clickOnRestorePassword();
			myProfilePage.enterCurrentpassword(password);
			myProfilePage.clickOnProceedBtn();
			myProfilePage.reEnterCurrentPassword(password);
			myProfilePage.enterNewPassword(Newpassword);
			myProfilePage.enterConfoirmPassword(ConfirmPassword);
			myProfilePage.clickOnResetPasswordBtn();
			
	}

}
