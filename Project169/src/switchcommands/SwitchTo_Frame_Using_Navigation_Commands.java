package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Navigation_Commands 
{

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
			    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");
		Thread.sleep(5000);
		
		//identify element under frame
		WebElement Email_Eb=driver.findElement(By.id("email"));
		Email_Eb.clear();
		Email_Eb.sendKeys("qadarshan@gmail.com");
		
		//identify element under frame
		WebElement TripID=driver.findElement(By.id("tripidSecond"));
		TripID.clear();
		TripID.sendKeys("12345878");
		
		//Get mainpage using navigation method
		driver.navigate().back();
	
		//identify element under page
		driver.findElement(By.linkText("Flights")).click();
		
		
		

	}

}
