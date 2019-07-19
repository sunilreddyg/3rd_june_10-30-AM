package touch_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class SingleTab_Touch_Action 
{

	public static void main(String[] args) 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
			    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		//target location
		WebElement Exp_Sal=driver.findElement(By.xpath("//input[@id='cjaMinSal']"));
		
		/*
		 *  Single tap action analogs mouse right click option at webpage
		 *  => Enable touch actions on automation browser
		 */
		new TouchActions(driver).singleTap(Exp_Sal).perform();
		
		

	}

}
