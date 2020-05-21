package com.afc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.afc.utils.AfcDriverHelper;

public class EmployerNotificationRequestUploadpage extends AfcDriverHelper {
	
	@FindBy(how=How.XPATH, using="//select[@name='batchHeaderVO.filter11']")
	private WebElement uploadType;
	
	@FindBy(how=How.XPATH,using="//input[@type='file']")
	private WebElement chosefile;
	
	@FindBy(how=How.XPATH,using="//label[@ficlabel='ACNT_Upload.label']")
	private WebElement uploadBtn;
	
	@FindBy(how=How.XPATH,using="//input[@id='nttdataLogo']")
	private WebElement afcLogo;
	
	
	
	
	
	public EmployerNotificationRequestUploadpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public EmployerNotificationRequestUploadpage selectUploadType(String UploadType)
	  {
		waitForWebElementPresent(uploadType,getTimeOut());
		mouseClickByWebElement(uploadType);
		selectDropDown(uploadType,UploadType , getTimeOut());
		_waitForJStoLoad();
			return PageFactory.initElements(driver, EmployerNotificationRequestUploadpage.class);  
	  }
	
	public EmployerNotificationRequestUploadpage clickOnChoseFile() throws Exception
	{
		waitForWebElementPresent(chosefile, getTimeOut());
		waitForElementToBeClickable(chosefile, getTimeOut());
		_clickUsingJavaScript(chosefile);
		//chosefile.click();
		waitfor5sec();
		_waitForJStoLoad();
		return PageFactory.initElements(driver, EmployerNotificationRequestUploadpage.class);
	}
	
	public EmployerNotificationRequestUploadpage clickOnUploadBtn() throws Exception
	{
		waitfor5sec();
		Actions builder= new Actions(driver);
		builder.moveToElement(uploadBtn).click(uploadBtn);
		builder.perform();
		
		waitfor5sec();
		WebDriverWait wait=WebDriverWait(driver,10);
		String closeButton="//div/button[text()='OK']";
		driver.findElement(By.xpath(closeButton)).click();
		_waitForPageLoad();
		waitfor5sec();
		_waitForPageLoad();
		return PageFactory.initElements(driver, EmployerNotificationRequestUploadpage.class);
	}


	private WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String captureBatchId()
	{
		//waitForWebElementPresent(element, timeout);
		waitForElementPresent("(//input[@name='batchHeaderVO.batchId'])[1]", getTimeOut());
		
		WebElement proposalno=driver.findElement(By.xpath("(//input[@name='batchHeaderVO.batchId'])[1]"));
		String s = driver.findElement(By.xpath("(//input[@name='batchHeaderVO.batchId'])[1]")).getAttribute("value");
		System.out.println("number is "+s);
		return 	s;
		
	}
	
	public DashboardPage clickonAFCLogo() throws Exception
	{
		waitForWebElementPresent(afcLogo, getTimeOut());
		waitForElementToBeClickable(afcLogo, getTimeOut());
		_clickUsingJavaScript(afcLogo);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, DashboardPage.class);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
