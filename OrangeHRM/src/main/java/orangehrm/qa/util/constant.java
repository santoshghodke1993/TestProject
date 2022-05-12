package orangehrm.qa.util;

import orangehrm.qa.base.testBase;

public class constant extends testBase{
 
	 public static String BROWSER=prop.getProperty("browser");
	 public static String URL=prop.getProperty("url");
	 public static String USERNAME=prop.getProperty("username");
	 public static String PASSWORD=prop.getProperty("password");
	 public static String LOGINEXPECTEDTITLE=prop.getProperty("LoginPageExpectedtitle");
	 public static String CHROMEPATH=prop.getProperty("chrome");
	 public static String EDGEPATH=prop.getProperty("edge");
	 public static String IEPATH=prop.getProperty("IE");
	 public static String PROPERTIESPATH="src\\main\\java\\orangehrm\\qa\\config\\config.properties";
	 public static String CHROMEKEY=prop.getProperty("chromeDriver");
	 public static String EDGEKEY=prop.getProperty("edgeDriver");
	 public static String IEKEY=prop.getProperty("IEDriver"); 
	 public static String EMPLOYEENAME=prop.getProperty("EmpName");
	 public static String LEAVETYPE=prop.getProperty("LeaveType");
	 public static String PARTIALDAYS=prop.getProperty("partialDays");
	 public static String COMMENT=prop.getProperty("assignLeaveComment");
	 
	 public static String MOBILENUMBER=prop.getProperty("MobileNo");
	 public static String OPTIONALMAIL=prop.getProperty("OptionalMail");
	 public static String PASS=prop.getProperty("Password_2");
	 
	 public static String FROM_DATE=prop.getProperty("fromDate");
	 public static String FROM_MONTH=prop.getProperty("fromMonth");
	 public static String FROM_YEAR=prop.getProperty("fromYear");
	 public static String TO_DATE=prop.getProperty("toDate");
	 public static String TO_MONTH=prop.getProperty("toMonth");
	 public static String TO_YEAR=prop.getProperty("toYear");
	
}