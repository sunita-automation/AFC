package com.ndfs.afc.accounts.CTA44;

import org.testng.annotations.Test;

import com.afc.pages.BatchMonitorSearchPage;
import com.afc.pages.BatchMonitorTransactionPage;
import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.pages.LrBulkUploadPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class ModificationofLaborRelationships_id8Test extends AfcTestCaseHelper {
	
	
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private LrBulkUploadPage lrBulkUploadPage;
	private BatchMonitorSearchPage BatchMonitorSearchPage;
	private BatchMonitorTransactionPage BatchMonitorTransactionPage;
	
	
	
	private String UploadType,path,BatchId,Success; 
	
	
	@Test
	public void createIuserGroupService() throws Exception
	{
		int i=1;
		UploadType=propertyReader.getCellData(5	, i, 24);
	    path=propertyReader.readTestData("LR_Modification");
	    BatchId=propertyReader.readTestData("LR_Modification_batchId");
	    Success=propertyReader.getCellData(5, i, 23);
		
		
		
		
		
		
		repoterLog = extent.createTest("open Labor Relationship maintance Bulk Upload");
		 
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		//loginPage = loginPage.closecrossicon();
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		
		dashboardPage.mouseOverToAfcAccountDropdown();
		dashboardPage.mouseOverToAccountMaintanceDropdown();
		dashboardPage.mouseOverToLaborRelationship();
		dashboardPage.mouseOverToLaborRelationshipMaintance();
		lrBulkUploadPage=dashboardPage.clickOnLaborRelationshipBulkUpload();
		lrBulkUploadPage.selectUploadType(UploadType);
		lrBulkUploadPage.clickOnChoseFile();
		lrBulkUploadPage.upload(path);
		lrBulkUploadPage.clickOnUploadBtn();
		String a=lrBulkUploadPage.captureBatchId();
		propertyReader.updateProperty("LR_Modification_batchId", a);
		dashboardPage=lrBulkUploadPage.clickonAFCLogo();
		
		dashboardPage.mouseOverToManuBarDropDown();
		dashboardPage.mouseOverToAuxillary();
		dashboardPage.mouseOverToAuxUpload();
		BatchMonitorSearchPage=dashboardPage.clickOnBatchMonitor();
		
		 BatchId=propertyReader.readTestData("LR_Modification_batchId");
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
