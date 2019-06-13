package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) throws Exception 
	{
		
		//Set Runtime environment variable for chrome driver
		String path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");		  //Load webpage to browser window
		driver.manage().window().maximize();  //Optional
		
		//Type Email and press enter key
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan"+Keys.ENTER);

		Thread.sleep(4000);
		
		//Type Password and press enter key
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("hello12345"+Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
	}

}
