package validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Element_Enable_OR_disableState 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", chrome_path);
	    
		//browser initiation.
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		
		
		/*
		 * Testcase:-->Verify locality editbox without city & State selection
		 * expected:--> Editbox should disable and display 
		 * 		text Please enter after city selection
		 * 	
		 */
		
		WebElement Locality_Editbox=driver.findElement(By.id("customLocality"));
		if(!Locality_Editbox.isEnabled())
		{
				System.out.println("Testpass:--> As expected Locality editbox was disable before selection of state and city");
		}
		else
		{
				System.err.println("TestFail;--> Locality editox is enabled beore selection of state and city");
		}
		
	
		/*
		 * Testcase:-->Verify locality editbox After city & State  selection
		 * expected:--> Editbox should enable and display
		 * 		text Please enter locality
		 */
		
		//Select State Dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		new Select(State_Dropdown).selectByVisibleText("Telangana");
		
		//Timeout to load city options
		Thread.sleep(5000);
		
		//Select City Dropdown
		WebElement City_dropdown=driver.findElement(By.id("customCity"));
		new Select(City_dropdown).selectByVisibleText("Hyderabad");
		
		//Timeout before validate
		Thread.sleep(5000);
		
		
		if(Locality_Editbox.isEnabled())
			System.out.println("Testpass editbox enabled after state selection");
		else
			System.err.println("Testfail editbox disabled");
		
		
		

	}

}
