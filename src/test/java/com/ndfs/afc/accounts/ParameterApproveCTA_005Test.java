package com.ndfs.afc.accounts;

import org.testng.annotations.Test;

import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.pages.ParameterApprovalSearchPage;
import com.afc.pages.ParameterApprovalViewPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class ParameterApproveCTA_005Test extends AfcTestCaseHelper{
	
	
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private ParameterApprovalSearchPage parameterApprovalSearchPage;
	private ParameterApprovalViewPage parameterApprovalViewPage;

	
	
	private String period,clno;
	@Test
	public void createIuserGroupService() throws Exception
	{
		int i=1;
		period=propertyReader.getCellData(6, i, 0);
		clno=propertyReader.getCellData(6, i, 1);
		
		
		
		
		
		
        repoterLog = extent.createTest("Collection Of Parameter Approval page");
		 
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		//loginPage = loginPage.closecrossicon();
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		
		
		dashboardPage.mouseOverToAfcAccountDropdown();
		dashboardPage.mouseOverToParameterization();
		parameterApprovalSearchPage=dashboardPage.mouseOverToParameterApproval();
		parameterApprovalSearchPage.enterCollectionPeriod(period);
		parameterApprovalSearchPage.clickOnSearchBtn();
		parameterApprovalViewPage=parameterApprovalSearchPage.clickOnClnoViewBtn(clno);
		parameterApprovalViewPage.clickOnApproveBtn();
		
		
		
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
