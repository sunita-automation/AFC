package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class UserMaintSearchPage extends AfcDriverHelper {

	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FICUTIL_add.label']")
	private WebElement addBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	public UserMaintSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public CreateUserServicePage clickOnAddbtn()
	{
		waitForWebElementPresent(addBtn, getTimeOut());
		waitForElementToBeClickable(addBtn, getTimeOut());
		_clickUsingJavaScript(addBtn);
		_waitForPageLoad();
		return PageFactory.initElements(driver, CreateUserServicePage.class);
	}
	
	
	
	
	
	
	
	
	
	
	
}
