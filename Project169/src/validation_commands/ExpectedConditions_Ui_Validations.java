package validation_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExpectedConditions_Ui_Validations 
{

	public static void main(String[] args) 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		
		//Using ExpectedConditions class verify Title presented at webapge.
		boolean flag=ExpectedConditions.titleIs("mail").apply(driver);
		System.out.println("page title status is => "+flag);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
