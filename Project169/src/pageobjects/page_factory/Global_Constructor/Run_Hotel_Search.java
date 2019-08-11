package pageobjects.page_factory.Global_Constructor;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Hotel_Search {

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
		
		
		//Create object for HotelSearch class
		Hotel_Search obj=new Hotel_Search(driver);
		obj.Hotel_Search();


	}

}
