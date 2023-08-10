package org.tnsif.interfacedemo;

public interface DebitCard {
	//by default all the variable inside an interface is public
	//static final and if it final then we must have to initialize
	//value of that variable
	long CardNo=56468795L;
	
	//We can,t use concrete method inside an interface
	//by default, method inside an interface is an abstract
	void displayCardDetails();
	
	//Default method and static method is the new feature of Java8
	//which can we use, inside an interface
	default void display() {
		System.out.println("Default Method");
	}
	
	//static method
	static void print() {
		System.out.println("static method");
		
	}

}
