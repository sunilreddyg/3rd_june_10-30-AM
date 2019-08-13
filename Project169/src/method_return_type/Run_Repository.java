package method_return_type;

public class Run_Repository {

	public static void main(String[] args) 
	{
		
		//Create object for repository
		Repository obj=new Repository();
		obj.drivers_path="drivers\\";
		obj.launch_browser("chrome");
		obj.load_webpage("http://seleniumhq.org");
		obj.set_timeout(30);
		
		
		String Exp_title="Selenium - Web Browser Automation";
		if(obj.is_title_presented(Exp_title))
			System.out.println("Expected title presented for seleniumhq page");
		else
			System.out.println("Title mismatch for seleniumhq page");

		
		String Exp_url="https://www.seleniumhq.org/";
		if(obj.isUrl_Presented(Exp_url))
			System.out.println("Expected url presented");
		else
			System.out.println("wrong url presented");
		
		
		String Exp_text="What is Selenium?";
		if(obj.isText_visibleAt_Webpage(Exp_text))
			System.out.println("Text visible at webpage");
		else
			System.out.println("text not visible at webpage");
		
		
	}

}
