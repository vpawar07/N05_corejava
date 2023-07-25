package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseExecuter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int song= s.nextInt();
		switch(song){
			case 1:
				System.out.println("Humnava");
				break;
				
			case 2:
				System.out.println("Hasi");
				break;
			case 3:
				System.out.println("Hamari Adhuri Kahani");
				break;
			case 4:
				System.out.println("Zaroorat");
				break;
			default:
				System.out.println("Invalid Input");
				break;
				
		}
		s.close();

	}

}
