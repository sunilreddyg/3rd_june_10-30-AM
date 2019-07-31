package corejava.Collections;

import java.util.Hashtable;
import java.util.Set;

public class HashTable_Interface
{

	public static void main(String[] args) 
	{
		
		/*
		 *  Hash accept objects to store using key and value
		 *  It only accept pair values to store..
		 *  	=> Hashset is a sorted list of set.
		 */
		
		
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		h.put(1, "Akash");
		h.put(2, "Arun");
		h.put(3, "sudheer");
		
		
        
        		/*
        		 * => 1 is  Key
        		 * => Akash is a value
        		 */
        
        String t=h.get(1);
        System.out.println(t);
        
        String t1=h.get(2);
        System.out.println(t1);
        
        
        //Get all keys
        Set<Integer> set=h.keySet();
        for (Integer eachKey : set) 
        {
        	String value=h.get(eachKey);
        	System.out.println("=> "+value);
        }
       
       
       
       
       
       
	}
       
}
