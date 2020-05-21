package Test;

import org.testng.annotations.Test;

import com.afc.utils.AfcDriverHelper;
import com.aventstack.extentreports.Status;
import com.afc.utils.AfcTestCaseHelper;
import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;

public class Test1 extends AfcTestCaseHelper
{
	
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	
	
	@Test
	public void openLoginPage() throws Exception
	{
		//repoterLog = extent.createTest("openLoginPage");
		
		
		loginPage = applicationSetup();
		//logger.info("Launching application");
		//repoterLog.log(Status.INFO, "Application setup completed");
		//loginPage = loginPage.closecrossicon();
		dashboardPage = loginPage.login();
		logger.info("Log in to application");
		takeScreenShot("Login_CP");
		
		/*
		dashboardPage.mouseOverToManuBarDropDown();
		logger.info("Hovering mouse to manu bar");
		Thread.sleep(2000);
		takeScreenShot("Menubar");
		
		dashboardPage.mouseOverToAdminDropDown();
		takeScreenShot("test1");
		dashboardPage.mouseOverToAuditlogDropDown();
		dashboardPage.mouseOverToAdminutilityDropDown();
		//Thread.sleep(20000);
		
		*/
		//dashboardPage.afcaccount();
		

		
	}


}
