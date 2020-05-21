package com.afc.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class MyProfilePage extends AfcDriverHelper{

	@FindBy(xpath="//label[@ficlabel='IDM_ResetPassword.label']")
	 private WebElement restorePassword;
	
	@FindBy(xpath="//input[@name='userVO.current_password']")
	 private WebElement enterPassword;
	
	@FindBy(xpath="//button[@ficlabel='IDM_proceed.button']")
	 private WebElement proceedBtn;
	
	@FindBy(xpath="//input[@name='resultObj.current_password']")
	 private WebElement reEntrdcurntPsw;

	@FindBy(xpath="//input[@name='resultObj.user_password']")
	 private WebElement newPsw;

	@FindBy(xpath="//input[@name='resultObj.confirm_password']")
	 private WebElement confrimeNewPsw;

	@FindBy(xpath="//button[@ficlabel='IDM_resetPassword.label']")
	 private WebElement resetPswBtn;
	
	
	
	
	
	
	
	
	
	
	
	public MyProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public MyProfilePage clickOnRestorePassword()
	{
		waitForWebElementPresent(restorePassword, getTimeOut());
		waitForElementToBeClickable(restorePassword, getTimeOut());
		_clickUsingJavaScript(restorePassword);
		_waitForPageLoad();
		return PageFactory.initElements(driver, MyProfilePage.class);
	}
	
	public MyProfilePage enterCurrentpassword(String password) throws Exception
	{
		waitForWebElementPresent(enterPassword, getTimeOut());
		waitForElementToBeClickable(enterPassword, getTimeOut());
		clear(enterPassword, "clear the field");
		enterValueInFieldInput(enterPassword, password);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, MyProfilePage.class);
		
	}
	
	public MyProfilePage clickOnProceedBtn()
	{
		waitForWebElementPresent(proceedBtn, getTimeOut());
		waitForElementToBeClickable(proceedBtn, getTimeOut());
		_clickUsingJavaScript(proceedBtn);
		_waitForPageLoad();
		return PageFactory.initElements(driver, MyProfilePage.class);
	}
	
	
	public MyProfilePage reEnterCurrentPassword(String password) throws Exception
	{
		waitForWebElementPresent(reEntrdcurntPsw, getTimeOut());
		waitForElementToBeClickable(reEntrdcurntPsw, getTimeOut());
		clear(reEntrdcurntPsw, "clear the field");
		enterValueInFieldInput(reEntrdcurntPsw, password);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, MyProfilePage.class);
	}
	
	public MyProfilePage enterNewPassword(String Newpassword) throws Exception
	{
		waitForWebElementPresent(newPsw, getTimeOut());
		waitForElementToBeClickable(newPsw, getTimeOut());
		clear(newPsw, "clear the field");
		enterValueInFieldInput(newPsw, Newpassword);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, MyProfilePage.class);
	}
	
	public MyProfilePage enterConfoirmPassword(String ConfirmPassword) throws Exception
	{
		waitForWebElementPresent(confrimeNewPsw, getTimeOut());
		waitForElementToBeClickable(confrimeNewPsw, getTimeOut());
		clear(confrimeNewPsw, "clear the field");
		enterValueInFieldInput(confrimeNewPsw, ConfirmPassword);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, MyProfilePage.class);
	}
	
	public MyProfilePage clickOnResetPasswordBtn()
	{
		waitForWebElementPresent(resetPswBtn, getTimeOut());
		waitForElementToBeClickable(resetPswBtn, getTimeOut());
		_clickUsingJavaScript(resetPswBtn);
		_waitForPageLoad();
		return PageFactory.initElements(driver, MyProfilePage.class);
	}
	
	
	
	
	
}
