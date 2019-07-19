package mouse_interactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args)
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
			    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Create object for action class inorder to access mouse and keyboard interactions
		Actions action=new Actions(driver);
		
		//Location at webpage
		WebElement Category=driver.findElement(By.xpath("//span[text()='Shop by']"));
		//perform mouse hover action at location.
		action.moveToElement(Category).perform();
		
		//Location under main category
		WebElement Sub_Cat=driver.findElement(By.xpath("//span[@class='nav-text'][contains(.,'Mobiles, Computers')]"));
		action.pause(5000).moveToElement(Sub_Cat).perform();
		
		
		//Location under Mobile Phones category
		WebElement Mobiles_Sub_Cat_laptops=driver.findElement(By.xpath("//span[contains(.,'Laptops')]"));
		action.pause(2000).click(Mobiles_Sub_Cat_laptops).perform();
		
	

	}

}
