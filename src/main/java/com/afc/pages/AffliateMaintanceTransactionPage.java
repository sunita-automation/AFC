package com.afc.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.afc.utils.AfcDriverHelper;

public class AffliateMaintanceTransactionPage  extends AfcDriverHelper {

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.partyID']")
	 private WebElement rutNumber;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.name.middleName']")
	 private WebElement paternalSurname;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.name.lastName']")
	 private WebElement maternalSurname;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.name.firstName']")
	 private WebElement name;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.DOB']")
	 private WebElement birthFetcha;

	@FindBy(xpath="(//input[@name='paRequestTO.individualTO.sex'])[2]")
	 private WebElement gender;


	@FindBy(xpath="//select[@name='paRequestTO.individualTO.maritalStatus']")
	 private WebElement civilStatus;


	@FindBy(xpath="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.affiliateIdentityValidationDesc']")
	 private WebElement affiliateIdentityValidation;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.birthCountryDesc']")
	 private WebElement birthCountry;


	@FindBy(xpath="(//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.regionDesc'])[2]")
	 private WebElement regionofBirth;


	@FindBy(xpath="(//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.provinceDesc'])[2]")
	 private WebElement provinceofBirth;

	@FindBy(xpath="(//input[@name='paRequestTO.individualTO.birthCityDesc'])[2]")
	 private WebElement birthPlace;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.educationCodeDesc']")
	 private WebElement educationLevel;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.freeText8']")
	 private WebElement yearsApproved;
    
	@FindBy(xpath="//input[@name='paRequestTO.individualTO.numberOfDependents']")
	 private WebElement familyCharges;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.previsionTypeDesc']")
	 private WebElement typeOfForecast;
	
	@FindBy(xpath="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.currentAFPDesc']")
	 private WebElement afpActual;
	
	@FindBy(xpath="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.stateOfAuthEmail']")
	 private WebElement codeByEmail;
	
	@FindBy(xpath="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.orgAuthMailDesc']")
	 private WebElement originByEmail;
	
	@FindBy(xpath="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.stateOfAuthMailDT']")
	 private WebElement dateByEmail;

	@FindBy(xpath="(//label[@ficlabel='ACNT_AffiliateControlData.label'])[1]")
	 private WebElement affiliateControlDataTab;

	@FindBy(xpath="//input[@name='paRequestTO.subscriptionDate']")
	 private WebElement subsriptionDate;
	
	@FindBy(xpath="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.memebershipDT']")
	 private WebElement membershipDate;
	
	@FindBy(xpath="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.affiliationtypeDesc']")
	 private WebElement typeOfAffilation;
	
	@FindBy(xpath="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.pensionTypeDesc']")
	 private WebElement typeOfPension;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.raceCodeDesc']")
	 private WebElement affiliateStatus;

	@FindBy(xpath="(//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.pensionerDT'])[1]")
	 private WebElement dateOfDeath;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.pensionerSourceDesc']")
	 private WebElement sourceCdeDeceasedPensionedState;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.mortalitySourceDesc']")
	 private WebElement StateofdeathOriginCodeDeceased;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.numberOfDependentOthers']")
	 private WebElement accountEliminationClaimNumber;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.accountDeletionCauseDesc']")
	 private WebElement accountDeletionCause;

	@FindBy(xpath="//input[@name='paRequestTO.individualTO.paAcntLaborRelationList[0].cessCauseCD']")
	 private WebElement accountLockoutCode;

	@FindBy(xpath="//input[@name='O']")
	 private WebElement percentageofJudicialWithholding;
	 
	@FindBy(xpath="//div[14]//div[2]//p[1]//input[1]")
	 private WebElement accountLockoutDate;

	@FindBy(xpath="(//label[@ficlabel='ACNT_AddressDetailsofAffiliate.label'])[1]")
	 private WebElement affiliateAddressDetailsTab;
	
	@FindBy(xpath="//select[@name='addresspurpose']")
	 private WebElement purpose;

	@FindBy(xpath="//input[@name='tempData.zipNumber']")
	 private WebElement postalCode;

	@FindBy(xpath="//input[@name='tempData.line1']")
	 private WebElement address;

