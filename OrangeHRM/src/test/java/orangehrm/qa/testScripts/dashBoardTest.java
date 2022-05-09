package orangehrm.qa.testScripts;

import org.testng.annotations.Test;

public class dashBoardTest extends BaseTest {
	
	public dashBoardTest() {
		super();
	}
	
	@Test
	public void checkAssignLeaveLogo() {
		loginpage.enterUsername();
		loginpage.enterPassword();
		loginpage.clickLoginBtn();
		dashboard.checkAssignLeaveLogo();
	}
	
	@Test
	public void leaveListLogo() {
		loginpage.enterUsername();
		loginpage.enterPassword();
		loginpage.clickLoginBtn();
		dashboard.checkLeaveListLogo();
	}
}
