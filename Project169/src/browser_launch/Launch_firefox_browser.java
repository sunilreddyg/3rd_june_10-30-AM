package browser_launch;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_firefox_browser {

	public static void main(String[] args)
	{
		
		/*
		 * download geckodriver:-->
		 * 		URL:--> https://github.com/mozilla/geckodriver/releases
		 * 		Select geckodriver version w.r.t browser version.
		 * 				Firefox 65 ---> geckodriver [v0.24.0]
		 * 		Select Window operating system and download zip format file
		 * 		Unzip file to backup location..
		 * 
		 * 	
		 */
		
		//Set Runtime environment variable to geckodriver
		String firefox_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", firefox_path);
		
		//launch firefox browser instance
		FirefoxDriver firefox=new FirefoxDriver();
		//load webpage to browser window.
		firefox.get("http://facebook.com");
		
		
		
		
		
		
		
	}

}
