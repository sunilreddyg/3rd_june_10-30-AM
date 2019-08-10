package framework.Datadriven.Notepad;

import java.util.Scanner;

public class Get_Input_From_Console {

	public static void main(String[] args) 
	{
		
		//Create object for scanner..
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter username :--> ");
		String username = sc.nextLine();
		System.out.println("Your username is " + username);
		
		System.out.println("Enter start iteration");
		int Start=sc.nextInt();
		
		System.out.println("Enter last iteration value");
		int End=sc.nextInt();
		
		
		for (int i = Start; i <= End; i++) 
		{
			System.out.println(i);
		}
		
		
		
	}

}
