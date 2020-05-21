package com.afc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.afc.utils.AfcDriverHelper;
import com.afc.pages.UserGroupServiceSearchPage;
import com.afc.pages.DashboardPage;

public class DashboardPage extends AfcDriverHelper
{
	@FindBy(how=How.XPATH, using="//li[@id='burgerDropdown']/a/i[@role='button']")
	private WebElement manuBarDropDown;
	
	@FindBy(how=How.XPATH, using="//span[text()=' Admin']")
	private WebElement admin;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Audit Log'])[1]")
	private WebElement auditlog;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Admin Utility'])[1]")
	private WebElement adminUtility;
	
	@FindBy(how=How.XPATH, using="//span[text()=' Auxillary']")
	private WebElement auxillary;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Aux Upload'])[1]")
	private WebElement auxUpload;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Batch Monitor'])[1]")
	private WebElement batchMonitor;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Scheduler'])[4]")
	private WebElement scheduler;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Job Schedule Starter'])[1]")
	private WebElement jobScheduleStarter;
	
	
	
	// write here IDM xpath
	@FindBy(how=How.XPATH, using="(//label[text()='Identity Management'])[1]")
	private WebElement idmDropdown;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' User Group Service'])[2]")
	private WebElement userGroupService;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' User Service'])[2]")
	private WebElement userService;
	
	
	
	
	
	
	
	
	
	// write here Accounts xpaths
	
	@FindBy(how=How.XPATH, using="//label[text()='AFC-Accounts']")
	private WebElement accountDropdown;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Accounts Creation'])[2]")
	private WebElement accountCreation;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Voluntary Affiliation'])[2]")
	private WebElement voluntaryAffiliation;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Create New Request'])[2]")
	private WebElement createNewRequest;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Approve'])[2]")
	private WebElement approve;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Employer Notification'])[2]")
	private WebElement employerNotification;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Create New Employer Notification'])[2]")
	private WebElement createNewEmployerNotification;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Manual Entry'])[11]")
	private WebElement manualEntry;
	
	@FindBy(how=How.XPATH, using="(//li[@class='dropdown ng-scope dropdown-submenu']/a/span[text()=' Bulk Upload'])[2]")
	private WebElement bulkUpload;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Request Upload'])[2]")
	private WebElement requestUpload;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' External Notification'])[2]")
	private WebElement externalNotification;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Civil Registry Notification'])[2]")
	private WebElement civilRegistryNotification;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Upload CR Response'])[2]")
	private WebElement uploadCRResponse;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' AFP/IPS'])[2]")
	private WebElement aFPIPS;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Upload AFP/IPS Response'])[2]")
	private WebElement uploadAfpresponse;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Stakeholders Records Information'])[2]")
	private WebElement stakeholdersRecordsInformation;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Stakeholders Records Maintenance'])[2]")
	private WebElement stakeholdersRecordsMaintance;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Affiliate Records Maintenance'])[2]")
	private WebElement affilateRecordsMaintance;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Maintenance'])[14]")
	private WebElement affilatesMaintance;
	
	//vpn
	//@FindBy(how=How.XPATH, using="(//span[text()=' Maintenance'])[5]")
	//private WebElement affilatesMaintance;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Employer Records Maintenance'])[2]")
	private WebElement employerRecordsMaintance;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Maintenance'])[15]")
	private WebElement employerMaintance;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Account Maintenance'])[2]")
	private WebElement accountMaintance;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Labor Relationship'])[2]")
	private WebElement laborRelationship;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Labor Relationship Maintenance'])[2]")
	private WebElement laborRelationshipMaintance;
	
	@FindBy(how=How.XPATH, using="(//span[text()=' Maintenance/Enquiry'])[7]")
	private WebElement laborMaintanceAndEnquiry;
	
	@FindBy(how=How.XPATH,using="(//span[text()=' Enquiry'])[17]")
	private WebElement employerNotificationEnquiry;
	
	@FindBy(xpath="(//span[text()=' Parameterization'])[2]")
	 private WebElement parameterization;

	@FindBy(xpath="(//span[text()= ' Collection Files Parameter Maintenance (Operational User)'])[2]")
	 private WebElement parameterMaintance;
	
	@FindBy(xpath="(//span[text()=' Collection Files Parameter Maintenance (Approver)'])[2]")
	 private WebElement parameterApproval;
	
	@FindBy(xpath="(//span[text()=' Bulk Upload'])[22]")
	 private WebElement lrBulkUpload;
	
	
	
	
	
	
	
	
	
	
	
	
	//party
	
	
	
	
	//welcom icon
	
	@FindBy(xpath="(//i[@class='icon-dashboard-my-profile'])[1]")
	 private WebElement welcomeIcon;
	
	@FindBy(xpath="//label[@ficlabel='FICWUI.MyProfile.label']")
	 private WebElement myProfile;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public DashboardPage(final WebDriver driver)
	{
		super(driver);
	}
	
	public DashboardPage mouseOverToManuBarDropDown()
	{
		waitForWebElementPresent(manuBarDropDown, getTimeOut());
		mouseOver(manuBarDropDown, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToAdminDropDown()
	{
		waitForWebElementPresent(admin, getTimeOut());
		mouseOver(admin, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToAuditlogDropDown()
	{
		waitForWebElementPresent(auditlog, getTimeOut());
		mouseOver(auditlog, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToAdminutilityDropDown()
	{
		waitForWebElementPresent(adminUtility, getTimeOut());
		mouseOver(adminUtility, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToAuxillary()
	{
		waitForWebElementPresent(auxillary, getTimeOut());
		mouseOver(auxillary, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToAuxUpload()
	{
		waitForWebElementPresent(auxUpload, getTimeOut());
		mouseOver(auxUpload, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public BatchMonitorSearchPage clickOnBatchMonitor() throws Exception
	{
		waitForWebElementPresent(batchMonitor, getTimeOut());
		mouseOver(batchMonitor, getTimeOut());
		_clickUsingJavaScript(batchMonitor);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, BatchMonitorSearchPage.class);
	}
	
	public DashboardPage mouseOverToSchedulerDropDown()
	{
		waitForWebElementPresent(scheduler, getTimeOut());
		mouseOver(scheduler, getTimeOut());
		_waitForJStoLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public JobScheduleSearchPage clickOnJobScheduleStarter() throws Exception
	{
		waitForWebElementPresent(jobScheduleStarter, getTimeOut());
		mouseOver(jobScheduleStarter, getTimeOut());
		_clickUsingJavaScript(jobScheduleStarter);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, JobScheduleSearchPage.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// write here IDM methods
	
	public DashboardPage mouseOverToIdmDropdown()
	{
		waitForWebElementPresent(idmDropdown, getTimeOut());
		mouseOver(idmDropdown, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public UserGroupServiceSearchPage clickOnUserGroupService() throws Exception
	{
		waitForWebElementPresent(userGroupService, getTimeOut());
		mouseOver(userGroupService, getTimeOut());
		_clickUsingJavaScript(userGroupService);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, UserGroupServiceSearchPage.class);
	}
	
	public UserMaintSearchPage clickOnUserService() throws Exception
	{
		waitForWebElementPresent(userService, getTimeOut());
		mouseOver(userService, getTimeOut());
		_clickUsingJavaScript(userService);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, UserMaintSearchPage.class);
	}
	
	
	
	
	//my profile
	public DashboardPage mouseOverToWelcomeIcon()
	{
		waitForWebElementPresent(welcomeIcon, getTimeOut());
		mouseOver(welcomeIcon, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public MyProfilePage clickOnMyProfile() throws Exception
	{
		waitForWebElementPresent(myProfile, getTimeOut());
		mouseOver(myProfile, getTimeOut());
		_clickUsingJavaScript(myProfile);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, MyProfilePage.class);
	}
	
	
	
	
	
	
	
	
	
	
	//write here Accounts methods
	
	
	public DashboardPage mouseOverToAfcAccountDropdown()
	{
		waitForWebElementPresent(accountDropdown, getTimeOut());
		mouseOver(accountDropdown, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToAccountCreationDropdown()
	{
		waitForWebElementPresent(accountCreation, getTimeOut());
		mouseOver(accountCreation, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	
	public DashboardPage mouseOverToVoluntaryAffiliationDropdown()
	{
		waitForWebElementPresent(voluntaryAffiliation, getTimeOut());
		mouseOver(voluntaryAffiliation, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public AffilatesCreateSearchPage clickOnCreateNewrequest() throws Exception
	{
		waitForWebElementPresent(createNewRequest, getTimeOut());
		mouseOver(createNewRequest, getTimeOut());
		_clickUsingJavaScript(createNewRequest);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, AffilatesCreateSearchPage.class);
	}
	
	
	public AffilatesApproveSearchPage clickOnApproved() throws Exception
	{
		waitForWebElementPresent(approve, getTimeOut());
		mouseOver(approve, getTimeOut());
		_clickUsingJavaScript(approve);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, AffilatesApproveSearchPage.class);
	}
	
	public DashboardPage mouseOverToEmployerNotification()
	{
		waitForWebElementPresent(employerNotification, getTimeOut());
		mouseOver(employerNotification, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	public DashboardPage mouseOverToCreateNewEmployerNotification()
	{
		waitForWebElementPresent(createNewEmployerNotification, getTimeOut());
		mouseOver(createNewEmployerNotification, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public EmployerNotificationCreationManualyPage clickOnManualEntry() throws Exception
	{
		waitForWebElementPresent(manualEntry, getTimeOut());
		mouseOver(manualEntry, getTimeOut());
		_clickUsingJavaScript(manualEntry);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, EmployerNotificationCreationManualyPage.class);
	}
	
	public DashboardPage mouseOverToBulkUpload()
	{
		waitForWebElementPresent(bulkUpload, getTimeOut());
		mouseOver(bulkUpload, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public EmployerNotificationRequestUploadpage clickOnRequestUpload() throws Exception
	{
		waitForWebElementPresent(requestUpload, getTimeOut());
		mouseOver(requestUpload, getTimeOut());
		_clickUsingJavaScript(requestUpload);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, EmployerNotificationRequestUploadpage.class);
	}
	
	public DashboardPage mouseOverToExternalNotificationDropdown()
	{
		waitForWebElementPresent(externalNotification, getTimeOut());
		mouseOver(externalNotification, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToCivilRegistryNotification()
	{
		waitForWebElementPresent(civilRegistryNotification, getTimeOut());
		mouseOver(civilRegistryNotification, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public ResponseFromCRPage clickOnUploadCRResponse() throws Exception
	{
		waitForWebElementPresent(uploadCRResponse, getTimeOut());
		mouseOver(uploadCRResponse, getTimeOut());
		_clickUsingJavaScript(uploadCRResponse);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, ResponseFromCRPage.class);
	}
	
	public DashboardPage mouseOverToAFPIPS()
	{
		waitForWebElementPresent(aFPIPS, getTimeOut());
		mouseOver(aFPIPS, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public ResponseFromAFPPage clickOnUploadAfpIpsResponse() throws Exception
	{
		waitForWebElementPresent(uploadAfpresponse, getTimeOut());
		mouseOver(uploadAfpresponse, getTimeOut());
		_clickUsingJavaScript(uploadAfpresponse);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, ResponseFromAFPPage.class);
	}
	
	public DashboardPage mouseOverToStakeholdersRecordsInformationDropdown()
	{
		waitForWebElementPresent(stakeholdersRecordsInformation, getTimeOut());
		mouseOver(stakeholdersRecordsInformation, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToStakeholdersRecordsMaintanceDropdown()
	{
		waitForWebElementPresent(stakeholdersRecordsMaintance, getTimeOut());
		mouseOver(stakeholdersRecordsMaintance, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToAffilatesRecordsMaintanceDropdown()
	{
		waitForWebElementPresent(affilateRecordsMaintance, getTimeOut());
		mouseOver(affilateRecordsMaintance, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public AffiliateRecordMaintenanceSearchPage clickOnAffilatesMaintance() throws Exception
	{
		waitForWebElementPresent(affilatesMaintance, getTimeOut());
		mouseOver(affilatesMaintance, getTimeOut());
		_clickUsingJavaScript(affilatesMaintance);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, AffiliateRecordMaintenanceSearchPage.class);
	}
	
	public DashboardPage mouseOverToEmployerRecordsMaintanceDropdown()
	{
		waitForWebElementPresent(employerRecordsMaintance, getTimeOut());
		mouseOver(employerRecordsMaintance, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public EmployerRecordMaintenanceSearchPage clickOnEmployerMaintance() throws Exception
	{
		waitForWebElementPresent(employerMaintance, getTimeOut());
		mouseOver(employerMaintance, getTimeOut());
		_clickUsingJavaScript(employerMaintance);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, EmployerRecordMaintenanceSearchPage.class);
	}
	
	public DashboardPage mouseOverToAccountMaintanceDropdown()
	{
		waitForWebElementPresent(accountMaintance, getTimeOut());
		mouseOver(accountMaintance, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToLaborRelationship()
	{
		waitForWebElementPresent(laborRelationship, getTimeOut());
		mouseOver(laborRelationship, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage mouseOverToLaborRelationshipMaintance()
	{
		waitForWebElementPresent(laborRelationshipMaintance, getTimeOut());
		mouseOver(laborRelationshipMaintance, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public LrMaintenanceOrEnquiryPage clickOnLaborEnquiry() throws Exception
	{
		waitForWebElementPresent(laborMaintanceAndEnquiry, getTimeOut());
		mouseOver(laborMaintanceAndEnquiry, getTimeOut());
		_clickUsingJavaScript(laborMaintanceAndEnquiry);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, LrMaintenanceOrEnquiryPage.class);
	}
	
	public EmployerNotificationEnquiryPage clickOnEmployerNotificationEnquiry() throws Exception
	{
		waitForWebElementPresent(employerNotificationEnquiry, getTimeOut());
		mouseOver(employerNotificationEnquiry, getTimeOut());
		_clickUsingJavaScript(employerNotificationEnquiry);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, EmployerNotificationEnquiryPage.class);
	}
	
	public DashboardPage mouseOverToParameterization()
	{
		waitForWebElementPresent(parameterization, getTimeOut());
		mouseOver(parameterization, getTimeOut());
		_waitForJStoLoad();
		_waitForPageLoad();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public ParameterSearchPage mouseOverToParameterMaintance() throws Exception
	{
		waitForWebElementPresent(parameterMaintance, getTimeOut());
		mouseOver(parameterMaintance, getTimeOut());
		_clickUsingJavaScript(parameterMaintance);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, ParameterSearchPage.class);
	}
	
	
	public ParameterApprovalSearchPage mouseOverToParameterApproval() throws Exception
	{
		waitForWebElementPresent(parameterApproval, getTimeOut());
		mouseOver(parameterApproval, getTimeOut());
		_clickUsingJavaScript(parameterApproval);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, ParameterApprovalSearchPage.class);
	}
	
	public LrBulkUploadPage clickOnLaborRelationshipBulkUpload() throws Exception
	{
		waitForWebElementPresent(lrBulkUpload, getTimeOut());
		mouseOver(lrBulkUpload, getTimeOut());
		_clickUsingJavaScript(lrBulkUpload);
		_waitForPageLoad();
		waitfor5sec();
		return PageFactory.initElements(driver, LrBulkUploadPage.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
