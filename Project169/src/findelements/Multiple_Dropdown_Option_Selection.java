package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Dropdown_Option_Selection {

	public static void main(String[] args) throws Exception
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		
		//Identify State Drodpown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		
		//Identify list of options tags under stateDropdown
		List<WebElement> All_State_Options=State_Dropdown.findElements(By.tagName("option"));
		
		//get Size of list of objects
		int Count=All_State_Options.size();
		
		//Iterate list of options time
		for (int i = 0; i < Count; i++)
		{
			//get single option from list of option
			WebElement EachOption=All_State_Options.get(i);
			
			//get text of each option
			String StateName=EachOption.getText();
			
			//Select Each state
			EachOption.click();
			Thread.sleep(1000);
		}
				
	}

}
