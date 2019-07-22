package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_Syntax {

	public static void main(String[] args) 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
							    
		//Browser initiation and loading webpage..
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		System.out.println("Maximized");
		
		//Assign implicit wait on automation browsers..
		driver.manage().timeouts()
		.implicitlyWait(50, TimeUnit.SECONDS)
		.pageLoadTimeout(50, TimeUnit.SECONDS)
		.setScriptTimeout(30, TimeUnit.SECONDS);
		
		
		
		
		
		
		
		

	}

}
