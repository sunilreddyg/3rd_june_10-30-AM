package framework_testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData 
{
  @Test(dataProvider = "dp")
  public void test(Integer n, String s) 
  {
	  
  }
  
  
  @Test(dataProvider="user_info",enabled=false)
  public void test_user_info(String name,String mobile,String role)
  {
	  
  }
  
  

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
    };
  }
  
  
  @DataProvider
  public static String[][] user_info()
  {
	  String data[][]=
		  {
				  {"ajay","9030303030","tester"},
				  {"vikram","987461235","developer"},
				  {"akash","4712589631","tester"},
				  {"avinash","6787988979","tester"},
		  };
	  return data;
  }
  
  
  

  
  
}
