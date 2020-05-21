package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class BatchMonitorTransactionPage extends AfcDriverHelper {

	
	@FindBy(how=How.XPATH, using="//select[@name='batchHeaderVO.batchStatus']")
	private WebElement success;
	
	@FindBy(how=How.XPATH, using="//button[@ficlabel='FICUW.showRecords.label']")
	private WebElement showRecords;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FICUW.close.label']")
	private WebElement closeBtn;
	
	@FindBy(how=How.XPATH,using="//input[@id='nttdataLogo']")
	private WebElement afcLogo;
	
	
	
	
	
	
	
	
	public BatchMonitorTransactionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public BatchMonitorTransactionPage selectSuccess(String Success)
	  {
		waitForWebElementPresent(success,getTimeOut());
		mouseClickByWebElement(success);
		selectDropDown(success,Success , getTimeOut());
		_waitForJStoLoad();
			return PageFactory.initElements(driver, BatchMonitorTransactionPage.class);  
	  }
	
	public BatchMonitorSearchPage clickOnShowRecordBtn() throws Exception
	  {
		  waitForWebElementPresent(showRecords, getTimeOut());
			mouseClickByWebElement(showRecords);
			wait2sec();
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, BatchMonitorSearchPage.class);  
	  }
	
	public BatchMonitorSearchPage clickOnCloseBtn()
	  {
		  waitForWebElementPresent(closeBtn, getTimeOut());
		  waitForElementToBeClickable(closeBtn, getTimeOut());
			//mouseClickByWebElement(closeBtn);
			//closeBtn.click();
		  _clickUsingJavaScript(closeBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, BatchMonitorSearchPage.class);  
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
