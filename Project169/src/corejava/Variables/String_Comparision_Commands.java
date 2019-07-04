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
		
		
		/*
		 * SubString:-->
		 * 		Method get sub String from mainString..
		 */
		
		String Account_num="0000111122223333";
		System.out.println("Account number is => "+Account_num);
		
		String Last_digits=Account_num.substring(10);
		System.out.println("Account number last 6 digit numbers are => "+Last_digits);
		
		//Get Middle characters from main String
		String Middle_digits=Account_num.substring(8, 12);
		System.out.println("Account number middle digits are => "+Middle_digits);
		
		/*
		 * length:-->
		 * 		Method return number of characters available with in String
		 */
		String Mobile_num="9030248855";
		int length=Mobile_num.length();
		System.out.println("Number of character available => "+length);
			
		/*
		 * trim:-->
		 * 		Method trim extra spaces with in String.
		 */
		String Zipcode="    500064   ";
		System.out.println("before trim => "+Zipcode.length());
		//trimp extra spaces
		String New_Zipcode=Zipcode.trim();
		System.out.println("After trim => "+New_Zipcode);
			
		/*
		 * IsEmpty:-->
		 * 		Method return boolean value true/false on
		 * 		String available status..
		 */
		String val="";
		String val1="MQ";
		
		System.out.println("Val Empty status is => "+val.isEmpty());
		System.out.println("val1 empty status is => "+val1.isEmpty());
		
		
		
		
	}

}
