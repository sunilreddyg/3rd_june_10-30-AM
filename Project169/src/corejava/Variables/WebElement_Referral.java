package corejava.Variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement_Referral 
{
	WebDriver driver;
	String path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\";
	String url="http://facebook.com";
	String UID;
	String PWD;
	
	public void lauch_chromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	
	public void lauch_firefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
	}
	
	
	public void User_login()
	{
		//Without Any referral
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(UID);
		
		
		//WebElement Referral
		WebElement PWD_Editbox=driver.findElement(By.id("pass"));
		PWD_Editbox.clear();
		PWD_Editbox.sendKeys(PWD);
		
		//Locator and webElemnet refferal
		By Login_btn_locator=By.id("loginbutton");
		WebElement Login_Btn=driver.findElement(Login_btn_locator);
		Login_Btn.click();
		
	}
	

	public static void main(String[] args)
	{
		
		//Create object for class
		WebElement_Referral obj=new WebElement_Referral();
		obj.lauch_chromeBrowser();
		obj.UID="9030248855";
		obj.PWD="Hello12345";
		obj.User_login();
		obj.driver.close();
		
		
		//Automate using firefox browser
		obj.lauch_firefoxBrowser();
		obj.User_login();
		obj.driver.close();
		
		
		
		
		
		
		
		
		

	}

}
