package org.tnsif.singledimensinalarray;
//program to demonstrate on array using compile-time input value
public class ArrayExample {

	public static void main(String[] args) {
		//declaration and initialization of an array at compile-time
		int arr[] = {44,56,2,32,28};
		System.out.println("The array od 2nd index is: "+arr[2]);
		
		//to print all values of array 
		for(int i:arr) {
			System.out.print(i+", ");		
			}
		

	}

}
