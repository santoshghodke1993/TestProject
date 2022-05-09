package orangehrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm.qa.base.testBase;
import orangehrm.qa.util.constant;

public class createAccPage extends testBase{
	
	@FindBy(xpath = "//div//preceding::div//input[@id='ap_customer_name']")
	WebElement SignIn;
	
	@FindBy(partialLinkText  = "Create your Amazon account")
	WebElement createAccount;
	
	@FindBy(className = "a-input-text a-span12 auth-autofocus auth-required-field")
	WebElement enterName;
	
	@FindBy(css =  "input[id='ap_phone_number']")
	WebElement enterMobileNo;
	
	@FindBy(name = "secondaryLoginClaim")
	WebElement OptionalMail;
	
	@FindBy(xpath = "//label//following::input[@id='ap_password']")
	WebElement passWord;
	
	@FindBy(xpath = "//input[contains(@id,'ap_password_check')]")
	WebElement passWord_2;
	
	@FindBy(xpath = "//span//child::input")
	WebElement ContinueBtn;
	
	public createAccPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void signIn() {
		SignIn.click();
	}
	
	public void createAmazonAcc() {
		createAccount.click();
	}
	
	public void enterYourName() {
		enterName.sendKeys(constant.EMPLOYEENAME);
	}
	
	public void enterMobileNumber() {
		enterMobileNo.sendKeys(constant.MOBILENUMBER);
	}
	
	public void optionalMail() {
		OptionalMail.sendKeys(constant.OPTIONALMAIL);
	}
	
	public void enterPassword() {
		passWord.sendKeys(constant.PASS);
	}
	
	public void ReEnterPassword(){
		passWord_2.sendKeys(constant.PASS);
	}
	
	public void continueBtn() {
		ContinueBtn.click();
	}
}

