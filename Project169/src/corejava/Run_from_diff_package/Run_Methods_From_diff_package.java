package corejava.Run_from_diff_package;

import corejava.Instantmethods.NativeInputs;
import corejava.Staticmethods.Robot;

public class Run_Methods_From_diff_package
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
		
		/*
		 * calling static methods from public class.
		 * 
		 * 			ClassName.methodname();
		 */
		
		
		Robot.run();
		Robot.walk();
		
		
		
		
	}

}
