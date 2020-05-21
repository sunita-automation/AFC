package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class ParameterApprovalViewPage extends AfcDriverHelper{

	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='ACNT_Approve.button']")
	private WebElement approvalBtn;
	
	
	
	
	
	
	
	
	public ParameterApprovalViewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public ParameterApprovalViewPage clickOnApproveBtn()
	  {
		  waitForWebElementPresent(approvalBtn, getTimeOut());
			mouseClickByWebElement(approvalBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, ParameterApprovalViewPage.class);  
	  }
	
	
	
	
	
	
	
	
}
