package org.tnsif.instanceofdemo;

//program to demonstrate on instance operator

//this parent class
class Flower{
	String name ="Rose";
}

//this child class
class Rose extends Flower{
	String color = "Red";
}

public class InstanceOfExecuter {

	public static void main(String[] args) {
		Rose r =new Rose();
		System.out.println(r instanceof Flower);
		
		
		// to check the given object is true object of class or not
        // r is object of rose but rose inherits the flower so the r is also object flower class
        // we direct get error here so we use if else statement

		if (r instanceof Flower) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
