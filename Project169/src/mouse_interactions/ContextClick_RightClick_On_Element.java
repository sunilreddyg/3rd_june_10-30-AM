package mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_RightClick_On_Element {

	public static void main(String[] args) throws Exception {
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		//Idenify location at webapge
		WebElement Element=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//Enable mouse and keyboard interaction on automation browser
		new Actions(driver).contextClick(Element).perform();
		
		
		//Idetify Option at context menu
		WebElement Delete_btn=driver.findElement(By.xpath("//span[text()='Delete']"));
		Delete_btn.click();
		Thread.sleep(5000);  //timeout to watch alert..
		
		
		try {
		
			//Switch to alert and accept alert window
			driver.switchTo().alert().accept();
			
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		
	}

}
