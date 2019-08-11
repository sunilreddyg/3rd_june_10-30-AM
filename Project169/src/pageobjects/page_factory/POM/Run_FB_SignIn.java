package pageobjects.page_factory.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_FB_SignIn {

	public static void main(String[] args) 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
							    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//Create object for Facebook Sign in
		FB_SignIn obj=new FB_SignIn(driver);
		obj.User_login("9030248855", "Hello12345");
		
		

	}

}
