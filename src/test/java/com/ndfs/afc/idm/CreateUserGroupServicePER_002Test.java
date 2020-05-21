package com.ndfs.afc.idm;

import org.testng.annotations.Test;

import com.afc.pages.CreateUserGroupServicePage;
import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.pages.UserGroupServiceSearchPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class CreateUserGroupServicePER_002Test extends AfcTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private UserGroupServiceSearchPage userGroupServiceSearchPage;
	private CreateUserGroupServicePage createUserGroupServicePage;
	
	
	private String UserGrpname, desc, Country,language,menu;
	
	
	
	@Test
	public void createIuserGroupService() throws Exception
	{
		UserGrpname=propertyReader.getCellData(0, 1, 0);
		desc=propertyReader.getCellData(0, 1, 1);
		Country=propertyReader.getCellData(0, 1, 2);
		language=propertyReader.getCellData(0, 1, 3);
		menu=propertyReader.getCellData(0, 1, 4);
		
		
		
		
		
		
		repoterLog = extent.createTest("User Service Page");
		 
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		//takeScreenShot("Login_CP");
		
		dashboardPage.mouseOverToIdmDropdown();
		userGroupServiceSearchPage=dashboardPage.clickOnUserGroupService();
		createUserGroupServicePage=userGroupServiceSearchPage.clickOnAddBtn();
		createUserGroupServicePage.providUserGroupName(UserGrpname);
		createUserGroupServicePage.providUserGroupDesc(desc);
		createUserGroupServicePage.provideCountrycode(Country);
		createUserGroupServicePage.providelanguage(language);
		createUserGroupServicePage.provideMenuGroup(menu);
		userGroupServiceSearchPage=createUserGroupServicePage.clickOnSaveBtn();
		
		
		
		//TO SEARCH THE RESULT
		
		Thread.sleep(10000);
		
		
		
		
		
		
		
	}
}
