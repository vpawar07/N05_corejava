/* Question  :  Ask a user for their birth year encoded as 2 digit ( like "62" ) and for the current 
 *              year,  also encoded as 2 digit (like "99") write a program to find the user's current
 *              age in year's 
 *       
 *      Input:  Current year  
 *                 Birth Year   */


package org.tnsif.challenges;

import java.util.Scanner;

public class AgeCalculater {
	
	 static int ageCalcy(int cy, int by){
		if(cy<by) {
			return((100-by)+cy);
		}
		else
			return(cy-by);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cy = s.nextInt();
		int by = s.nextInt();
		
		System.out.println(ageCalcy(cy,by));

	}

}
