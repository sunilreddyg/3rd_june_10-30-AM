package verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Styles 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Identifying location
		WebElement Nifty_tab=driver.findElement(By.xpath("//a[@id='TradeRec']"));
		
		//Using Element referral get Element styles
		String Bg_color=Nifty_tab.getCssValue("background-color");
		String color=Nifty_tab.getCssValue("color");
		String Font_size=Nifty_tab.getCssValue("font-size");
		String text_alignment=Nifty_tab.getCssValue("text-align");
		
		
		System.out.println("Bg color is => "+Bg_color);
		System.out.println("element color is => "+color);
		System.out.println("text size at element => "+Font_size);
		System.out.println("text alignment at element => "+text_alignment);
		
		
		String Exp_bg_color="rgba(231, 120, 23, 1)";
		
		
		String Runtime_bg_color=Nifty_tab.getCssValue("background-color");
		if(Runtime_bg_color.equals(Exp_bg_color))
			System.out.println("Nifty tab was active");
		else
			System.out.println("Nifty tab was not active");
	}

}
