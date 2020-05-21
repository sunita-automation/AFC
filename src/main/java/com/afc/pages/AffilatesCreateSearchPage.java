package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class AffilatesCreateSearchPage extends AfcDriverHelper{
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FICUTIL_add.label']")
	private WebElement addBtn;
	
	
	
	
	
	
	

	public AffilatesCreateSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public AffilatesCreateRequestPage clickOnAddBtn()
	  {
		  waitForWebElementPresent(addBtn, getTimeOut());
			mouseClickByWebElement(addBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	

}
