package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_ChromeBrowser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver:-->
		 * 		URL:--> https://www.seleniumhq.org/download/
		 * 				Under Third Party Browser Drivers 
		 * 				Click Google chrome driver link.
		 * 				And download chromedriver w.r.t browser version.
		 * 
		 * Note:--> Before execute browser launch syntax Set Runtime
		 * 			environment variable for chrome driver
		 */
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
		
		//launching chrome browser
		ChromeDriver chrome=new ChromeDriver();
		//Load webpage to browser window.
		chrome.get("http://facebook.com");
		

		
		
		
		

	}

}
