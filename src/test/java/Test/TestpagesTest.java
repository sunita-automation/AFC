package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.afc.pages.CreateUserGroupServicePage;
import com.afc.pages.DashboardPage;
import com.afc.pages.LoginPage;
import com.afc.pages.Testpages;
import com.afc.pages.UserGroupServiceSearchPage;
import com.afc.utils.AfcDriverHelper;



public class TestpagesTest extends AfcDriverHelper 

{
	public TestpagesTest(WebDriver webdriver) {
		super(webdriver);
		// TODO Auto-generated constructor stub
	}


	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private Testpages testpages;
	private UserGroupServiceSearchPage userGroupServiceSearchPage;
	
	private  String UserGrpname;
	



	
}
