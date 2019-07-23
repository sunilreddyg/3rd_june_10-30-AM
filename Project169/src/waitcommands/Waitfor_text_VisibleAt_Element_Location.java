package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_text_VisibleAt_Element_Location {

	public static void main(String[] args) 
	{
		

		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		//Enter email and press enter key at keyboard
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com");
		
		//Identify location and store into referral
		By text_location=By.xpath("//span[contains(.,'Welcome')]");
		
		//Create object for explicit wait
		new WebDriverWait(driver, 50).until
		(ExpectedConditions.textToBePresentInElementLocated
				(text_location, "Welcome"));
		
		System.out.println("Welcome text visible at webpage");
		
		
		//Enter password
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("hello12345",Keys.ENTER);
	
		
		
		
	}

}
