package org.tnsif.uncheckedexeption;

public class ArrayIndexOutOfBoundExeptionExecuter {
	
	static void print(int arr[]) {
		try {
			System.out.println(arr[4]);
		}
		catch(Exception e) {
			System.out.println("Exception handel: "+e);
		}
		finally {
			System.out.println("Finally block is always executed");
		}
		
		System.out.println("Any statement outside the block is always executed");
	}

	public static void main(String[] args) {
		int arr[] = {12,4,6};
		print(arr);
	}

}
