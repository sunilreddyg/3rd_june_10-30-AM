package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_Between_Frames {

	public static void main(String[] args) 
	{
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
			    
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize();
		
		//switch to menuframe with id property
		driver.switchTo().frame("menuFrame");
		
		//identify link under menuframe
		driver.findElement(By.xpath("//a[contains(.,'Fee Structure')]")).click();

		//Get control back to mainpage
		driver.switchTo().defaultContent();
		
		//Swicth to another frame
		driver.switchTo().frame("bodyFrame");
		
		//Select Dropdown under body frame
		WebElement Univ=driver.findElement(By.id("univ"));
		new Select(Univ).selectByIndex(3);
		
		
		
		
		
		
	}

}
