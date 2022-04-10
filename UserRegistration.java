import java.util.regex.*;
import java.util.Scanner;
import java.lang.*;

public class UserRegistration {

	public static void main(String args[])
	{
		String regex = "(^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*)";
		String eMailRegex = "(^[A-Za-z0-9.-_]+@+[a-zA-Z]+.+[com])";
		String firstName,lastName,eMail;
		Scanner scanner=new Scanner(System.in);
		
		//***************************First Name validation*********************************8
		System.out.println("Enter the first name of a user, it should start with capital letter and minimum three charecter long");
		firstName=scanner.nextLine();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher=pattern.matcher(firstName);
		boolean b=matcher.matches();
		if(b==false)
		{		System.out.println("Enter name in proper formate, Example 'Abc, Xyz,etc'");
				firstName=scanner.nextLine();
				 pattern = Pattern.compile(regex);
				 matcher=pattern.matcher(firstName);
				 b=matcher.matches();
											
					if(b==false)
					{
						System.out.println("You entered a name wrong again");
						System.exit(0);
					}	
		}
		
		//*************** Verification**************************
		System.out.println("Enter the last name of a user, it should start with capital letter and minimum three charecter long");
		lastName=scanner.nextLine();
		pattern = Pattern.compile(regex);
		matcher=pattern.matcher(lastName);
		b=matcher.matches();
		if(b==false)
		{		System.out.println("Enter name in proper formate, Example 'Abc, Xyz,etc'");
				firstName=scanner.nextLine();
				 pattern = Pattern.compile(regex);
				 matcher=pattern.matcher(lastName);
				 b=matcher.matches();
											
					if(b==false)
					{
						System.out.println("You entered a name wrong again");
						System.exit(0);
					}	
		}
		
		//***************Email Id Verification**************************;
		
		System.out.println("Enter the Email id of a user in proper format");
		eMail=scanner.nextLine();
		pattern = Pattern.compile(eMailRegex);
		matcher=pattern.matcher(eMail);
		b=matcher.matches();
		if(b==false)
		{		System.out.println("Enter Id in proper formate, Example 'Abc.xyz@pqr.com, etc'");
				eMail=scanner.nextLine();
				 pattern = Pattern.compile(eMailRegex);
				 matcher=pattern.matcher(eMail);
				 b=matcher.matches();
											
					if(b==false)
					{
						System.out.println("You entered a Email wrong again");
						System.exit(0);
					}	
		}
		
		
		
	}

}
