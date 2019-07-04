package verification_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_VerificationCommands {

	public static void main(String[] args) throws Exception 
	{
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", chrome_path);
	    
	    WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");  //Load webpage to browser window
		driver.manage().window().maximize();  //Optional
		
		
		String Runtime_title=driver.getTitle();
		System.out.println("Current window title is => "+Runtime_title);
		
		
		
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("Current Window url is => "+Runtime_url);
		
		
		String Runtime_pageSource=driver.getPageSource();
		//System.out.println(Runtime_pageSource);
		

		String Runtime_WindowID=driver.getWindowHandle();
		System.out.println(Runtime_WindowID);
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
