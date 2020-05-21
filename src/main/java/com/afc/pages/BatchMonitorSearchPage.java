package com.afc.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class BatchMonitorSearchPage extends AfcDriverHelper 
{
	
	@FindBy(how=How.XPATH, using="//input[@name='batchFilterVO.batchId']")
	private WebElement batchId;
	
	@FindBy(how=How.XPATH, using="//input[@name='batchFilterVO.branchCodeDesc']")
	private WebElement branchOffice;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='Utils_Search.button']")
	private WebElement searchBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public BatchMonitorSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public BatchMonitorSearchPage provideBatchId(String BatchId)
	  {
		waitForWebElementPresent(batchId, getTimeOut());
		mouseClickByWebElement(batchId);
		clear(batchId, BatchId);
		enterValueInFieldInput(batchId, BatchId);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, BatchMonitorSearchPage.class);  
	  }
	
	public BatchMonitorSearchPage clearBranchOfficeField() throws Exception
	  {
		/*
		waitForWebElementPresent(branchOffice, getTimeOut());
		mouseClickByWebElement(branchOffice);
		clear(branchOffice, "clear field if any data is there");
		waitfor5sec();
		_waitForJStoLoad();
		*/
		
		
		waitForWebElementPresent(branchOffice, getTimeOut());
		waitForElementToBeClickable(branchOffice, getTimeOut());
		branchOffice.click();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		waitfor5sec();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		return PageFactory.initElements(driver, BatchMonitorSearchPage.class);  
	  }
	
	public BatchMonitorSearchPage clickOnSearchBtn()
	  {
		  waitForWebElementPresent(searchBtn, getTimeOut());
			mouseClickByWebElement(searchBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, BatchMonitorSearchPage.class);  
	  }
	public BatchMonitorTransactionPage clickOnBatchId(String BatchId) throws InterruptedException
	{
		_waitForPageLoad();
		String s = "//td/label[text()='"+BatchId+" ']";
		waitForElementPresent(s, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(s)), getTimeOut());
		Thread.sleep(2000);
		mouseClick(s, getTimeOut());
		Thread.sleep(10000);
		Thread.sleep(10000);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, BatchMonitorTransactionPage.class);
	}
	

}
