/*  new project = coding challenge for this two challenges xyz, xyz2 
 * Write a program to calculate hotel tariff(Budget). the room rent is 12% high during 
 * peak season's (April - June) and (Nov - Dec)
 * 
 * hint: use switch cases
 * 
 * sample input :  month = 3  (March)
 * 					rent 
 *                  day    no. of days you are leaving
 *                   rent * day = budget
 *                   but 20 % high during peak season 
 *                    */


package org.tnsif.challenges;

import java.util.Scanner;

public class HotelBudget {
	
//	static double tariff(int month, int day, int rent) {
//		if(month == 4 || month == 5 || month == 6 || month == 11 || month == 12) {
//			rent += (int) (rent*0.12);
//			return rent*day;
//		}
//		else {
//			return day*rent;
//		}
//	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("In which month you are going to stay in hotel : ");
		int month = s.nextInt();
		System.out.println("How many day's you are going to stay in hotel : ");
		int day = s.nextInt();
		System.out.println("The rent of hotel : ");
		int rent = s.nextInt();
		//System.out.println("The hotel budget is : "+tariff(month,day,rent));
		
		switch(month){
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println(rent*day);
			break;
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			System.out.println((rent+(rent*0.12))*day);
			break;
		default:
			System.out.println("Invalid month No");
		
		}
		
		

	}

}