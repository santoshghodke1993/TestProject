package orangehrm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm.qa.base.testBase;

public class RecruitmentPage extends testBase {
	
	//Object repository
	@FindBy(xpath = "//a[@id='menu_recruitment_viewRecruitmentModule']/b")
	WebElement RecruitmentTab;

	
	//initializing page object
	public RecruitmentPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions 
	
	//click on recruitment tab
	public void clickRecruitmentTab() {
		RecruitmentTab.click();
	}
	
	//*[@id="resultTable"]/tbody/tr[4]/td[2]
	public void checkVacancy() {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int rowCount=rows.size();
		
		String beforeVacancyXpath="//*[@id='resultTable']/tbody/tr[";
		String afterVacancyXpath="]/td[2]";
		for(int i=1;i<=rowCount;i++) {
			String ActualVacancyXpath=beforeVacancyXpath+i+afterVacancyXpath;
			WebElement Vacancycolumn=driver.findElement(By.xpath(ActualVacancyXpath));
			//System.out.println(Vacancycolumn.getText());
			//System.out.println(" ");
			
			if(Vacancycolumn.getText().equals("Associate IT Manager")) {
				System.out.println("Vacancy : " + Vacancycolumn.getText() + " is found at position " + i);
			}
		}
	}
	
}
