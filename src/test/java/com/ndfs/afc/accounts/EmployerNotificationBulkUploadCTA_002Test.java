
package com.ndfs.afc.accounts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

import com.afc.pages.BatchMonitorSearchPage;
import com.afc.pages.BatchMonitorTransactionPage;
import com.afc.pages.DashboardPage;
import com.afc.pages.EmployerNotificationRequestUploadpage;
import com.afc.pages.JobScheduleSearchPage;
import com.afc.pages.LoginPage;
import com.afc.pages.ResponseFromAFPPage;
import com.afc.pages.ResponseFromCRPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class EmployerNotificationBulkUploadCTA_002Test extends AfcTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private EmployerNotificationRequestUploadpage employerNotificationRequestUploadpage;
	private BatchMonitorSearchPage BatchMonitorSearchPage;
	private BatchMonitorTransactionPage BatchMonitorTransactionPage;
	private JobScheduleSearchPage JobScheduleSearchPage;
	private ResponseFromCRPage ResponseFromCRPage;
	private ResponseFromAFPPage ResponseFromAFPPage;




	
	
	
	
	private String UploadType,path,BatchId,Success,path1,CR_BatchId,path2,AFP_BatchId;

	
	@Test
	public void createIuserGroupService() throws Exception
	{
		UploadType=propertyReader.getCellData(2, 1, 26);
		path=propertyReader.readApplicationFile("BulkUpload_Path");
		BatchId=propertyReader.readTestData("BatchId");
		Success=propertyReader.getCellData(2, 1, 27);
		
		path1=propertyReader.readTestData("Cr_path");
		CR_BatchId=propertyReader.readTestData("Cr_BatchId");
		
		path2=propertyReader.readTestData("Afp_path");
		AFP_BatchId=propertyReader.readTestData("Afp_BatchId");
       
		
		
		
		
		repoterLog = extent.createTest("open Bulk Upload Page");
		 
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		//loginPage = loginPage.closecrossicon();
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		
		
		
		
		
		//upload insert file and batch monitor
		dashboardPage.mouseOverToAfcAccountDropdown();
		dashboardPage.mouseOverToEmployerNotification();
		dashboardPage.mouseOverToCreateNewEmployerNotification();
		takeScreenShot("a");
		dashboardPage.mouseOverToBulkUpload();
		employerNotificationRequestUploadpage=dashboardPage.clickOnRequestUpload();
		employerNotificationRequestUploadpage.selectUploadType(UploadType);
		employerNotificationRequestUploadpage.clickOnChoseFile();
		employerNotificationRequestUploadpage.upload(path);
		employerNotificationRequestUploadpage.clickOnUploadBtn();
		takeScreenShot("b");
		String r=employerNotificationRequestUploadpage.captureBatchId();
		propertyReader.updateProperty("BatchId", r);
		dashboardPage=employerNotificationRequestUploadpage.clickonAFCLogo();
		
		dashboardPage.mouseOverToManuBarDropDown();
		dashboardPage.mouseOverToAuxillary();
		dashboardPage.mouseOverToAuxUpload();
		BatchMonitorSearchPage=dashboardPage.clickOnBatchMonitor();
	    BatchId=propertyReader.readTestData("BatchId");
		BatchMonitorSearchPage.provideBatchId(BatchId);
		BatchMonitorSearchPage.clearBranchOfficeField();
		BatchMonitorSearchPage.clickOnSearchBtn();
		takeScreenShot("c");
		BatchMonitorTransactionPage=BatchMonitorSearchPage.clickOnBatchId(BatchId);
		BatchMonitorTransactionPage.selectSuccess(Success);
		BatchMonitorTransactionPage.clickOnShowRecordBtn();
		takeScreenShot("d");
		BatchMonitorTransactionPage.clickOnCloseBtn();
		dashboardPage=BatchMonitorTransactionPage.clickonAFCLogo();
		

		
		
		
		
		// run AFP and CR job Schedule
		dashboardPage.mouseOverToManuBarDropDown();
		dashboardPage.mouseOverToAdminDropDown();
		dashboardPage.mouseOverToSchedulerDropDown();
		takeScreenShot("e");
		JobScheduleSearchPage=dashboardPage.clickOnJobScheduleStarter();
		JobScheduleSearchPage.clickOnSearchBtn();
		JobScheduleSearchPage.clickOnAfpExEditIcon();
		JobScheduleSearchPage.clickOnProgrammerParameterTab();
		String timeStamp = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		JobScheduleSearchPage.enterTodaysDate(timeStamp);
		String time = new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime());
		System.out.println(time);
		String dt = time ; // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(dt));
		c.add(Calendar.MINUTE, 3);  // number of days to add
		dt = sdf.format(c.getTime());
		System.out.println(dt);
		JobScheduleSearchPage.enterTime(dt);
		takeScreenShot("f");
		JobScheduleSearchPage.clickOnConformBtn();
		JobScheduleSearchPage.clickOnCrExEditIcon();
		JobScheduleSearchPage.clickOnProgrammerParameterTab();
		JobScheduleSearchPage.enterTodaysDate(timeStamp);
		JobScheduleSearchPage.enterTime(dt);
		takeScreenShot("g");
		JobScheduleSearchPage.clickOnConformBtn();
		dashboardPage=JobScheduleSearchPage.clickonAFCLogo();
		
		
		
		
		
		//upload CR response and run batch monitor for CR
		dashboardPage.mouseOverToAfcAccountDropdown();
		dashboardPage.mouseOverToExternalNotificationDropdown();
		dashboardPage.mouseOverToCivilRegistryNotification();
		takeScreenShot("h");
		ResponseFromCRPage=dashboardPage.clickOnUploadCRResponse();
		ResponseFromCRPage.clickOnChoseFile();
		ResponseFromCRPage.upload(path1);
		ResponseFromCRPage.clickOnUploadBtn();
		takeScreenShot("i");
		String r1=ResponseFromCRPage.captureBatchId();
		propertyReader.updateProperty("Cr_BatchId", r1);
		dashboardPage=ResponseFromCRPage.clickonAFCLogo();
		
		dashboardPage.mouseOverToManuBarDropDown();
		dashboardPage.mouseOverToAuxillary();
		dashboardPage.mouseOverToAuxUpload();
		BatchMonitorSearchPage=dashboardPage.clickOnBatchMonitor();
	    CR_BatchId=propertyReader.readTestData("Cr_BatchId");	
		BatchMonitorSearchPage.provideBatchId(CR_BatchId);
		BatchMonitorSearchPage.clearBranchOfficeField();
		BatchMonitorSearchPage.clickOnSearchBtn();
		takeScreenShot("j");
		BatchMonitorTransactionPage=BatchMonitorSearchPage.clickOnBatchId(CR_BatchId);
		BatchMonitorTransactionPage.selectSuccess(Success);
		BatchMonitorTransactionPage.clickOnShowRecordBtn();
		takeScreenShot("k");
		BatchMonitorTransactionPage.clickOnCloseBtn();
		dashboardPage=BatchMonitorTransactionPage.clickonAFCLogo();
		
		
		
		
		
		
		//upload Afp response and run batch monitor for Afp
		dashboardPage.mouseOverToAfcAccountDropdown();
		dashboardPage.mouseOverToExternalNotificationDropdown();
		dashboardPage.mouseOverToAFPIPS();
		takeScreenShot("l");
		ResponseFromAFPPage=dashboardPage.clickOnUploadAfpIpsResponse();
		ResponseFromAFPPage.clickOnChoseFile();
		ResponseFromAFPPage.upload(path2);
		ResponseFromAFPPage.clickOnUploadBtn();
		takeScreenShot("m");
		String r2=ResponseFromAFPPage.captureBatchId();
		propertyReader.updateProperty("Afp_BatchId", r2);
		dashboardPage=ResponseFromAFPPage.clickonAFCLogo();
		
		dashboardPage.mouseOverToManuBarDropDown();
		dashboardPage.mouseOverToAuxillary();
		dashboardPage.mouseOverToAuxUpload();
		BatchMonitorSearchPage=dashboardPage.clickOnBatchMonitor();
		AFP_BatchId=propertyReader.readTestData("Afp_BatchId");
	    BatchMonitorSearchPage.provideBatchId(AFP_BatchId);
		BatchMonitorSearchPage.clearBranchOfficeField();
		BatchMonitorSearchPage.clickOnSearchBtn();
		takeScreenShot("n");
		BatchMonitorTransactionPage=BatchMonitorSearchPage.clickOnBatchId(AFP_BatchId);
		BatchMonitorTransactionPage.selectSuccess(Success);
		BatchMonitorTransactionPage.clickOnShowRecordBtn();
		takeScreenShot("o");
		BatchMonitorTransactionPage.clickOnCloseBtn();
		dashboardPage=BatchMonitorTransactionPage.clickonAFCLogo();
		
			
		
		
		//run PostLR job Schedule
		dashboardPage.mouseOverToManuBarDropDown();
		dashboardPage.mouseOverToAdminDropDown();
		dashboardPage.mouseOverToSchedulerDropDown();
		takeScreenShot("p");
		JobScheduleSearchPage=dashboardPage.clickOnJobScheduleStarter();
		JobScheduleSearchPage.clickOnSearchBtn();
		JobScheduleSearchPage.clickOnPostLREditIcon();
		JobScheduleSearchPage.clickOnProgrammerParameterTab();
		JobScheduleSearchPage.enterTodaysDate(timeStamp);
		JobScheduleSearchPage.enterTime(dt);
		takeScreenShot("q");
		JobScheduleSearchPage.clickOnConformBtn();
		
		
		
		
		
		
		
		//Thread.sleep(20000);
		
		
		
		
		
	
	}

}
