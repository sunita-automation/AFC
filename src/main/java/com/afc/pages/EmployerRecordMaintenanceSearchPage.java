package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class EmployerRecordMaintenanceSearchPage extends AfcDriverHelper{

	
	@FindBy(how=How.XPATH, using="//button[@ficlabel='ACNT_CreateNew.button']")
	private WebElement createBtn;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntSearchTO.employerPartyID']")
	private WebElement employerRut;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='Utils_Search.button']")
	private WebElement searchBtn;
	
	@FindBy(how=How.XPATH, using="//i[@class=' icon-transaction-edit iconblock']")
	private WebElement editIcon;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public EmployerRecordMaintenanceSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public EmployerMaintanceTransactionPage clickOnCreateBtn()
	  {
		  waitForWebElementPresent(createBtn, getTimeOut());
			mouseClickByWebElement(createBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	public EmployerRecordMaintenanceSearchPage enterEmployerRut(String Rut)
	  {
		waitForWebElementPresent(employerRut, getTimeOut());
		mouseClickByWebElement(employerRut);
		clear(employerRut, Rut);
		//enterValueInFieldInput(employerRut, Rut);
		employerRut.sendKeys(Rut);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerRecordMaintenanceSearchPage.class);  
	  }
	
	public EmployerRecordMaintenanceSearchPage clickOnSearchBtn()
	  {
		 waitForWebElementPresent(searchBtn, getTimeOut());
			mouseClickByWebElement(searchBtn);
			_waitForPageLoad();
			_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerRecordMaintenanceSearchPage.class);  
	  }
	
	public EmployerMaintanceTransactionPage clickOnEditIcon()
	  {
		waitForWebElementPresent(editIcon, getTimeOut());
		mouseClickByWebElement(editIcon);
		_waitForPageLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerMaintanceTransactionPage.class);  
	  }
	
	
	

}
