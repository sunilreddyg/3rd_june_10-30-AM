package framework_testng.DP;

import org.testng.annotations.Test;

public class Get_DataProvider_Data_From_Diff_Class 
{

	/*
	 * 	note:--> inorder to get dataprovider to diff class, We must declare 
	 * 			 dataprovider annotation with static access specifier..
	 * 
	 *  note:--> Along with methodname we have give even class name where method
	 *  		belongs to.
	 */
	
	@Test(dataProvider="user_info",dataProviderClass=InputData.class)
	public void Test_Info(String name,String mobile,String role)
	{
		System.out.println(name+"   "+mobile+"   "+role);
	}

}
