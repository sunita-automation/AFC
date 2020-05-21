package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class ParameterSearchPage extends AfcDriverHelper{

	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntParameterVO.collectionPeriod']")
	private WebElement collectionPeriod;
	
	@FindBy(how=How.XPATH, using="//button[@ficlabel='ACNT_Add.button']")
	private WebElement addBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ParameterSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public ParameterSearchPage enterCollectionPeriod(String period)
	  {
		waitForWebElementPresent(collectionPeriod, getTimeOut());
		mouseClickByWebElement(collectionPeriod);
		clear(collectionPeriod, period);
		//enterValueInFieldInput(collectionPeriod, period);
		collectionPeriod.sendKeys(period);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ParameterSearchPage.class);  
	  }
	
	
	public ParameterEditPage clickOnCreateBtn()
	  {
		  waitForWebElementPresent(addBtn, getTimeOut());
			mouseClickByWebElement(addBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, ParameterEditPage.class);  
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
