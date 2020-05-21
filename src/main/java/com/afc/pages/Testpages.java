package com.afc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class Testpages  extends AfcDriverHelper{

	
	
	
	public Testpages(WebDriver webdriver) {
		super(webdriver);
		// TODO Auto-generated constructor stub
	}
	
	

	@FindBy(how=How.XPATH, using=" //label[@ficlabel='FICUTIL_add.label']")
	private WebElement Addbtn;
	
	
	@FindBy(how=How.XPATH, using="(//input[@name='usergroupVO.user_group_id'])[2]")
	private WebElement UserGroup;
	
	
	@FindBy(how=How.XPATH, using="(//input[@name='usergroupVO.user_group_desc'])[2]")
	private WebElement UserGroupDescription;
	
	@FindBy(how=How.XPATH, using="(//input[@name='usergroupVO.user_group_country_desc'])")
	private WebElement country;
	
	@FindBy(how=How.XPATH, using="//input[@name='usergroupVO.user_group_language']")
	private WebElement Language;
	
	@FindBy(how=How.XPATH, using="//input[@name='usergroupVO.user_group_menu']")
	private WebElement MenuGroup;
	
	
	public CreateUserGroupServicePage providUserGroupName(String UserGrpname) throws Exception
	  {
		  waitForWebElementPresent(UserGroup, getTimeOut());
			mouseClickByWebElement(UserGroup);
			clear(UserGroup, UserGrpname);
			enterValueInFieldInput(UserGroup, UserGrpname);
			wait2sec();
			_waitForJStoLoad();
			return PageFactory.initElements(driver, CreateUserGroupServicePage.class);   
	  }
	
}
