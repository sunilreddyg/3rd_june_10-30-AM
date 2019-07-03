package corejava.Variables;

public class Variable_types 
{
	String email="info.dsnr@mindqsystems.com";  //Instant variable
	static String mobile="9030248855";	//class variable
	
	public void method1()
	{
		String name="WebDriver";
		System.out.println("Local variable => "+name);
	}
	
	public void method2()
	{
		System.out.println("instant variable => "+email);
		System.out.println("class variable => "+mobile);
	}

	public static void main(String[] args) 
	{
		/*
		 * Get Class variable from diff public class
		 * 		Classname.variablename;
		 */
		String New_mobile=Variable_types.mobile;
		System.out.println("class Variable => "+New_mobile);
		

		/*
		 * get Instant variable from diff public class
		 * 		Classname obj=new Classname();
		 * 		obj.Variablename();
		 */
		Variable_types obj=new Variable_types();
		String New_email=obj.email;
		System.out.println("Instant Variable => "+New_email);
	}

}
