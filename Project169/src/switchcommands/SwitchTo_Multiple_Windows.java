package switchcommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException 
	{
		

		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//Get All dynamic window ID's
		Set<String> Allwindow_IDS=driver.getWindowHandles();
		
		//Apply foreach loop
		for (String EachWindow_ID : Allwindow_IDS) 
		{
			//Switch to every window using runtime ID
			driver.switchTo().window(EachWindow_ID);
			//Capture Title of Window
			String Runtime_title=driver.getTitle();
			
			if(Runtime_title.contains("Seat Availability"))
			{
				break; //Break iteration 
			}
			
		}
		
		
		System.out.println("Current Focused window is => "+driver.getTitle());
	}

}
