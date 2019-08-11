package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_FlighSearch 
{

	public static void main(String[] args) 
	{
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
							    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
				
		//Using page factory access  element and methods for required page
		Flight_Search Fsearch=PageFactory.initElements
				(driver, Flight_Search.class);
		
		/*
		 * Syntax:-->
		 * 			pageFactory.initElements(browser_referal,Classname.Class);
		 */
		
		
		
		//caling resuable methods
		Fsearch.Verify_Flights_Search_Page();
		Fsearch.Flight_Oneway_Search();
		
		
		
		

	}

}
