package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class AffilatesApproveSearchPage extends AfcDriverHelper{

	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntSearchTO.affiliatePartyID']")
	private WebElement affilatesRUT;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='Utils_Search.button']")
	private WebElement searchBtn;
	
	@FindBy(how=How.XPATH, using="//i[@class=' icon-transaction-edit iconblock']")
	private WebElement editIcon;
	
	
	
	
	
	
	
	public AffilatesApproveSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public AffilatesApproveSearchPage enterAffilatesRutNo(String Rut)
	  {
		waitForWebElementPresent(affilatesRUT, getTimeOut());
		mouseClickByWebElement(affilatesRUT);
		clear(affilatesRUT, Rut);
		//enterValueInFieldInput(affilatesRUT, Rut);
		affilatesRUT.sendKeys(Rut);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesApproveSearchPage.class);  
	  }
	
	public AffilatesApproveSearchPage clickOnSearchBtn()
	  {
		  waitForWebElementPresent(searchBtn, getTimeOut());
			mouseClickByWebElement(searchBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, AffilatesApproveSearchPage.class);  
	  }
	
	public AffilatesApprovePage clickOnEditIcon()
	  {
		  waitForWebElementPresent(editIcon, getTimeOut());
			mouseClickByWebElement(editIcon);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, AffilatesApprovePage.class);  
	  }

}
