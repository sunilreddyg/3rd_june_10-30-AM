package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Muliple_SelectionState {

	public static void main(String[] args) throws Exception
	{
		//Set Runtime environment variable for chrome driver
		String path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");		  //Load webpage to browser window
		driver.manage().window().maximize();  //Optional
		Thread.sleep(5000);		
		
		//IDentfy Dropdown Location.
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown Multiple selection status is => "+flag);
		
		
		/*
		 * Using javscript executor convert single option dropdown to multiple
		 * option dropdown..
		 */
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		//IDentfy Dropdown Location.
		boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown Multiple selection status is => "+flag1);
		
		
		//Decision statement to accept on multiple selection type
		if(flag1==true)
		{
			System.out.println("As expected Dropdown accepting multiple selection");
		}
		else
		{
			System.out.println("Testfail:--> Selected dropdown is not a multiple selection type");
		}
		
		
		
		
		
		
		
	}

}
