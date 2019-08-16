package framework.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass {

	@BeforeClass //Invoke before execution of first @Test annotation with in class
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Precondition-Beforeclass");
	}

	@AfterClass //invoke after execution of last @Test annoation with in class
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("post-condition- Afterclass");
	}

	@Test //Invoke method to run
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	@Test //Invoke method to run
	public void test2() 
	{
		System.out.println("test2 executed");
	}

}
