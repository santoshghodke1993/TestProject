package orangehrm.qa.testScripts;

import org.testng.annotations.Test;

public class loginPageTest extends BaseTest {
	
	public loginPageTest() {
		super();
	}
	
	@Test
	public void checkLogin() {
		loginpage.enterUsername();
		loginpage.enterPassword();
		loginpage.clickLoginBtn();
	}
	
	@Test
	public void checkTitle() {
		loginpage.Title();	}
	
	@Test
	public void checkLogo() {
		loginpage.checkLogo();
	}
	
	@Test
	public void checkURL() {
		loginpage.URL();
	}

}
