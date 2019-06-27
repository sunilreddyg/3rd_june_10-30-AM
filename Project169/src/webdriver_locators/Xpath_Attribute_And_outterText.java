package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute_And_outterText 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Set Runtime environment variable for chrome driver
		String path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");//Load webpage to browser window
		driver.manage().window().maximize();     //Optional
		
		
		/*
		 * Identify Elemnet with element outtertext.
		 * HtmlSource:--> 
		 * 		<button  id="cjaMain">Create a Job Alert</button>
		 * Syntax:-->
		 * 			//tagname[text()='Elementtext']
		 */
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();
		
		

		/*
		 * IDentify Element with unique attribute proprty
		 * HtmlSource:-->
		 * 			<input name="keyskills" type="text" id="Sug_kwdsugg">
		 * Sytnax:-->
		 * 		//tagname[@Attributename='Attributevalue']
		 */
		driver.findElement(By.xpath("//input[@id='Sug_kwdsugg']")).clear();
		driver.findElement(By.xpath("//input[@id='Sug_kwdsugg']")).sendKeys("software testing");
		Thread.sleep(3000);
		
		//Select List of Items using xpath outter text
		driver.findElement(By.xpath("//div[text()='Software Testing']")).click();
		Thread.sleep(3000);
		
		//Select Item from list using xpath outter text
		driver.findElement(By.xpath("//div[.='Automation Testing']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//div[text()='Appium']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[.='Selenium']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[.='Cucumber']")).click();
		Thread.sleep(3000);
		
		
		
		
		
		

	}

}
