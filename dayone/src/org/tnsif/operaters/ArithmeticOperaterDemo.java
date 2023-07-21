// Program to demonstrate on Arithmetic Operators
package org.tnsif.operaters;
import java.utit.Scanner;
public class ArithmeticOperaterDemo {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		s.close();

	}

}
