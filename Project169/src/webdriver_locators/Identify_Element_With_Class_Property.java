package webdriver_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_Element_With_Class_Property {

	public static void main(String[] args) throws Exception 
	{
		
		//Set Runtime environment variable for chrome driver
		String path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");//Load webpage to browser window
		driver.manage().window().maximize();     //Optional
		Thread.sleep(10000);
		
		

	}

}
