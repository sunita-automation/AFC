package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class AffiliateRecordMaintenanceSearchPage extends AfcDriverHelper {

	
	@FindBy(how=How.XPATH, using="//button[@ficlabel='ACNT_CreateNew.button']")
	private WebElement createBtn;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paAcntSearchTO.affiliatePartyID'])[1]")
	private WebElement affilateRut;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='Utils_Search.button']")
	private WebElement searchBtn;
	
	@FindBy(how=How.XPATH, using="//i[@class=' icon-transaction-edit iconblock']")
	private WebElement editIcon;
	
	
	
	
	
	
	
	public AffiliateRecordMaintenanceSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public AffliateMaintanceTransactionPage clickOnCreateBtn()
	  {
		  waitForWebElementPresent(createBtn, getTimeOut());
			mouseClickByWebElement(createBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	
	public AffliateMaintanceTransactionPage enterAffilateRut(String Rut)
	  {
		waitForWebElementPresent(affilateRut, getTimeOut());
		mouseClickByWebElement(affilateRut);
		clear(affilateRut, Rut);
		enterValueInFieldInput(affilateRut, Rut);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage clickOnSearchBtn()
	  {
		  waitForWebElementPresent(searchBtn, getTimeOut());
			mouseClickByWebElement(searchBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	public AffliateMaintanceTransactionPage clickOnEditIcon()
	  {
		  waitForWebElementPresent(editIcon, getTimeOut());
			mouseClickByWebElement(editIcon);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, AffliateMaintanceTransactionPage.class);  
	  }
	
	
	

}
