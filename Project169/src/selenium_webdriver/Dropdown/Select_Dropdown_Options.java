package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Options {

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime environment variable for chrome driver
		String path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");		  //Load webpage to browser window
		driver.manage().window().maximize();  //Optional
		
		//Select dropdown option using option-name
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Chandigarh");
		Thread.sleep(5000);  //timeout to load cities
		
		
		//Select dropdown option using option-value property..
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("chandigarh");
		
		
		//type text into editbox
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Gandhi nagar");
		
		
		//Select dropdown option using Option-index number..
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(3);
		
		
		//Select checkbox  
		driver.findElement(By.id("amenity_category_order_types50")).click();
		
		/*
		 * Note:--> Checkbox selection and Deselction we use same
		 * 			command click..
		 */
		
		
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[1]/div[1]/form[2]/ul/li[7]/input")).click();

	}

}
