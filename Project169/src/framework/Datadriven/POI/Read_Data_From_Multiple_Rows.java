package framework.Datadriven.POI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_From_Multiple_Rows {

	public static void main(String[] args) throws IOException, Exception 
	{
		String filepath="TestData\\InputData.xlsx";
		//Target file using inputstream
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Access workbook using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using above book referral
		XSSFSheet sht=book.getSheetAt(2);
		
		//return number at what row data started.
		int Frnum=sht.getFirstRowNum();
		System.out.println("Data started at row is => "+Frnum);
		
		//Get Count of Number of rows data available
		int Lrnum=sht.getLastRowNum();
		System.out.println("Number of rows available is => "+Lrnum);
		
		
		
		
		//Set Runtime Property for chrome Driver
		String chrome_path="C:\\Users\\Administrator\\git\\3rd_june_10-30-AM\\Project169\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
							    
		//Launch browser and maximize window
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		
		//Iterate for number of rows
		for (int i = 5; i <= Lrnum; i++) 
		{
			//get static data from excel
			String URL=sht.getRow(0).getCell(1).getStringCellValue();
			String Loc_email=sht.getRow(1).getCell(1).getStringCellValue();
			String Loc_pwd=sht.getRow(2).getCell(1).getStringCellValue();
			String Loc_signin_btn=sht.getRow(3).getCell(1).getStringCellValue();
			
			
			
			//Get Dynamci row and Static Cell Data
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(UID+"  "+PWD);
			
			
			//Load url
			driver.get(URL);
			
			//Enter Email
			driver.findElement(By.xpath(Loc_email)).clear();
			driver.findElement(By.xpath(Loc_email)).sendKeys(UID);
			
			//Enter Password
			driver.findElement(By.xpath(Loc_pwd)).clear();
			driver.findElement(By.xpath(Loc_pwd)).sendKeys(PWD);
			
			//Click Signin buttin
			driver.findElement(By.xpath(Loc_signin_btn)).click();
			Thread.sleep(2000);
			
		}
		
		
		
		
		
	}

}
