package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class LrMaintenanceOrEnquiryPage extends AfcDriverHelper{

	@FindBy(how=How.XPATH, using="//button[@ficlabel='ACNT_Add.button']")
	private WebElement createBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	public LrMaintenanceOrEnquiryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public LrCreation clickOnCreateBtn()
	  {
		  waitForWebElementPresent(createBtn, getTimeOut());
			mouseClickByWebElement(createBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, LrCreation.class);  
	  }
	
	
	
	
	
	
	
	
}
