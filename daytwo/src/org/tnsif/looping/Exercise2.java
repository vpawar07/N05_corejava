package org.tnsif.looping;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int count=0;
		
		do {
			num= num/10;
			count++;
		}while(num!=0);
		
		System.out.println(count);
	}

}
