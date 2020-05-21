package com.ndfs.afc.accounts;

import org.testng.annotations.Test;

import com.afc.pages.AffilatesCreateRequestPage;
import com.afc.pages.AffilatesCreateSearchPage;
import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class AffiliationAccountCreationCTA_001Test extends AfcTestCaseHelper
{
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private AffilatesCreateSearchPage affilatesCreateSearchPage;
	private AffilatesCreateRequestPage affilatesCreateRequestPage;
	
	
	
	
	
	
	private String Rut,Peternal,mother,Name,dob,MaritialStatus,identity,EmployerAddress,country,RegionofBirth,Province,BirthPlace,Education,yearsAproved,
	FamilyCharges,codeEmail,CurrentAddress,Country,Region,Commune,IdentityCard,Relationship,Percentage,LegalName,date,Contract,weekHr,
	Affilation,Place,afp;
	
	
	@Test
	public void createIuserGroupService() throws Exception
	{
		int i=1;
		
		int rowCount = propertyReader.getRowCountXlsx(1);
		System.out.println("rowCount------->>>"+rowCount);
		for(i =1;i<=rowCount;i++)
		{
		
		Rut=propertyReader.getCellData(1, i, 0);
		Peternal=propertyReader.getCellData(1, i, 1);
		mother=propertyReader.getCellData(1, i, 2);
		Name=propertyReader.getCellData(1, i, 3);
		dob=propertyReader.getCellData(1, 1, 4);
		MaritialStatus=propertyReader.getCellData(1, i, 6);
		identity=propertyReader.getCellData(1, i, 7);
		EmployerAddress=propertyReader.getCellData(1, i, 17);
		country=propertyReader.getCellData(1, i, 8);
		RegionofBirth=propertyReader.getCellData(1, i, 9);
		Province=propertyReader.getCellData(1, i, 10);
		BirthPlace=propertyReader.getCellData(1, i, 11);
		Education=propertyReader.getCellData(1, i, 12);
		yearsAproved=propertyReader.getCellData(1, i, 13);
		FamilyCharges=propertyReader.getCellData(1, i, 14);
		codeEmail=propertyReader.getCellData(1, i, 15);
		CurrentAddress=propertyReader.getCellData(1, i, 16);
		Country=propertyReader.getCellData(1, i, 8);
		Region=propertyReader.getCellData(1, i, 9);
		Commune=propertyReader.getCellData(1, i, 11);
		IdentityCard=propertyReader.getCellData(1, i, 30);
		Relationship=propertyReader.getCellData(1, i, 35);
		Percentage=propertyReader.getCellData(1, i, 36);
		LegalName=propertyReader.getCellData(1, i, 37);
		date=propertyReader.getCellData(1, i, 38);
		Contract=propertyReader.getCellData(1, i, 39);
		weekHr=propertyReader.getCellData(1, i, 40);
		Affilation=propertyReader.getCellData(1, i, 42);
		Place=propertyReader.getCellData(1, i, 43);
		afp=propertyReader.getCellData(1, i, 44);
		
		
		
		
		
		
		
		
		
		
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
		takeScreenShot("A");
		
		affilatesCreateRequestPage.clickOnAffilatesInformationTab();
		affilatesCreateRequestPage.enterCurrentAddress(CurrentAddress);
		affilatesCreateRequestPage.enterCounty(Country);
		affilatesCreateRequestPage.enterRegion(Region);
		affilatesCreateRequestPage.enterProvince(Province);
		affilatesCreateRequestPage.enterCommune(Commune);
		takeScreenShot("B");
		
		
		affilatesCreateRequestPage.clickOnBeneficiaryTab();
		affilatesCreateRequestPage.clickonbeneficiaryAddIcon();
		affilatesCreateRequestPage.enterIdentityCard(IdentityCard);


		affilatesCreateRequestPage.enterBeneficiaryrelationship(Relationship);
		affilatesCreateRequestPage.enterPercentage(Percentage); 
		affilatesCreateRequestPage.clickSaveBtn();
		takeScreenShot("C");
		
		affilatesCreateRequestPage.clickOnEmployerInfomationTab();
		affilatesCreateRequestPage.enterLegalName(LegalName);
		affilatesCreateRequestPage.clickOnEmployerAddressDetailsTab();
		affilatesCreateRequestPage.enterEmployerAddress(EmployerAddress);
		affilatesCreateRequestPage.enterEmployerCounty(Country);
		affilatesCreateRequestPage.enterEmployerRegion(Region);
		affilatesCreateRequestPage.enterEmployerProvince(Province);
		affilatesCreateRequestPage.enterEmployerCommune(Commune);
		affilatesCreateRequestPage.clickOnLaborContractInfoTab();
		affilatesCreateRequestPage.enterWorkStartDate(date);
		affilatesCreateRequestPage.enterTypeOfContract(Contract);
		affilatesCreateRequestPage.enterWeeklyHours(weekHr);
		takeScreenShot("D");
		
		affilatesCreateRequestPage.clickOnApplicationInfoTab();
		affilatesCreateRequestPage.clickonGenerateBtn();
		affilatesCreateRequestPage.enterTypeOfAffilation(Affilation);
		affilatesCreateRequestPage.enterSubscriptionPlace(Place);
		affilatesCreateRequestPage.enterAfpActual(afp);
		affilatesCreateRequestPage.clickonConformBtn();
		takeScreenShot("E");
		Thread.sleep(5000);
		
		dashboardPage=affilatesCreateRequestPage.clickonAFCLogo();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
	}

}
