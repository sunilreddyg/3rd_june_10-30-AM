package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senkeys_Example {

	public static void main(String[] args) 
	{
		//Set Runtime environment variable for chrome driver
		String path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");		  //Load webpage to browser window
		driver.manage().window().maximize();  //Optional
		
		
		driver.findElement(By.name("firstname"))
		.sendKeys("Arun"+Keys.TAB+"Kiran"
		+Keys.TAB+"arunkiran@gmail.com"
		+Keys.TAB+"arunkiran@gmail.com"
		+Keys.TAB+"hello");
		
		
		//IDentify Dropdown Element
		driver.findElement(By.id("day")).sendKeys("23");
		System.out.println("Select successfull");
		
		
		//Identify Dropdown and use keyboard shortcuts
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		
		
		
		
		
		

	}

}
