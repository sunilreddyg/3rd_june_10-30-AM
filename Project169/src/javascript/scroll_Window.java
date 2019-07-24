package javascript;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class scroll_Window
{

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
								
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	
		//To scroll window vertical.
	   ((JavascriptExecutor)driver).executeScript("window.scroll(100,600)");
	   Thread.sleep(4000);
	   
	   //To Scroll horizonal.
	   ((JavascriptExecutor)driver).executeScript("window.scroll(300,100)");
	    
	}

}
