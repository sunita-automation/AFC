package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class AffilatesApprovePage extends AfcDriverHelper
{
	@FindBy(how=How.XPATH, using="//input[@name='paAcntSearchTO.affiliatePartyID']")
	private WebElement approveICon;

	@FindBy(how=How.XPATH, using="//label[@ficlabel='ACNT_Approve.button']")
	private WebElement approveBtn;
	
	@FindBy(how=How.XPATH, using="//textarea[@name='paRequestTO.imwProcessComment']")
	private WebElement textArea;
	
	@FindBy(how=How.XPATH, using="//button[@ficlabel='FICUW_Approve.button']")
	private WebElement saveBtn;
	
	@FindBy(how=How.XPATH,using="//input[@id='nttdataLogo']")
	private WebElement afcLogo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public AffilatesApprovePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public AffilatesApprovePage clickOnApproveIcon()
	  {
		  waitForWebElementPresent(approveBtn, getTimeOut());
			mouseClickByWebElement(approveBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, AffilatesApprovePage.class);  
	  }
	
	public AffilatesCreateRequestPage enterInTextArea(String text)
	  {
		waitForWebElementPresent(textArea, getTimeOut());
		mouseClickByWebElement(textArea);
		clear(textArea, text);
		enterValueInFieldInput(textArea, text);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	public AffilatesApprovePage clickOnSaveBtn()
	  {
		  waitForWebElementPresent(saveBtn, getTimeOut());
			mouseClickByWebElement(saveBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, AffilatesApprovePage.class);  
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
