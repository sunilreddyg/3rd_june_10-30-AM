package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links {

	public static void main(String[] args) throws InterruptedException
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		//Identify Footer link location
		WebElement Footer_Area;
		Footer_Area=driver.findElement(By.xpath("//ul[@class='inline clearFix']"));
		
		//Find List of links available under footer area
		List<WebElement> All_links;
		All_links=Footer_Area.findElements(By.tagName("a"));

		//iterate for number of links
		for (int i = 0; i < All_links.size(); i++) 
		{
			//Target Each link using index number
			WebElement Eachlink=All_links.get(i);
			
			//get Linkname and href
			String linkname=Eachlink.getText();
			String linkhref=Eachlink.getAttribute("href");
			
			System.out.println(linkname+"    "+linkhref);
			
			//Click Eachlink
			Eachlink.click();
			Thread.sleep(4000);
			
			
			//Navigate to Homepage
			driver.navigate().back();
			Thread.sleep(4000);
			

			//Restore all referral to avoid <<"staleelementreference">> exception
			Footer_Area=driver.findElement(By.xpath("//ul[@class='inline clearFix']"));
			All_links=Footer_Area.findElements(By.tagName("a"));
		}
		
	}

}
