package extent_Reports;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports_For_Gmail_Validation 
{

	public static void main(String[] args) throws Exception {
		
		String filepath="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\src\\extent_Reports\\MyReports.html";
		
		//Create object for extensionReports
		ExtentReports reports=new ExtentReports(filepath, true);
		
		ExtentTest test=reports.startTest("Login_valid", "login with valid email");

		//Set Runtime environment variable for chrome driver
		String chrome_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "browser launch successfull");
		
		//Type Text into Editbox
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan@gmail.com");
		test.log(LogStatus.INFO, "Enter Email succesfull");
		
		//Identify Next button
		driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[1]")).click();
		test.log(LogStatus.INFO, "Next button clicked");
		
		Thread.sleep(8000);
		test.log(LogStatus.INFO, "Waiting for 8 seconds");
		
		//capture screen shot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\src\\extent_Reports\\login_email_valid.png";
		FileUtils.copyFile(src, new File(path));
		test.log(LogStatus.INFO, "Screen captured");
		
		//Identify Password
		WebElement password_editbox=driver.findElement(By.name("password"));
				
		if(password_editbox.isDisplayed())
		{
			test.log(LogStatus.PASS, "As expected password visible at webpage"+test.addScreenCapture(path));
			
		}
		else
		{
			test.log(LogStatus.FAIL, "password not visible on "
					+ "valid email entry "+test.addScreenCapture(path));
		}
		
		reports.endTest(test);
		
		

		reports.flush();
		
		
		
	
	}

}
