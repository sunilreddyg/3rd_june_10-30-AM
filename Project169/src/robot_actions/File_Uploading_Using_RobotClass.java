package robot_actions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_Uploading_Using_RobotClass 
{

	public static void main(String[] args) throws Exception
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
							    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		
		
		WebElement Role_Exp=driver.findElement(By.xpath("//button[@value='exp']"));
		Role_Exp.click();
		
		
		//Identify UploadCV button
		WebElement Upload_CV_Btn=driver.findElement(By.xpath("//input[@name='uploadCV']"));
		new Actions(driver).moveToElement(Upload_CV_Btn).pause(3000).perform();
		Upload_CV_Btn.click();
		Thread.sleep(3000);
		
		
		String text="C:\\Users\\Administrator\\Downloads\\Sunil.docx";
		
		//Select String
		StringSelection Stext=new StringSelection(text);
		//Get default system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//set content to clipboard at runtime.
		clipboard.setContents(Stext, Stext);
		
		
		//Crate object for Robot class
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
				
		//Press Ctrl+V to paste copied text into notepad file
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
				
		//Press enter key
		robot.keyPress(KeyEvent.VK_ENTER);
				
		//Release Control key
		robot.keyRelease(KeyEvent.VK_CONTROL);
				
		
		
		
		

	}

}
