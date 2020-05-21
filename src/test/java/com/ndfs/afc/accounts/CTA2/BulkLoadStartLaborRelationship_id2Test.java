package com.ndfs.afc.accounts.CTA2;

import org.testng.annotations.Test;

import com.afc.pages.DashboardPage;
import com.afc.pages.EmployerNotificationEnquiryPage;
import com.afc.pages.EmployerNotificationRequestUploadpage;
import com.afc.pages.LoginPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class BulkLoadStartLaborRelationship_id2Test extends AfcTestCaseHelper{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private EmployerNotificationRequestUploadpage employerNotificationRequestUploadpage;
	private EmployerNotificationEnquiryPage employerNotificationEnquiryPage;
	
	private String UploadType,path,EmployerRut1,EmployerRut2;
	
	
	
	
	@Test
	public void createIuserGroupService() throws Exception
	{
		UploadType=propertyReader.getCellData(2, 1, 26);
		path=propertyReader.readApplicationFile("BulkUpload_Path");
		EmployerRut1=propertyReader.getCellDataXlsx1(path, 0, 1, 17);
		EmployerRut2=propertyReader.getCellDataXlsx1(path, 0, 1, 18);
		
		
		
		
		
		
		
		
		
		
		
		

		repoterLog = extent.createTest("open Bulk Upload Page");
		 
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		//loginPage = loginPage.closecrossicon();
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		
		
		dashboardPage.mouseOverToAfcAccountDropdown();
		dashboardPage.mouseOverToEmployerNotification();
		dashboardPage.mouseOverToCreateNewEmployerNotification();
		dashboardPage.mouseOverToBulkUpload();
		employerNotificationRequestUploadpage=dashboardPage.clickOnRequestUpload();
		employerNotificationRequestUploadpage.selectUploadType(UploadType);
		employerNotificationRequestUploadpage.clickOnChoseFile();
		employerNotificationRequestUploadpage.upload(path);
		employerNotificationRequestUploadpage.clickOnUploadBtn();
		employerNotificationRequestUploadpage.clickonAFCLogo();
		
		dashboardPage.mouseOverToAfcAccountDropdown();
		dashboardPage.mouseOverToEmployerNotification();
		employerNotificationEnquiryPage=dashboardPage.clickOnEmployerNotificationEnquiry();
		employerNotificationEnquiryPage.enterEmployerRut(EmployerRut1,EmployerRut2);
		
		
		
		
		//employerNotificationEnquiryPage.enterAffilateRut(Rut);
		//System.out.println(Rut);
		Thread.sleep(10000);
		
		
		
		
	}

}
