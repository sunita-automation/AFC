package com.ndfs.afc.accounts.CTA40;

import org.testng.annotations.Test;

import com.afc.pages.DashboardPage;
import com.afc.pages.EmployerMaintanceTransactionPage;
import com.afc.pages.EmployerRecordMaintenanceSearchPage;
import com.afc.pages.LoginPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class ModifyEmployerDetails_id19Test extends AfcTestCaseHelper {

	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private EmployerRecordMaintenanceSearchPage employerRecordMaintenanceSearchPage;
	private EmployerMaintanceTransactionPage employerMaintanceTransactionPage;
	
	private String existingRut,Name,Activity1,Activity2,Activity3,EmpStatus,Origin,Prupose,postal,Address,Country,Region,Province,
	Commune,Home,Email,RepresentiveRut,LastName,MotherName,Date,LegalStatus,LegalAdvisorRut,EstablishedDate,Cause,Bank,
	BankType,AccountNo,Method;
	
	
	@Test
	public void createIuserGroupService() throws Exception
	{
		int i =1;
		existingRut=propertyReader.getCellData(4, 1, 28);
		Name=propertyReader.getCellData(4, i, 1);
		Activity1=propertyReader.getCellData(4, i, 2);
		Activity2=propertyReader.getCellData(4, i, 3);
		Activity3=propertyReader.getCellData(4, i, 4);
		EmpStatus=propertyReader.getCellData(4, i, 5);
		Origin=propertyReader.getCellData(4, i, 6);
		Prupose=propertyReader.getCellData(4, i, 7);
		postal=propertyReader.getCellData(4, i, 8);
		Address=propertyReader.getCellData(4, i, 9);
		Country=propertyReader.getCellData(4, i, 10);
		Region=propertyReader.getCellData(4, i, 11);
		Province=propertyReader.getCellData(4, i, 12);
		Commune=propertyReader.getCellData(4, i, 13);
		Home=propertyReader.getCellData(4, i, 14);
		Email=propertyReader.getCellData(4, i, 15);
		RepresentiveRut=propertyReader.getCellData(4, i, 16);
		LastName=propertyReader.getCellData(4, i, 17);
		MotherName=propertyReader.getCellData(4, i, 18);
		Date=propertyReader.getCellData(4, i, 19);
		LegalStatus=propertyReader.getCellData(4, i, 20);
		LegalAdvisorRut=propertyReader.getCellData(4, i, 21);
		EstablishedDate=propertyReader.getCellData(4, i, 22);
		Cause=propertyReader.getCellData(4, i, 23);
		Bank=propertyReader.getCellData(4, i, 24);
		BankType=propertyReader.getCellData(4, i, 25);
		AccountNo=propertyReader.getCellData(4, i, 26);
		Method=propertyReader.getCellData(4, i, 27);
		
		
		
		
		
        repoterLog = extent.createTest("Employer Record Maintance Page");
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		//loginPage = loginPage.closecrossicon();
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		
		dashboardPage.mouseOverToAfcAccountDropdown();
		dashboardPage.mouseOverToStakeholdersRecordsInformationDropdown();
		dashboardPage.mouseOverToStakeholdersRecordsMaintanceDropdown();
		dashboardPage.mouseOverToEmployerRecordsMaintanceDropdown();
		employerRecordMaintenanceSearchPage=dashboardPage.clickOnEmployerMaintance();
		employerRecordMaintenanceSearchPage.enterEmployerRut(existingRut);
		employerRecordMaintenanceSearchPage.clickOnSearchBtn();
		employerMaintanceTransactionPage=employerRecordMaintenanceSearchPage.clickOnEditIcon();
	
		employerMaintanceTransactionPage.enterCompanyName(Name);
		employerMaintanceTransactionPage.enterEconomicActivity1(Activity1);
		employerMaintanceTransactionPage.enterEconomicActivity2(Activity2);
		employerMaintanceTransactionPage.enterEconomicActivity3(Activity3);
		employerMaintanceTransactionPage.selectemployerStatus(EmpStatus);
		employerMaintanceTransactionPage.enterOriginOfEmployerCreation(Origin);
		
		employerMaintanceTransactionPage.clickOnEmployerAddressDetailsTab();
		employerMaintanceTransactionPage.clickOnAddressDltBtn();
		employerMaintanceTransactionPage.selectPurpose(Prupose);
		employerMaintanceTransactionPage.enterPostalCode(postal);
		employerMaintanceTransactionPage.enterAddress(Address);
		employerMaintanceTransactionPage.enterCountry(Country);
		employerMaintanceTransactionPage.enterRegion(Region);
		employerMaintanceTransactionPage.enterProvince(Province);
		employerMaintanceTransactionPage.enterCommune(Commune);
		employerMaintanceTransactionPage.enterHomePhone(Home);
		employerMaintanceTransactionPage.enterEmail(Email);
		employerMaintanceTransactionPage.clickOnAddressSaveBtn();
		
		employerMaintanceTransactionPage.clickOnLegalRepresentativeTab();
		employerMaintanceTransactionPage.enterLegalRepresentiveRut(RepresentiveRut);
		employerMaintanceTransactionPage.enterLastName(LastName);
		employerMaintanceTransactionPage.enterMotherSurname(MotherName);
		employerMaintanceTransactionPage.enterUpdatedDate(Date);
		employerMaintanceTransactionPage.enterLegalRepresentativeStatus(LegalStatus);
		
		employerMaintanceTransactionPage.clickOnInformationOfTheLegalOfCompanyTabTab();
		employerMaintanceTransactionPage.enterLegalAdvisorRut(LegalAdvisorRut);
		employerMaintanceTransactionPage.enterEstablishedDate(EstablishedDate);
		employerMaintanceTransactionPage.entercontinuation(Cause);
		
		employerMaintanceTransactionPage.clickOnBankInformationTabTab();
		//employerMaintanceTransactionPage.clickOnBeneficiaryDltBtn();
		employerMaintanceTransactionPage.clickOnBankAddBtn();
		employerMaintanceTransactionPage.enterBankName(Bank);
		employerMaintanceTransactionPage.enterTypeOfBank(BankType);
		employerMaintanceTransactionPage.enterAccountNumber(AccountNo);
		employerMaintanceTransactionPage.enterPaymentMethod(Method);
		employerMaintanceTransactionPage.clickOnBankInfoSaveBtn();
		employerMaintanceTransactionPage.clickonConformBtn();
		
		
		
		
		
		Thread.sleep(10000);
		
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
