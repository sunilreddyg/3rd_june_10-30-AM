package corejava.Variables;

public class String_Comparision_Commands {

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 		=> String is a non-primitive datatype and also
		 * 			called as class.String class contains set of
		 * 			events [Methods] to validate stored characters.
		 */
		
		
		String Exp_Res="Account Created";
		String Act_Res="account created";
		
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings
		 * 		and return boolean value true/false.
		 */
		boolean flag=Act_Res.equals(Exp_Res);
		System.out.println("Equal comparision is =.> "+flag);
		
		
		/*
		 * EqualIgnoreCase;-->
		 * 		Method verify Equal comparision by ignoring casesensitive
		 * 		and return boolean value true/false...
		 */
		boolean flag1=Act_Res.equalsIgnoreCase(Exp_Res);
		System.out.println("EqualIgnore case comparision is => "+flag1);
		
		
		/*
		 * Contains:--> 
		 * 		Method verify sub String available at main String
		 * 		and return boolean value ture/false
		 */
		String Status="Account Created 100";
		boolean flag2=Status.contains("100");
		System.out.println("Sub String available status is => "+flag2);
	}

}
