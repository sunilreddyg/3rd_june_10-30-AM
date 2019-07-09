package verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Attribute_Property
{

	public static void main(String[] args) throws Exception 
	{
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		//Identify roundtrip 
		WebElement Roundtrip=driver.findElement(By.xpath("//li[text()='Round Trip']"));
		Roundtrip.click();
		Thread.sleep(5000);
		
		
		//Switch to Frame
		String FrameID="webklipper-publisher-widget-container-notification-frame";
		driver.switchTo().frame(FrameID);
		Thread.sleep(4000);
		
		//Close Advertise window.
		String ElementID="webklipper-publisher-widget-container-notification-close-div";
		driver.findElement(By.id(ElementID)).click();
		
		
		//Get controls back to frame
		driver.switchTo().defaultContent();
		
		
		//Idenitfy return date Editbox
		WebElement ReturnDate_Container=driver.findElement(By.xpath("//span[text()='RETURN']/following-sibling::p"));
		//Get Runtime class attribute from return date container
		String Runtime_Class=ReturnDate_Container.getAttribute("class");
	
		if(Runtime_Class.contains("blackText"))
		{
			System.out.println("As expected Return date visible at front page");
		}
		else
		{
			System.out.println("Testfail return not visible at front page");
		}
		
		
		
		


		
	}

}
