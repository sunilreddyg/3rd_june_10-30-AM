package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert 
{

	public static void main(String[] args) throws Exception
	{
		
		/*
		 * Scenario:-->
		 * 			Verify search job without enter selectcourse and keyword enter
		 * Steps:-->
		 * 		=> Given url https://www.firstnaukri.com/
		 * 		=> When click search button without enter Select courst and Keyword Enter
		 * 		=> Then receive Alert with expected text.
		 */
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
			    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		//Identify Search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);
		
		
		//Switch to alert
		Alert alert=driver.switchTo().alert();
		
		//get text at alert 
		String alert_msg=alert.getText();
		System.out.println("Alert msg displayed is => "+alert_msg);
		
		//Close alert window
		alert.accept();
		
		
		
		
		/*
		 * Capture text on alert window
		 * 
		 * 	driver.switchTo().alert().getText();
		 * 
		 * Accept popup window    [It close window]
		 * 	
		 * 	driver.switchTo().alert().accept();
		 * 
		 * Dismiss alert window   [It close window]
		 * 
		 * 	driver.switchTo().alert().dismiss();
		 * 
		 * Send text to popup-window  [Prompt window]
		 * 
		 * 	driver.switchTo().alert().sendkeys("text");
		 */

		
		/*
		 * Alert Exceptions:-->
		 * 	
		 * 		UnhandledAlertException  
		 * 		NoalertpresentedException
		 */
		
		
		

	}

}
