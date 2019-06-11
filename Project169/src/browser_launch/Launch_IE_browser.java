package browser_launch;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_IE_browser {

	public static void main(String[] args) 
	{
		
		/*
		 * downlaod IEDriverServer:-->
		 * 		URL:--> https://www.seleniumhq.org/download/
		 * 		Under The Internet Explorer Driver Server,
		 * 		Downlaod w.r.t hotspot size  32 bit  0r 64 bit.
		 * 
		 * 		Note:-->
		 * 			=> Zoom level should be 100..
		 * 			=> All security and private setting should 
		 * 				be disabled..
		 * 			=> Browser version support IE7,IE8---IE11.
		 * 			=> IEdriverServer we need to download w.r.t 
		 * 				selenium version.	
		 * 
		 */
		
		//Set Runtime environment variable to iedriver
		String Ie_path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", Ie_path);
				
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
		

	}

}
