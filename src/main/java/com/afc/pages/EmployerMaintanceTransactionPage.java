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

public class EmployerMaintanceTransactionPage extends AfcDriverHelper{

	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.partyID']")
	private WebElement employerRut;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.name.fullName']")
	private WebElement companyName;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.campaignDesc']")
	private WebElement code1;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.taxTypeDesc']")
	private WebElement code2;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.natureOfBusinessDesc']")
	private WebElement code3;
	
	@FindBy(how=How.XPATH, using="//select[@name='paRequestTO.paCorporateTO.status']")
	private WebElement employerStatus;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.freeText2']")
	private WebElement employerCreation;
	
	@FindBy(how=How.XPATH, using="(//label[@ficlabel='ACNT_AddressDetailsofEmployer.label'])[1]")
	private WebElement employerAddressDetailsTab;
	
	@FindBy(how=How.XPATH, using="//select[@name='addresspurpose']")
	private WebElement purpose;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.zipNumber']")
	private WebElement postalCode;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.line1']")
	private WebElement address;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.countryDesc']")
	private WebElement country;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.countryDesc']/../span/button/i[@class='icon-login-down-arrow']")
	private WebElement countryCodeArrow;
	
	@FindBy(how=How.XPATH, using="//input[@name='picklistFilter.desc']")
	private WebElement descField;
	
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.stateDesc']")
	private WebElement region;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.districtDesc']")
	private WebElement province;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.cityDesc']")
	private WebElement commune;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.streetName']")
	private WebElement addressVerificationdate;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.matchCode']")
	private WebElement homePhone;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.availableFrom']")
	private WebElement homePhoneVerificationDate;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.emailAdd2']")
	private WebElement callVerificationDate;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.email']")
	private WebElement email;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.availableTo']")
	private WebElement emailVerificationDate;

	
	
	@FindBy(how=How.XPATH, using="(//button[@ficlabel='PARTY_Save.label '])[1]")
	private WebElement addressSaveBtn;
	
	@FindBy(how=How.XPATH, using="(//label[@ficlabel='ACNT_Legal_Representative_Information.title'])[1]")
	private WebElement legalRepresentative;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.parentOffice']")
	private WebElement representiveRut;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.name.lastName']")
	private WebElement lastName;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.name.middleName']")
	private WebElement motherName;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.registrationDate']")
	private WebElement updatedDate;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.orgCodeFunction']")
	private WebElement representativeStatus;
	
	@FindBy(how=How.XPATH, using="(//label[@ficlabel='ACNT_Legal_Successor_Company_Information.title'])[1]")
	private WebElement informationOfTheLegalOfCompanyTab;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.reportingParent']")
	private WebElement legalAdvisorRut;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.gstRegDate']")
	private WebElement establishedDate;
	
