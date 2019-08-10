package framework.Datadriven.Notepad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_Data_From_NotepadFile {

	public static void main(String[] args) throws IOException
	{
		
		String filepath="src\\framework\\Datadriven\\Notepad\\InputData.txt";
		//target flatfile location
		FileReader fr=new FileReader(filepath);
		System.out.println("file located");
		
		
		//create object for buffered reader
		BufferedReader reader=new BufferedReader(fr);
		
		String header=reader.readLine();
		//Split comma delimeted file
		String h[]=header.split(",");
		System.out.println("Zero index value is =>"+h[0]);
		System.out.println("first index value is =>"+h[1]);

		
		String rline;
		while((rline=reader.readLine())!=null)
		{
			String line[]=rline.split(",");
			String UID=line[0];
			
			String PWD=line[1];
			
			System.out.println(UID+"   "+PWD);
		}
		
		
		
	}

}
