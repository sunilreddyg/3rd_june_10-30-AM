package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    	
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		/*
		 * Note:-->
		 * 		Enable mouse and keybord interaction on automation
		 * 		browser.
		 */
		Actions action=new Actions(driver);
		
		
		//Identify Elements
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dst=driver.findElement(By.xpath("//div[@id='droptarget']"));
		
	
		//Perfrom drag and drop acton
		action.dragAndDrop(src, dst).build().perform();
		
		
		
		/*
		 * Example:-->
		 * 		https://jqueryui.com/droppable/
		 */
		

	}

}
