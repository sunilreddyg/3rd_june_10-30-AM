package verification_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRuntime_Attribute_Property {

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Clicking search button witout enter proper details
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search flights']"));
		Search_btn.click();
		

		/*
		 * Expected:--> System should display appropriate error message.
		 */
		
		
		
		//Verifying Error message visible at webpage using runtime attribute..
		
		WebElement Error_locator=driver.findElement(By.id("homeErrorMessage"));
		String Runtime_Style=Error_locator.getAttribute("style");
		if(Runtime_Style.isEmpty() || Runtime_Style.contains("display:Block"))
		{
			System.out.println("text visible at webpage");
		}
		else
		{
			System.out.println("text not visible at webpage");
		}
	}

}
