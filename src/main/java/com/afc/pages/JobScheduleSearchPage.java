package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class JobScheduleSearchPage extends AfcDriverHelper {

	@FindBy(how=How.XPATH, using="//label[@ficlabel='Utils_Search.button']")
	private WebElement searchBtn;
	
	@FindBy(how=How.XPATH, using="//label[text()='AFF_AFP_EX ']/../../td[4]/i[@class=' icon-transaction-edit iconblock']")
	private WebElement afpex;
	
	@FindBy(how=How.XPATH, using="//label[text()='AFF_CR_EX ']/../../td[4]/i[@class=' icon-transaction-edit iconblock']")
	private WebElement crex;
	
	@FindBy(how=How.XPATH, using="//label[text()='POST_LR ']/../../td[4]/i[@class=' icon-transaction-edit iconblock']")
	private WebElement postLr;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FICUTILS.ScheduleParams.title']")
	private WebElement programmerParameterTab;
	
	@FindBy(how=How.XPATH, using="//input[@name='scheduleVO.oneTimeExecDt']")
	private WebElement date;
	
	@FindBy(how=How.XPATH, using="//input[@name='scheduleVO.oneTimeExecTime']")
	private WebElement startTime;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FICUTILS.Confirm.button']")
	private WebElement conformBtn;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FICUTILS.Cancel.button']")
	private WebElement cancelBtn;
	
	@FindBy(how=How.XPATH,using="//input[@id='nttdataLogo']")
	private WebElement afcLogo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public JobScheduleSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public JobScheduleSearchPage clickOnSearchBtn()
	  {
		  waitForWebElementPresent(searchBtn, getTimeOut());
			mouseClickByWebElement(searchBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, JobScheduleSearchPage.class);  
	  }
	
	public JobScheduleSearchPage clickOnAfpExEditIcon()
	  {
		  waitForWebElementPresent(afpex, getTimeOut());
			mouseClickByWebElement(afpex);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, JobScheduleSearchPage.class);  
	  }

	public JobScheduleSearchPage clickOnProgrammerParameterTab()
	{
		waitForWebElementPresent(programmerParameterTab, getTimeOut());
		scrollToWebElement(programmerParameterTab);
		waitForElementToBeClickable(programmerParameterTab, getTimeOut());
		_clickUsingJavaScript(programmerParameterTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, JobScheduleSearchPage.class);
	}
	
	public JobScheduleSearchPage enterTodaysDate(String timeStamp) throws Exception
	  {
		waitfor5sec();
		waitForWebElementPresent(date, getTimeOut());
		mouseClickByWebElement(date);
		clear(date, timeStamp);
		enterValueInFieldInput(date, timeStamp);
		waitfor5sec();
		_waitForPageLoad();
			return PageFactory.initElements(driver, JobScheduleSearchPage.class);  
	  }
	
	public JobScheduleSearchPage enterTime(String dt) throws Exception
	  {
		waitfor5sec();
		waitForWebElementPresent(startTime, getTimeOut());
		mouseClickByWebElement(startTime);
		clear(startTime, dt);
		enterValueInFieldInput(startTime, dt);
		waitfor5sec();
		_waitForPageLoad();
			return PageFactory.initElements(driver, JobScheduleSearchPage.class);  
	  }
	
	public JobScheduleSearchPage clickOnConformBtn() throws Exception
	  {
		  waitForWebElementPresent(conformBtn, getTimeOut());
			mouseClickByWebElement(conformBtn);
			waitfor5sec();
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, JobScheduleSearchPage.class);  
	  }
	public JobScheduleSearchPage clickOnCancelBtn()
	  {
		  waitForWebElementPresent(cancelBtn, getTimeOut());
			mouseClickByWebElement(cancelBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, JobScheduleSearchPage.class);  
	  }
	
	public JobScheduleSearchPage clickOnCrExEditIcon()
	  {
		  waitForWebElementPresent(crex, getTimeOut());
			mouseClickByWebElement(crex);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, JobScheduleSearchPage.class);  
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
	
	public JobScheduleSearchPage clickOnPostLREditIcon()
	  {
		  waitForWebElementPresent(postLr, getTimeOut());
			mouseClickByWebElement(postLr);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, JobScheduleSearchPage.class);  
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
