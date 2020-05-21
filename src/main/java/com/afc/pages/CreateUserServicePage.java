package com.afc.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;
import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class CreateUserServicePage extends AfcDriverHelper {

	@FindBy(how=How.XPATH,using="//input[@name='userVO.user_id']")
	private WebElement userId;
	
	@FindBy(how=How.XPATH,using="//input[@name='userVO.userExtnVO.free_text3']")
	private WebElement rutOfId;
	
	@FindBy(how=How.XPATH,using="(//input[@name='userVO.user_name'])[2]")
	private WebElement username;
	
	@FindBy(how=How.XPATH,using="//select[@name='userVO.recoveryQuestion1']")
	private WebElement securityQues1;
	
	@FindBy(how=How.XPATH, using="//input[@name='userVO.recoveryAnswer1']")
	private WebElement ans1;
	
	@FindBy(how=How.XPATH,using="//select[@name='userVO.recoveryQuestion2']")
	private WebElement securityQues2;
	
	@FindBy(how=How.XPATH,using="//input[@name='userVO.recoveryAnswer2']")
	private WebElement ans2;
	
	@FindBy(how=How.XPATH,using="(//input[@name='userVO.user_group'])[2]")
	private WebElement userGroup;
	
	@FindBy(how=How.XPATH,using="//input[@name='userVO.user_parent']")
	private WebElement supervisedBy;
	
	@FindBy(how=How.XPATH,using="//input[@name='userVO.userExtnVO.user_defined_DT1']")
	private WebElement incorporationDate;
	
	@FindBy(how=How.XPATH,using="//input[@name='userVO.userExtnVO.user_defined_DT2']")
	private WebElement endDate;
	
	@FindBy(how=How.XPATH,using="//input[@name='userVO.userExtnVO.free_text2']")
	private WebElement cargo;
	
	@FindBy(how=How.XPATH,using="//input[@name='userVO.departmentDesc']")
	private WebElement department;
	
	@FindBy(how=How.XPATH,using="//input[@name='userVO.user_email']")
	private WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@name='userVO.user_lang_desc']")
	private WebElement language;
	
	@FindBy(how=How.XPATH,using="//input[@name='userVO.user_portal_id']")
	private WebElement userPortalID;
	
	@FindBy(how=How.XPATH,using="(//label[@ficlabel='IdM_password.label'])[1]")
	private WebElement passwordTab;
	
	@FindBy(how=How.XPATH,using="//input[@name='userVO.user_password']")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@name='userVO.confirm_password']")
	private WebElement confirmPassword;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='IdM_submit.button']")
	private WebElement saveBtn;
	
	
	
	
	
	
	public CreateUserServicePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public CreateUserServicePage enterUserId(String Id)
	{
		waitForWebElementPresent(userId, getTimeOut());
		waitForElementToBeClickable(userId, getTimeOut());
		clear(userId, "clera the field");
		enterValueInFieldInput(userId, Id);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CreateUserServicePage.class);	
	}
	
	public CreateUserServicePage enterRut(String Rut)
	{
		waitForWebElementPresent(rutOfId, getTimeOut());
		waitForElementToBeClickable(rutOfId, getTimeOut());
		clear(rutOfId, "clera the field");
		enterValueInFieldInput(rutOfId, Rut);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CreateUserServicePage.class);
	}
	
	
	public CreateUserServicePage enterUserName(String Username)
	{
		waitForWebElementPresent(username, getTimeOut());
		waitForElementToBeClickable(username, getTimeOut());
		clear(username, "clear the field");
		enterValueInFieldInput(username, Username);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CreateUserServicePage.class);
	}
	
	public CreateUserServicePage selectSecurityQues1(String ques1)
	{
		
		waitForWebElementPresent(securityQues1, getTimeOut());
		waitForElementToBeClickable(securityQues1, getTimeOut());
		selectDropDown(securityQues1, ques1, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CreateUserServicePage.class);
	}
	
	public CreateUserServicePage provideAnsForQues1(String Ans1)
	{
		waitForWebElementPresent(ans1, getTimeOut());
		waitForElementToBeClickable(ans1, getTimeOut());
		clear(ans1, "clear the field");
		enterValueInFieldInput(ans1, Ans1);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CreateUserServicePage.class);
		
	}
	
	public CreateUserServicePage selectSecurityQues2(String ques2)
	{
		waitForWebElementPresent(securityQues2, getTimeOut());
		waitForElementToBeClickable(securityQues2, getTimeOut());
		selectDropDown(securityQues2, ques2, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CreateUserServicePage.class);
		
	}
	 public CreateUserServicePage provideAnsforQues2(String Ans2)
	 {
		 waitForWebElementPresent(ans2, getTimeOut());
		 waitForElementToBeClickable(ans2, getTimeOut());
		 clear(ans2, "clear the field");
		 enterValueInFieldInput(ans2, Ans2);
		 _waitForJStoLoad();
		return PageFactory.initElements(driver, CreateUserServicePage.class);
		 
	 }
	public CreateUserServicePage enterUsergroup(String UserGroup) throws Exception
	{
		waitForWebElementPresent(userGroup, getTimeOut());
		waitForElementToBeClickable(userGroup, getTimeOut());
		clear(userGroup, "clear the field");
		enterValueInFieldInput(userGroup, UserGroup);
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CreateUserServicePage.class);
		
	}
	
	public CreateUserServicePage enterLanguage(String Language) throws Exception
	{
		waitForWebElementPresent(language, getTimeOut());
		waitForElementToBeClickable(language, getTimeOut());
		clear(language, "clear the field");
		enterValueInFieldInput(language, Language);
		wait2sec();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		_waitForJStoLoad();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, CreateUserServicePage.class);
		
	}
	
	public AffilatesCreateRequestPage clickOnPasswordTab()
	{
		waitForWebElementPresent(passwordTab, getTimeOut());
		scrollToWebElement(passwordTab);
		waitForElementToBeClickable(passwordTab, getTimeOut());
		_clickUsingJavaScript(passwordTab);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);
	}
	
	public CreateUserServicePage enterPassword(String Password)
	 {
		 waitForWebElementPresent(password, getTimeOut());
		 waitForElementToBeClickable(password, getTimeOut());
		 clear(password, "clear the field");
		 enterValueInFieldInput(password, Password);
		 _waitForJStoLoad();
		return PageFactory.initElements(driver, CreateUserServicePage.class);
		 
	 }
	
	public CreateUserServicePage enterConfirmPassword(String ConfirmPW)
	 {
		 waitForWebElementPresent(confirmPassword, getTimeOut());
		 waitForElementToBeClickable(confirmPassword, getTimeOut());
		 clear(confirmPassword, "clear the field");
		 enterValueInFieldInput(confirmPassword, ConfirmPW);
		 _waitForJStoLoad();
		return PageFactory.initElements(driver, CreateUserServicePage.class);
		 
	 }
	
	public CreateUserServicePage clickOnSaveBtn()
	 {waitForWebElementPresent(saveBtn, getTimeOut());
		waitForElementToBeClickable(saveBtn, getTimeOut());
		_clickUsingJavaScript(saveBtn);
		_waitForPageLoad();
		return PageFactory.initElements(driver, CreateUserServicePage.class);
		 
	 }
	
}
