package com.ndfs.afc.accounts;

import org.testng.annotations.Test;

import com.afc.pages.DashboardPage;
import com.afc.pages.EmployerMaintanceTransactionPage;
import com.afc.pages.EmployerRecordMaintenanceSearchPage;
import com.afc.pages.LoginPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class EmployerRecordsMaintenanceCTA_040Test extends AfcTestCaseHelper{
	
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private EmployerRecordMaintenanceSearchPage employerRecordMaintenanceSearchPage;
	private EmployerMaintanceTransactionPage employerMaintanceTransactionPage;
	
	
	
	
	private String Rut,Name,Activity1,Activity2,Activity3,EmpStatus,Origin,Prupose,postal,Address,Country,Region,Province,
	Commune,Home,Email,RepresentiveRut,LastName,MotherName,Date,LegalStatus,LegalAdvisorRut,EstablishedDate,Cause,Bank,
	BankType,AccountNo,Method,VerificationDate,AddressVerificationdate,HomePhoneDate,CallVerificationDate;
	
	
	@Test
	public void createIuserGroupService() throws Exception
	{
		int i =1;
		
		int rowCount = propertyReader.getRowCountXlsx(4);
		System.out.println("rowCount------->>>"+rowCount);
		for(i =1;i<=rowCount;i++)
		{
		Rut=propertyReader.getCellData(4, i, 0);
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
		VerificationDate=propertyReader.getCellData(4, i, 29);
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
		AddressVerificationdate=propertyReader.getCellData(4, i, 30);
		HomePhoneDate=propertyReader.getCellData(4, i, 31);
		CallVerificationDate=propertyReader.getCellData(4, i, 32);
		
		
		if(i==1)
		{
		
        repoterLog = extent.createTest("Employer Record Maintance Page");
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		//loginPage = loginPage.closecrossicon();
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		}
		
		
		dashboardPage.mouseOverToAfcAccountDropdown();
		dashboardPage.mouseOverToStakeholdersRecordsInformationDropdown();
		dashboardPage.mouseOverToStakeholdersRecordsMaintanceDropdown();
		dashboardPage.mouseOverToEmployerRecordsMaintanceDropdown();
		employerRecordMaintenanceSearchPage=dashboardPage.clickOnEmployerMaintance();
		employerMaintanceTransactionPage=employerRecordMaintenanceSearchPage.clickOnCreateBtn();
		employerMaintanceTransactionPage.enterEmployerRut(Rut);
		employerMaintanceTransactionPage.enterCompanyName(Name);
		employerMaintanceTransactionPage.enterEconomicActivity1(Activity1);
		employerMaintanceTransactionPage.enterEconomicActivity2(Activity2);
		employerMaintanceTransactionPage.enterEconomicActivity3(Activity3);
		employerMaintanceTransactionPage.selectemployerStatus(EmpStatus);
		employerMaintanceTransactionPage.enterOriginOfEmployerCreation(Origin);
		employerMaintanceTransactionPage.clickOnEmployerAddressDetailsTab();
		employerMaintanceTransactionPage.selectPurpose(Prupose);
		employerMaintanceTransactionPage.enterPostalCode(postal);
		employerMaintanceTransactionPage.enterAddress(Address);
		employerMaintanceTransactionPage.clickCountryCodeArrow();
		employerMaintanceTransactionPage.selectCountry(Country);
		//employerMaintanceTransactionPage.enterCountry(Country);
		employerMaintanceTransactionPage.enterRegion(Region);
		employerMaintanceTransactionPage.enterProvince(Province);
		employerMaintanceTransactionPage.enterCommune(Commune);
		employerMaintanceTransactionPage.enterAddressVerificationDate(AddressVerificationdate);
		employerMaintanceTransactionPage.enterHomePhone(Home);
		employerMaintanceTransactionPage.enterHomePhoneVerificationDate(HomePhoneDate);
		employerMaintanceTransactionPage.enterCallVerificationDate(CallVerificationDate);
		employerMaintanceTransactionPage.enterEmail(Email);
		employerMaintanceTransactionPage.enterEmailVerificationDate(VerificationDate);
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
		employerMaintanceTransactionPage.clickOnBankAddBtn();
		employerMaintanceTransactionPage.enterBankName(Bank);
		employerMaintanceTransactionPage.enterTypeOfBank(BankType);
		employerMaintanceTransactionPage.enterAccountNumber(AccountNo);
		employerMaintanceTransactionPage.enterPaymentMethod(Method);
		employerMaintanceTransactionPage.clickOnBankInfoSaveBtn();
		dashboardPage=employerMaintanceTransactionPage.clickonConformBtn();
		Thread.sleep(2000);
		//dashboardPage=employerMaintanceTransactionPage.clickonAFCLogo();
		
		
		
		
		Thread.sleep(5000);
		
		
		}
		
	
	}
	

}