	@FindBy(how=How.XPATH, using="//input[@name='paRequestTO.paCorporateTO.organizationIndustryCodeDesc']")
	private WebElement continuation;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='ACNT_Bank_Information.title']")
	private WebElement bankInfoTab;
	
	@FindBy(how=How.XPATH, using="(//i[@class=' icon-transaction-add iconinline'])[1]")
	private WebElement bankAddBtn;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.bankCodeDesc']")
	private WebElement bank;
	
	@FindBy(how=How.XPATH, using="(//input[@name='tempData.statementOfAccountTypeDesc'])")
	private WebElement typeOfBank;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.accountNumber']")
	private WebElement accountNumber;
	
	@FindBy(how=How.XPATH, using="//input[@name='tempData.methodOfPaymentDesc']")
	private WebElement paymentMethod;
	
	@FindBy(how=How.XPATH, using="//button[@ficlabel='PARTY_Save.label']")
	private WebElement bankInfoSaveBtn;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='Save.Label']")
	private WebElement conformBtn;
	
	@FindBy(how=How.XPATH, using="(//i[@class=' icon-transaction-delete iconblock'])[1]")
	private WebElement addressDltBtn;
	
	@FindBy(how=How.XPATH, using="(//i[@class=' icon-transaction-delete iconblock'])[2]")
	private WebElement beneficiaryDltBtn;
	
	@FindBy(how=How.XPATH,using="//input[@id='nttdataLogo']")
	private WebElement afcLogo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public EmployerMaintanceTransactionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public EmployerMaintanceTransactionPage enterEmployerRut(String Rut)
	  {
		waitForWebElementPresent(employerRut, getTimeOut());
		mouseClickByWebElement(employerRut);
		clear(employerRut, Rut);
		enterValueInFieldInput(employerRut, Rut);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterCompanyName(String Name)
	  {
		waitForWebElementPresent(companyName, getTimeOut());
		mouseClickByWebElement(companyName);
		clear(companyName, Name);
		enterValueInFieldInput(companyName, Name);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterEconomicActivity1(String Activity1) throws Exception
	  {
		waitForWebElementPresent(code1, getTimeOut());
		mouseClickByWebElement(code1);
		clear(code1, Activity1);
		enterValueInFieldInput(code1, Activity1);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterEconomicActivity2(String Activity2) throws Exception
	  {
		waitForWebElementPresent(code2, getTimeOut());
		mouseClickByWebElement(code2);
		clear(code2, Activity2);
		enterValueInFieldInput(code2, Activity2);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterEconomicActivity3(String Activity3) throws Exception
	  {
		waitForWebElementPresent(code3, getTimeOut());
		mouseClickByWebElement(code3);
		clear(code3, Activity3);
		enterValueInFieldInput(code3, Activity3);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage selectemployerStatus(String EmpStatus) throws Exception
	  {
		waitForWebElementPresent(employerStatus,getTimeOut());
		mouseClickByWebElement(employerStatus);
		selectDropDown(employerStatus,EmpStatus , getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterOriginOfEmployerCreation(String Origin) throws Exception
	  {
		waitForWebElementPresent(employerCreation, getTimeOut());
		mouseClickByWebElement(employerCreation);
		clear(employerCreation, Origin);
		enterValueInFieldInput(employerCreation, Origin);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage clickOnEmployerAddressDetailsTab() throws Exception
	  {
		waitForWebElementPresent(employerAddressDetailsTab, getTimeOut());
		scrollToWebElement(employerAddressDetailsTab);
		waitForElementToBeClickable(employerAddressDetailsTab, getTimeOut());
		_clickUsingJavaScript(employerAddressDetailsTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage selectPurpose(String Prupose) throws Exception
	  {
		waitForWebElementPresent(purpose,getTimeOut());
		mouseClickByWebElement(purpose);
		selectDropDown(purpose,Prupose , getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterPostalCode(String postal)
	  {
		waitForWebElementPresent(postalCode, getTimeOut());
		mouseClickByWebElement(postalCode);
		clear(postalCode, postal);
		enterValueInFieldInput(postalCode, postal);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterAddress(String Address)
	  {
		waitForWebElementPresent(address, getTimeOut());
		mouseClickByWebElement(address);
		clear(address, Address);
		enterValueInFieldInput(address, Address);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	
	
	public EmployerMaintanceTransactionPage clickCountryCodeArrow() throws Exception
	  {
		waitForWebElementPresent(countryCodeArrow, getTimeOut());
		scrollToWebElement(countryCodeArrow);
		waitForElementToBeClickable(countryCodeArrow, getTimeOut());
		countryCodeArrow.click();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage selectCountry(String Country) throws Exception
	  {
		//(//label[text()='06'])[1]
		waitForWebElementPresent(descField, getTimeOut());
		mouseClickByWebElement(descField);
		clear(descField, "clear the field");
		descField.sendKeys(Country);
				String xpath = "(//td/label[text()='"+Country+"'])[1]";
				waitForElementPresent(xpath, getTimeOut());
				waitForElementToBeClickable(driver.findElement(byLocator(xpath)), getTimeOut());
				Thread.sleep(2000);
				mouseClick(xpath, getTimeOut());
				_waitForJStoLoad();
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public EmployerMaintanceTransactionPage enterCountry(String Country) throws Exception
	  {
		waitForWebElementPresent(country, getTimeOut());
		mouseClickByWebElement(country);
		clear(country, Country);
		country.sendKeys(Country);
	
		//enterValueInFieldInput(country, Country);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait2sec();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterRegion(String Region) throws Exception
	  {
		waitForWebElementPresent(region, getTimeOut());
		mouseClickByWebElement(region);
		clear(region, Region);
		enterValueInFieldInput(region, Region);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterProvince(String Province) throws Exception
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
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterCommune(String Commune) throws Exception
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
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterAddressVerificationDate(String AddressVerificationdate)
	  {
		waitForWebElementPresent(addressVerificationdate, getTimeOut());
		mouseClickByWebElement(addressVerificationdate);
		clear(addressVerificationdate, AddressVerificationdate);
		enterValueInFieldInput(addressVerificationdate, AddressVerificationdate);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterHomePhone(String Home)
	  {
		waitForWebElementPresent(homePhone, getTimeOut());
		mouseClickByWebElement(homePhone);
		clear(homePhone, Home);
		enterValueInFieldInput(homePhone, Home);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterHomePhoneVerificationDate(String HomePhoneDate)
	  {
		waitForWebElementPresent(homePhoneVerificationDate, getTimeOut());
		mouseClickByWebElement(homePhoneVerificationDate);
		clear(homePhoneVerificationDate, HomePhoneDate);
		enterValueInFieldInput(homePhoneVerificationDate, HomePhoneDate);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterCallVerificationDate(String CallVerificationDate)
	  {
		waitForWebElementPresent(callVerificationDate, getTimeOut());
		mouseClickByWebElement(callVerificationDate);
		clear(callVerificationDate, CallVerificationDate);
		enterValueInFieldInput(callVerificationDate, CallVerificationDate);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterEmail(String Email)
	  {
		waitForWebElementPresent(email, getTimeOut());
		mouseClickByWebElement(email);
		clear(email, Email);
		enterValueInFieldInput(email, Email);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterEmailVerificationDate(String VerificationDate)
	  {
		waitForWebElementPresent(emailVerificationDate, getTimeOut());
		mouseClickByWebElement(emailVerificationDate);
		clear(emailVerificationDate, VerificationDate);
		enterValueInFieldInput(emailVerificationDate, VerificationDate);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage clickOnAddressSaveBtn()
	  {
		waitForWebElementPresent(addressSaveBtn, getTimeOut());
		scrollToWebElement(addressSaveBtn);
		waitForElementToBeClickable(addressSaveBtn, getTimeOut());
		_clickUsingJavaScript(addressSaveBtn);
		//_waitForPageLoad();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage clickOnLegalRepresentativeTab() throws Exception
	  {
		waitForWebElementPresent(legalRepresentative, getTimeOut());
		scrollToWebElement(legalRepresentative);
		waitForElementToBeClickable(legalRepresentative, getTimeOut());
		_clickUsingJavaScript(legalRepresentative);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterLegalRepresentiveRut(String RepresentiveRut) throws Exception
	  {
		waitForWebElementPresent(representiveRut, getTimeOut());
		mouseClickByWebElement(representiveRut);
		clear(representiveRut, RepresentiveRut);
		enterValueInFieldInput(representiveRut, RepresentiveRut);
		waitfor5sec();
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait2sec();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterLastName(String LastName)
	  {
		waitForWebElementPresent(lastName, getTimeOut());
		mouseClickByWebElement(lastName);
		clear(lastName, LastName);
		enterValueInFieldInput(lastName, LastName);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterMotherSurname(String MotherName) throws Exception
	  {
		wait2sec();
		waitForWebElementPresent(motherName, getTimeOut());
		mouseClickByWebElement(motherName);
		clear(motherName, MotherName);
		enterValueInFieldInput(motherName, MotherName);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterUpdatedDate(String Date)
	  {
		waitForWebElementPresent(updatedDate, getTimeOut());
		mouseClickByWebElement(updatedDate);
		clear(updatedDate, Date);
		enterValueInFieldInput(updatedDate, Date);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterLegalRepresentativeStatus(String LegalStatus) throws Exception
	  {
		waitForWebElementPresent(representativeStatus, getTimeOut());
		mouseClickByWebElement(representativeStatus);
		clear(representativeStatus, LegalStatus);
		enterValueInFieldInput(representativeStatus, LegalStatus);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	
	public EmployerMaintanceTransactionPage clickOnInformationOfTheLegalOfCompanyTabTab() throws Exception
	  {
		waitForWebElementPresent(informationOfTheLegalOfCompanyTab, getTimeOut());
		scrollToWebElement(informationOfTheLegalOfCompanyTab);
		waitForElementToBeClickable(informationOfTheLegalOfCompanyTab, getTimeOut());
		_clickUsingJavaScript(informationOfTheLegalOfCompanyTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterLegalAdvisorRut(String LegalAdvisorRut) throws Exception
	  {
		waitForWebElementPresent(legalAdvisorRut, getTimeOut());
		mouseClickByWebElement(legalAdvisorRut);
		clear(legalAdvisorRut, LegalAdvisorRut);
		enterValueInFieldInput(legalAdvisorRut, LegalAdvisorRut);
		waitfor5sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterEstablishedDate(String EstablishedDate)
	  {
		waitForWebElementPresent(establishedDate, getTimeOut());
		mouseClickByWebElement(establishedDate);
		clear(establishedDate, EstablishedDate);
		enterValueInFieldInput(establishedDate, EstablishedDate);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	//continuation
	public EmployerMaintanceTransactionPage entercontinuation(String Cause) throws Exception
	  {
		waitForWebElementPresent(continuation, getTimeOut());
		mouseClickByWebElement(continuation);
		clear(continuation, Cause);
		enterValueInFieldInput(continuation, Cause);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage clickOnBankInformationTabTab() throws Exception
	  {
		waitForWebElementPresent(bankInfoTab, getTimeOut());
		scrollToWebElement(bankInfoTab);
		waitForElementToBeClickable(bankInfoTab, getTimeOut());
		_clickUsingJavaScript(bankInfoTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage clickOnBankAddBtn()
	  {
		waitForWebElementPresent(bankAddBtn, getTimeOut());
		scrollToWebElement(bankAddBtn);
		waitForElementToBeClickable(bankAddBtn, getTimeOut());
		_clickUsingJavaScript(bankAddBtn);
		//_waitForPageLoad();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterBankName(String Bank) throws Exception
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
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterTypeOfBank(String BankType) throws Exception
	  {
		waitForWebElementPresent(typeOfBank, getTimeOut());
		mouseClickByWebElement(typeOfBank);
		clear(typeOfBank, BankType);
		enterValueInFieldInput(typeOfBank, BankType);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterAccountNumber(String AccountNo)
	  {
		waitForWebElementPresent(accountNumber, getTimeOut());
		mouseClickByWebElement(accountNumber);
		clear(accountNumber, AccountNo);
		enterValueInFieldInput(accountNumber, AccountNo);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage enterPaymentMethod(String Method) throws Exception
	  {
		waitForWebElementPresent(paymentMethod, getTimeOut());
		mouseClickByWebElement(paymentMethod);
		clear(paymentMethod, Method);
		enterValueInFieldInput(paymentMethod, Method);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage clickOnBankInfoSaveBtn()
	  {
		waitForWebElementPresent(bankInfoSaveBtn, getTimeOut());
		scrollToWebElement(bankInfoSaveBtn);
		waitForElementToBeClickable(bankInfoSaveBtn, getTimeOut());
		_clickUsingJavaScript(bankInfoSaveBtn);
		//_waitForPageLoad();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public DashboardPage clickonConformBtn() throws Exception
	  {
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
		return PageFactory.initElements(driver, DashboardPage.class);  
	  }

	private WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public EmployerMaintanceTransactionPage clickOnAddressDltBtn()
	  {
		  waitForWebElementPresent(addressDltBtn, getTimeOut());
			mouseClickByWebElement(addressDltBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage clickOnBeneficiaryDltBtn()
	  {
		  waitForWebElementPresent(beneficiaryDltBtn, getTimeOut());
			mouseClickByWebElement(beneficiaryDltBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
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