	@FindBy(xpath="//input[@name='tempData.countryDesc']")
	 private WebElement country;


	@FindBy(xpath="//input[@name='tempData.stateDesc']")
	 private WebElement region;

	@FindBy(xpath="//input[@name='tempData.districtDesc']")
	 private WebElement province;

	@FindBy(xpath="//input[@name='tempData.cityDesc']")
	 private WebElement commune;

	@FindBy(xpath="//select[@name='tempData.streetNumber']")
	 private WebElement addressVerificationStatus;

	@FindBy(xpath="//input[@name='tempData.streetName']")
	 private WebElement addressDateVerification;

	@FindBy(xpath="//input[@name='tempData.matchCode']")
	 private WebElement homePhone;
	
	@FindBy(xpath="//input[@name='tempData.email']")
	 private WebElement email;
	
	@FindBy(xpath="//button[@ficlabel='PARTY_Save.label '] ")
	 private WebElement addressSaveBtn;
	
	@FindBy(xpath="(//label[@ficlabel='ACNT_AffiliateBankInformation.label'])[1]")
	 private WebElement affiliateBankingInfoTab;
	
	@FindBy(xpath="(//i[@class=' icon-transaction-add iconinline'])[1]")
	 private WebElement bankingAddIcon;

	@FindBy(xpath="//input[@name='tempData.bankCodeDesc']")
	 private WebElement bank;

	@FindBy(xpath="(//input[@name='tempData.statementOfAccountTypeDesc'])[1]")
	 private WebElement bankAccountType;

	@FindBy(xpath="//input[@name='tempData.accountNumber']")
	 private WebElement accountNumber;

	@FindBy(xpath="//input[@name='tempData.methodOfPaymentDesc']")
	 private WebElement paymentMethod;
	
	@FindBy(xpath="//button[@ficlabel='PARTY_Save.label']")
	 private WebElement bankingInfoSaveBtn;
	
	@FindBy(xpath="(//label[@ficlabel='ACNT_BeneficiaryDetails.label'])[1]")
	 private WebElement beneficiaryDetailsTabInfo;
	
	@FindBy(xpath="(//i[@class=' icon-transaction-add iconinline'])[2]")
	 private WebElement beneficiaryAddIcon;

	@FindBy(xpath="//input[@name='tempData.beneficiaryName']")
	 private WebElement identityCard;

	@FindBy(xpath="//input[@name='tempData.beneficiaryName']")
	 private WebElement firstName;

	@FindBy(xpath="//input[@name='tempData.beneficiaryFatherLastName']")
	 private WebElement lastName;

	@FindBy(xpath="//input[@name='tempData.beneficiaryMotherLastName']")
	 private WebElement motherLastName;


	@FindBy(xpath="//input[@name='tempData.beneficiaryDOB']")
	 private WebElement birthdate;


	@FindBy(xpath="//input[@name='tempData.benRelDesc']")
	 private WebElement beneficiaryRelationship;


	@FindBy(xpath="//input[@name='tempData.beneficiaryPercentage']")
	 private WebElement percentageOfTheBeneficiary;

	@FindBy(xpath="//button[@ficlabel='FICUW_save.label']")
	 private WebElement beneficiarySaveBtn;
	
	
	@FindBy(xpath="//label[@ficlabel='ACNT_Confirm.button']")
	 private WebElement conformBtn;
	
	@FindBy(xpath="(//i[@class=' icon-transaction-delete iconblock'])[1]")
	 private WebElement addressDltBtn;
	
	@FindBy(xpath="(//i[@class=' icon-transaction-delete iconblock'])[5]")
	 private WebElement beneficiaryDltBtn;
	
	@FindBy(xpath="(//i[@class=' icon-transaction-delete iconblock'])[4]")
	 private WebElement beneficiaryDltBtn1;
	
