package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class UserGroupServiceSearchPage extends AfcDriverHelper{
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='FICUTIL_add.label']")
	private WebElement addBtn;
	
	
	
	
	
	

	public UserGroupServiceSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public CreateUserGroupServicePage clickOnAddBtn() throws Exception
	{
		waitForWebElementPresent(addBtn, getTimeOut());
		mouseOver(addBtn, getTimeOut());
		_clickUsingJavaScript(addBtn);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, CreateUserGroupServicePage.class);
	}

}
