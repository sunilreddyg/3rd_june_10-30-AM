package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Flight_Search 
{
	
	@FindBy(xpath = "//h1[contains(.,'Search flights')]")
	public WebElement Page_header;
	
	@FindBy(how=How.ID,using="OneWay") 
	public WebElement Oneway_Rbtn; 
	
	@FindBy(how=How.XPATH,using="//strong[contains(.,'One way')]")
	public WebElement Oneway_Rbtn_label;
	
	@FindBy(xpath = "//input[@id='RoundTrip']")
	public WebElement Roundtrip_Rbtn;
	
	@FindBy(xpath = "(//strong[contains(.,'Round trip')])[1]")
	public WebElement Roundtrip_Rbtn_Label;
	
	@FindBy(xpath = "//input[@id='MultiCity']")
	public WebElement Multicity_Rbtn;
	
	@FindBy(xpath = "//strong[contains(.,'Multi-city')]")
	public WebElement Multicity_Rbtn_Label;
	
	@FindBy(xpath = "//input[@id='FromTag']")
	public WebElement From_Auto_EB;
	
	@FindBy(xpath = "//input[@id='ToTag']")
	public WebElement To_Auto_EB;
	
	@FindBy(xpath = "//a[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]")
	public WebElement From_City_Option;
	
	@FindBy(xpath = "//a[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]")
	public WebElement To_City_Option;
	
	
	/*
	 * MethodName:--> Flight Search
	 */
	public void Verify_Flights_Search_Page()
	{
		String Runtime_header_Text=Page_header.getText();
		if(Runtime_header_Text.equalsIgnoreCase("Search flights"))
			System.out.println("expected header text visible");
		else
			System.out.println("expected header text not visible");
		
	}
	
	
	/*
	 * MethodName;--> Oneway_Search
	 */
	public void Flight_Oneway_Search()
	{
		
		Oneway_Rbtn.click();
		
		From_Auto_EB.clear();
		From_Auto_EB.sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		From_City_Option.click();
		
		To_Auto_EB.clear();
		To_Auto_EB.sendKeys("DEL");
		To_City_Option.click();
		
	}
	
	
	//InputData
	public String Input_From_City="HYD";
	public String Input_To_City="DEL";
	public String Page_title="#1 Site for Booking Flights, Hotels, Packages, Trains";
}
