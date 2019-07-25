package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Examples {

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
		
		
		//return current window title
		String Runtime_title=js.executeScript("return document.title").toString();
		System.out.println("Curret window title is => "+Runtime_title);
		
		//return current window URL
		String Runtime_url=js.executeScript("return window.location.href").toString();
		System.out.println("Current window title is => "+Runtime_url);
		
		//Move to Element using mouse action.
		js.executeScript("document.getElementById('month').scrollIntoView()");
		
	
		//Create popup using javascript
		js.executeScript("return alert('Tc001 Execution finished')");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();		
		
		
		

	}

}
