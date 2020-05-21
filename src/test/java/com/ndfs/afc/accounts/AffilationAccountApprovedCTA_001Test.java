package com.ndfs.afc.accounts;

import org.testng.annotations.Test;

import com.afc.pages.AffilatesApprovePage;
import com.afc.pages.AffilatesApproveSearchPage;
import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class AffilationAccountApprovedCTA_001Test extends AfcTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private AffilatesApproveSearchPage AffilatesApproveSearchPage;
	private AffilatesApprovePage AffilatesApprovePage;
	
	
	
	private  String Rut,text;
	
	@Test
	public void createIuserGroupService() throws Exception
	{
		int i =1;
		
		int rowCount = propertyReader.getRowCountXlsx(1);
		System.out.println("rowCount------->>>"+rowCount);
		for(i =1;i<=rowCount;i++)
		{
		

		Rut=propertyReader.getCellData(1, i, 0);
		text=propertyReader.getCellData(1, i, 45);
		
		
		
		
		
		
		
		if(i==1)
		{
		
		repoterLog = extent.createTest("open Creation of Affilates ");
		 
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		//loginPage = loginPage.closecrossicon();
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		}
		
		dashboardPage.mouseOverToAfcAccountDropdown();
		dashboardPage.mouseOverToAccountCreationDropdown();
		dashboardPage.mouseOverToVoluntaryAffiliationDropdown();
		AffilatesApproveSearchPage=dashboardPage.clickOnApproved();
		AffilatesApproveSearchPage.enterAffilatesRutNo(Rut);
		AffilatesApproveSearchPage.clickOnSearchBtn();
		AffilatesApprovePage=AffilatesApproveSearchPage.clickOnEditIcon();
		AffilatesApprovePage.clickOnApproveIcon();
		AffilatesApprovePage.enterInTextArea(text);
		AffilatesApprovePage.clickOnSaveBtn();
		dashboardPage=AffilatesApprovePage.clickonAFCLogo();
		
		}
	}
	

}
