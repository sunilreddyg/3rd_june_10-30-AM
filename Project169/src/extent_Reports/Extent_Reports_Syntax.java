package extent_Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports_Syntax
{

	public static void main(String[] args) 
	{
		
		String filepath="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\src\\extent_Reports\\Reports.html";
		ExtentReports reports=new ExtentReports(filepath, true);
		
		ExtentTest test=reports.startTest("Test Login", "Login with invalid data");

		test.log(LogStatus.INFO, "Browser launched");
		test.log(LogStatus.SKIP, "Skip maximize browser");
		test.log(LogStatus.PASS, "Test verfied");
		test.log(LogStatus.FAIL, "Data not verifed");
		test.log(LogStatus.FATAL, "Total test fail no workarround");
		test.log(LogStatus.INFO, "Screen captured "
		                 +test.addScreenCapture("imagepath"));
	
		reports.endTest(test);
		

		reports.flush();
	}

}
