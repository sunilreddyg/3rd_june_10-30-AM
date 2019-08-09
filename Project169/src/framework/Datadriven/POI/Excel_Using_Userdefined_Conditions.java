package framework.Datadriven.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Using_Userdefined_Conditions 
{

	public static void main(String[] args) throws IOException, Exception
	{
		String filepath="TestData\\InputData.xlsx";
		//Target file using inputstream
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Access workbook using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using above book referral
		XSSFSheet sht=book.getSheetAt(3);
		
		
		//Get count of number of rows data available at sheet
		int Rcount=sht.getLastRowNum();
		
		//Iterate for number of rows 
		for (int i = 5; i <= Rcount; i++) 
		{
			
			//Get Execution status
			String Exe_status=sht.getRow(i).getCell(2).getStringCellValue();
			
			//Condition to accept where execution status is "Y"
			if(Exe_status.equalsIgnoreCase("y"))
			{
				
				//Get Username and password
				String username=sht.getRow(i).getCell(0).getStringCellValue();
				String password=sht.getRow(i).getCell(1).getStringCellValue();
				
				System.out.println(username+"   "+password);
				
				
				Thread.sleep(3000);  //Static Timeout
				
				
				//Get Scenario type
				String Stype=sht.getRow(i).getCell(3).getStringCellValue();
				
				if(Stype.equalsIgnoreCase("P"))
				{
					System.out.println("positive output captured"+"\n");
				}
				else if(Stype.equalsIgnoreCase("N"))
				{
					System.out.println("negative output captured"+"\n");
				}
				else if(Stype.equalsIgnoreCase("text"))
				{
					System.out.println("text output captured"+"\n");
				}
				else if(Stype.equalsIgnoreCase("alert"))
				{
					System.out.println("Alert otuput captured"+"\n");
				}
				
				
			}//Exe
			
		}//Loop
		
		
		
	}

}
