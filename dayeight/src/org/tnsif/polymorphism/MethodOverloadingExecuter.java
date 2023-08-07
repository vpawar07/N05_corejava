// Program to demonstrate on compile time polymorphism  (method overloading, constrctor overloading)
// Method overloading = 2 or more method's having same name but different type of parameters or different 
// number of parameters 
// We can overload the static method


package org.tnsif.polymorphism;

import java.util.Scanner;

class Bollywood{
	
	String str1,str2,str3;
	//method overloading based on changing the no. of arguments
	static void displayString(String str1, String str2) {
		System.out.println(str1+" loves "+str2);
	}
	
	static void displayString(String str1, String str2, String str3) {
		System.out.println(str1+" loves "+str2+" as well as "+str3);
	}
	
}

public class MethodOverloadingExecuter {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		String str3 = s.next();
		Bollywood.displayString(str1, str2);
		Bollywood.displayString(str1, str2, str3);


	}

}
