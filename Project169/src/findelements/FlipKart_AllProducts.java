package findelements;

import java.security.ProtectionDomain;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_AllProducts 
{

	public static void main(String[] args) 
	{
		//set runtime environment variable
		String driver_path="D:\\sunill\\29th_Apr_7-30_AM_2019\\Project_165\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
				
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi");
		driver.manage().window().maximize();
		
		
		//Identify total product locations
		WebElement Products_Table=driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[1]/div[2]"));
		
		//Identify All Prouducts under Table
		List<WebElement> All_Items=Products_Table.findElements(By.className("bhgxx2"));
		System.out.println("Total items in front page displayed is => "+All_Items.size());
		

		//Iterate for number of items
		for (int i = 1; i < All_Items.size()-2; i++) 
		{
			
			WebElement Each_item=All_Items.get(i);
			
			//Get Complete text visible at prodcut table.
			String Item_text=Each_item.getText();
			
			//If product table text contain on offer text get product name
			if(Item_text.contains("ON OFFER"))
			{
				//Get Product Name
				String ProductName=Each_item.findElement(By.className("_3wU53n")).getText();
				System.out.println(ProductName);
						
			}
			
					
		}//for
		
				
			
	}

}
