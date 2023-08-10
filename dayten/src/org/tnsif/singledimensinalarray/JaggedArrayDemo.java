package org.tnsif.singledimensinalarray;

import java.util.Scanner;

public class JaggedArrayDemo {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//in jagged array outside array size is fixed,
		//but inside array size is different for different 
		//outside array index
		
		//jagged array declaration 
		int arr[][]= new int[3][];
		
		//for outside array index 0, storing 3 element
		arr[0] = new int[3];
		
		//for inside array index 1, storing 2 element
		arr[1] = new int[2];
		
		//for inside array index 2, storing 4 element
		arr[2] = new int[4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= s.nextInt();
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}

		
		
	}

}
