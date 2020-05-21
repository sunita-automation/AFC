package com.ndfs.afc.accounts.CTA1;

import org.testng.annotations.Test;

import com.afc.pages.AffilatesCreateRequestPage;
import com.afc.pages.AffilatesCreateSearchPage;
import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class EntryOfAffiliationsClaimsClaimViaEmail_id103Test extends AfcTestCaseHelper{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private AffilatesCreateSearchPage affilatesCreateSearchPage;
	private AffilatesCreateRequestPage affilatesCreateRequestPage;
	
	
	
	
	private String Rut,Peternal,mother,Name,dob,MaritialStatus,identity,country,RegionofBirth,Province,BirthPlace,Education,yearsAproved,
	FamilyCharges,codeEmail,CurrentAddress,Country,Region,Commune,IdentityCard,Relationship,Percentage,LegalName,date,Contract,weekHr,
	Affilation,Place,afp;
	
	
	
	
	
	
	@Test
	public void createIuserGroupService() throws Exception
	{
		
		Rut=propertyReader.getCellData(1, 1, 0);
		Peternal=propertyReader.getCellData(1, 1, 1);
		mother=propertyReader.getCellData(1, 1, 2);
		Name=propertyReader.getCellData(1, 1, 3);
		dob=propertyReader.getCellData(1, 1, 4);
		MaritialStatus=propertyReader.getCellData(1, 1, 6);
		identity=propertyReader.getCellData(1, 1, 7);
		country=propertyReader.getCellData(1, 1, 8);
		RegionofBirth=propertyReader.getCellData(1, 1, 9);
		Province=propertyReader.getCellData(1, 1, 10);
		BirthPlace=propertyReader.getCellData(1, 1, 11);
		Education=propertyReader.getCellData(1, 1, 12);
		yearsAproved=propertyReader.getCellData(1, 1, 13);
		FamilyCharges=propertyReader.getCellData(1, 1, 14);
		codeEmail=propertyReader.getCellData(1, 1, 15);
		CurrentAddress=propertyReader.getCellData(1, 1, 16);
		Country=propertyReader.getCellData(1, 1, 8);
		Region=propertyReader.getCellData(1, 1, 9);
		Commune=propertyReader.getCellData(1, 1, 11);
		IdentityCard=propertyReader.getCellData(1, 1, 30);
		Relationship=propertyReader.getCellData(1, 1, 35);
		Percentage=propertyReader.getCellData(1, 1, 36);
		LegalName=propertyReader.getCellData(1, 1, 37);
		date=propertyReader.getCellData(1, 1, 38);
		Contract=propertyReader.getCellData(1, 1, 39);
		weekHr=propertyReader.getCellData(1, 1, 40);
		Affilation=propertyReader.getCellData(1, 1, 42);
		Place=propertyReader.getCellData(1, 1, 43);
		afp=propertyReader.getCellData(1, 1, 44);
		
	
	
	
	
	
	repoterLog = extent.createTest("open Creation of Affilates ");
	 
	
	loginPage = applicationSetup();
	logger.info("Launching application");
	repoterLog.log(Status.INFO, "Application setup completed");
	//loginPage = loginPage.closecrossicon();
	dashboardPage = loginPage.login();
	logger.info("Log in to application");
	
	dashboardPage.mouseOverToAfcAccountDropdown();
	dashboardPage.mouseOverToAccountCreationDropdown();
	dashboardPage.mouseOverToVoluntaryAffiliationDropdown();
	affilatesCreateSearchPage=dashboardPage.clickOnCreateNewrequest();
	affilatesCreateRequestPage=affilatesCreateSearchPage.clickOnAddBtn();
	affilatesCreateRequestPage.numberOfRut(Rut);
	affilatesCreateRequestPage.enterPaternalSurname(Peternal);
	affilatesCreateRequestPage.enterMotherSurname(mother);
	affilatesCreateRequestPage.enterName(Name);
	affilatesCreateRequestPage.enterDob(dob);
	affilatesCreateRequestPage.selectMaritalStatus(MaritialStatus);
	affilatesCreateRequestPage.enterAffilatesIdentityValidation(identity);
	affilatesCreateRequestPage.enterCountyOfBirth(country);
	affilatesCreateRequestPage.enterRegionofBirth(RegionofBirth);
	affilatesCreateRequestPage.enterProvinceofBirth(Province);
	affilatesCreateRequestPage.enterBirthPlace(BirthPlace);
	affilatesCreateRequestPage.enterEducationLevel(Education);
	affilatesCreateRequestPage.enterYearsApproved(yearsAproved);
	affilatesCreateRequestPage.enterNoOfFamilyCharges(FamilyCharges);
	affilatesCreateRequestPage.selectCodeByEmail(codeEmail);
	
	affilatesCreateRequestPage.clickOnAffilatesInformationTab();
	affilatesCreateRequestPage.enterCurrentAddress(CurrentAddress);
	affilatesCreateRequestPage.enterCounty(Country);
	affilatesCreateRequestPage.enterRegion(Region);
	affilatesCreateRequestPage.enterProvince(Province);
	affilatesCreateRequestPage.enterCommune(Commune);
	
	
	affilatesCreateRequestPage.clickOnBeneficiaryTab();
	affilatesCreateRequestPage.clickonbeneficiaryAddIcon();
	affilatesCreateRequestPage.enterIdentityCard(IdentityCard);
	affilatesCreateRequestPage.enterBeneficiaryrelationship(Relationship);
	affilatesCreateRequestPage.enterPercentage(Percentage); 
	affilatesCreateRequestPage.clickSaveBtn();
	
	
	affilatesCreateRequestPage.clickOnEmployerInfomationTab();
	affilatesCreateRequestPage.enterLegalName(LegalName);
	affilatesCreateRequestPage.clickOnEmployerAddressDetailsTab();
	affilatesCreateRequestPage.enterEmployerCounty(Country);
	affilatesCreateRequestPage.enterEmployerRegion(Region);
	affilatesCreateRequestPage.enterEmployerProvince(Province);
	affilatesCreateRequestPage.enterEmployerCommune(Commune);
	affilatesCreateRequestPage.clickOnLaborContractInfoTab();
	affilatesCreateRequestPage.enterWorkStartDate(date);
	affilatesCreateRequestPage.enterTypeOfContract(Contract);
	affilatesCreateRequestPage.enterWeeklyHours(weekHr);
	
	affilatesCreateRequestPage.clickOnApplicationInfoTab();
	affilatesCreateRequestPage.clickonGenerateBtn();
	affilatesCreateRequestPage.enterTypeOfAffilation(Affilation);
	affilatesCreateRequestPage.enterSubscriptionPlace(Place);
	affilatesCreateRequestPage.enterAfpActual(afp);
	
	
	//NEER TO WRITE THE FULL TEST STEPS
	
	
	
	
	
	
	
	}

}

