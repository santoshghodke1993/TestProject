package orangehrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import orangehrm.qa.base.testBase;
import orangehrm.qa.util.constant;

public class AssignLeavePage extends testBase{
	
	//Object Repository
	@FindBy(css = "input#assignleave_txtEmployee_empName")
	WebElement EmployeeName;
	
	@FindBy(css = "select[id='assignleave_txtLeaveType']")
	WebElement LeaveType;
	
	@FindBy(css = "input#assignleave_txtFromDate")
	WebElement LeaveFromDate;
	
	@FindBy(className = "ui-datepicker-month")
	WebElement Month;
	
	@FindBy(xpath = "//a[text()='2']")
	WebElement Date;
	
	@FindBy(xpath ="//input[@id='assignleave_txtToDate']")
	WebElement LeaveToDate;
	
	@FindBy(name = "assignleave[partialDays]")
	WebElement PartialDay;
	
	@FindBy(name = "assignleave[txtComment]")
	WebElement comment;
	
	@FindBy(id = "assignBtn")
	WebElement assignBtn;

	
	// Initializing page object
	public AssignLeavePage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions
	// enter employee name 
	public void enterEmployeeName() {
		EmployeeName.sendKeys(constant.EMPLOYEENAME);
	}
	
	// Select leave type
	public void selectLeaveType() {
		Select dropLeave=new Select(LeaveType);
		dropLeave.selectByVisibleText(constant.LEAVETYPE);
	}
	
	// Select Date from datepicker
	public void SelectFromLeaveDate() {
		LeaveFromDate.click();
		Select dropMonth=new Select(Month);
		dropMonth.selectByIndex(4);
		Date.click();
	}
	
	// Select Date from datepicker
	public void SelectToLeaveDate() {
		LeaveToDate.click();
		Select dropMonth2=new Select(Month);
		dropMonth2.selectByIndex(5);
		Date.click();
	}
	
	//select partial days
	public void SelectPartialDays() {
		Select dropPartialDays=new Select(PartialDay);
		dropPartialDays.selectByVisibleText(constant.PARTIALDAYS);
	}
	
	//Add comment for leave
	public void AddComment() {
		comment.sendKeys(constant.COMMENT);
	}
	
	//click on assign Btn
	public void clickAssignBtn() {
		assignBtn.click();
	}
}
