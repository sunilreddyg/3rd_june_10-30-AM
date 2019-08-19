package framework_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Before_method_And_After_Method {

	
  @BeforeMethod //Invoke every test annotation before
  public void beforeMethod() 
  {
	  System.out.println("Load webpage");
  }

  @AfterMethod //Invoke every test annoation after
  public void afterMethod() 
  {
	  System.out.println("Taken Screenshot");
  }
  
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
 
 
  @Test //invoke method to run
  public void tc003() 
  {
	  Reporter.log("Signout test output displayed",true);
  }
  
  
  @BeforeClass //Invoke before execution of first @Test annotation with in class
  public void beforeClass() 
  {
	  System.out.println("Beforeclas -Browserlaunch");
  }

  @AfterClass //Invoke after exection of last @Test annotation with in class
  public void afterClass() 
  {
	  System.out.println("AfterClass - Close browser");
  }
  
  

}
