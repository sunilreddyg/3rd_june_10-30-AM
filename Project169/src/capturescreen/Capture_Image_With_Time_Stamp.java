package capturescreen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Capture_Image_With_Time_Stamp 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * 	Note:-->To use fileutils[local folders and files] in selenium 
		 * 			3.6 above version ,below downloads required.  
		 * 
		 * URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 		   Download binrary file  --> commons-io-2.6-bin.zip
		 * 		   Unzip file and configure all executable jar files to selenium-project.
		 */
		
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
					    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
		//Target Location
		WebElement Location=driver.findElement(By.xpath("//a[contains(@id,'anc')]"));
		new Actions(driver).moveToElement(Location).pause(2000).perform();
		
		
		//get default system date
		Date d=new Date();
		//Create simple date format..
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/EEE/dd/ hh-mm-ss");
		//Using date formatter convert system date
		String time=sdf.format(d);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"Targetimage.png"));
		
		
		/*
		 *  Time Stamp formats:-->
		 *  	
		 * 	yyyy -->Current Year
		 *  MMM  -->Current Month  [jan --Dec]
		 *  MM   --> Current Month [01-12]
		 *  EEE  --> Current Week  [SUN -  MON]
		 *  dd   --> Current day date
		 *  hh   --> Hour of the day
		 *  mm   --> Minute of the hour
		 *  ss   --> Seconds 
		 *  	
		 *  	Note:-->  In java time stamp  \  "backward slash Create folder."
		 */

	}

}
