package corejava.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
		
		
		//Get any single obejct using index number.
		String single_object=list.get(3);
		System.out.println("3rd index value is => "+single_object);
		
		
		
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
		
		
		
		
		/*
		 * List:--> Linked List
		 */
		List<String> link_list=new LinkedList<>();
		link_list.add("RC");
		link_list.add("WD");
		link_list.add("GRID");
		link_list.add("Appium");
		link_list.add("IDE");
		link_list.add("WD");
		link_list.add("Cucumber");
		
		
		//print all values using foreach loop
		for (String Eachlist : link_list) 
		{
			System.out.println("--> "+Eachlist);
		}

	}

}
