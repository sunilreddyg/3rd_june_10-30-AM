package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker_Select_All_Active_dates {

	public static void main(String[] args) throws InterruptedException
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//Target location
		WebElement Depart_Date=driver.findElement(By.id("dpt_date"));
		Depart_Date.click();  //It Open's calendar.
		Thread.sleep(2000);
		
		
		for (int i = 1; i <= 4; i++) 
		{
			
			
			//Target Active month table
			WebElement Active_month;
			Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table"));
		
			//Find list of active links under current month.
			List<WebElement> Active_dates;
			Active_dates=Active_month.findElements(By.tagName("a"));
			
			//iterate for expected range
			for (int j = 0; j < Active_dates.size(); j++) 
			{
				
				WebElement Each_Date=Active_dates.get(j);
				Each_Date.click();
				//Thread.sleep(1000);
				
				Depart_Date.click();  //It Open's calendar.
				//Thread.sleep(1000);
				
				//Restore table referrals to avoid <<StateElementReference>> Exception
				Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table"));
				Active_dates=Active_month.findElements(By.tagName("a"));
				
	
			}
			
			
			if(i==3)
			{
				//Identify Next month calendar
				WebElement Next_Month_Table=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[2]"));
				List<WebElement> Next_month_Table_Active_links=Next_Month_Table.findElements(By.tagName("a"));
				Next_month_Table_Active_links.get(0).click();  
				
				//Open Calendar
				Depart_Date.click();
			}
				
			WebElement Next_Month_btn=driver.findElement(By.xpath("//a[@title='Next month']"));
			Next_Month_btn.click();
				
		}
		
		
	
		
		
		
		
		

	}

}
