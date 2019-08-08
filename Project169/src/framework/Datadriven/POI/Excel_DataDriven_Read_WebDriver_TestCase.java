package framework.Datadriven.POI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_DataDriven_Read_WebDriver_TestCase {

	public static void main(String[] args) throws IOException, Exception 
	{
		String filepath="TestData\\InputData.xlsx";
		//Target file using inputstream
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Access workbook using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using above book referral
		XSSFSheet sht=book.getSheetAt(1);
		
		//target row using sheet referral
		XSSFRow row=sht.getRow(1);
		
		
		//Set Runtime Property for chrome Driver
		String chrome_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
							    
		//Launch browser and maximize window
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String URL=row.getCell(1).getStringCellValue();
		driver.get(URL);  //Load webpage
		
		//Get Singin button xpath form Excel
		String Signin_nav_btn=row.getCell(2).getStringCellValue();
		driver.findElement(By.xpath(Signin_nav_btn)).click();
		Thread.sleep(3000);
		
		//Get Email Location and Xpath from Excel
		String Loc_Email=row.getCell(3).getStringCellValue();
		String Input_Email=row.getCell(4).getStringCellValue();
		driver.findElement(By.xpath(Loc_Email)).clear();
		driver.findElement(By.xpath(Loc_Email)).sendKeys(Input_Email);
		
		//Get Next button location from  excel
		String Loc_next_btn=row.getCell(5).getStringCellValue();
		driver.findElement(By.xpath(Loc_next_btn)).click();
		

	}

}
