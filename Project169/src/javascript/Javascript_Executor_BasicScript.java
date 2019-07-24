package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor_BasicScript {

	public static void main(String[] args) 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
							    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Enable Javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		//Using javascript type text into editbox..
		js.executeScript("document.getElementById('u_0_l').value='Newuser'");
		js.executeScript("document.getElementById('u_0_n').value='Webdriver'");
		
		//Javascript executor identify location using other than ID property..
		WebElement Mobile_EB=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		js.executeScript("arguments[0].value='info.dsnr@gmail.com'", Mobile_EB);
		
		
		//Using javascript select dropdown options..[use Dropdown option value Attribute]
		js.executeScript("document.getElementById('day').value='5'");		
		js.executeScript("document.getElementById('month').value='5'");
	
		//Javascript execution identify location using other than ID property
		WebElement Year_DD=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		js.executeScript("arguments[0].value='1990'", Year_DD);
		
		
		//Identify Female radio button using webdriver 
		WebElement Female_Rbtn=driver.findElement(By.xpath("//input[@value='1']"));
		//click radio button 
		js.executeScript("arguments[0].click()", Female_Rbtn);  
		
		
		//Identify male radio button using webdriver 
		WebElement Male_Rbtn=driver.findElement(By.xpath("//input[@value='2']"));
		//click radio button 
		js.executeScript("arguments[0].checked='true'", Male_Rbtn);  
		
		
		WebElement Create_btn=driver.findElement(By.xpath("//button[@name='websubmit']"));
		js.executeScript("arguments[0].click()", Create_btn);
		
		
		
	}

}
