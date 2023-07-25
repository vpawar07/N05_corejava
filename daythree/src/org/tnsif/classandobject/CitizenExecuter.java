//drive class
//Program to demonstrate on Default and parameterized constructor

package org.tnsif.classandobject;

public class CitizenExecuter {

	public static void main(String[] args) {
		Citizen c= new Citizen();
		c.aadharNo=123456789012L;
		c.citizenType="Adult";
		c.city="Nashik";
		c.gender="Male";
		
		Citizen c1= new Citizen("Adult",123456789012L,"Male","Nashik");
		System.out.println(c1);

	}

}
