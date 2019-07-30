package corejava.Collections;

import java.util.ArrayList;
import java.util.List;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class List_Interface {

	public static void main(String[] args) 
	{
		
		/*
		 * List:--> Inorder collection of objects. And
		 * 			accept duplicate objects to store..
		 */
		
		
		List<String> list=new ArrayList<String>();
		list.add("RC");
		list.add("WD");
		list.add("GRID");
		list.add("Appium");
		list.add("IDE");
		list.add("WD");
		list.add("Cucumber");
		
		
		//Get size of objects
		int object_count=list.size();
		System.out.println("Object count is => "+object_count);
		
		
		//Get any single obejct using GET Method.
		String object=list.get(3);
		System.out.println("3rd index object is => "+object);
		
		
		//Print all object names using for loop..
		for (int i = 0; i < object_count; i++) 
		{
			String ObjectName=list.get(i);
			System.out.println("=> "+ObjectName);
		}
		
		
		
		//Apply foreach loop to print all objects
		for (String Eachobject : list) 
		{
			System.out.println("@@--> "+Eachobject);
		}
		

	}

}
