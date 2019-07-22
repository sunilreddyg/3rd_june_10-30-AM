package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Visibilityof_Element {

	public static void main(String[] args) {
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
													    
		//Browser initiation and loading webpage..
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		System.out.println("Maximized");
		
		//Create object for webdriverait and assign timeout to automation browser
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		
		//Type Email and press enter key
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan");

		
		WebElement Password_Editbox=wait.until
				(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
				
		//Type Password and press enter key
		Password_Editbox.clear();
		Password_Editbox.sendKeys("hello12345"+Keys.ENTER);

	}

}
