package switchcommands;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Window_Using_Iterator 
{

	public static void main(String[] args) throws Exception 
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
		
		
		//Get All dynamic window ID's
		Set<String> Allwindow_IDS=driver.getWindowHandles();
		//All dynamic ID's split into independent iterators.
		Iterator<String> itr=Allwindow_IDS.iterator();
		
		String W1=itr.next();
		driver.switchTo().window(W1);
		System.out.println("W1 title is => "+driver.getTitle());
		
		String W2=itr.next();
		driver.switchTo().window(W2);
		System.out.println("w2 title is => "+driver.getTitle());

		String W3=itr.next();
		driver.switchTo().window(W3);
		System.out.println("w3 title is => "+driver.getTitle());
		
		
		
		//Switch Seat availability window
		driver.switchTo().window(W2);
		System.out.println("Current focused window title is => "+driver.getTitle());
		
		
	}

}
