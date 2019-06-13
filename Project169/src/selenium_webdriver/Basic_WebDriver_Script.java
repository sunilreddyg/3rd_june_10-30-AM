package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_WebDriver_Script 
{

	public static void main(String[] args)
	{
		
	//Set Runtime environment variable for chrome driver
	String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", chrome_path);
    
    
    /*
     * Note:--> Webdriver is a common interface class designed to
     * 			implemnts all browser instances supported by [Selenium].
     * 		
     * 		=> Single interface class helps to conduct cross browser automation.
     */
    
   
    //Launch Chrome browser instance
    WebDriver driver= new ChromeDriver();
    //Load webpage to chrome automation browser.
    driver.get("http://facebook.com");
    
    //Identify firstname and type text init
    driver.findElement(By.id("u_0_l")).clear();
    driver.findElement(By.id("u_0_l")).sendKeys("newuser");
    
    //identify surname and type text init
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys("Webdriver");
    
    //identify mobile or email and type text init..
    driver.findElement(By.id("u_0_q")).clear();
    driver.findElement(By.id("u_0_q")).sendKeys("Newuserwebdriver@gmail.com");
    
    //identify re-enter email and type text init
    driver.findElement(By.id("u_0_t")).clear();
    driver.findElement(By.id("u_0_t")).sendKeys("Newuserwebdriver@gmail.com");
    
    //identify password and type text init
    driver.findElement(By.name("reg_passwd__")).clear();
    driver.findElement(By.name("reg_passwd__")).sendKeys("password");
    
    
    
  
    
    
    
    
    
    
    

	}

}
