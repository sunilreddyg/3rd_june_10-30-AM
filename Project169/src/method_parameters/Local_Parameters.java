package method_parameters;

public class Local_Parameters 
{
	
	public void get_details()
	{
		String name="MQ-Dsnr";
		System.out.println(name);
		
	}

	public void get_details(String BranchName)
	{
		String name=BranchName;
		System.out.println(name);
	}
	
	public void get_details(String BranchName,int BrachCode)
	{
		String Brach=BranchName;
		int Code=BrachCode;
		System.out.println(Brach+"    "+Code);
	}
	

	public static void main(String[] args) 
	{
		
		//Create object for local parameter class
		Local_Parameters obj=new Local_Parameters();
		
		//Calling method without arguments
		obj.get_details();
		
		//Calling method with single argument
		obj.get_details("MQ-Bglr");
		
		//Calling method with multiple arguments
		obj.get_details("MQ-DSNR", 102);

	}

}
