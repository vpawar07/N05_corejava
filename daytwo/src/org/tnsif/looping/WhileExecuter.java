package org.tnsif.looping;

import java.util.Scanner;

public class WhileExecuter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int i=1;
		while(n>=i) {
			System.out.println(n+" ");
			n--;
		}
		s.close();

	}

}
