package verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_page_title 
{

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
				
				
		String Exp_title="Selenium - Web Browser Automation";
		
		//Verify EqualIngorecase comparision between two strings
		boolean flag=Runtime_title.equalsIgnoreCase(Exp_title);
		System.out.println("Selenium Hompage title display status is => "+flag);
		
		
		//Decision to accept on expected title presented
		if(flag==true)
		{
			System.out.println("Expected title presented at webapge");
			WebElement Download_link=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
			Download_link.click();
			
			
			if(driver.getTitle().contains("Downloads"))
				System.out.println("Expected downloads page title verified");
			else
				System.out.println("Downloads page title not verified");
			
			
		}
		else
		{
			System.out.println("Precondition failed Wrong title presented");
		}
		
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
