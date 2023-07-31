//drive class
//Program to demonstrate on class and objects
package org.tnsif.classandobject;

import java.util.Scanner;

public class SandwichExecuter {

	public static void main(String[] args) {
		
		//Object creation
		Sandwich s= new Sandwich();
		
		s.breadType="Brown Bread";
		s.noOfSlice=4;
		
		
		//method call
		s.display();
		



	}

}
