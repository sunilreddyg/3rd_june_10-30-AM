package method_return_type;


public class Method_Types 
{
	
	//Void is a method type it doesn't return any value
	public void method1()
	{
		String name="WebDriver";
	}
	
	//Method return string value
	public String method2()
	{
		return "Hi";
		
	}
	
	//Method return integer value
	public int cal(int a, int b)
	{
		return a*b;
		
	}
	

	public static void main(String[] args) {
		
		//Create object for class
		Method_Types obj=new Method_Types();
		//Calling void method 
		obj.method1();
		
		//Calling String return method
		String name=obj.method2();
		System.out.println("return value is => "+name);

		//Calling int return method
		int total=obj.cal(100, 6);
		System.out.println("total value is => "+total);
	}

}
