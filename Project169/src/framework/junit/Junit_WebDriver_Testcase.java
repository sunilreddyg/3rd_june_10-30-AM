package framework.junit;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_WebDriver_Testcase
{
	
	static WebDriver driver;
	static String driver_path="drivers\\";
	static String URL="http://facebook.com";
	public @Rule TestName test=new TestName();  //Get Current constucted method..
	

	@Test
	public void Tc001_Verify_Signup_Link()
	{
		driver.findElement(By.linkText("Sign Up")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("title verified for signup link");
	}
	
	

	@Test
	public void Tc002_Verify_Messenger_Link()
	{
		driver.findElement(By.linkText("Messenger")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("title verified for Messenger page");
	}
	

	@Test
	public void Tc003_Verify_Games_Link()
	{
		driver.findElement(By.linkText("Games")).click();
		Assert.assertEquals("Games", driver.getTitle());
		System.out.println("title verified for Games page");
	}
	
	
	@Test
	public void Tc004_Verify_Developers_Link()
	{
		driver.findElement(By.linkText("Developers")).click();
		Assert.assertEquals("Facebook for Developers", driver.getTitle());
		System.out.println("title verified for Developers Page");
	}
	
	
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@Before
	public void setUp() throws Exception 
	{
		driver.get(URL); //Load webpage before every test
	}

	@After
	public void tearDown() throws Exception 
	{
		//get default system date
		Date d=new Date();
		//Create simple date format..
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/EEE/dd/ hh-mm-ss");
		//Using date formatter convert system date
		String time=sdf.format(d);
				
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+test.getMethodName()+".png"));
				
	}

	
}
