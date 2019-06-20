package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_DeseelctingOptions_From_MultipleSelection {

	public static void main(String[] args) throws InterruptedException 
	{
		//Set Runtime environment variable for chrome driver
		String path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");		  //Load webpage to browser window
		driver.manage().window().maximize();  //Optional
		Thread.sleep(5000);		
		

		
		/*
		 * Using javscript executor convert single option dropdown to multiple
		 * option dropdown..
		 */
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
				
				
		//IDentfy Dropdown Location using select class
		Select Dropdown=new Select(driver.findElement(By.id("customState")));
		
		boolean flag=Dropdown.isMultiple();
		System.out.println("Dropdown Multiple selection status is => "+flag);
		
			
		if(flag==true)
		{
			Dropdown.deselectAll();  //Deselect only possible on multipel selection dropdown.
			//Select Multiple option..
			Dropdown.selectByIndex(3);
			Dropdown.selectByIndex(6);
			Dropdown.selectByIndex(9);
			
			
			//Get All Selected Options
			int Scount=Dropdown.getAllSelectedOptions().size();
			if(Scount==3)
			{
				System.out.println("selection match with expected count");
				
				//Deselect single option from multiple selection
				Dropdown.deselectByIndex(9);
				
				//Get All Selected Options
				int Dcount=Dropdown.getAllSelectedOptions().size();
				if(Dcount==2)
				{
					System.out.println("Successfuly deselected single option");
					
				}
				else
				{
					System.out.println("failed to deselect single option");
				}
				
				
			}
			else
			{
				System.out.println("Selection mismatch with expected count");
			}
			
		}
		else
		{
			System.out.println("Testfail:--> Selected dropdown is not a multiple selection type");
		}
				
				

	}

}
