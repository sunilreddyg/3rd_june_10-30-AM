package method_parameters;

import pageobjects.page_factory.Global_Constructor.Hotel_Search;

public class Run_pageobjects {

	public static void main(String[] args) {
		
		//Create object for Repository class
		Repository obj=new Repository();
		obj.drivers_path="drivers\\";
				
		obj.launch_browser("chrome");
		obj.load_webpage("http://cleartrip.com");
		obj.set_timeout(50);
		
		
		//Create object to access pageoject
		Hotel_Search Hsearch=new Hotel_Search(obj.driver);
		obj.Click_Element(Hsearch.Hotels_page_link);		

		obj.Enter_Text(Hsearch.Where_locality_EB, "HYD");
		obj.Click_Element(Hsearch.Locatity_City_Option);
	}

}
