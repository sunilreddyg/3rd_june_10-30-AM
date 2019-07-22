package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover_Visibility_of_Element 
{

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
						
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	
		/*
		 * Note:-->
		 * 		Enable mouse and keybord interaction on automation
		 * 		browser by creation of object for Actions Class.
		 */
		Actions action=new Actions(driver);
		//Create object for explicitwait
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		
		
		By Category_locator=By.xpath("//span[contains(.,'Category')]");
		WebElement Category_Element=wait.until(ExpectedConditions.visibilityOfElementLocated(Category_locator));
		//perfrom hover action on element
		action.moveToElement(Category_Element).perform();
		
		
		By Mobiles_locator=By.xpath("//span[@class='nav-text'][contains(.,'Mobiles, Computers')]");
		WebElement Mobile_Element=wait.until(ExpectedConditions.visibilityOfElementLocated(Mobiles_locator));
		//Perform hover action on it
		action.moveToElement(Mobile_Element).perform();
		
		
		By Laptops_locator=By.xpath("//span[contains(.,'Laptops')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Laptops_locator)).click();
		
		
	

	}

}
