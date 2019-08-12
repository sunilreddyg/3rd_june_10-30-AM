package method_parameters;

import org.openqa.selenium.By;

public class Run_Repository 
{

	public static void main(String[] args) 
	{
		
		//Create object for Repository class
		Repository obj=new Repository();
		obj.drivers_path="drivers\\";
		
		obj.launch_browser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(50);
		
		//using xpath
		obj.Enter_Text("//input[@name='firstname']", "Darshan");
		obj.Enter_Text("//input[@name='lastname']", "Ram");
		
		//Using locator Class
		obj.Enter_Text(By.cssSelector("#u_0_q"), "Darshanram@gmail.com");
		
		//Select Dropdown using xpath locator
		obj.Select_Dropdown("//select[@aria-label='Day']", "19");
		obj.Select_Dropdown("//select[@aria-label='Month']", "May");
		obj.Select_Dropdown("//select[@aria-label='Year']", "2012");
		
		
		//Select Radio button
		obj.Click_Element("//input[@value='1']");
		
		
		
		
		
		

	}

}
