package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class EmployerNotificationEnquiryPage extends AfcDriverHelper{

	@FindBy(how=How.XPATH, using="//input[@name='paAcntSearchTO.employerPartyID']")
	private WebElement employerRut;
	
	@FindBy(how=How.XPATH, using="//input[@name='paAcntSearchTO.affiliatePartyID']")
	private WebElement affilateRut;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public EmployerNotificationEnquiryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public EmployerNotificationEnquiryPage enterEmployerRut(String EmployerRut1 , String EmployerRut2) throws Exception
	  {
		waitForWebElementPresent(employerRut, getTimeOut());
		mouseClickByWebElement(employerRut);
		clear(employerRut, "remove all values if present");
		//enterValueInFieldInput(employerRut, Rut);
		employerRut.sendKeys(EmployerRut1);
		employerRut.sendKeys(EmployerRut2);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerNotificationEnquiryPage.class);  
	  }
	
	
	public EmployerNotificationEnquiryPage enterAffilateRut(String AffilateRut) throws Exception
	  {
		waitForWebElementPresent(affilateRut, getTimeOut());
		mouseClickByWebElement(affilateRut);
		clear(affilateRut, AffilateRut);
		affilateRut.sendKeys(AffilateRut);
		affilateRut.sendKeys(AffilateRut);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerNotificationEnquiryPage.class);  
	  }
	
	
	
	
	
	
	
	
}
