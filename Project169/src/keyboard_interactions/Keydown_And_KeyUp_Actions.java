package keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keydown_And_KeyUp_Actions {

	public static void main(String[] args) 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
				

		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		//Identify Frame Location
		WebElement Demo_frame=driver.findElement(By.className("demo-frame"));
		//Switch browser control to frame
		driver.switchTo().frame(Demo_frame);
		
		
		//perform keydown action at automation browser
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		
		//Click 1,3,5,7 items
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
		
		//perform keyup action at automation browser..
		new Actions(driver).keyUp(Keys.CONTROL).perform();
	
		// keydown and keyup actions at automation browser
		
		//perform keydown action at automation browser
		new Actions(driver).keyDown(Keys.CONTROL).perform();
				
		
		//perform keyup action at automation browser..
		new Actions(driver).keyUp(Keys.CONTROL).perform();
		
		new Actions(driver).keyDown(Keys.CONTROL).keyDown(Keys.ALT)
		.sendKeys("T").perform();
		
		
		new Actions(driver).keyDown(Keys.CONTROL)
		.keyDown(Keys.SHIFT).sendKeys(Keys.chord("D")).perform();
		
	
	}

}
