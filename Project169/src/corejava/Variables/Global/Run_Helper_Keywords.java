package corejava.Variables.Global;

public class Run_Helper_Keywords {

	public static void main(String[] args) 
	{
		//Create object for Class
		Helper obj=new Helper();
		
		//Assign chrome driver location at runtime.
		obj.path="D:\\sunill\\3rd_June_10-30_AM_2019\\drivers\\chromedriver.exe";
		obj.Launch_chrome_browser();
		
		//Assign url at runtime
		obj.url="http://facebook.com";
		obj.load_webpage();
		
		//Assign username and password at rutime
		obj.UID="9030248855";
		obj.PWD="Hello123456";
		obj.User_signin();
		
		
		//Close Browser window
		obj.driver.close();
		
		
		
		
	}

}
