package framework.Datadriven.DB;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opencsv.CSVWriter;

public class Dump_Database_RecordsTo_Excel
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
	{
		//Example:-->Database records dump into csv file.
		
		
		//Set Variable name
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		
		String DB_Loc="jdbc:sqlserver://localhost";
		String DB_Name="MQDSNR";
		String DB_UID="Sunil";
		String DB_PWD="Hello";
		
		//Target database using driver manager
		Connection con=DriverManager.getConnection(DB_Loc+DB_Name+DB_UID+DB_PWD);
		
		//Execute Query..
		ResultSet result_set=con.createStatement()
				.executeQuery("select * from studentlist");

		
		//Create New file writer
		String filepath="C:\\Users\\Administrator\\git\\28th_Mar_9AM_161\\Project_161\\src\\framework_datadriven\\CSVfiles\\";
		FileWriter fw=new FileWriter(filepath+"DB_output.csv");
				
		//Create object for CsvFiles
		CSVWriter writer=new CSVWriter(fw);
		writer.writeAll(result_set, true);
		//Save and close
		writer.close();
	
		

	}

}
