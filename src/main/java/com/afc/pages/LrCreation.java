package com.afc.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class LrCreation extends AfcDriverHelper{

	

	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.groupNo']")
	private WebElement group;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.subscribeDT']")
	private WebElement subscriptiondate;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.affiliateName']")
	private WebElement affilateRut;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.employerFullName']")
	private WebElement employerRut;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.typeofContractDesc']")
	private WebElement typeOfContract;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.effectiveJoiningDT']")
	private WebElement contractDate;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.joiningDT']")
	private WebElement startDate;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.cessationDT']")
	private WebElement cessationDate;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.cessCauseCdDesc']")
	private WebElement reasonOfTermination;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.noOfHrsForWeeklyWork']")
	private WebElement noOfHrsForWeeklyWork;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.statusCDDesc']")
	private WebElement lrStatus;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.silCompanyDesc']")
	private WebElement payCompanyRelationship;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.affiliationTypeDesc']")
	private WebElement lrCreationOrigin;
	
	@FindBy(how=How.XPATH, using="(//label[@ficlabel='ACNT_OriginCompanyLegalSuccessionAndElevenyearsInfo.label'])[1]")
	private WebElement companyOriginTab;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paAcntLabourRelationshipVO.legalSuccCompName'])[1]")
	private WebElement legalComapnyRut;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paAcntLabourRelationshipVO.legalSuccStartDT'])[1]")
	private WebElement startDateCompany;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paAcntLabourRelationshipVO.contCauseCDDesc'])[1]")
	private WebElement reasonOfCont;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='ACNT_LaborRelationshipControlData.label']")
	private WebElement laborRelationshipTab;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntLabourRelationshipVO.modifyBy']")
	private WebElement modifiedUser;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='ACNT_Submit.label']")
	private WebElement conform;
	
	@FindBy(how=How.XPATH,using="//input[@id='nttdataLogo']")
	private WebElement afcLogo;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public LrCreation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public LrCreation enterGroup(String Group)
	  {
		waitForWebElementPresent(group, getTimeOut());
		mouseClickByWebElement(group);
		clear(group, Group);
		enterValueInFieldInput(group, Group);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterSubscriptionDate(String SubDate)
	  {
		//waitfor5sec();
		waitForWebElementPresent(subscriptiondate, getTimeOut());
		mouseClickByWebElement(subscriptiondate);
		clear(subscriptiondate, SubDate);
		enterValueInFieldInput(subscriptiondate, SubDate);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterAffilateRut(String AffilateRut)
	  {
		waitForWebElementPresent(affilateRut, getTimeOut());
		mouseClickByWebElement(affilateRut);
		clear(affilateRut, AffilateRut);
		enterValueInFieldInput(affilateRut, AffilateRut);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterEmployerRut(String EmployerRut)
	  {
		waitForWebElementPresent(employerRut, getTimeOut());
		mouseClickByWebElement(employerRut);
		clear(employerRut, EmployerRut);
		enterValueInFieldInput(employerRut, EmployerRut);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterTypeOfContract(String ContractType) throws Exception
	  {
		waitForWebElementPresent(typeOfContract, getTimeOut());
		mouseClickByWebElement(typeOfContract);
		clear(typeOfContract, ContractType);
		enterValueInFieldInput(typeOfContract, ContractType);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterContractStartDate(String ContractDate)
	  {
		//waitfor5sec();
		waitForWebElementPresent(contractDate, getTimeOut());
		mouseClickByWebElement(contractDate);
		clear(contractDate, ContractDate);
		enterValueInFieldInput(contractDate, ContractDate);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterStartDate(String StartDate)
	  {
		//waitfor5sec();
		waitForWebElementPresent(startDate, getTimeOut());
		mouseClickByWebElement(startDate);
		clear(startDate, StartDate);
		enterValueInFieldInput(startDate, StartDate);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterCessationDate(String CessationDate)
	  {
		//waitfor5sec();
		waitForWebElementPresent(cessationDate, getTimeOut());
		mouseClickByWebElement(cessationDate);
		clear(cessationDate, CessationDate);
		enterValueInFieldInput(cessationDate, CessationDate);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterReasonOfTermination(String Reason) throws Exception
	  {
		waitForWebElementPresent(reasonOfTermination, getTimeOut());
		mouseClickByWebElement(reasonOfTermination);
		clear(reasonOfTermination, Reason);
		enterValueInFieldInput(reasonOfTermination, Reason);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterNoOfHrsForWeeklyWork(String WorkHr)
	  {
		waitForWebElementPresent(noOfHrsForWeeklyWork, getTimeOut());
		mouseClickByWebElement(noOfHrsForWeeklyWork);
		clear(noOfHrsForWeeklyWork, WorkHr);
		enterValueInFieldInput(noOfHrsForWeeklyWork, WorkHr);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterLrStatus(String status) throws Exception
	  {
		waitForWebElementPresent(lrStatus, getTimeOut());
		mouseClickByWebElement(lrStatus);
		clear(lrStatus, status);
		enterValueInFieldInput(lrStatus, status);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterSilPayCompanyRelationship(String payCompany) throws Exception
	  {
		waitForWebElementPresent(payCompanyRelationship, getTimeOut());
		mouseClickByWebElement(payCompanyRelationship);
		clear(payCompanyRelationship, payCompany);
		enterValueInFieldInput(payCompanyRelationship, payCompany);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterLrCreationOrigin(String LrOrigin) throws Exception
	  {
		waitForWebElementPresent(lrCreationOrigin, getTimeOut());
		mouseClickByWebElement(lrCreationOrigin);
		clear(lrCreationOrigin, LrOrigin);
		enterValueInFieldInput(lrCreationOrigin, LrOrigin);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation clickOnCompanyOriginTab() throws Exception
	  {
		waitForWebElementPresent(companyOriginTab, getTimeOut());
		scrollToWebElement(companyOriginTab);
		waitForElementToBeClickable(companyOriginTab, getTimeOut());
		_clickUsingJavaScript(companyOriginTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	
	public LrCreation enterLegalComapnyRut(String LegalComapnyRut) throws Exception
	  {
		waitForWebElementPresent(legalComapnyRut, getTimeOut());
		mouseClickByWebElement(legalComapnyRut);
		clear(legalComapnyRut, LegalComapnyRut);
		enterValueInFieldInput(legalComapnyRut, LegalComapnyRut);
		waitfor5sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	
	public LrCreation enterStartDateCompany(String StartDateCompany)
	  {
		//waitfor5sec();
		waitForWebElementPresent(startDateCompany, getTimeOut());
		mouseClickByWebElement(startDateCompany);
		clear(startDateCompany, StartDateCompany);
		enterValueInFieldInput(startDateCompany, StartDateCompany);
		//waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterReasonOfContinuity(String ReasonOfCont) throws Exception
	  {
		waitForWebElementPresent(reasonOfCont, getTimeOut());
		mouseClickByWebElement(reasonOfCont);
		clear(reasonOfCont, ReasonOfCont);
		enterValueInFieldInput(reasonOfCont, ReasonOfCont);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	
	public LrCreation clickOnLaborRelationshipTab() throws Exception
	  {
		waitForWebElementPresent(laborRelationshipTab, getTimeOut());
		scrollToWebElement(laborRelationshipTab);
		waitForElementToBeClickable(laborRelationshipTab, getTimeOut());
		_clickUsingJavaScript(laborRelationshipTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation enterModifiedUser(String ModifiedUser) throws Exception
	  {
		waitForWebElementPresent(modifiedUser, getTimeOut());
		mouseClickByWebElement(modifiedUser);
		clear(modifiedUser, ModifiedUser);
		enterValueInFieldInput(modifiedUser, ModifiedUser);
		wait2sec();
		//waitfor5sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	public LrCreation clicKOnConformBtn() throws Exception
	  {
		waitForWebElementPresent(conform, getTimeOut());
		mouseClickByWebElement(conform);
		_waitForPageLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, LrCreation.class);  
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
