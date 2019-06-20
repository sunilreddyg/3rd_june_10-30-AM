package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editbox
{

	public static void main(String[] args) throws InterruptedException 
	{

		//Set Runtime environment variable for chrome driver
		String path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");//Load webpage to browser window
		driver.manage().window().maximize();     //Optional
		Thread.sleep(10000);
		
		//Identify From Editbox and type referral keyword.
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("H"+Keys.ARROW_RIGHT+"YD");

		
		
		
		Thread.sleep(4000); //Timeout to load suggestions.
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		//Identify To Editbox and type referral keyword
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(4000); //Timeout to load suggestions.
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		//Select Departure date 
		driver.findElement(By.linkText("28")).click();
		
		
		//Select Adults dropdown
		new Select(driver.findElement(By.id("Adults")))
		.selectByVisibleText("4");
		
		
		//Identify Link with ID property
		driver.findElement(By.id("MoreOptionsLink")).click();
		
		
		//Click Search button
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
		
		
		
		
		
	}

}
