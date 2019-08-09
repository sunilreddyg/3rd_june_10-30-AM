package framework.Datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Read_PropertyFile_Data {

	public static void main(String[] args) throws IOException
	{
		String filepath="src\\framework\\Datadriven\\PropertyFiles\\Input.properties";
		//Target file using inputstream
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Create object for property files
		Properties repository=new Properties();
		//Load data to repository
		repository.load(fi);
		
		//Get Property value using keyname
		String URL=repository.getProperty("facebook.url");
		System.out.println("Appication url is => "+URL);
		
		
		//Get Property value using keyname
		String UID=repository.getProperty("username");
		System.out.println("username is => "+UID);
		
		
		//Get Property Value using keyname
		String Loc_Username=repository.getProperty("username_locator");
		System.out.println("username locator is => "+Loc_Username);
	}

}
