package verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_url {

	public static void main(String[] args) 
	{
		

		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", chrome_path);
	    
	    WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");  //Load webpage to browser window
		driver.manage().window().maximize();  //Optional
		
	
		//Store Expected url
		String exp_url="https://www.seleniumhq.org/";
			
		//Capture runtime url
		String Runtime_url=driver.getCurrentUrl();

		//Verify expected and runtime url
		if(Runtime_url.contains(exp_url))
		{
			System.out.println("Expected url found for homepage");
			
			//Identify Element
			WebElement Downlaod_tab=driver.findElement(By.xpath("//a[contains(.,'Download')]"));
			Downlaod_tab.click();
			
			String DownloadPage_url="download/";
			//Capture Runtime url
			if(driver.getCurrentUrl().contains(DownloadPage_url))
				System.out.println("As expected download page url presented");
			else
				System.out.println("Downlod page url not found");
		}
		else
		{
			System.out.println("Homepage url mismatch");
		}
		
	}

}
