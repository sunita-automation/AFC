package com.ndfs.afc.accounts.CTA40;

import org.testng.annotations.Test;

import com.afc.pages.AffiliateRecordMaintenanceSearchPage;
import com.afc.pages.AffliateMaintanceTransactionPage;
import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class EnterMultipleBeneficiaries_id7Test extends AfcTestCaseHelper{
	
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private AffiliateRecordMaintenanceSearchPage affiliateRecordMaintenanceSearchPage;
	private AffliateMaintanceTransactionPage affliateMaintanceTransactionPage;
	
	
	
	 private String Rut,BeneficiaryRut1,BeneficiaryRut2,BeneficiaryRut3,FirstName,LastName,MotherLastName, Beneficiarydob,relationShip,
	 percentage1,percentage2,percentage3;
	
	 @Test
		public void createIuserGroupService() throws Exception
		{
		 
		 int i =1;
			Rut=propertyReader.getCellData(3, 1, 40);
			BeneficiaryRut1=propertyReader.getCellData(3, 1, 42);
			BeneficiaryRut2=propertyReader.getCellData(3, 2, 42);
			BeneficiaryRut3=propertyReader.getCellData(3, 3, 42);
			FirstName=propertyReader.getCellData(3, i, 34);
			LastName=propertyReader.getCellData(3, i, 35);
			MotherLastName=propertyReader.getCellData(3, i, 36);
			Beneficiarydob=propertyReader.getCellData(3, i, 37);
			relationShip=propertyReader.getCellData(3, i, 38);
			percentage1=propertyReader.getCellData(3, 1, 41);
			percentage2=propertyReader.getCellData(3, 2, 41);
			percentage3=propertyReader.getCellData(3, 3, 41);
		 
		 
		 
			
		 repoterLog = extent.createTest("Affilates Record Maintance Page");
			
			loginPage = applicationSetup();
			logger.info("Launching application");
			repoterLog.log(Status.INFO, "Application setup completed");
			//loginPage = loginPage.closecrossicon();
			dashboardPage = loginPage.login();
			logger.info("Log in to application");
			
			
			dashboardPage.mouseOverToAfcAccountDropdown();
			dashboardPage.mouseOverToStakeholdersRecordsInformationDropdown();
			dashboardPage.mouseOverToStakeholdersRecordsMaintanceDropdown();
			dashboardPage.mouseOverToAffilatesRecordsMaintanceDropdown();
			affiliateRecordMaintenanceSearchPage=dashboardPage.clickOnAffilatesMaintance();
			//before run update the Rut no in cell 19
			affiliateRecordMaintenanceSearchPage.enterAffilateRut(Rut);
			affiliateRecordMaintenanceSearchPage.clickOnSearchBtn();
			affliateMaintanceTransactionPage=affiliateRecordMaintenanceSearchPage.clickOnEditIcon();
			
		 
			affliateMaintanceTransactionPage.clickOnBeneficiaryInfoTab();
			affliateMaintanceTransactionPage.clickOnBeneficiaryDltBtn1();
		 
		
			
			affliateMaintanceTransactionPage.clickonBeneficiaryAddIcon();
			affliateMaintanceTransactionPage.enterBeneficiaryRutNo(BeneficiaryRut1);
			affliateMaintanceTransactionPage.enterBneficiaryFirstName(FirstName);
			affliateMaintanceTransactionPage.enterBneficiaryLastName(LastName);
			affliateMaintanceTransactionPage.enterBneficiaryMothersLastName(MotherLastName);
			affliateMaintanceTransactionPage.enterBeneficiaryDob(Beneficiarydob);
			affliateMaintanceTransactionPage.enterBeneficiaryRelationShip(relationShip);
			affliateMaintanceTransactionPage.enterBneficiaryPercentage(percentage1);
			affliateMaintanceTransactionPage.clickOnBeneficiarySaveBtn();
			
			
			affliateMaintanceTransactionPage.clickonBeneficiaryAddIcon();
			affliateMaintanceTransactionPage.enterBeneficiaryRutNo(BeneficiaryRut2);
			affliateMaintanceTransactionPage.enterBneficiaryFirstName(FirstName);
			affliateMaintanceTransactionPage.enterBneficiaryLastName(LastName);
			affliateMaintanceTransactionPage.enterBneficiaryMothersLastName(MotherLastName);
			affliateMaintanceTransactionPage.enterBeneficiaryDob(Beneficiarydob);
			affliateMaintanceTransactionPage.enterBeneficiaryRelationShip(relationShip);
			affliateMaintanceTransactionPage.enterBneficiaryPercentage(percentage2);
			affliateMaintanceTransactionPage.clickOnBeneficiarySaveBtn();
			
			
			affliateMaintanceTransactionPage.clickonBeneficiaryAddIcon();
			affliateMaintanceTransactionPage.enterBeneficiaryRutNo(BeneficiaryRut3);
			affliateMaintanceTransactionPage.enterBneficiaryFirstName(FirstName);
			affliateMaintanceTransactionPage.enterBneficiaryLastName(LastName);
			affliateMaintanceTransactionPage.enterBneficiaryMothersLastName(MotherLastName);
			affliateMaintanceTransactionPage.enterBeneficiaryDob(Beneficiarydob);
			affliateMaintanceTransactionPage.enterBeneficiaryRelationShip(relationShip);
			affliateMaintanceTransactionPage.enterBneficiaryPercentage(percentage3);
			affliateMaintanceTransactionPage.clickOnBeneficiarySaveBtn();
			
			affliateMaintanceTransactionPage.clickonConformBtn();
			
			Thread.sleep(50000);
			
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
			
		 
		 
		 
		}

}