	@FindBy(how=How.XPATH,using="//input[@id='nttdataLogo']")
	private WebElement afcLogo;



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public AffliateMaintanceTransactionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public AffliateMaintanceTransactionPage numberOfRut(String Rut)
	  {
		waitForWebElementPresent(rutNumber, getTimeOut());
		mouseClickByWebElement(rutNumber);
		clear(rutNumber, Rut);
		enterValueInFieldInput(rutNumber, Rut);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterPaternalSurname(String Peternal)
	  {
		waitForWebElementPresent(paternalSurname, getTimeOut());
		mouseClickByWebElement(paternalSurname);
		clear(paternalSurname, Peternal);
		enterValueInFieldInput(paternalSurname, Peternal);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterMotherSurname(String mother)
	  {
		waitForWebElementPresent(maternalSurname, getTimeOut());
		mouseClickByWebElement(maternalSurname);
		clear(maternalSurname, mother);
		enterValueInFieldInput(maternalSurname, mother);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterName(String Name)
	  {
		waitForWebElementPresent(name, getTimeOut());
		mouseClickByWebElement(name);
		clear(name, Name);
		enterValueInFieldInput(name, Name);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterDob(String dob) throws Exception
	  {
		waitfor5sec();
		waitForWebElementPresent(birthFetcha, getTimeOut());
		mouseClickByWebElement(birthFetcha);
		clear(birthFetcha, dob);
		enterValueInFieldInput(birthFetcha, dob);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage selectCivilStatus(String MaritialStatus)
	  {
		waitForWebElementPresent(civilStatus,getTimeOut());
		mouseClickByWebElement(civilStatus);
		selectDropDown(civilStatus,MaritialStatus , getTimeOut());
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterAffilatesIdentityValidation(String identity) throws Exception
	  {
		waitForWebElementPresent(affiliateIdentityValidation, getTimeOut());
		mouseClickByWebElement(affiliateIdentityValidation);
		clear(affiliateIdentityValidation, identity);
		enterValueInFieldInput(affiliateIdentityValidation, identity);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterCountyOfBirth(String country) throws Exception
	  {
		waitForWebElementPresent(birthCountry, getTimeOut());
		mouseClickByWebElement(birthCountry);
		clear(birthCountry, country);
		enterValueInFieldInput(birthCountry, country);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait2sec();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterRegionofBirth(String Region) throws Exception
	  {
		//waitfor5sec();
		waitForWebElementPresent(regionofBirth, getTimeOut());
		mouseClickByWebElement(regionofBirth);
		clear(regionofBirth, Region);
		enterValueInFieldInput(regionofBirth, Region);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterProvinceofBirth(String Province) throws Exception
	  {
		waitForWebElementPresent(provinceofBirth, getTimeOut());
		mouseClickByWebElement(provinceofBirth);
		clear(provinceofBirth, Province);
		enterValueInFieldInput(provinceofBirth, Province);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterBirthPlace(String BirthPlace) throws Exception
	  {
		waitForWebElementPresent(birthPlace, getTimeOut());
		mouseClickByWebElement(birthPlace);
		clear(birthPlace, BirthPlace);
		enterValueInFieldInput(birthPlace, BirthPlace);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterEducationLevel(String Education) throws Exception
	  {
		waitForWebElementPresent(educationLevel, getTimeOut());
		mouseClickByWebElement(educationLevel);
		clear(educationLevel, Education);
		enterValueInFieldInput(educationLevel, Education);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterYearsApproved(String yearsAproved)
	  {
		waitForWebElementPresent(yearsApproved, getTimeOut());
		mouseClickByWebElement(yearsApproved);
		clear(yearsApproved, yearsAproved);
		enterValueInFieldInput(yearsApproved, yearsAproved);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterNoOfFamilyCharges(String FamilyCharges)
	  {
		waitForWebElementPresent(familyCharges, getTimeOut());
		mouseClickByWebElement(familyCharges);
		clear(familyCharges, FamilyCharges);
		enterValueInFieldInput(familyCharges, FamilyCharges);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterTypeOfForecast(String forecast) throws Exception
	  {
		waitForWebElementPresent(typeOfForecast, getTimeOut());
		mouseClickByWebElement(typeOfForecast);
		clear(typeOfForecast, forecast);
		enterValueInFieldInput(typeOfForecast, forecast);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterAFPActual(String actual) throws Exception
	  {
		waitForWebElementPresent(afpActual, getTimeOut());
		mouseClickByWebElement(afpActual);
		clear(afpActual, actual);
		enterValueInFieldInput(afpActual, actual);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	
	public AffliateMaintanceTransactionPage selectCodeByEmail(String codeEmail)
	  {
		waitForWebElementPresent(codeByEmail,getTimeOut());
		mouseClickByWebElement(codeByEmail);
		//selectDropDown(codeByEmail,codeEmail , getTimeOut());
		clear(codeByEmail, codeEmail);
		enterValueInFieldInput(codeByEmail, codeEmail);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage selectOriginByEmail(String originEmail) throws Exception
	  {

		waitForWebElementPresent(originByEmail, getTimeOut());
		mouseClickByWebElement(originByEmail);
		clear(originByEmail, originEmail);
		enterValueInFieldInput(originByEmail, originEmail);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterDateByEmail(String dateEmail) throws Exception
	  {
		wait2sec();
		waitForWebElementPresent(dateByEmail, getTimeOut());
		mouseClickByWebElement(dateByEmail);
		clear(dateByEmail, dateEmail);
		enterValueInFieldInput(dateByEmail, dateEmail);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	
	public AffliateMaintanceTransactionPage clickOnAffilatesControlDataTab()
	{
		waitForWebElementPresent(affiliateControlDataTab, getTimeOut());
		scrollToWebElement(affiliateControlDataTab);
		waitForElementToBeClickable(affiliateControlDataTab, getTimeOut());
		_clickUsingJavaScript(affiliateControlDataTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);
	}
	
	public AffliateMaintanceTransactionPage enterSubsriptionDate(String subdate) throws Exception
	  {
		waitfor5sec();
		waitForWebElementPresent(subsriptionDate, getTimeOut());
		mouseClickByWebElement(subsriptionDate);
		clear(subsriptionDate, subdate);
		enterValueInFieldInput(subsriptionDate, subdate);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterMembershipDate(String memberdate) throws Exception
	  {
		//typeOfAffilation
		waitfor5sec();
		waitForWebElementPresent(membershipDate, getTimeOut());
		mouseClickByWebElement(membershipDate);
		clear(membershipDate, memberdate);
		enterValueInFieldInput(membershipDate, memberdate);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterAffilateStatus(String status) throws Exception
	  {
		waitForWebElementPresent(affiliateStatus, getTimeOut());
		mouseClickByWebElement(affiliateStatus);
		clear(affiliateStatus, status);
		enterValueInFieldInput(affiliateStatus, status);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	public AffliateMaintanceTransactionPage enterAffilateType(String typeAffilate) throws Exception
	  {
		waitForWebElementPresent(typeOfAffilation, getTimeOut());
		mouseClickByWebElement(typeOfAffilation);
		clear(typeOfAffilation, typeAffilate);
		enterValueInFieldInput(typeOfAffilation, typeAffilate);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	//typeOfPension
	
	public AffliateMaintanceTransactionPage entertypePensionType(String typePension) throws Exception
	  {
		waitForWebElementPresent(typeOfPension, getTimeOut());
		mouseClickByWebElement(typeOfPension);
		clear(typeOfPension, typePension);
		enterValueInFieldInput(typeOfPension, typePension);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterDateOfDeath(String DateOfDeath) throws Exception
	  {
		//typeOfAffilation
		waitfor5sec();
	    waitForWebElementPresent(dateOfDeath, getTimeOut());
		mouseClickByWebElement(dateOfDeath);
		clear(dateOfDeath, DateOfDeath);
		enterValueInFieldInput(dateOfDeath, DateOfDeath);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	
	
	
	public AffliateMaintanceTransactionPage enterPensionedState(String PensionedState) throws Exception
	  {
		waitForWebElementPresent(sourceCdeDeceasedPensionedState, getTimeOut());
		mouseClickByWebElement(sourceCdeDeceasedPensionedState);
		clear(sourceCdeDeceasedPensionedState, PensionedState);
		enterValueInFieldInput(sourceCdeDeceasedPensionedState, PensionedState);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	public AffliateMaintanceTransactionPage enterStateOfDeathOriginCodeDeceased(String StateOfDeath) throws Exception
	  {
		waitForWebElementPresent(StateofdeathOriginCodeDeceased, getTimeOut());
		mouseClickByWebElement(StateofdeathOriginCodeDeceased);
		clear(StateofdeathOriginCodeDeceased, StateOfDeath);
		enterValueInFieldInput(StateofdeathOriginCodeDeceased, StateOfDeath);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	public AffliateMaintanceTransactionPage enterAccountEliminationClaimNumber(String claimNo)
	  {
		waitForWebElementPresent(accountEliminationClaimNumber, getTimeOut());
		mouseClickByWebElement(accountEliminationClaimNumber);
		clear(accountEliminationClaimNumber, claimNo);
		enterValueInFieldInput(accountEliminationClaimNumber, claimNo);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterAccountDeletionCause(String cause) throws Exception
	  {
		waitForWebElementPresent(accountDeletionCause, getTimeOut());
		mouseClickByWebElement(accountDeletionCause);
		clear(accountDeletionCause, cause);
		enterValueInFieldInput(accountDeletionCause, cause);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class); 
	  }
	
	public AffliateMaintanceTransactionPage enterAccountLockoutCode(String lockCode) throws Exception
	  {
		waitForWebElementPresent(accountLockoutCode, getTimeOut());
		mouseClickByWebElement(accountLockoutCode);
		clear(accountLockoutCode, lockCode);
		enterValueInFieldInput(accountLockoutCode, lockCode);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class); 
	  }
	//percentageofJudicialWithholding
	public AffliateMaintanceTransactionPage enterpercentageOfJudicialWithholding(String percentageJudicialWithholding) throws Exception
	  {
		waitForWebElementPresent(percentageofJudicialWithholding, getTimeOut());
		mouseClickByWebElement(percentageofJudicialWithholding);
		clear(percentageofJudicialWithholding, percentageJudicialWithholding);
		enterValueInFieldInput(percentageofJudicialWithholding, percentageJudicialWithholding);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class); 
	  }
	
	
	public AffliateMaintanceTransactionPage clickOnAffilateAddressDetailsTab()
	{
		waitForWebElementPresent(affiliateAddressDetailsTab, getTimeOut());
		scrollToWebElement(affiliateAddressDetailsTab);
		waitForElementToBeClickable(affiliateAddressDetailsTab, getTimeOut());
		_clickUsingJavaScript(affiliateAddressDetailsTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);
	}
	
	public AffliateMaintanceTransactionPage selectPurpose(String Purpose)
	  {
		waitForWebElementPresent(purpose,getTimeOut());
		mouseClickByWebElement(purpose);
		selectDropDown(purpose,Purpose , getTimeOut());
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterPostalCode(String PostalCode)
	  {
		waitForWebElementPresent(postalCode, getTimeOut());
		mouseClickByWebElement(postalCode);
		clear(postalCode, PostalCode);
		enterValueInFieldInput(postalCode, PostalCode);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterAddress(String Address)
	  {
		waitForWebElementPresent(address, getTimeOut());
		mouseClickByWebElement(address);
		clear(address, Address);
		enterValueInFieldInput(address, Address);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterCounty(String Country) throws Exception
	  {
		waitForWebElementPresent(country, getTimeOut());
		mouseClickByWebElement(country);
		clear(country, Country);
		enterValueInFieldInput(country, Country);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait2sec();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterRegion(String Region) throws Exception
	  {
		//waitfor5sec();
		waitForWebElementPresent(region, getTimeOut());
		mouseClickByWebElement(region);
		clear(region, Region);
		enterValueInFieldInput(region, Region);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterProvince(String Province) throws Exception
	  {
		waitForWebElementPresent(province, getTimeOut());
		mouseClickByWebElement(province);
		clear(province, Province);
		enterValueInFieldInput(province, Province);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterCommune(String BirthPlace) throws Exception
	  {
		waitForWebElementPresent(commune, getTimeOut());
		mouseClickByWebElement(commune);
		clear(commune, BirthPlace);
		enterValueInFieldInput(commune, BirthPlace);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage selectAddressVerificationStatus(String VerificationStatus)
	  {
		waitForWebElementPresent(addressVerificationStatus,getTimeOut());
		mouseClickByWebElement(addressVerificationStatus);
		selectDropDown(addressVerificationStatus,VerificationStatus , getTimeOut());
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterEmail(String Email)
	  {
		waitForWebElementPresent(email, getTimeOut());
		scrollToWebElement(email);
		mouseClickByWebElement(email);
		clear(email, Email);
		enterValueInFieldInput(email, Email);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage clickOnAddressSaveBtn() 
	{
		waitForWebElementPresent(addressSaveBtn, getTimeOut());
		scrollToWebElement(addressSaveBtn);
		waitForElementToBeClickable(addressSaveBtn, getTimeOut());
		_clickUsingJavaScript(addressSaveBtn);
		//_waitForPageLoad();
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	
	public AffliateMaintanceTransactionPage clickOnAffilatesBankingInfoTab()
	{
		waitForWebElementPresent(affiliateBankingInfoTab, getTimeOut());
		scrollToWebElement(affiliateBankingInfoTab);
		waitForElementToBeClickable(affiliateBankingInfoTab, getTimeOut());
		_clickUsingJavaScript(affiliateBankingInfoTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);
	}
	
	
	public AffilatesCreateRequestPage clickonBankingAddIcon() throws Exception 
	{
		waitForWebElementPresent(bankingAddIcon, getTimeOut());
		scrollToWebElement(bankingAddIcon);
		waitForElementToBeClickable(bankingAddIcon, getTimeOut());
		_clickUsingJavaScript(bankingAddIcon);
		waitfor5sec();
		Thread.sleep(2000);
		_waitForPageLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);
		
	}
	
	public AffliateMaintanceTransactionPage enterBank(String Bank) throws Exception
	  {
		waitForWebElementPresent(bank, getTimeOut());
		mouseClickByWebElement(bank);
		clear(bank, Bank);
		enterValueInFieldInput(bank, Bank);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterBankAccountType(String AccountType) throws Exception
	  {
		waitForWebElementPresent(bankAccountType, getTimeOut());
		mouseClickByWebElement(bankAccountType);
		clear(bankAccountType, AccountType);
		enterValueInFieldInput(bankAccountType, AccountType);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterAccountNumber(String AccountNo)
	  {
		waitForWebElementPresent(accountNumber, getTimeOut());
		mouseClickByWebElement(accountNumber);
		clear(accountNumber, AccountNo);
		enterValueInFieldInput(accountNumber, AccountNo);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterpaymentMethod(String PaymentMethod) throws Exception
	  {
		waitForWebElementPresent(paymentMethod, getTimeOut());
		mouseClickByWebElement(paymentMethod);
		clear(paymentMethod, PaymentMethod);
		enterValueInFieldInput(paymentMethod, PaymentMethod);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	
	public AffliateMaintanceTransactionPage clickOnBankingInfoSaveBtn() 
	{
		waitForWebElementPresent(bankingInfoSaveBtn, getTimeOut());
		scrollToWebElement(bankingInfoSaveBtn);
		waitForElementToBeClickable(bankingInfoSaveBtn, getTimeOut());
		_clickUsingJavaScript(bankingInfoSaveBtn);
		//_waitForPageLoad();
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage clickOnBeneficiaryInfoTab()
	{
		waitForWebElementPresent(beneficiaryDetailsTabInfo, getTimeOut());
		scrollToWebElement(beneficiaryDetailsTabInfo);
		waitForElementToBeClickable(beneficiaryDetailsTabInfo, getTimeOut());
		_clickUsingJavaScript(beneficiaryDetailsTabInfo);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);
	}
	
	public AffilatesCreateRequestPage clickonBeneficiaryAddIcon() throws Exception 
	{
		waitForWebElementPresent(beneficiaryAddIcon, getTimeOut());
		scrollToWebElement(beneficiaryAddIcon);
		waitForElementToBeClickable(beneficiaryAddIcon, getTimeOut());
		_clickUsingJavaScript(beneficiaryAddIcon);
		waitfor5sec();
		Thread.sleep(2000);
		_waitForPageLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);
		
	}
	
	public AffliateMaintanceTransactionPage enterBeneficiaryRutNo(String BeneficiaryRut)
	  {
		waitForWebElementPresent(identityCard, getTimeOut());
		mouseClickByWebElement(identityCard);
		clear(identityCard, BeneficiaryRut);
		enterValueInFieldInput(identityCard, BeneficiaryRut);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterBneficiaryFirstName(String FirstName)
	  {
		waitForWebElementPresent(firstName, getTimeOut());
		mouseClickByWebElement(firstName);
		clear(firstName, FirstName);
		enterValueInFieldInput(firstName, FirstName);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterBneficiaryLastName(String LastName)
	  {
		waitForWebElementPresent(lastName, getTimeOut());
		mouseClickByWebElement(lastName);
		clear(lastName, LastName);
		enterValueInFieldInput(lastName, LastName);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterBneficiaryMothersLastName(String MotherLastName)
	  {
		waitForWebElementPresent(motherLastName, getTimeOut());
		mouseClickByWebElement(motherLastName);
		clear(motherLastName, MotherLastName);
		enterValueInFieldInput(motherLastName, MotherLastName);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterBeneficiaryDob(String Beneficiarydob) throws Exception
	  {
		waitfor5sec();
		waitForWebElementPresent(birthdate, getTimeOut());
		mouseClickByWebElement(birthdate);
		clear(birthdate, Beneficiarydob);
		enterValueInFieldInput(birthdate, Beneficiarydob);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterBeneficiaryRelationShip(String relationShip) throws Exception
	  {
		waitForWebElementPresent(beneficiaryRelationship, getTimeOut());
		mouseClickByWebElement(beneficiaryRelationship);
		clear(beneficiaryRelationship, relationShip);
		enterValueInFieldInput(beneficiaryRelationship, relationShip);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage enterBneficiaryPercentage(String percentage)
	  {
		waitForWebElementPresent(percentageOfTheBeneficiary, getTimeOut());
		mouseClickByWebElement(percentageOfTheBeneficiary);
		clear(percentageOfTheBeneficiary, percentage);
		enterValueInFieldInput(percentageOfTheBeneficiary, percentage);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	//beneficiarySaveBtn
	
	public AffliateMaintanceTransactionPage clickOnBeneficiarySaveBtn() 
	{
		waitForWebElementPresent(beneficiarySaveBtn, getTimeOut());
		scrollToWebElement(beneficiarySaveBtn);
		waitForElementToBeClickable(beneficiarySaveBtn, getTimeOut());
		_clickUsingJavaScript(beneficiarySaveBtn);
		//_waitForPageLoad();
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage clickonConformBtn() throws Exception 
	{
		//waitForWebElementPresent(saveBtn, getTimeOut());
		waitForWebElementPresent(conformBtn, getTimeOut());
		scrollToWebElement(conformBtn);
		waitForElementToBeClickable(conformBtn, getTimeOut());
		waitfor5sec();
		_clickUsingJavaScript(conformBtn);
		waitfor5sec();
		WebDriverWait wait=WebDriverWait(driver,10);
		String closeButton="//div/button[text()='OK']";
		driver.findElement(By.xpath(closeButton)).click();
		_waitForPageLoad();
		waitfor5sec();
		//Thread.sleep(10000);
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);
		
	}

	private WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	public AffliateMaintanceTransactionPage clickOnAddressDltBtn()
	  {
		  waitForWebElementPresent(addressDltBtn, getTimeOut());
			mouseClickByWebElement(addressDltBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	
	public AffliateMaintanceTransactionPage clickOnBeneficiaryDltBtn()
	  {
		  waitForWebElementPresent(beneficiaryDltBtn, getTimeOut());
			mouseClickByWebElement(beneficiaryDltBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	
	public AffliateMaintanceTransactionPage clickOnBeneficiaryDltBtn1()
	  {
		  waitForWebElementPresent(beneficiaryDltBtn1, getTimeOut());
			mouseClickByWebElement(beneficiaryDltBtn1);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	
	
	public DashboardPage clickonAFCLogo() throws Exception
	{
		waitForWebElementPresent(afcLogo, getTimeOut());
		waitForElementToBeClickable(afcLogo, getTimeOut());
		_clickUsingJavaScript(afcLogo);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, DashboardPage.class);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
