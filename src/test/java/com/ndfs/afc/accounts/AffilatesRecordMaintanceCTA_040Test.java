package com.ndfs.afc.accounts;

import org.testng.annotations.Test;

import com.afc.pages.AffiliateRecordMaintenanceSearchPage;
import com.afc.pages.AffliateMaintanceTransactionPage;
import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class AffilatesRecordMaintanceCTA_040Test extends AfcTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private AffiliateRecordMaintenanceSearchPage affiliateRecordMaintenanceSearchPage;
	private AffliateMaintanceTransactionPage affliateMaintanceTransactionPage;
	
	
	
	
     private String Rut,Peternal,mother,Name,dob,MaritialStatus,identity,country,Region,Province,BirthPlace,Education,
     yearsAproved,FamilyCharges,forecast,actual,codeEmail,originEmail,dateEmail,status,PensionedState,StateOfDeath,claimNo,Purpose,PostalCode,
     Address,VerificationStatus,Email,Bank,AccountType,AccountNo,PaymentMethod,BeneficiaryRut,FirstName,LastName,MotherLastName,
     Beneficiarydob,relationShip,percentage,subdate,memberdate,typeAffilate,typePension,DateOfDeath,cause,
     lockCode,percentageJudicialWithholding;
	
	
	
	

	@Test
	public void createIuserGroupService() throws Exception
	{
		int i =1;
		
		int rowCount = propertyReader.getRowCountXlsx(3);
		System.out.println("rowCount------->>>"+rowCount);
		for(i =1;i<=rowCount;i++)
		{
		
		Rut=propertyReader.getCellData(3, i, 0);
		Peternal=propertyReader.getCellData(3, i, 1);
		mother=propertyReader.getCellData(3, i, 2);
		Name=propertyReader.getCellData(3, i, 3);
		dob=propertyReader.getCellData(3, i, 4);
		MaritialStatus=propertyReader.getCellData(3, i, 6);
		identity=propertyReader.getCellData(3, i, 7);
		country=propertyReader.getCellData(3, i, 8);
		Region=propertyReader.getCellData(3, i, 9);
		Province=propertyReader.getCellData(3, i, 10);
		BirthPlace=propertyReader.getCellData(3, i, 11);
		Education=propertyReader.getCellData(3, i, 12);
		yearsAproved=propertyReader.getCellData(3, i, 13);
		FamilyCharges=propertyReader.getCellData(3, i, 14);
		forecast=propertyReader.getCellData(3, i, 15);
		actual=propertyReader.getCellData(3, i, 16);
		codeEmail=propertyReader.getCellData(3, i, 17);
		originEmail=propertyReader.getCellData(3, i, 18);
		dateEmail=propertyReader.getCellData(3, i, 43);
		status=propertyReader.getCellData(3, i, 19);
		PensionedState=propertyReader.getCellData(3, i, 20);
		StateOfDeath=propertyReader.getCellData(3, i, 21);
		claimNo=propertyReader.getCellData(3, i, 22);
		Purpose=propertyReader.getCellData(3, i, 23);
		PostalCode=propertyReader.getCellData(3, i, 24);
		Address=propertyReader.getCellData(3, i, 25);
		VerificationStatus=propertyReader.getCellData(3, i, 27);
		Email=propertyReader.getCellData(3, i, 28);
		Bank=propertyReader.getCellData(3, i, 29);
		AccountType=propertyReader.getCellData(3, i, 30);
		AccountNo=propertyReader.getCellData(3, i, 31);
		PaymentMethod=propertyReader.getCellData(3, i, 32);
		BeneficiaryRut=propertyReader.getCellData(3, i, 33);
		FirstName=propertyReader.getCellData(3, i, 34);
		LastName=propertyReader.getCellData(3, i, 35);
		MotherLastName=propertyReader.getCellData(3, i, 36);
		Beneficiarydob=propertyReader.getCellData(3, i, 37);
		relationShip=propertyReader.getCellData(3, i, 38);
		percentage=propertyReader.getCellData(3, i, 39);
		subdate=propertyReader.getCellData(3, i, 44);
		memberdate=propertyReader.getCellData(3, i, 45);
		typeAffilate=propertyReader.getCellData(3, i, 47);
		typePension=propertyReader.getCellData(3, i, 48);
		DateOfDeath=propertyReader.getCellData(3, i, 49);
		cause=propertyReader.getCellData(3, i, 50);
		lockCode=propertyReader.getCellData(3, i, 51);
		percentageJudicialWithholding=propertyReader.getCellData(3, i, 52);
		
		
		
		
		
		
		
		if(i==1)
		{
		
		repoterLog = extent.createTest("Affilates Record Maintance Page");
		
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
		dashboardPage.mouseOverToAffilatesRecordsMaintanceDropdown();
		affiliateRecordMaintenanceSearchPage=dashboardPage.clickOnAffilatesMaintance();
		affliateMaintanceTransactionPage=affiliateRecordMaintenanceSearchPage.clickOnCreateBtn();
		affliateMaintanceTransactionPage.numberOfRut(Rut);
		Thread.sleep(1000);
		affliateMaintanceTransactionPage.enterPaternalSurname(Peternal);
		Thread.sleep(1000);
		affliateMaintanceTransactionPage.enterMotherSurname(mother);
		affliateMaintanceTransactionPage.enterName(Name);
		affliateMaintanceTransactionPage.enterDob(dob);
		affliateMaintanceTransactionPage.selectCivilStatus(MaritialStatus);
		affliateMaintanceTransactionPage.enterAffilatesIdentityValidation(identity);
		affliateMaintanceTransactionPage.enterCountyOfBirth(country);
		affliateMaintanceTransactionPage.enterRegionofBirth(Region);
		affliateMaintanceTransactionPage.enterProvinceofBirth(Province);
		affliateMaintanceTransactionPage.enterBirthPlace(BirthPlace);
		affliateMaintanceTransactionPage.enterEducationLevel(Education);
		affliateMaintanceTransactionPage.enterYearsApproved(yearsAproved);
		affliateMaintanceTransactionPage.enterNoOfFamilyCharges(FamilyCharges);
		affliateMaintanceTransactionPage.enterTypeOfForecast(forecast);
		affliateMaintanceTransactionPage.enterAFPActual(actual);
		affliateMaintanceTransactionPage.selectCodeByEmail(codeEmail);
		affliateMaintanceTransactionPage.selectOriginByEmail(originEmail);
		affliateMaintanceTransactionPage.enterDateByEmail(dateEmail);
		
		affliateMaintanceTransactionPage.clickOnAffilatesControlDataTab();
		affliateMaintanceTransactionPage.enterSubsriptionDate(subdate);
		affliateMaintanceTransactionPage.enterMembershipDate(memberdate);
		affliateMaintanceTransactionPage.enterAffilateStatus(status);
		affliateMaintanceTransactionPage.enterAffilateType(typeAffilate);
		affliateMaintanceTransactionPage.entertypePensionType(typePension);
		affliateMaintanceTransactionPage.enterDateOfDeath(DateOfDeath);
		affliateMaintanceTransactionPage.enterPensionedState(PensionedState);
		affliateMaintanceTransactionPage.enterStateOfDeathOriginCodeDeceased(StateOfDeath);
		affliateMaintanceTransactionPage.enterAccountEliminationClaimNumber(claimNo);
		affliateMaintanceTransactionPage.enterAccountDeletionCause(cause);
		affliateMaintanceTransactionPage.enterAccountLockoutCode(lockCode);
		affliateMaintanceTransactionPage.enterpercentageOfJudicialWithholding(percentageJudicialWithholding);
		
		
		affliateMaintanceTransactionPage.clickOnAffilateAddressDetailsTab();
		affliateMaintanceTransactionPage.selectPurpose(Purpose);
		affliateMaintanceTransactionPage.enterPostalCode(PostalCode);
		affliateMaintanceTransactionPage.enterAddress(Address);
		affliateMaintanceTransactionPage.enterCounty(country);
		affliateMaintanceTransactionPage.enterRegion(Region);
		affliateMaintanceTransactionPage.enterProvince(Province);
		affliateMaintanceTransactionPage.enterCommune(BirthPlace);
		affliateMaintanceTransactionPage.selectAddressVerificationStatus(VerificationStatus);
		affliateMaintanceTransactionPage.enterEmail(Email);
		affliateMaintanceTransactionPage.clickOnAddressSaveBtn();
		
		affliateMaintanceTransactionPage.clickOnAffilatesBankingInfoTab();
		affliateMaintanceTransactionPage.clickonBankingAddIcon();
		affliateMaintanceTransactionPage.enterBank(Bank);
		affliateMaintanceTransactionPage.enterBankAccountType(AccountType);
		affliateMaintanceTransactionPage.enterAccountNumber(AccountNo);
		affliateMaintanceTransactionPage.enterpaymentMethod(PaymentMethod);
		affliateMaintanceTransactionPage.clickOnBankingInfoSaveBtn();
		
		affliateMaintanceTransactionPage.clickOnBeneficiaryInfoTab();
		affliateMaintanceTransactionPage.clickonBeneficiaryAddIcon();
		affliateMaintanceTransactionPage.enterBeneficiaryRutNo(BeneficiaryRut);
		//affliateMaintanceTransactionPage.enterBneficiaryFirstName(FirstName);
		//affliateMaintanceTransactionPage.enterBneficiaryLastName(LastName);
		//affliateMaintanceTransactionPage.enterBneficiaryMothersLastName(MotherLastName);
		//affliateMaintanceTransactionPage.enterBeneficiaryDob(Beneficiarydob);
		affliateMaintanceTransactionPage.enterBeneficiaryRelationShip(relationShip);
		affliateMaintanceTransactionPage.enterBneficiaryPercentage(percentage);
		affliateMaintanceTransactionPage.clickOnBeneficiarySaveBtn();
		affliateMaintanceTransactionPage.clickonConformBtn();
		Thread.sleep(2000);
		//affliateMaintanceTransactionPage.clickonAFCLogo();
		Thread.sleep(2000);
		
		
		}
		
	}

}
