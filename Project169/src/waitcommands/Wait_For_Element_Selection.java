package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Element_Selection 
{

	public static void main(String[] args) 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
						
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		//Identify Element
		By Roundtrip_locator=By.xpath("//input[@value='RoundTrip']");
		//Create object for explicit wait
		new WebDriverWait(driver, 50).until
		(ExpectedConditions.elementSelectionStateToBe(Roundtrip_locator, true));
		System.out.println("Selection state is true");
	}

}
