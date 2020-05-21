package com.ndfs.afc.idm;

import org.testng.annotations.Test;

import com.afc.pages.CreateUserServicePage;
import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.pages.UserMaintSearchPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class CreateUserServicePER_001Test extends AfcTestCaseHelper {
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private UserMaintSearchPage userMaintSearchPage;
	private CreateUserServicePage createUserServicePage;
	
	
	private String Id,Rut,Username,ques1,Ans1,ques2,Ans2,UserGroup,Language,Password,ConfirmPW;
	
	@Test
	public void createUserService() throws Exception
	{
		int i=1;
		Id=propertyReader.getCellData(7, i, 0);
		Rut=propertyReader.getCellData(7, i, 1);
		Username=propertyReader.getCellData(7, i, 2);
		ques1=propertyReader.getCellData(7, i, 3);
		Ans1=propertyReader.getCellData(7, i, 4);
		ques2=propertyReader.getCellData(7, i, 5);
		Ans2=propertyReader.getCellData(7, i, 6);
		UserGroup=propertyReader.getCellData(7, i, 7);
		Language=propertyReader.getCellData(7, i, 14);
		Password=propertyReader.getCellData(7, i, 16);
		ConfirmPW=propertyReader.getCellData(7, i, 17);
		
		
		
		
		
        repoterLog = extent.createTest("User Service Page");
		 
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		

		dashboardPage.mouseOverToIdmDropdown();
		userMaintSearchPage=dashboardPage.clickOnUserService();
		createUserServicePage=userMaintSearchPage.clickOnAddbtn();
		
		createUserServicePage.enterUserId(Id);
		createUserServicePage.enterRut(Rut);
		createUserServicePage.enterUserName(Username);
		createUserServicePage.selectSecurityQues1(ques1);
		createUserServicePage.provideAnsForQues1(Ans1);
		createUserServicePage.selectSecurityQues2(ques2);
		createUserServicePage.provideAnsforQues2(Ans2);
		createUserServicePage.enterUsergroup(UserGroup);
		createUserServicePage.enterLanguage(Language);
		createUserServicePage.clickOnPasswordTab();
		createUserServicePage.enterPassword(Password);
		createUserServicePage.enterConfirmPassword(ConfirmPW);
		createUserServicePage.clickOnSaveBtn();
		
		Thread.sleep(20000);
		
	}

}
