package com.afc.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.utils.AfcDriverHelper;

public class ParameterEditPage extends AfcDriverHelper{

	

	@FindBy(how=How.XPATH, using="(//input[@name='paAcntParameterVO.closureNumber'])[2]")
	private WebElement closingNumber;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paAcntParameterVO.dailyClosingDate'])[3]")
	private WebElement dailyClosingDate;
	
	@FindBy(how=How.XPATH, using="(//input[@name='paAcntParameterVO.formattedAmountavgUnitFundValue'])[2]")
	private WebElement averageUnit;
	
	@FindBy(how=How.XPATH, using="//label[@ficlabel='ACNT_Submit.label']")
	private WebElement conformBtn;
	
	
	
	
	
	
	
	
	
	
	
	public ParameterEditPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String captureClosingNo()
	{
		//waitForWebElementPresent(element, timeout);
		waitForElementPresent("(//input[@name='paAcntParameterVO.closureNumber'])[2]", getTimeOut());
		
		WebElement proposalno=driver.findElement(By.xpath("(//input[@name='paAcntParameterVO.closureNumber'])[2]"));
		String s = driver.findElement(By.xpath("(//input[@name='paAcntParameterVO.closureNumber'])[2]")).getAttribute("value");
		String capturePropasalNo=proposalno.getText();
		System.out.println("Number is"+capturePropasalNo);
		System.out.println("number is "+s);
		return 	s;
		
	}
	
	public ParameterSearchPage enterDailyClosingDate(String date)
	  {
		waitForWebElementPresent(dailyClosingDate, getTimeOut());
		mouseClickByWebElement(dailyClosingDate);
		clear(dailyClosingDate, date);
		enterValueInFieldInput(dailyClosingDate, date);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ParameterSearchPage.class);  
	  }
	
	public ParameterSearchPage enterAverageUnitFundValue(String unit)
	  {
		waitForWebElementPresent(averageUnit, getTimeOut());
		mouseClickByWebElement(averageUnit);
		clear(averageUnit, unit);
		enterValueInFieldInput(averageUnit, unit);
		_waitForJStoLoad();
		return PageFactory.initElements(driver, ParameterSearchPage.class);  
	  }
	
	public AffilatesCreateRequestPage clickOnConformBtn()
	  {
		  waitForWebElementPresent(conformBtn, getTimeOut());
			mouseClickByWebElement(conformBtn);
			_waitForPageLoad();
			_waitForPageLoad();
			return PageFactory.initElements(driver, AffilatesCreateRequestPage.class);  
	  }
	
	
	
	
	
	
	
	
	
	
	
}
