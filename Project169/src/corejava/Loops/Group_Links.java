package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links {

	public static void main(String[] args) throws Exception 
	{
		

		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		String links[]={"Sign Up","Log In","Messenger","People","Pages","Games","Terms"};
		
		//iterate for expected array length 
		for (int i = 0; i < links.length; i++) 
		{
			driver.findElement(By.linkText(links[i])).click();
			Thread.sleep(3000);
			
			System.out.println(links[i]+" -->  runtime title is => "+driver.getTitle());
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			
		}
		

	}

}
