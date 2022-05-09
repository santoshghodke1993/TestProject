package orangehrm.qa.testScripts;

import org.testng.annotations.Test;

public class AssignLeaveTest extends BaseTest{
	
	public AssignLeaveTest() {
		super();
	}
	
	@Test
	public void CheckAssignLeave() {
		//testscripts to check assign leave;
		loginpage.enterUsername();
		loginpage.enterPassword();
		loginpage.clickLoginBtn();
		dashboard.ClickOnAssignLeave();
		assignLeave.enterEmployeeName();
		assignLeave.selectLeaveType();
		assignLeave.SelectFromLeaveDate();
		assignLeave.SelectToLeaveDate();
		assignLeave.SelectPartialDays();
		assignLeave.AddComment();
	}

}
