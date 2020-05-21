package com.ndfs.afc.accounts;

import org.testng.annotations.Test;

import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.pages.LrCreation;
import com.afc.pages.LrMaintenanceOrEnquiryPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class LaborRelationshipMaintanceCreationCTA_044Test extends AfcTestCaseHelper {
	
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private LrMaintenanceOrEnquiryPage lrMaintenanceOrEnquiryPage;
	private LrCreation lrCreation;
	
	
	
	
	private String Group,SubDate,AffilateRut,EmployerRut,ContractType,ContractDate,StartDate,CessationDate,Reason,
	WorkHr,status,payCompany,LrOrigin,LegalComapnyRut,StartDateCompany,ReasonOfCont,ModifiedUser;
	@Test
	public void createIuserGroupService() throws Exception
	{
		int i=1;
		
		Group=propertyReader.getCellData(5, i, 0);
		SubDate=propertyReader.getCellData(5, i, 1);
		AffilateRut=propertyReader.getCellData(5, 5, 2);
		EmployerRut=propertyReader.getCellData(5, 5, 3);
		ContractType=propertyReader.getCellData(5, i, 4);
		ContractDate=propertyReader.getCellData(5, i, 5);
		StartDate=propertyReader.getCellData(5, i, 6);
		CessationDate=propertyReader.getCellData(5, i, 7);
		Reason=propertyReader.getCellData(5, i, 8);
		WorkHr=propertyReader.getCellData(5, i, 9);
		status=propertyReader.getCellData(5, i, 10);
		payCompany=propertyReader.getCellData(5, i, 11);
		LrOrigin=propertyReader.getCellData(5, i, 12);
		LegalComapnyRut=propertyReader.getCellData(5, i, 13);
		StartDateCompany=propertyReader.getCellData(5, i, 14);
		ReasonOfCont=propertyReader.getCellData(5, i, 15);
		ModifiedUser=propertyReader.getCellData(5, i, 16);
		
		
		
		
		
		
		
		
		
		
		
	
        repoterLog = extent.createTest("open Labor Relationship maintance and enquiry page");
		 
		
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
		lrMaintenanceOrEnquiryPage=dashboardPage.clickOnLaborEnquiry();
		lrCreation=lrMaintenanceOrEnquiryPage.clickOnCreateBtn();
		lrCreation.enterGroup(Group);
		lrCreation.enterSubscriptionDate(SubDate);
		lrCreation.enterAffilateRut(AffilateRut);
		lrCreation.enterEmployerRut(EmployerRut);
		lrCreation.enterTypeOfContract(ContractType);
		lrCreation.enterContractStartDate(ContractDate);
		lrCreation.enterStartDate(StartDate);
		lrCreation.enterCessationDate(CessationDate);
		lrCreation.enterReasonOfTermination(Reason);
		lrCreation.enterNoOfHrsForWeeklyWork(WorkHr);
		lrCreation.enterLrStatus(status);
		lrCreation.enterSilPayCompanyRelationship(payCompany);
		lrCreation.enterLrCreationOrigin(LrOrigin);
		
		lrCreation.clickOnCompanyOriginTab();
		lrCreation.enterLegalComapnyRut(LegalComapnyRut);
		lrCreation.enterStartDateCompany(StartDateCompany);
		lrCreation.enterReasonOfContinuity(ReasonOfCont);
		
		lrCreation.clickOnLaborRelationshipTab();
		lrCreation.enterModifiedUser(ModifiedUser);
		lrCreation.clicKOnConformBtn();
		Thread.sleep(5000);
		dashboardPage=lrCreation.clickonAFCLogo();
		
		
	}

	
	

}
