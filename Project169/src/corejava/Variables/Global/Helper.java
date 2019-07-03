package corejava.Variables.Global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper 
{
	WebDriver driver=null;
	String url=null;
	String UID=null;
	String PWD=null;
	String path=null;
	
	public void Launch_chrome_browser()
	{
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	public void load_webpage()
	{
		driver.get(url);
	}
	
	
	public void User_signin()
	{
		driver.findElement(FB_SignIn_Locators.Email).clear();
		driver.findElement(FB_SignIn_Locators.Email).sendKeys(UID);
		
		driver.findElement(FB_SignIn_Locators.Password).clear();
		driver.findElement(FB_SignIn_Locators.Password).sendKeys(PWD);
		
		driver.findElement(FB_SignIn_Locators.Login_btn).click();
	}
	

}
