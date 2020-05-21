package com.afc.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class EmployerNotificationCreationManualyPage extends AfcDriverHelper{

	@FindBy(how=How.XPATH, using="//button[@ficlabel='PARTY_GenAppID.label']")
	private WebElement generateBtn;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.partyID']")
	private WebElement numberOfRut;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.name.middleName']")
	private WebElement paternalSurname;

	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.name.lastName']")
	private WebElement motherSurname;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.name.firstName']")
	private WebElement name;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.DOB']")
	private WebElement birthFetcha;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.individualTO.sex'])[2]")
	private WebElement gender;
	
	@FindBy(how=How.XPATH, using="//select[@name='paRequestTO.individualTO.maritalStatus']")
	private WebElement maritalStatus;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.birthCountryDesc']")
	private WebElement countryofBirth;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.regionDesc'])[2]")
	private WebElement regionofBirth;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.provinceDesc'])[2]")
	private WebElement provinceofBirth;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.individualTO.birthCityDesc'])[2]")
	private WebElement birthPlace;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.pensionTypeDesc']")
	private WebElement typeofPension;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='ACNT.Address_Information.label']")
	private WebElement addressInfoTab;
	
	@FindBy(how=How.XPATH, using="//select[@name='addresspurpose']")
	private WebElement purpose;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.zipNumber']")
	private WebElement postalCode;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.line1']")
	private WebElement address;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.countryDesc']")
	private WebElement country;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.stateDesc']")
	private WebElement region;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.districtDesc']")
	private WebElement province;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.cityDesc']")
	private WebElement commune;
	//
	@FindBy(how=How.XPATH, using="//input[@name='tempData.matchCode']")
	private WebElement homePhone;
	
	@FindBy(how=How.XPATH, using="//button[@ficlabel='PARTY_Save.label ']")
	private WebElement addressSaveBtn;
	
	@FindBy(how=How.XPATH, using="(//label[@ficlabel='ACNT_LabourCotract.label'])[1]")
	private WebElement wrkConrctTab;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.name.fullName']")
	private WebElement legalName;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.contractTypeDesc']")
	private WebElement typeOfContact;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.joiningDT']")
	private WebElement workStartDate;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.noOfHrsForWeeklyWork']")
	private WebElement workingHr;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.taxableIncome']")
	private WebElement taxIncome;
	
	
	@FindBy(how=How.XPATH, using="(//input[@name='paRequestTO.paCorporateTO.partyID'])[2]")
	private WebElement employerRUT;
	
	@FindBy(how=How.XPATH, using="(//label[@ficlabel='ACNT_ControlDataOfEmpNotification.label'])[1]")
	private WebElement employerNotificationTab;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.affiliationTypeDesc']")
	private WebElement typeOfAffilatation;

	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.individualTO.paAcntAdditionalDetailsVO.previsionTypeDesc']")
	private WebElement typeofForecast;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='Submit']")
	private WebElement saveBtn;
	
	@FindBy(how=How.XPATH,using="//input[@id='nttdataLogo']")
	private WebElement afcLogo;
	
	
	
	
	
	
	
	public EmployerNotificationCreationManualyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public EmployerNotificationCreationManualyPage clickonGenerateBtn() throws Exception 
	{
		waitForWebElementPresent(generateBtn, getTimeOut());
		scrollToWebElement(generateBtn);
		waitForElementToBeClickable(generateBtn, getTimeOut());
		_clickUsingJavaScript(generateBtn);
		waitfor5sec();
		//Thread.sleep(2000);
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);
		
	}
	
	
	public EmployerNotificationCreationManualyPage enterNumberOfRut(String Rut)
	  {
		waitForWebElementPresent(numberOfRut, getTimeOut());
		mouseClickByWebElement(numberOfRut);
		clear(numberOfRut, Rut);
		enterValueInFieldInput(numberOfRut, Rut);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterPaternalSurname(String Paternal)
	  {
		waitForWebElementPresent(paternalSurname, getTimeOut());
		mouseClickByWebElement(paternalSurname);
		clear(paternalSurname, Paternal);
		enterValueInFieldInput(paternalSurname, Paternal);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }


	public EmployerNotificationCreationManualyPage enterMotherSurname(String Mother)
	  {
		waitForWebElementPresent(motherSurname, getTimeOut());
		mouseClickByWebElement(motherSurname);
		clear(motherSurname, Mother);
		enterValueInFieldInput(motherSurname, Mother);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterName(String Name)
	  {
		waitForWebElementPresent(name, getTimeOut());
		mouseClickByWebElement(name);
		clear(name, Name);
		enterValueInFieldInput(name, Name);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterDob(String dob) throws Exception
	  {
		waitfor5sec();
		waitForWebElementPresent(birthFetcha, getTimeOut());
		mouseClickByWebElement(birthFetcha);
		clear(birthFetcha, dob);
		enterValueInFieldInput(birthFetcha, dob);
		waitfor5sec();
		_waitForPageLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage selectMaritalStatus (String MaritialStatus)
	  {
		waitForWebElementPresent(maritalStatus,getTimeOut());
		mouseClickByWebElement(maritalStatus);
		selectDropDown(maritalStatus,MaritialStatus , getTimeOut());
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterCountyOfBirth(String Country) throws Exception
	  {
		waitForWebElementPresent(countryofBirth, getTimeOut());
		mouseClickByWebElement(countryofBirth);
		clear(countryofBirth, Country);
		enterValueInFieldInput(countryofBirth, Country);
		//waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait2sec();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterRegionofBirth(String Region) throws Exception
	  {
		waitfor5sec();
		waitForWebElementPresent(regionofBirth, getTimeOut());
		mouseClickByWebElement(regionofBirth);
		clear(regionofBirth, Region);
		enterValueInFieldInput(regionofBirth, Region);
		//waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	
	public EmployerNotificationCreationManualyPage enterProvinceofBirth (String Province) throws Exception
	  {
		waitForWebElementPresent(provinceofBirth, getTimeOut());
		mouseClickByWebElement(provinceofBirth);
		clear(provinceofBirth, Province);
		enterValueInFieldInput(provinceofBirth, Province);
		//waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterBirthPlace (String BirthPlace) throws Exception
	  {
		waitForWebElementPresent(birthPlace, getTimeOut());
		mouseClickByWebElement(birthPlace);
		clear(birthPlace, BirthPlace);
		enterValueInFieldInput(birthPlace, BirthPlace);
		//waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterTyepOfPension(String Pension) throws Exception
	  {
		waitForWebElementPresent(typeofPension, getTimeOut());
		mouseClickByWebElement(typeofPension);
		clear(typeofPension, Pension);
		enterValueInFieldInput(typeofPension, Pension);
		//waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	

	public EmployerNotificationCreationManualyPage clickOnAddressInfoTab()
	{
		waitForWebElementPresent(addressInfoTab, getTimeOut());
		scrollToWebElement(addressInfoTab);
		waitForElementToBeClickable(addressInfoTab, getTimeOut());
		_clickUsingJavaScript(addressInfoTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);
	}
	
	
	public EmployerNotificationCreationManualyPage selectPurpose(String Purpose) throws Exception
	  {
		waitForWebElementPresent(purpose,getTimeOut());
		mouseClickByWebElement(purpose);
		selectDropDown(purpose,Purpose , getTimeOut());
		wait2sec();
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	
	public EmployerNotificationCreationManualyPage enterPostalCode(String Postalcode)
	  {
		waitForWebElementPresent(postalCode, getTimeOut());
		mouseClickByWebElement(postalCode);
		clear(postalCode, Postalcode);
		enterValueInFieldInput(postalCode, Postalcode);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterAddress(String Address)
	  {
		waitForWebElementPresent(address, getTimeOut());
		mouseClickByWebElement(address);
		clear(address, Address);
		enterValueInFieldInput(address, Address);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterCounty(String Country) throws Exception
	  {
		waitForWebElementPresent(country, getTimeOut());
		mouseClickByWebElement(country);
		clear(country, Country);
		enterValueInFieldInput(country, Country);
		//waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait2sec();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterRegion(String Region) throws Exception
	  {
		waitfor5sec();
		waitForWebElementPresent(region, getTimeOut());
		mouseClickByWebElement(region);
		clear(region, Region);
		enterValueInFieldInput(region, Region);
		//waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterProvince(String Province) throws Exception
	  {
		waitForWebElementPresent(province, getTimeOut());
		mouseClickByWebElement(province);
		clear(province, Province);
		enterValueInFieldInput(province, Province);
		//waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterCommune(String Commune) throws Exception
	  {
		waitForWebElementPresent(commune, getTimeOut());
		mouseClickByWebElement(commune);
		clear(commune, Commune);
		enterValueInFieldInput(commune, Commune);
		//waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	
	public EmployerNotificationCreationManualyPage clickOnAddressSaveBtn()
	  {
		//homePhone
		waitForWebElementPresent(homePhone, getTimeOut());
		scrollToWebElement(homePhone);
		waitForWebElementPresent(addressSaveBtn, getTimeOut());
		scrollToWebElement(addressSaveBtn);
		waitForElementToBeClickable(addressSaveBtn, getTimeOut());
		_clickUsingJavaScript(addressSaveBtn);
		//_waitForPageLoad();
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	
	public EmployerNotificationCreationManualyPage clickOnWorkContractTab()
	{
		waitForWebElementPresent(wrkConrctTab, getTimeOut());
		scrollToWebElement(wrkConrctTab);
		waitForElementToBeClickable(wrkConrctTab, getTimeOut());
		_clickUsingJavaScript(wrkConrctTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);
	}
	
	public EmployerNotificationCreationManualyPage enterLegalName(String LegalName) throws Exception
	  {
		waitForWebElementPresent(legalName, getTimeOut());
		mouseClickByWebElement(legalName);
		clear(legalName, LegalName);
		enterValueInFieldInput(legalName, LegalName);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait2sec();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterTypeOfContract(String contract) throws Exception
	  {
		waitfor5sec();
		waitForWebElementPresent(typeOfContact, getTimeOut());
		mouseClickByWebElement(typeOfContact);
		clear(typeOfContact, contract);
		enterValueInFieldInput(typeOfContact, contract);
		//waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterWorkstartDate(String startDate) throws Exception
	  {
		waitForWebElementPresent(workStartDate, getTimeOut());
		mouseClickByWebElement(workStartDate);
		clear(workStartDate, startDate);
		enterValueInFieldInput(workStartDate, startDate);
		waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterWorkingHr(String workinghr) throws Exception
	  {
		waitForWebElementPresent(workingHr, getTimeOut());
		mouseClickByWebElement(workingHr);
		clear(workingHr, workinghr);
		enterValueInFieldInput(workingHr, workinghr);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage enterTaxIncome(String tax) throws Exception
	  {
		waitForWebElementPresent(taxIncome, getTimeOut());
		mouseClickByWebElement(taxIncome);
		clear(taxIncome, tax);
		enterValueInFieldInput(taxIncome, tax);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	
	
	
	public EmployerNotificationCreationManualyPage clickOnEmployerNotificationTab()
	{
		waitForWebElementPresent(employerNotificationTab, getTimeOut());
		scrollToWebElement(employerNotificationTab);
		waitForElementToBeClickable(employerNotificationTab, getTimeOut());
		_clickUsingJavaScript(employerNotificationTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);
	}
	
	
	public EmployerNotificationCreationManualyPage enterTypeOfAffilation(String Affilation) throws Exception
	  {
		waitForWebElementPresent(typeOfAffilatation, getTimeOut());
		mouseClickByWebElement(typeOfAffilatation);
		clear(typeOfAffilatation, Affilation);
		enterValueInFieldInput(typeOfAffilatation, Affilation);
		//waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	
	public EmployerNotificationCreationManualyPage enterTypeOfForecast(String Forecast) throws Exception
	  {
		waitForWebElementPresent(typeofForecast, getTimeOut());
		mouseClickByWebElement(typeofForecast);
		clear(typeofForecast, Forecast);
		enterValueInFieldInput(typeofForecast, Forecast);
		//waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
	  }
	
	public EmployerNotificationCreationManualyPage clickOnSaveBtn()
	  {
		waitForWebElementPresent(saveBtn, getTimeOut());
		scrollToWebElement(saveBtn);
		waitForElementToBeClickable(saveBtn, getTimeOut());
		_clickUsingJavaScript(saveBtn);
		//_waitForPageLoad();
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);  
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
