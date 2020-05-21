package com.afc.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;


public class CreateUserGroupServicePage extends AfcDriverHelper{
	
	@FindBy(how=How.XPATH, using="(//input[@ng-model='usergroupVO.user_group_id'])[2]")
	private WebElement userGroup;
	
	@FindBy(how=How.XPATH, using="(//input[@name='usergroupVO.user_group_desc'])[2]")
	private WebElement userGroupDesc;
	
	
	@FindBy(how=How.XPATH, using="//input[@ng-model='usergroupVO.user_group_country_desc']")
	private WebElement country;
	
	@FindBy(how=How.XPATH, using="//input[@ng-model='usergroupVO.user_group_language']")
	private WebElement lanuage;
	
	@FindBy(how=How.XPATH, using="//input[@ng-model='usergroupVO.user_group_menu']")
	private WebElement menuGroup;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='IdM_submit.button']")
	private WebElement saveBtn;
	
	
	
	
	
	
	
	
	

	public CreateUserGroupServicePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public CreateUserGroupServicePage providUserGroupName(String UserGrpname) throws Exception
	  {
		  waitForWebElementPresent(userGroup, getTimeOut());
			mouseClickByWebElement(userGroup);
			clear(userGroup, UserGrpname);
			enterValueInFieldInput(userGroup, UserGrpname);
			wait2sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, CreateUserGroupServicePage.class);   
	  }
	
	public CreateUserGroupServicePage providUserGroupDesc(String desc) throws Exception
	  {
		 waitForWebElementPresent(userGroupDesc, getTimeOut());
			mouseClickByWebElement(userGroupDesc);
			enterValueInFieldInput(userGroupDesc, desc);
			_waitForJStoLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, CreateUserGroupServicePage.class);   
	  }
	
	public CreateUserGroupServicePage provideCountrycode(String Country) throws Exception
	  {
		  waitForWebElementPresent(country, getTimeOut());
			mouseClickByWebElement(country);
			clear(country, Country);
			enterValueInFieldInput(country, Country);
			waitfor5sec();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			wait2sec();
			
			//robot.keyPress(KeyEvent.VK_TAB);
			//robot.keyRelease(KeyEvent.VK_TAB);
			//wait2sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, CreateUserGroupServicePage.class); 
	  }
	
	
	public CreateUserGroupServicePage providelanguage(String language) throws Exception
	  {
		  waitForWebElementPresent(lanuage, getTimeOut());
			mouseClickByWebElement(lanuage);
			clear(lanuage, language);
			enterValueInFieldInput(lanuage, language);
			waitfor5sec();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			wait2sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, CreateUserGroupServicePage.class); 
	  }
	
	public CreateUserGroupServicePage provideMenuGroup(String menu) throws Exception
	  {
		  waitForWebElementPresent(menuGroup, getTimeOut());
			mouseClickByWebElement(menuGroup);
			clear(menuGroup, menu);
			enterValueInFieldInput(menuGroup, menu);
			waitfor5sec();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			wait2sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, CreateUserGroupServicePage.class); 
	  }
	
	public UserGroupServiceSearchPage clickOnSaveBtn()
	  {
		  waitForWebElementPresent(saveBtn, getTimeOut());
			mouseClickByWebElement(saveBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, UserGroupServiceSearchPage.class);  
	  }
	  

}
