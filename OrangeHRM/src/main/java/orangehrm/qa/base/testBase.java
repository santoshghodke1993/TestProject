package orangehrm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import orangehrm.qa.util.constant;
import orangehrm.qa.util.testUtil;

public class testBase {
	
	public static  WebDriver driver;
	public static Properties prop;
	
	
	public testBase() {
		prop= new Properties();
		 FileInputStream file;
		try {
			file = new FileInputStream("src\\main\\java\\orangehrm\\qa\\config\\config.properties");
			prop.load(file);
		} catch (IOException e) {
	
		}
	}

	public static void initialization() {
		String browser=constant.BROWSER;
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(constant.CHROMEKEY, constant.CHROMEPATH);
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty(constant.IEKEY, constant.IEPATH);
			driver = new InternetExplorerDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty(constant.EDGEKEY, constant.EDGEPATH);
			driver = new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.get(constant.URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(testUtil.implicit_wait));
	}
}
