package robot_actions;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_With_Robot {

	public static void main(String[] args) throws Exception
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
			    
			    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		//Identify Search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);
		
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		
		//Get system default dimension
		Dimension Screen_Dimension=Toolkit.getDefaultToolkit().getScreenSize();
		//Create screen using robot
		BufferedImage Image=robot.createScreenCapture(new Rectangle(Screen_Dimension));
		//Write buffered image into local system
		String Img_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\src\\robot_actions\\Alert.PNG";
		ImageIO.write(Image, "PNG", new File(Img_path));
		
		
		/*
		 * Note:-->
		 * 		Selenium fail to capture screen when alert presented
		 * 		at webpage. But Robot framework capture screen even
		 * 		alert presented at webpage.
		 */
		
		
	}

}
