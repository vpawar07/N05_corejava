package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	
	int x;
	
	// default constructor
	ThisKeywordDemoFour(){
		//invoking current parameterize constructor
		this(34);
		System.out.println("Default Constructor");
	}
	
	// Parameterized constructor
	ThisKeywordDemoFour(int x){
		this.x=x;// calling to parameterized constructor using this keyword with argument 10 then parameterized constructor is executed first and then default constructor is executed
		
		System.out.println("Parameterize Constructor");
	}

	public static void main(String[] args) {
		
		ThisKeywordDemoFour f =new ThisKeywordDemoFour();



	}

}
