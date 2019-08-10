package framework.Datadriven.CSV_Files;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Read_Data_From_CsvFiles {

	public static void main(String[] args) throws IOException
	{
		
		String filepath="src\\framework\\Datadriven\\CSV_Files\\TestData.csv";
		FileReader fr=new FileReader(filepath);
		System.out.println("file located");
		
		//Create object for csvreader using input file
		CSVReader reader=new CSVReader(fr);
		
		String header[]=reader.readNext();
		System.out.println(header[0]+"  "+header[1]);
		
		//Read next record
		String line1[]=reader.readNext();
		System.out.println(line1[0]+"    "+line1[1]);
		
		//Iterate untile next line records read null
		String Rline[];
		while((Rline=reader.readNext()) != null)
		{
			System.out.println(Rline[0]+"  "+Rline[1]);
		}
		
		
		
		

	}

}
