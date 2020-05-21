package com.ndfs.afc.accounts;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;

import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.pages.ParameterEditPage;
import com.afc.pages.ParameterSearchPage;
import com.afc.utils.AfcTestCaseHelper;
import com.aventstack.extentreports.Status;

public class ParameterMaintenanceCTA_005Test extends AfcTestCaseHelper{
	
	
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private ParameterSearchPage parameterSearchPage;
	private ParameterEditPage parameterEditPage;
	
	
	
	
	
	
	
	private String period ,date,unit;
	
	
	@Test
	public void createIuserGroupService() throws Exception
	{
		int i=1;
		period=propertyReader.getCellData(6, i, 0);
		unit=propertyReader.getCellData(6, i, 2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        repoterLog = extent.createTest("Collection Of Parameter Maintance Page ");
		 
		
		loginPage = applicationSetup();
		logger.info("Launching application");
		repoterLog.log(Status.INFO, "Application setup completed");
		//loginPage = loginPage.closecrossicon();
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		
		dashboardPage.mouseOverToAfcAccountDropdown();
		dashboardPage.mouseOverToParameterization();
		parameterSearchPage=dashboardPage.mouseOverToParameterMaintance();
		parameterSearchPage.enterCollectionPeriod(period);
		parameterEditPage=parameterSearchPage.clickOnCreateBtn();
		String s=parameterEditPage.captureClosingNo();
		System.out.println(s);
		int a=Integer.parseInt(s); 
		int b=a+1;
		System.out.println(b);
		String clno=String.valueOf(b);
		System.out.println(clno);
		propertyReader.setCellDataXlsx(6, i, 1, clno);
		String date = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
		System.out.println(date);
		parameterEditPage.enterDailyClosingDate(date);
		parameterEditPage.enterAverageUnitFundValue(unit);
		parameterEditPage.clickOnConformBtn();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
