package framework.junit;


import org.junit.Ignore;
import org.junit.Test;

public class Ignore_Method_Execution {

	@Test //Invoke method to run
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	@Ignore  //Ignore method execution
	public void test2() 
	{
		System.out.println("test2 executed");
	}
	
	@Test //Invoke method to run
	public void test3() 
	{
		System.out.println("test3 executed");
	}

}
