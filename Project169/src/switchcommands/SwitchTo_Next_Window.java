package switchcommands;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception {
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
			    
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		String MainWindow_ID=driver.getWindowHandle();
		System.out.println(MainWindow_ID);
		
		//Click External link
		driver.findElement(By.linkText("Instagram")).click();
		
		//Get All widnow dynamic id's open throw webdriver scripting.
		Set<String> Allwindow_IDS=driver.getWindowHandles();
		
		//Apply foreach loop
		for (String Eachwindow_ID : Allwindow_IDS) 
		{	//Apply switch to every window
			driver.switchTo().window(Eachwindow_ID);
			
			//Accept condition on otherthan mainwindow
			if(!MainWindow_ID.equals(Eachwindow_ID))
			{
				break; //Break loop on expected window
			}
		}
		
		
		//Identify Element under Instagram window
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).clear();
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("9030248855");
		
		
		//Close Sub window
		driver.close();
		
		//Switch to main window
		driver.switchTo().window(MainWindow_ID);
		System.out.println("Focus available at window  => "+driver.getTitle());
		
		
		

	}

}
