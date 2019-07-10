package verification_commands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_GetLocation 
{

	public static void main(String[] args) 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		//identify location
		WebElement sensex_tab=driver.findElement(By.id("InvestRec"));
		
		//Get Element X and Y coordinates
		Point Obj_point=sensex_tab.getLocation();
		//using object point get x and y coorindates
		int Obj_x=Obj_point.getX();
		int Obj_y=Obj_point.getY();
		
		System.out.println("Object x coordinates are => "+Obj_x);
		System.out.println("Object y coordinates are => "+Obj_y);
		
		/*
		 * Note:--> Method return coordinates for only visible elements. 
		 * Incase Element not visible method return zero coorindates..
		 */
		if(Obj_x > 0)
			System.out.println("Element visible at webpage");
		else
			System.out.println("Elemnt not visible at webpage");
		
	}

}
