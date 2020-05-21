package com.ndfs.afc.accounts.CTA2;

import org.testng.annotations.Test;

import com.afc.pages.BatchMonitorSearchPage;
import com.afc.pages.BatchMonitorTransactionPage;
import com.afc.pages.DashboardPage;
import com.afc.pages.EmployerNotificationRequestUploadpage;
import com.afc.pages.LoginPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class BulkLoadTerminationofLaborRelationship_id6Test extends AfcTestCaseHelper {
	
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private EmployerNotificationRequestUploadpage employerNotificationRequestUploadpage;
	private BatchMonitorSearchPage BatchMonitorSearchPage;
	private BatchMonitorTransactionPage BatchMonitorTransactionPage;
	
	
	
	
	private String UploadType,path,BatchId,Success;
	@Test
	public void createIuserGroupService() throws Exception
	{
		
		UploadType=propertyReader.getCellData(2, 1, 29);
		path=propertyReader.readApplicationFile("Cessation_path");
		BatchId=propertyReader.readTestData("Cessation_batchId");
		Success=propertyReader.getCellData(2, 1, 27);
		
		
		
		
		
		
		
		
		
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
		String r=employerNotificationRequestUploadpage.captureBatchId();
		propertyReader.updateProperty("Cessation_batchId", r);
		dashboardPage=employerNotificationRequestUploadpage.clickonAFCLogo();
		
		dashboardPage.mouseOverToManuBarDropDown();
		dashboardPage.mouseOverToAuxillary();
		dashboardPage.mouseOverToAuxUpload();
		BatchMonitorSearchPage=dashboardPage.clickOnBatchMonitor();
		
		BatchId=propertyReader.readTestData("Cessation_batchId");
		BatchMonitorSearchPage.provideBatchId(BatchId);
		BatchMonitorSearchPage.clearBranchOfficeField();
		BatchMonitorSearchPage.clickOnSearchBtn();
		BatchMonitorTransactionPage=BatchMonitorSearchPage.clickOnBatchId(BatchId);
		BatchMonitorTransactionPage.selectSuccess(Success);
		BatchMonitorTransactionPage.clickOnShowRecordBtn();
		BatchMonitorTransactionPage.clickOnCloseBtn();
		dashboardPage=BatchMonitorTransactionPage.clickonAFCLogo();
		
		
		
		
	}
	
	

}
