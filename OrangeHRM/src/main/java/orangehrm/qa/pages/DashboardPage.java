package orangehrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm.qa.base.testBase;

public class DashboardPage extends testBase {
	
	//Object Repository for Dashboard Page
	
	@FindBy(xpath = "//span[text()='Assign Leave']")
	WebElement AssignLeave;
	
	//xpath by using preceding sibling 
	@FindBy(xpath = "//div[@class='quickLaunge']//a//img")
	WebElement Assignleavelogo;
	
	@FindBy(xpath="//span[text()='Leave List']")
	WebElement LeaveList;
	
	@FindBy(xpath = "//span[text()='Leave List']//preceding-sibling::img")
	WebElement leaveListLogo;
	
	//xpath by using following
	@FindBy(xpath = "//img//following::span[text()='Timesheets']")
	WebElement Timesheet;
	
	//xpath by using child relation
	@FindBy(xpath = "//a//child::span[text()='Apply Leave']")
	WebElement ApplyLeave;
	
	//xpath by using descendant relation
	@FindBy(xpath = "//a//descendant::span[text()='My Leave']")
	WebElement MyLeave;

	@FindBy(xpath = "//a//span[text()='My Timesheet']")
	WebElement MyTimesheet;
	
	
	//Initializing Page Objects
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	//click on AssignLeave
	public void ClickOnAssignLeave() {
		AssignLeave.click();
	}
	
	//check assign leave is displayed or not
	public void checkAssignLeaveLogo() {
		Assignleavelogo.isDisplayed();
	}
	
	//click on leave List
	public void ClickOnLeaveList() {
		LeaveList.click();
	}
	
	//check leave list logo
	public void checkLeaveListLogo() {
		leaveListLogo.isDisplayed();
	}
	
	//click on TImesheet
	public void ClickOnTimeSheet() {
		Timesheet.click();
	}

	//click Apply Leave
	public void ClickOnApplyLeave() {
		ApplyLeave.click();
	}
	
	//click My Leave
	public void ClickMyLeave() {
		MyLeave.click();
	}
	
	//click on My Timesheet
	public boolean ClickOnMyTimeSheet() {
		return MyTimesheet.isSelected();
	}
	
}
