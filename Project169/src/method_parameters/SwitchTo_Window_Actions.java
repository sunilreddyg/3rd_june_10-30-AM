package method_parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SwitchTo_Window_Actions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Create object for Repository
		Repository obj=new Repository();
		obj.drivers_path="drivers\\";
		obj.launch_browser("chrome");
		String url="https://www.hdfcbank.com/wholesale/default.htm";
		obj.load_webpage(url);
		obj.set_timeout(30);
		
		By Where_DD=By.xpath("//select[@name='where']");
		obj.Select_Dropdown(Where_DD, "ATM");
		Thread.sleep(5000);
		
		obj.switchto_window("ATMs in India.");
		Thread.sleep(3000);
		obj.Capturescreen("ATM window");
		
		

	}

}
