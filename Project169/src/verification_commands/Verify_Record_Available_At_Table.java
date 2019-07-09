package verification_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Verify_Record_Available_At_Table {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.bseindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Identify indicies table
		WebElement table=driver.findElement(By.xpath("/html/body/article/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div[1]/table"));
		
		//Get Table visible text
		String Table_Text=table.getText();
		
		if(Table_Text.contains("S&P BSE 100"))
			System.out.println("Record available at indices list");
		else
			System.out.println("Record not available at indices list");
	}

}
