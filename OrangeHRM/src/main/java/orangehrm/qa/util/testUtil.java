package orangehrm.qa.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import orangehrm.qa.base.testBase;

public class testUtil extends testBase {

	public static long implicit_wait=10;
	public static long explicit_wait=30;
	
	public static void selectDropDownValue(WebElement locator, String type, String value) {
	
		Select select= new Select(locator);
		
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibletext":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("please pass the correct selection criteria...");
			break;
		}
	}
}
