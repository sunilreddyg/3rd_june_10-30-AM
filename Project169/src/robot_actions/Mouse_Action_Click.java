package robot_actions;


import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_Action_Click {

	public static void main(String[] args) throws Exception 
	{
		//Handling browser notification popup window.
		
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
							    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Move cusor to location
		robot.mouseMove(305, 166);
		
		//Perform left click action
		robot.mousePress(InputEvent.BUTTON1_MASK);
		//Release Mouse
		robot.mouseRelease(InputEvent.BUTTON1_MASK);

		robot.mouseWheel(500);

	}

}
