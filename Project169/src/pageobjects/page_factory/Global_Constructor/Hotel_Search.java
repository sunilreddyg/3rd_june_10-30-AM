package pageobjects.page_factory.Global_Constructor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Search 
{

	public Hotel_Search(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//h1[contains(.,'Search for hotels')]")
	public WebElement Hotel_Header_Location;
	
	@FindBy(xpath = "//a[@title='Find hotels in destinations around the world']")
	public WebElement Hotels_page_link;
	
	@FindBy(xpath = "//input[@id='Tags']")
	public WebElement Where_locality_EB;
	
	@FindBy(xpath = "//a[contains(.,'Hyderabad, Telangana, India')]")
	public WebElement Locatity_City_Option;
	
	@FindBy(xpath = "//input[@id='CheckInDate']")
	public WebElement CheckIn_Date_EB;
	
	@FindBy(xpath = "//input[@id='CheckOutDate']")
	public WebElement ChekcOut_Date_EB;
	
	@FindBy(linkText="13")
	public WebElement CheckIn_Date_link;
	
	@FindBy(linkText="15")
	public WebElement CheckOut_Date_link;
	
	@FindBy(xpath = "//select[@id='travellersOnhome']")
	public WebElement Travelers_Dropdown;
	
	@FindBy(xpath = "//input[@id='SearchHotelsButton']")
	public WebElement Flight_Search_button;
	
	
	/*
	 * MethodName:-->
	 */
	public void Hotel_Search()
	{
		Hotels_page_link.click();
		
		Where_locality_EB.clear();
		Where_locality_EB.sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		Locatity_City_Option.click();
		
		CheckIn_Date_link.click();
		CheckOut_Date_link.click();
		
		new Select(Travelers_Dropdown).selectByIndex(2);
		
		Flight_Search_button.click();
		
	}
	

}
