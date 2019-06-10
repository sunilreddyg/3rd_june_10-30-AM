package corejava.Instantmethods;

public class Run_NativeInputs 
{

	public static void main(String[] args) 
	{

		/*
		 * Note:--> Inorder to call any public class instant
		 * 			methods we should create object for class.
		 * 
		 * 			Syntax:-->
		 * 					new Classname().methodname();
		 */
		
		
		new NativeInputs().Keyboard();
		new NativeInputs().Mouse();
		
		
		//Object Creation using referral variable
		NativeInputs obj=new NativeInputs();
		obj.Keyboard();
		obj.Mouse();
		
		

	}

}
