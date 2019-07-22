package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Url_Presented 
{

	public static void main(String[] args) 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
											    
		//Browser initiation and loading webpage..
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		System.out.println("Maximized");
		
		//Create object for webdriverait and assign timeout to automation browser
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.urlContains("https://www.seleniumhq.org/"));
		System.out.println("Url verified for selenium homepage");
		
		
		//Click download button
		WebElement Download_link=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
		Download_link.click();
		
		//Wait and verify url presented for download page
		wait.until(ExpectedConditions.urlContains("/download/"));
		System.out.println("Url verified for downlaods page");
		
		
	}

}
