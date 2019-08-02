package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Click_InsideCell_Using_refferal_Text {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Example:--> target cell from dynamic rows and click	
		 * 				inside cell..
		 */
		
		
		//Set Runtime environment variable for chrome driver
				String chrome_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\drivers\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", chrome_path);
									    
				//browser initiation
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				//Identify Markets link
				WebElement Markets_Menu=driver.findElement(By.xpath("//a[@href='https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx'][contains(.,'markets')]"));
				Markets_Menu.click();
				
				
				//Identify Table
				WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
				
				//Find list of rows available under table
				List<WebElement> rows=table.findElements(By.tagName("tr"));
				
				boolean flag=false;
				//iterate for number of rows
				for (int i = 1; i < rows.size(); i++)
				{
					//Select Specfic row using index number
					WebElement DynamicRow=rows.get(i);
					
					//Get Text available at webtable
					String RowText=DynamicRow.getText();
					
					//Accept condition only on expected found at dynamic rows.
					if(RowText.contains("TATMOT"))
					{
						flag=true;
						//Using selected row find list of cell available..
						List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
						
						cells.get(7).findElement(By.tagName("a")).click();
						break; //break row iteration 
						
					}
					
				}//for
				
				System.out.println("record found status is => "+flag);
				
				
				if(flag==true)
				{
					Thread.sleep(5000);
					WebElement Live_news=driver.findElement(By.xpath("//div[@id='tinydata']/table"));
					String News=Live_news.getText();
					System.out.println(News);
				}

	}//main

}//class
