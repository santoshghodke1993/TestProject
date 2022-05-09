package orangehrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import orangehrm.qa.base.testBase;
import orangehrm.qa.util.constant;

public class loginPage extends testBase {

	@FindBy(xpath = "//input[@name='txtUsername']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//div[@id='divLogo']//img")
	WebElement logo;
	
	
	//Initializing Page Objects
	public loginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsername() {
		username.sendKeys(constant.USERNAME);
	}
	
	public void enterPassword() {
		password.sendKeys(constant.PASSWORD);
	}
	
	public DashboardPage clickLoginBtn() {
		loginBtn.click();
		return new DashboardPage();
	}
	
	public boolean checkLogo() {
		return logo.isDisplayed();	
	}
	
	public void Title() {
		String title= driver.getTitle();
		//System.out.println(title);
		//System.out.println(constant.LOGINEXPECTEDTITLE);
		SoftAssert Sassert=new SoftAssert();
		Sassert.assertEquals(title, constant.LOGINEXPECTEDTITLE);
		Sassert.assertAll();
		
	}
	
	public void URL() {
		String Url=driver.getCurrentUrl();
		Assert.assertEquals(Url, constant.URL);
	}
}
