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
		set.add("RC");
		set.add("WD");
		set.add("GRID");
		set.add("Appium");
		set.add("IDE");
		set.add("WD");
		set.add("Cucumber");
		
		
		//Get Size of objects..
		int obj_size=set.size();
		System.out.println("Number of object available is => "+obj_size);
		
		//Remove object using name
		set.remove("Cucumber");
		
		//Verify object available
		boolean flag=set.contains("IDE");
		System.out.println("Object Available status is => "+flag);
		
		
		//Get Next Iterator with in  object..
		String itr=set.iterator().next();
		System.out.println("next iterator value is => "+itr);
		
		
		
		//Print all Object using foreach loop
		for (String eachobject : set) 
		{
			System.out.println("=> "+eachobject);
		}
		

	}

}
