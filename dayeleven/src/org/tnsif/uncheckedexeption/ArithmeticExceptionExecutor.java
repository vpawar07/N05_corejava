package org.tnsif.uncheckedexeption;

import java.util.Scanner;
//program to demonstrate on ArithmeticExeption 
public class ArithmeticExceptionExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x =s.nextInt();
		int y=s.nextInt();
		
		//try block contain exception code
		try {
			System.out.println(x/y);
		}
		
		//catch block is used to handle an exception
		catch(Exception e) {
			System.out.println("Exeption handel "+e);
			
		}

	}

}
