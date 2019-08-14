package keyword_driven_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator 
{
	
	public static By convert_locator(String pname, String pvalue)
	{
		
		By by=null;
		
		switch (pname) 
		{
		
		case "id":
			by=By.id(pvalue);
			break;
			
		case "name":
			by=By.name(pvalue);
			break;
			
		case "classname":
			by=By.className(pvalue);
			break;
			
		case "linktext":
			by=By.linkText(pvalue);
			break;
			
		case "partiallinktext":
			by=By.partialLinkText(pvalue);
			break;
			
		case "cssselector":
			by=By.cssSelector(pvalue);
			break;
			
		case "xpath":
			by=By.xpath(pvalue);
			break;
			
		case "tagname":
			by=By.tagName(pvalue);
			break;

		default:System.out.println("locatorname mismatch");
			break;
		}
		
		return by;
		
	}
	
	
	
	public static void main(String args[])
	{
		
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
						
				
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		By UID_Locator=convert_locator("id", "email");
		driver.findElement(UID_Locator).clear();
		driver.findElement(UID_Locator).sendKeys("Email");
		
		
	}
	
	

}
