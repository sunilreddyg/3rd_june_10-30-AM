package corejava.Loops;

public class ForEach_Loop 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Foreach:-->
		 * 			Foreach loop read array next values.
		 * 	Syntax:-->
		 * 				for(Variable :  Arrayname)
		 * 				{
		 * 
		 * 				}
		 */
		
		
		/*
		 * Example:--> Print array next value using foreach loop.
		 */
		String tools[]={"IDE","RC","WD","GRID"};
		for (String Eachtool : tools) 
		{
			System.out.println("=> "+Eachtool);
		}
		
		

	}

}
