package framework.Datadriven.POI;

import java.io.FileInputStream;
import java.io.IOException;

public class Target_File_Location {

	public static void main(String[] args) throws IOException 
	{
		
		String filepath="TestData\\InputData.xlsx";
		//Target file using inputstream
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		
		
		
		//target File location using try-catch
		try {
			
			String file="TestData\\InputData.xlsx";
			//Target file using inputstream
			FileInputStream IPS=new FileInputStream(file);
			System.out.println("file located");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
