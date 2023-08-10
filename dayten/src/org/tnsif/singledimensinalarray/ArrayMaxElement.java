package org.tnsif.singledimensinalarray;
//program  to demonstrate on run time array and to find out largest element in array

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxElement {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no. elements in array");
		int n =s.nextInt();
		//array declaration
		int arr[]=new int[n];
		for(int i=0;i<n; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		

		//maximum value
		int max = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			
		}
		System.out.println("The largest element in array is: "+max);
		
		//Arrays is a class and sort is a built in method
		Arrays.sort(arr);
		System.out.println("Array sorted elements are");
		for(int i=0;i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
