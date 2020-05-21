package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class ParameterApprovalSearchPage extends AfcDriverHelper{

	@FindBy(how=How.XPATH, using="//input[@name='paAcntParameterVO.collectionPeriod']")
	private WebElement collectionPeriod;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='Utils_Search.button']")
	private WebElement searchBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ParameterApprovalSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public ParameterApprovalSearchPage enterCollectionPeriod(String period)
	  {
		waitForWebElementPresent(collectionPeriod, getTimeOut());
		mouseClickByWebElement(collectionPeriod);
		clear(collectionPeriod, period);
		//enterValueInFieldInput(collectionPeriod, period);
		collectionPeriod.sendKeys(period);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ParameterApprovalSearchPage.class);  
	  }
	
	
	public ParameterApprovalSearchPage clickOnSearchBtn()
	  {
		  waitForWebElementPresent(searchBtn, getTimeOut());
			mouseClickByWebElement(searchBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, ParameterApprovalSearchPage.class);  
	  }
	
	
	
	public ParameterApprovalViewPage clickOnClnoViewBtn(String clno) throws InterruptedException
	{
		_waitForPageLoad();
		String s="//label[text()='"+clno+" ']/../../td[8]/i[@class=' icon-transaction-view iconblock']";
		waitForElementPresent(s, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(s)), getTimeOut());
		Thread.sleep(2000);
		mouseClick(s, getTimeOut());
		//Thread.sleep(10000);
		//Thread.sleep(10000);
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, ParameterApprovalViewPage.class);
	}
	
	
	
	
	
	
	
	
	
	
	

}
