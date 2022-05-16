package orangehrm.qa.testScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import orangehrm.qa.base.testBase;
import orangehrm.qa.pages.AssignLeavePage;
import orangehrm.qa.pages.DashboardPage;
import orangehrm.qa.pages.RecruitmentPage;
import orangehrm.qa.pages.loginPage;



public class BaseTest extends testBase{
	

	loginPage loginpage;
	DashboardPage dashboard;
	AssignLeavePage assignLeave;
	RecruitmentPage recruitment;
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage =new loginPage();
		dashboard=new DashboardPage();
		assignLeave =new AssignLeavePage();
		recruitment =new RecruitmentPage();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
