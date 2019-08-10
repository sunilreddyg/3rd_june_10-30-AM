package framework.Datadriven.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL_Connection 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		//Set Variable name
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		//Target database using driver manager
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost" + 
		"databaseName=MQDSNR" + "user=sunil" + "password=111");
		
		//Execute query
		ResultSet rs=con.createStatement().executeQuery("SELECT * FROM Customers WHERE City='paris';");
		
		//Iterate for number of records
		while(rs.next())
		{
			
				String Cname=rs.getString("ContactName");
				System.out.println(Cname);
			
		}
		
		
	}

}
