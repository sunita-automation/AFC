package com.afc.pages;

import com.afc.utils.AfcDriverHelper;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



import com.afc.utils.AfcPropertyReader;


public class LoginPage extends AfcDriverHelper
{
	@FindBy(how=How.NAME, using="userLoginVO.user_id")
	private WebElement userName;
	
	@FindBy(how=How.NAME, using="screenpassword")
	private WebElement passWord;
	
	
	@FindBy(how=How.XPATH, using="//button[@id='loginButton']")
	private WebElement loginButton;

	public LoginPage(final WebDriver driver) 
	{
		super(driver);
	}
	
	public LoginPage enterUserName(String username) throws Exception
	{
		waitForWebElementPresent(userName, getTimeOut());
		clear(userName, "We are clearing user name input box");
		wait2sec();
		enterValueInFieldInput(userName, username);
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public LoginPage enterPassword(String password)
	{
		waitForWebElementPresent(passWord, getTimeOut());
		clear(passWord, "We are clearing password input box");
		enterValueInFieldInput(passWord, password);
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public DashboardPage clickOnLoginButton()
	{
		waitForWebElementPresent(loginButton, getTimeOut());
		try
		{
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage login() throws Exception
	{
		String username = propertyReader.readApplicationFile(AfcPropertyReader.getDomain() + "_userName");
		String password = propertyReader.readApplicationFile(AfcPropertyReader.getDomain() + "_password");
		enterUserName(username);
		enterPassword(password);
		//Thread.sleep(2000);
		clickOnLoginButton();
		//Thread.sleep(1000);
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	//to close the popup in login page
	public LoginPage closecrossicon() throws Exception
	{
		String xpath="//div[@class='dynamsoft-dialog-close']";
		waitForElementPresent(xpath, getTimeOut());
		waitForElementToBeClickable(driver.findElement(byLocator(xpath)), getTimeOut());
		Thread.sleep(2000);
		mouseClick(xpath, getTimeOut());
		_waitForJStoLoad();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		return PageFactory.initElements(driver, LoginPage.class);
	}
}