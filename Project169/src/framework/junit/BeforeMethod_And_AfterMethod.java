package framework.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeMethod_And_AfterMethod {

	@Before //Invoke every @test annotation before
	public void setUp() throws Exception 
	{
		System.out.println("pre-condition Before method");
	}

	@After //Invoke after every @Test annoation
	public void tearDown() throws Exception 
	{
		System.out.println("post-condition Before method");
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
	
	@Test //Invoke method to run
	public void test3() 
	{
		System.out.println("test3 executed");
	}


}
