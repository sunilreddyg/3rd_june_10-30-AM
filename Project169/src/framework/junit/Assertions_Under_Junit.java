package framework.junit;

import org.junit.Assert;
import org.junit.Test;

public class Assertions_Under_Junit 
{

	@Test
	public void Tc001()
	{
		Assert.assertEquals("mail", "mail");
		System.out.println("Tc001 executed");
	}
	
	@Test
	public void Tc002()
	{
		Assert.assertEquals("Signin", "Sign");
		System.out.println("Tc002 executed");
	}
	
	@Test
	public void Tc003()
	{
		Assert.assertTrue("Tespass", true);
		System.out.println("Tc003 executed");
	}
	
	@Test
	public void Tc004()
	{
		Assert.assertTrue("Testfail", false);
		System.out.println("Tc003 executed");
	}
	
}
