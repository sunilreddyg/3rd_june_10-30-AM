package method_parameters;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository 
{
	
	public WebDriver driver=null;
	public WebDriverWait wait=null;
	String drivers_path=null;
	
	
	/*
	 * Keyword Name:--> LaunchBrowser [Firefox,Chrome,IE]
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void launch_browser(String browsername)
	{
		switch (browsername) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", drivers_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", drivers_path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", drivers_path+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default: System.out.println("browser name mismatch");
			break;
		}
	}
	
	
	
	/*
	 * Keyword Name:--> Load application to browser [http & https]
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void load_webpage(String app_url)
	{
		driver.get(app_url);
		driver.manage().window().maximize();
	}
	
	
	/*
	 * Keyword Name:--> Explicit wait
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void set_timeout(int time_in_sec)
	{
		 wait=new WebDriverWait(driver, time_in_sec);
	}
	
	
	/*
	 * Keyword Name:--> Enter Text into Editbox
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void Enter_Text(String Element_xpath, String InputData)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Element_xpath)));
		Editbox.clear();
		Editbox.sendKeys(InputData);
	}
	
	
	/*
	 * Keyword Name:--> Enter Text into Editbox using By locator referral
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void Enter_Text(By Locator, String InputData)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
		Editbox.clear();
		Editbox.sendKeys(InputData);
	}
	
	
	/*
	 * Keyword Name:--> Enter Text into Editbox  [POM keyword]
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void Enter_Text(WebElement Element, String InputData)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOf(Element));
		Editbox.clear();
		Editbox.sendKeys(InputData);
	}
	
	
	
	/*
	 * Keyword Name:--> select Dropdown  [using xpath locator]
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void Select_Dropdown(String Element_xpath, String Optionname)
	{
		WebElement Dropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Element_xpath)));
		new Select(Dropdown).selectByVisibleText(Optionname);
	}
	
	
	/*
	 * Keyword Name:--> select Dropdown  [using By locator]
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void Select_Dropdown(By locator, String Optionname)
	{
		WebElement Dropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Select(Dropdown).selectByVisibleText(Optionname);
	}
	
	
	
	/*
	 * Keyword Name:--> select Dropdown  [POM]
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void Select_Dropdown(WebElement Element, String Optionname)
	{
		WebElement Dropdown=wait.until(ExpectedConditions.visibilityOf(Element));
		new Select(Dropdown).selectByVisibleText(Optionname);
	}
	
	
	
	
	/*
	 * Keyword Name:--> Click Any Element    [Button, List, checkbox, Radio button]
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void Click_Element(String element_xpath)
	{
		WebElement Clickable_element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element_xpath)));
		Clickable_element.click();
	}
	
	
	/*
	 * Keyword Name:--> Click Any Element    [Button, List, checkbox, Radio button]
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void Click_Element(By locator)
	{
		WebElement Clickable_element=wait.until(ExpectedConditions.elementToBeClickable(locator));
		Clickable_element.click();
	}
	
	
	
	/*
	 * Keyword Name:--> Click Any Element  [POM keyword]  [link, Button, List, checkbox, Radio button]
	 * Author:--> Sunil
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * LastUpdatedDate:-->
	 * ParametersUsed:-->Local Parameter
	 */
	public void Click_Element(WebElement Element)
	{
		WebElement Clickable_element=wait.until(ExpectedConditions.elementToBeClickable(Element));
		Clickable_element.click();
	}
	
	
	
	/*
	 * MethodName:-->Mouse hover on element
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void MouseHover(By locator)
	{
		WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Actions(driver).moveToElement(Element).build().perform();
	}
	
	
	/*
	 * MethodName:-->Mouse hover on element  [POM elemnet]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void MouseHover(WebElement Element)
	{
		WebElement Visible_element=wait.until(ExpectedConditions.visibilityOf(Element));
		new Actions(driver).moveToElement(Visible_element).build().perform();
	}
	
	
	
	/*
	 * MethodName:-->ContextClick
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void RightClick_OnElement(By locator)
	{
		WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Actions(driver).contextClick(Element).perform();
	}
	
	
	/*
	 * MethodName:-->switch to window using window title
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void switchto_window(String window_title)
	{
		//Get all window dyamic id's
		Set<String> allwindows=driver.getWindowHandles();
				
		//Apply foreach loop ot iterate 
		for (String Eachwindow : allwindows) 
		{
			driver.switchTo().window(Eachwindow);
			//Get Current window at runtime
			String pagetitle=driver.getTitle();
					
			if(pagetitle.contains(window_title))
			{
				break;  //At what window title break iteration.It keep window controls on same window.
			}
				
		}	

	}
	
	
	/*
	 * MethodName:-->Capture Screenshot
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Capturescreen(String Imagename) 
	{
		//Java time stamp..
		DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Get System Data
		Date d=new Date();   //import java.util;
		//Using simple formatter change system data..
		String time=df.format(d);

		
		
		try {
			
			File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src1, new File("screens\\"+time+Imagename+".png"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}
