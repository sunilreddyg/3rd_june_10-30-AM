package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Runtime_Changes 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//Identif Webelement
		WebElement Email_editbox=driver.findElement(By.id("email"));
		
		//Disable Element
		js.executeScript("arguments[0].disabled=true;",Email_editbox);
		Thread.sleep(5000);
		
		//Enabled element
		js.executeScript("arguments[0].disabled=false;",Email_editbox);
		Thread.sleep(5000);
		
		
		//Hide element from webpage
		js.executeScript("arguments[0].style.visibility='hidden';",Email_editbox);
		Thread.sleep(5000);
		
		//Visibility of element
		js.executeScript("arguments[0].style.visibility='visible';",Email_editbox);
		Thread.sleep(5000);
		
		//Convert Single Selection dropdown to multiple selection dropdown
		js.executeScript("document.getElementById('month').setAttribute('multiple','multiple')");
		
	}

}
