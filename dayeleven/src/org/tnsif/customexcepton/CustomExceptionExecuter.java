package org.tnsif.customexcepton;
//program demonstrate on User-defined exception
//driver class
import java.util.Scanner;

public class CustomExceptionExecuter {

	public static void main(String[] args) throws LoginCredential {
		Scanner s = new Scanner(System.in);
		String email =s.nextLine();
		String password= s.nextLine();
		
		try {
			if(email.equals("skumbhalkar@tnsif.org")&&password.equals("Pass@123"))
			{
				System.out.println("Credential Matched");
			}
			else {
				throw new LoginCredential("Invalid Credential");
			}
		}
		catch(LoginCredential e){
			System.out.println(e);
		}
		
	}

}
