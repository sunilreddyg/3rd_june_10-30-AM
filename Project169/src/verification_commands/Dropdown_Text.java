package verification_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Text 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Testcase:--> Verify expected option available at dropdown.
		 */
		
		
		
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		//Identify State Dropdown and Select Any State
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");
		Thread.sleep(5000);  //timeout to load cities
		
		/*
		 * Scenario:--> 
		 * 			Verify correspondent cities displayed w.r.t
		 * 			state selection
		 */
		
		//Identify CityDropdown
		WebElement City_Dropdown=driver.findElement(By.id("customCity"));
		//Get Dropdown Option text
		String DropdownOptions=City_Dropdown.getText();
	
	
		//Verify expected city available in CityDropdown
		if(DropdownOptions.contains("Hyderabad"))
			System.out.println("Testpass:--> Expected option available at dropdown");
		else
			System.out.println("TestFail:--> Expected option not available at dropdown");
		


	}

}
