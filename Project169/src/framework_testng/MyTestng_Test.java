package framework_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestng_Test
{
  @Test //invoke method to run
  public void tc001() 
  {
	  Reporter.log("Signin test output dispalyed",true);
  }
  
  @Test //invoke method to run
  public void tc002() 
  {
	  Reporter.log("Signup test output displayed",true);
  }
  
}
