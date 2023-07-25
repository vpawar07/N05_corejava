package org.tnsif.operaters;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the age");
		int age=s.nextInt();
		
		System.out.println("Enter the weight");
		int weight=s.nextInt();
		
		if(age>18 && weight>=50) {
			System.out.println("Eligible for Blood Donation");
		}
		else {
			System.out.println("You are not eligible for Blood Donation");
		}

	}
 
}
