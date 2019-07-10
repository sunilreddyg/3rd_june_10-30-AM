package verification_commands;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_DepartureDate_And_SystemDate 
{

	public static void main(String[] args)
	{
		/*
		 * example:--> Verify system date match with deparute date.
		 */
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebElement DepartueDate=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String Ddate=DepartueDate.getAttribute("value");
		
		//Get Default system date
		Date d=new Date();
		//Create simple date formatter
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		//Using simple date formatter convert default date
		String Sdate=sdf.format(d);
		
		//Verify Expected genarated at departure date
		if(Sdate.equals(Ddate))
			System.out.println("Date match");
		else
			System.out.println("Date mismatch");
		

	}

}
