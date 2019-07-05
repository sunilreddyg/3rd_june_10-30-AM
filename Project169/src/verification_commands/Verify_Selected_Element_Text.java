package verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Selected_Element_Text {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:-->  Gmail login with invalid domain-name
		 * 
		 * 		Given valid url http://gmail.com
		 * 		When enter username with invalid domain address
		 * 		And click on Next button
		 * 		Then receive Expected Error msg 'Couldn't find your Google Account'. 
		 * 		
		 */
		
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		//identify location and type invalid email with wrong domain name
		WebElement Username=driver.findElement(By.id("identifierId"));
		Username.clear();
		Username.sendKeys("qadarshan@outlook.com");
		
		//Click Next button
		WebElement Next_btn=driver.findElement(By.xpath("//content[contains(.,'Next')]"));
		Next_btn.click();
		Thread.sleep(4000);
		
		
		//Identify Error location
		WebElement Error_location=driver.findElement(By.xpath("//div[@class='GQ8Pzc']"));
		//capture visible text at error location
		String Error_msg=Error_location.getText();
		
		//Write Decision to accept on text visible at webpage
		if(!Error_msg.isEmpty())  //!--NOT
		{
			System.out.println("error message visible at webpage");
			
					//Verify Error message text comparision
					String Exp_errmsg="Couldn't find your Google Account";
					if(Error_msg.equalsIgnoreCase(Exp_errmsg))
					{
						System.out.println("Expected Error message displayed");
					}
					else
					{
						System.out.println("Wrong error message displayed");
					}
			
		}
		else
		{
			System.out.println("Error message not visible at webpage");
		}
		
		
		
		
		
		
		
		

	}

}
