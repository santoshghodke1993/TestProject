package orangehrm.qa.testScripts;

import org.testng.annotations.Test;

public class RecruitmentPageTest extends BaseTest{

	public RecruitmentPageTest() {
		super();
	}
	
	@Test
	public void checkRecruitmentTable() {
		loginpage.enterUsername();
		loginpage.enterPassword();
		loginpage.clickLoginBtn();
		recruitment.clickRecruitmentTab();
		recruitment.checkVacancy();		
	}
}
