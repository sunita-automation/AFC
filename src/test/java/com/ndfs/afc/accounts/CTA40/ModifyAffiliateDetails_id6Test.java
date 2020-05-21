package com.ndfs.afc.accounts.CTA40;

import org.testng.annotations.Test;

import com.afc.pages.AffiliateRecordMaintenanceSearchPage;
import com.afc.pages.AffliateMaintanceTransactionPage;
import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class ModifyAffiliateDetails_id6Test extends AfcTestCaseHelper {
	
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private AffiliateRecordMaintenanceSearchPage affiliateRecordMaintenanceSearchPage;
	private AffliateMaintanceTransactionPage affliateMaintanceTransactionPage;
	
	  private String Rut,Peternal,mother,Name,dob,MaritialStatus,identity,country,Region,Province,BirthPlace,Education,
	  yearsAproved,FamilyCharges,forecast,actual,codeEmail,status,PensionedState,StateOfDeath,claimNo,Purpose,PostalCode,
	  Address,VerificationStatus,Email,Bank,AccountType,AccountNo,PaymentMethod,BeneficiaryRut,FirstName,LastName,MotherLastName,
	  Beneficiarydob,relationShip,percentage;
	
	  @Test
		public void createIuserGroupService() throws Exception
		{
			int i =1;
			Rut=propertyReader.getCellData(3, 1, 40);
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
			//before run update the Rut no in Colume 40
			affiliateRecordMaintenanceSearchPage.enterAffilateRut(Rut);
			affiliateRecordMaintenanceSearchPage.clickOnSearchBtn();
			affliateMaintanceTransactionPage=affiliateRecordMaintenanceSearchPage.clickOnEditIcon();
			
			
			affliateMaintanceTransactionPage.enterPaternalSurname(Peternal);
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
			
			affliateMaintanceTransactionPage.clickOnAffilatesControlDataTab();
			affliateMaintanceTransactionPage.enterAffilateStatus(status);
			affliateMaintanceTransactionPage.enterPensionedState(PensionedState);
			affliateMaintanceTransactionPage.enterStateOfDeathOriginCodeDeceased(StateOfDeath);
			affliateMaintanceTransactionPage.enterAccountEliminationClaimNumber(claimNo);
			
			affliateMaintanceTransactionPage.clickOnAffilateAddressDetailsTab();
			affliateMaintanceTransactionPage.clickOnAddressDltBtn();
			affliateMaintanceTransactionPage.selectPurpose(Purpose);
			affliateMaintanceTransactionPage.enterPostalCode(PostalCode);
			affliateMaintanceTransactionPage.enterAddress(Address);
			affliateMaintanceTransactionPage.enterCounty(country);
			affliateMaintanceTransactionPage.enterRegion(Region);
			affliateMaintanceTransactionPage.enterProvince(Province);
			affliateMaintanceTransactionPage.enterCommune(BirthPlace);
			affliateMaintanceTransactionPage.selectAddressVerificationStatus(VerificationStatus);
			affliateMaintanceTransactionPage.enterEmail(Email);
			Thread.sleep(2000);
			affliateMaintanceTransactionPage.clickOnAddressSaveBtn();
			
			affliateMaintanceTransactionPage.clickOnAffilatesBankingInfoTab();
			affliateMaintanceTransactionPage.clickonBankingAddIcon();
			affliateMaintanceTransactionPage.enterBank(Bank);
			affliateMaintanceTransactionPage.enterBankAccountType(AccountType);
			affliateMaintanceTransactionPage.enterAccountNumber(AccountNo);
			affliateMaintanceTransactionPage.enterpaymentMethod(PaymentMethod);
			affliateMaintanceTransactionPage.clickOnBankingInfoSaveBtn();
			
			affliateMaintanceTransactionPage.clickOnBeneficiaryInfoTab();
			affliateMaintanceTransactionPage.clickOnBeneficiaryDltBtn();
			affliateMaintanceTransactionPage.clickonBeneficiaryAddIcon();
			affliateMaintanceTransactionPage.enterBeneficiaryRutNo(BeneficiaryRut);
			affliateMaintanceTransactionPage.enterBneficiaryFirstName(FirstName);
			affliateMaintanceTransactionPage.enterBneficiaryLastName(LastName);
			affliateMaintanceTransactionPage.enterBneficiaryMothersLastName(MotherLastName);
			affliateMaintanceTransactionPage.enterBeneficiaryDob(Beneficiarydob);
			affliateMaintanceTransactionPage.enterBeneficiaryRelationShip(relationShip);
			affliateMaintanceTransactionPage.enterBneficiaryPercentage(percentage);
			affliateMaintanceTransactionPage.clickOnBeneficiarySaveBtn();
			affliateMaintanceTransactionPage.clickonConformBtn();
			
			Thread.sleep(50000);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			Thread.sleep(2000);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	

}
