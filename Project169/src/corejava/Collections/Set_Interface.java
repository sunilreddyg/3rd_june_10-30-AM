package corejava.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Set_Interface 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Set:--> Unorder collection of objects. Set
		 * 		   Doesn't support duplicate objects to store..
		 */
		
		Set<String> set=new HashSet<String>();
		set.add("Appium");
		set.add("WebDriver");
		set.add("Grid");
		set.add("RemoteControl");
		set.add("Cucumber");
		set.add("Katalon");
		set.add("Grid");
		
		
		//Get size of object count
		int obj_count=set.size();
		System.out.println("List of object available at set => "+obj_count);
		
		//Remove object from collection
		set.remove("RemoteControl");
		
		//Verify object contains at collection
		boolean flag=set.contains("Cucumber");
		System.out.println("Object Available status is => "+flag);
		
		//Get Next iteration value.
		String Itr=set.iterator().next();
		System.out.println("Next iterator value is => "+Itr);

		//Read all next iterator value using for each loop
		for (String Eachtool : set)
		{
			System.out.println("=>"+Eachtool);
		}
		
		
		/*
		 * Set:--> With TreeSet
		 */
		
		Set<String> tset=new TreeSet<String>();
		tset.add("Appium");
		tset.add("WebDriver");
		tset.add("Grid");
		tset.add("RemoteControl");
		tset.add("Cucumber");
		tset.add("Katalon");
		tset.add("Grid");
		
		
		//Print all option using foreach loop
		for (String Eachtool : tset) 
		{
			System.out.println("#=>"+Eachtool);
		}
		
		
		
		
		
		
	}

}
