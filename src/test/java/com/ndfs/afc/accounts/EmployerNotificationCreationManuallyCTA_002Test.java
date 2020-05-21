package com.ndfs.afc.accounts;

import org.testng.annotations.Test;

import com.afc.pages.DashboardPage;
import com.afc.pages.EmployerNotificationCreationManualyPage;
import com.afc.pages.LoginPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class EmployerNotificationCreationManuallyCTA_002Test extends AfcTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private EmployerNotificationCreationManualyPage employerNotificationCreationManualyPage;
	
	
	private String Rut,Paternal,Mother,Name,dob,MaritialStatus,Country,Region,Province,BirthPlace,Pension,Purpose,Postalcode,
	Address,Commune,LegalName,Affilation,Forecast,contract,startDate,workinghr ,tax;
	
	@Test
	public void createIuserGroupService() throws Exception
	{
		int i=1;
		
		int rowCount = propertyReader.getRowCountXlsx(2);
		System.out.println("rowCount------->>>"+rowCount);
		for(i =1;i<=rowCount;i++)
		{
	
		Rut=propertyReader.getCellData(2, i, 0);
		Paternal=propertyReader.getCellData(2, i, 1);
		Mother=propertyReader.getCellData(2, i, 2);
		Name=propertyReader.getCellData(2, i, 3);
		dob=propertyReader.getCellData(2, i, 4);
		MaritialStatus=propertyReader.getCellData(2, i, 6);
		Country=propertyReader.getCellData(2, i, 7);
		Region=propertyReader.getCellData(2, i, 8);
		Province=propertyReader.getCellData(2, i, 9);
		BirthPlace=propertyReader.getCellData(2, i, 10);
		Pension=propertyReader.getCellData(2, i, 11);
		Purpose=propertyReader.getCellData(2, i, 12);
		Postalcode=propertyReader.getCellData(2, i, 13);
		Address=propertyReader.getCellData(2, i, 14);
		Commune=propertyReader.getCellData(2, i, 10);
		LegalName=propertyReader.getCellData(2, i, 15);
		Affilation=propertyReader.getCellData(2, i, 16);
		Forecast=propertyReader.getCellData(2, i, 17);
		contract=propertyReader.getCellData(2, i, 18);
		startDate=propertyReader.getCellData(2, i, 19);
		workinghr=propertyReader.getCellData(2, i, 20);
		tax=propertyReader.getCellData(2, i, 21);

	
		
		
		
		if(i==1)
		{
		
		
		repoterLog = extent.createTest("open Employer Notification Creation Manually page");
		 
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		//loginPage = loginPage.closecrossicon();
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		}
		
		dashboardPage.mouseOverToAfcAccountDropdown();
		dashboardPage.mouseOverToEmployerNotification();
		dashboardPage.mouseOverToCreateNewEmployerNotification();
		employerNotificationCreationManualyPage=dashboardPage.clickOnManualEntry();
		employerNotificationCreationManualyPage.clickonGenerateBtn();
		employerNotificationCreationManualyPage.enterNumberOfRut(Rut);
		employerNotificationCreationManualyPage.enterPaternalSurname(Paternal);
		employerNotificationCreationManualyPage.enterMotherSurname(Mother);
		employerNotificationCreationManualyPage.enterName(Name);
		employerNotificationCreationManualyPage.enterDob(dob);
		employerNotificationCreationManualyPage.selectMaritalStatus(MaritialStatus);
		employerNotificationCreationManualyPage.enterCountyOfBirth(Country);
		employerNotificationCreationManualyPage.enterRegionofBirth(Region);
		employerNotificationCreationManualyPage.enterProvinceofBirth(Province);
		employerNotificationCreationManualyPage.enterBirthPlace(BirthPlace);
		employerNotificationCreationManualyPage.enterTyepOfPension(Pension);
		takeScreenShot("a");
		
		employerNotificationCreationManualyPage.clickOnAddressInfoTab();
		employerNotificationCreationManualyPage.selectPurpose(Purpose);
		employerNotificationCreationManualyPage.enterPostalCode(Postalcode);
		employerNotificationCreationManualyPage.enterAddress(Address);
		employerNotificationCreationManualyPage.enterCounty(Country);
		employerNotificationCreationManualyPage.enterRegion(Region);
		employerNotificationCreationManualyPage.enterProvince(Province);
		employerNotificationCreationManualyPage.enterCommune(Commune);
		employerNotificationCreationManualyPage.clickOnAddressSaveBtn();
		takeScreenShot("b");
		
		employerNotificationCreationManualyPage.clickOnWorkContractTab();
		employerNotificationCreationManualyPage.enterLegalName(LegalName);
		employerNotificationCreationManualyPage.enterTypeOfContract(contract);
		employerNotificationCreationManualyPage.enterWorkstartDate(startDate);
		employerNotificationCreationManualyPage.enterWorkingHr(workinghr);
		employerNotificationCreationManualyPage.enterTaxIncome(tax);
		
		employerNotificationCreationManualyPage.clickOnEmployerNotificationTab();
		employerNotificationCreationManualyPage.enterTypeOfAffilation(Affilation);
		employerNotificationCreationManualyPage.enterTypeOfForecast(Forecast);
		employerNotificationCreationManualyPage.clickOnSaveBtn();
		takeScreenShot("c");
		Thread.sleep(5000);
		employerNotificationCreationManualyPage.clickonAFCLogo();
		Thread.sleep(5000);
		
		
		
		}
		
		
	}

}
