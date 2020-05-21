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

public class AffilatesCreateRequestPage extends AfcDriverHelper {
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.partyID']")
	private WebElement numberofRUT;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.name.middleName']")
	private WebElement paternalSurname;
	
	
	@FindBy(how=How.XPATH, using=" //input[@name='paRequestTO.individualTO.name.lastName']")
	private WebElement motherSurname;
	
	
	@FindBy(how=How.XPATH, using=" //input[@name='paRequestTO.individualTO.name.firstName']")
	private WebElement name;
	
	
	@FindBy(how=How.XPATH, using=" //input[@name='paRequestTO.individualTO.DOB']")
	private WebElement birthFetcha;
	 
	
	@FindBy(how=How.XPATH, using="( //input[@name='paRequestTO.individualTO.sex'])[2]")
	private WebElement gender;
	
	
	@FindBy(how=How.XPATH, using="//select[@name='paRequestTO.individualTO.maritalStatus']")
	private WebElement maritalStatus;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.affiliateIdentityValidationDesc']")
	private WebElement affiliateIdentityValidation;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.birthCountryDesc']")
	private WebElement countryofBirth;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.regionDesc'])[1]")
	private WebElement regionofBirth;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.provinceDesc'])[1]")
	private WebElement provinceofBirth;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.individualTO.birthCityDesc'])[1]")
	private WebElement birthPlace;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.educationCodeDesc']")
	private WebElement educationLevel;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.freeText8']")
	private WebElement yearsApproved;
	
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.numberOfDependentOthers']")
	private WebElement familyCharges;
	
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.numberOfDependentOthers']")
	private WebElement birthplace;
	
	
	@FindBy(how=How.XPATH, using="//select[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.stateOfAuthEmail']")
	private WebElement codebyEmail;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='ACNT_addressOfAffiliate.label']")
	private WebElement affilateInfoTab;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.addresses[0].line1']")
	private WebElement currentAddress;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.addresses[0].line2']")
	private WebElement other;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.addresses[0].line3']")
	private WebElement number;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.addresses[0].countryDesc']")
	private WebElement country;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.individualTO.addresses[0].stateDesc'])[2]")
	private WebElement region;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.individualTO.addresses[0].districtDesc'])[2]")
	private WebElement province;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.individualTO.addresses[0].cityDesc'])[2]")
	private WebElement commune;
	
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.addresses[0].zipNumber']")
	private WebElement postalCode;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.addresses[0].geoCode']")
	private WebElement postcardhunt;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.addresses[0].line4']")
	private WebElement mail;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.handPhones[0].phoneNo1']")
	private WebElement telephoneCode;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.handPhones[0].phone']")
	private WebElement phonenumber;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.handPhones[0].phoneNo3']")
	private WebElement telephoneTypeCode;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.addresses[0].email']")
	private WebElement  email;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.emailTypeCodeDesc']")
	private WebElement  emailTypeCode;
	
	@FindBy(how=How.XPATH, using="(//label[@ficlabel='ACNT_BeneficiaryDetails.label'])[1]")
	private WebElement  beneficiaryDetailsTab;
	
	@FindBy(how=How.XPATH, using="( //i[@class=' icon-transaction-add iconinline'])[1]")
	private WebElement  beneficiaryAddIcon;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.beneficiaryName']")
	private WebElement  identityCard;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.benRelDesc']")
	private WebElement  beneficiaryRelation;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.beneficiaryPercentage']")
	private WebElement  beneficiaryPercentage;
	
	@FindBy(how=How.XPATH, using="//button[@ficlabel='FICUW_save.label']")
	private WebElement  beneficiarySaveBtn;
	
	@FindBy(how=How.XPATH, using="(//label[@ficlabel='ACNT_EmployerInfo.label'])[1]")
	private WebElement  employerInfoTab;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.name.fullName']")
	private WebElement  legalName;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='ACNT_AddressDetailsofEmployer.label']")
	private WebElement  employerAddressDetailsTab;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.addresses[0].line1']")
	private WebElement  employerAddress;
	
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.addresses[0].countryDesc']")
	private WebElement  employerCountry;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.paCorporateTO.addresses[0].stateDesc'])[2]")
	private WebElement  employerRegion;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.paCorporateTO.addresses[0].districtDesc'])[2]")
	private WebElement  employerProvince;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.paCorporateTO.addresses[0].cityDesc'])[2]")
	private WebElement  employerCommune;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='ACNT_LaborContractInformation.label']")
	private WebElement  laborContractTab;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.joiningDT']")
	private WebElement  workStartDate;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.contractTypeDesc']")
	private WebElement  typeOfContract;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.noOfHrsForWeeklyWork']")
	private WebElement  weeklyHours;
	
	@FindBy(how=How.XPATH, using="(//label[@ficlabel='ACNT_InformationOfTheRequest.label'])[1]")
	private WebElement  applicationInfoTab;
	
	@FindBy(how=How.XPATH, using="//button[@ficlabel='PARTY_GenAppID.label']")
	private WebElement  generateBtn;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.affiliationTypeDesc']")
	private WebElement  typeOfAffilation;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.subscriptionSourceDesc']")
	private WebElement  subscriptionPlace;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.currentAFPDesc']")
	private WebElement  afpActual;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='Save.Label']")
	private WebElement  saveBtn;
	
	@FindBy(how=How.XPATH,using="//input[@id='nttdataLogo']")
	private WebElement afcLogo;
	
	
	
	
	
	
	
	
	public AffilatesCreateRequestPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public AffilatesCreateRequestPage numberOfRut(String Rut) throws Exception
	  {
		waitForWebElementPresent(numberofRUT, getTimeOut());
		mouseClickByWebElement(numberofRUT);
		clear(numberofRUT, Rut);
		enterValueInFieldInput(numberofRUT, Rut);
		_waitForJStoLoad();
		Thread.sleep(1000);
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterPaternalSurname(String Peternal)
	  {
		waitForWebElementPresent(paternalSurname, getTimeOut());
		mouseClickByWebElement(paternalSurname);
		clear(paternalSurname, Peternal);
		enterValueInFieldInput(paternalSurname, Peternal);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	
	public AffilatesCreateRequestPage enterMotherSurname(String mother)
	  {
		waitForWebElementPresent(motherSurname, getTimeOut());
		mouseClickByWebElement(motherSurname);
		clear(motherSurname, mother);
		enterValueInFieldInput(motherSurname, mother);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterName(String Name)
	  {
		waitForWebElementPresent(name, getTimeOut());
		mouseClickByWebElement(name);
		clear(name, Name);
		enterValueInFieldInput(name, Name);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterDob(String dob) throws Exception
	  {
		waitfor5sec();
		waitForWebElementPresent(birthFetcha, getTimeOut());
		mouseClickByWebElement(birthFetcha);
		clear(birthFetcha, dob);
		enterValueInFieldInput(birthFetcha, dob);
		//waitfor5sec();
		_waitForPageLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage selectMaritalStatus (String MaritialStatus)
	  {
		waitForWebElementPresent(maritalStatus,getTimeOut());
		mouseClickByWebElement(maritalStatus);
		selectDropDown(maritalStatus,MaritialStatus , getTimeOut());
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	
	public AffilatesCreateRequestPage enterAffilatesIdentityValidation(String identity) throws Exception
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
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	
	public AffilatesCreateRequestPage enterCountyOfBirth(String country) throws Exception
	  {
		waitForWebElementPresent(countryofBirth, getTimeOut());
		mouseClickByWebElement(countryofBirth);
		clear(countryofBirth, country);
		enterValueInFieldInput(countryofBirth, country);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait2sec();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterRegionofBirth(String RegionofBirth) throws Exception
	  {
		//waitfor5sec();
		waitForWebElementPresent(regionofBirth, getTimeOut());
		mouseClickByWebElement(regionofBirth);
		clear(regionofBirth, RegionofBirth);
		enterValueInFieldInput(regionofBirth, RegionofBirth);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	
	public AffilatesCreateRequestPage enterProvinceofBirth (String Province) throws Exception
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
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterBirthPlace (String BirthPlace) throws Exception
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
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterEducationLevel(String Education) throws Exception
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
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterYearsApproved(String yearsAproved)
	  {
		waitForWebElementPresent(yearsApproved, getTimeOut());
		mouseClickByWebElement(yearsApproved);
		clear(yearsApproved, yearsAproved);
		enterValueInFieldInput(yearsApproved, yearsAproved);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterNoOfFamilyCharges(String FamilyCharges)
	  {
		waitForWebElementPresent(familyCharges, getTimeOut());
		mouseClickByWebElement(familyCharges);
		clear(familyCharges, FamilyCharges);
		enterValueInFieldInput(familyCharges, FamilyCharges);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage selectCodeByEmail(String codeEmail)
	  {
		waitForWebElementPresent(codebyEmail,getTimeOut());
		mouseClickByWebElement(codebyEmail);
		selectDropDown(codebyEmail,codeEmail , getTimeOut());
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage clickOnAffilatesInformationTab()
	{
		waitForWebElementPresent(affilateInfoTab, getTimeOut());
		scrollToWebElement(affilateInfoTab);
		waitForElementToBeClickable(affilateInfoTab, getTimeOut());
		_clickUsingJavaScript(affilateInfoTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);
	}
	
	public AffilatesCreateRequestPage enterCurrentAddress(String CurrentAddress)
	  {
		waitForWebElementPresent(currentAddress, getTimeOut());
		mouseClickByWebElement(currentAddress);
		clear(currentAddress, CurrentAddress);
		enterValueInFieldInput(currentAddress, CurrentAddress);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	
	public AffilatesCreateRequestPage enterCounty(String Country) throws Exception
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
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterRegion(String Region) throws Exception
	  {
		//waitfor5sec();
		waitForWebElementPresent(region, getTimeOut());
		mouseClickByWebElement(region);
		clear(region, Region);
		enterValueInFieldInput(region, Region);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterProvince(String Province) throws Exception
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
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterCommune(String Commune) throws Exception
	  {
		waitForWebElementPresent(commune, getTimeOut());
		mouseClickByWebElement(commune);
		clear(commune, Commune);
		enterValueInFieldInput(commune, Commune);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage clickOnBeneficiaryTab()
	{
		waitForWebElementPresent(beneficiaryDetailsTab, getTimeOut());
		scrollToWebElement(beneficiaryDetailsTab);
		waitForElementToBeClickable(beneficiaryDetailsTab, getTimeOut());
		_clickUsingJavaScript(beneficiaryDetailsTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);
	}
	
	
	public AffilatesCreateRequestPage clickonbeneficiaryAddIcon() throws Exception 
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
	
	public AffilatesCreateRequestPage enterIdentityCard(String IdentityCard)
	  {
		waitForWebElementPresent(identityCard, getTimeOut());
		mouseClickByWebElement(identityCard);
		clear(identityCard, IdentityCard);
		enterValueInFieldInput(identityCard, IdentityCard);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterBeneficiaryrelationship(String Relationship) throws Exception
	  {
		//beneficiaryRelation
		waitForWebElementPresent(beneficiaryRelation, getTimeOut());
		mouseClickByWebElement(beneficiaryRelation);
		clear(beneficiaryRelation, Relationship);
		enterValueInFieldInput(beneficiaryRelation, Relationship);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterPercentage(String Percentage)
	  {
		waitForWebElementPresent(beneficiaryPercentage, getTimeOut());
		mouseClickByWebElement(beneficiaryPercentage);
		clear(beneficiaryPercentage, Percentage);
		enterValueInFieldInput(beneficiaryPercentage, Percentage);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage clickSaveBtn() 
	{
		waitForWebElementPresent(beneficiarySaveBtn, getTimeOut());
		scrollToWebElement(beneficiarySaveBtn);
		waitForElementToBeClickable(beneficiarySaveBtn, getTimeOut());
		_clickUsingJavaScript(beneficiarySaveBtn);
		//_waitForPageLoad();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);
	}
	
	public AffilatesCreateRequestPage clickOnEmployerInfomationTab()
	{
		waitForWebElementPresent(employerInfoTab, getTimeOut());
		scrollToWebElement(employerInfoTab);
		waitForElementToBeClickable(employerInfoTab, getTimeOut());
		_clickUsingJavaScript(employerInfoTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);
	}
	
	public AffilatesCreateRequestPage enterLegalName(String LegalName) throws Exception
	  {
		waitForWebElementPresent(legalName, getTimeOut());
		mouseClickByWebElement(legalName);
		clear(legalName, LegalName);
		enterValueInFieldInput(legalName, LegalName);
		waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait2sec();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	
	public AffilatesCreateRequestPage clickOnEmployerAddressDetailsTab() throws Exception
	{
		waitfor5sec();
		waitForWebElementPresent(employerAddressDetailsTab, getTimeOut());
		scrollToWebElement(employerAddressDetailsTab);
		waitForElementToBeClickable(employerAddressDetailsTab, getTimeOut());
		_clickUsingJavaScript(employerAddressDetailsTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);
	}
	
	
	
	
	
	public AffilatesCreateRequestPage enterEmployerAddress(String EmployerAddress)
	  {
		waitForWebElementPresent(employerAddress, getTimeOut());
		mouseClickByWebElement(employerAddress);
		clear(employerAddress, EmployerAddress);
		enterValueInFieldInput(employerAddress, EmployerAddress);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	
	
	public AffilatesCreateRequestPage enterEmployerCounty(String Country) throws Exception
	  {
		waitForWebElementPresent(employerCountry, getTimeOut());
		mouseClickByWebElement(employerCountry);
		clear(employerCountry, Country);
		enterValueInFieldInput(employerCountry, Country);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait2sec();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterEmployerRegion(String Region) throws Exception
	  {
		//waitfor5sec();
		waitForWebElementPresent(employerRegion, getTimeOut());
		mouseClickByWebElement(employerRegion);
		clear(employerRegion, Region);
		enterValueInFieldInput(employerRegion, Region);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait2sec();
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterEmployerProvince(String Province) throws Exception
	  {
		//waitfor5sec();
		waitForWebElementPresent(employerProvince, getTimeOut());
		mouseClickByWebElement(employerProvince);
		clear(employerProvince, Province);
		enterValueInFieldInput(employerProvince, Province);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterEmployerCommune(String Commune) throws Exception
	  {
		waitForWebElementPresent(employerCommune, getTimeOut());
		mouseClickByWebElement(employerCommune);
		clear(employerCommune, Commune);
		enterValueInFieldInput(employerCommune, Commune);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	//laborContractTab
	
	public AffilatesCreateRequestPage clickOnLaborContractInfoTab()
	{
		waitForWebElementPresent(laborContractTab, getTimeOut());
		scrollToWebElement(laborContractTab);
		waitForElementToBeClickable(laborContractTab, getTimeOut());
		_clickUsingJavaScript(laborContractTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);
	}
	
	
	public AffilatesCreateRequestPage enterWorkStartDate(String date) throws Exception
	  {
		//waitfor5sec();
		waitForWebElementPresent(workStartDate, getTimeOut());
		mouseClickByWebElement(workStartDate);
		clear(workStartDate, date);
		enterValueInFieldInput(workStartDate, date);
		wait2sec();
		//waitfor5sec();
		_waitForPageLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterTypeOfContract(String Contract) throws Exception
	  {
		waitForWebElementPresent(typeOfContract, getTimeOut());
		mouseClickByWebElement(typeOfContract);
		clear(typeOfContract, Contract);
		enterValueInFieldInput(typeOfContract, Contract);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	public AffilatesCreateRequestPage enterWeeklyHours(String weekHr)
	  {
		waitForWebElementPresent(weeklyHours, getTimeOut());
		mouseClickByWebElement(weeklyHours);
		clear(weeklyHours, weekHr);
		enterValueInFieldInput(weeklyHours, weekHr);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	
	public AffilatesCreateRequestPage clickOnApplicationInfoTab()
	{
		waitForWebElementPresent(applicationInfoTab, getTimeOut());
		scrollToWebElement(applicationInfoTab);
		waitForElementToBeClickable(applicationInfoTab, getTimeOut());
		_clickUsingJavaScript(applicationInfoTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);
	}
	
	

	public AffilatesCreateRequestPage clickonGenerateBtn() throws Exception 
	{
		waitForWebElementPresent(generateBtn, getTimeOut());
		scrollToWebElement(generateBtn);
		waitForElementToBeClickable(generateBtn, getTimeOut());
		_clickUsingJavaScript(generateBtn);
		waitfor5sec();
		//Thread.sleep(2000);
		_waitForPageLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);
		
	}
	
	public AffilatesCreateRequestPage enterTypeOfAffilation(String Affilation) throws Exception
	  {
		waitForWebElementPresent(typeOfAffilation, getTimeOut());
		mouseClickByWebElement(typeOfAffilation);
		clear(typeOfAffilation, Affilation);
		enterValueInFieldInput(typeOfAffilation, Affilation);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterSubscriptionPlace(String Place) throws Exception
	  {
		waitForWebElementPresent(subscriptionPlace, getTimeOut());
		mouseClickByWebElement(subscriptionPlace);
		clear(subscriptionPlace, Place);
		enterValueInFieldInput(subscriptionPlace, Place);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesCreateRequestPage enterAfpActual(String afp) throws Exception
	  {
		waitForWebElementPresent(afpActual, getTimeOut());
		mouseClickByWebElement(afpActual);
		clear(afpActual, afp);
		enterValueInFieldInput(afpActual, afp);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	
	public AffilatesCreateRequestPage clickonConformBtn() throws Exception 
	{
		//waitForWebElementPresent(saveBtn, getTimeOut());
		waitForWebElementPresent(saveBtn, getTimeOut());
		scrollToWebElement(saveBtn);
		waitForElementToBeClickable(saveBtn, getTimeOut());
		waitfor5sec();
		_clickUsingJavaScript(saveBtn);
		waitfor5sec();
		WebDriverWait wait=WebDriverWait(driver,10);
		String closeButton="//div/button[text()='OK']";
		driver.findElement(By.xpath(closeButton)).click();
		_waitForPageLoad();
		waitfor5sec();
		//Thread.sleep(10000);
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);
		
	}
	
	private WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
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
