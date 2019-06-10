package corejava.Staticmethods;

public class Robot
{
	
	public static void run()
	{
		System.out.println("Run active");
	}
	
	
	public static void walk()
	{
		System.out.println("Walk active");
	}
	
	
	public static void main(String args[])
	{
		/*
		 * With in class Static Methods we can call 
		 * without using classname from main method.
		 */
		run();
		walk();
		
	}

}
