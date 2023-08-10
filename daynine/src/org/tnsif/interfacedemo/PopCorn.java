package org.tnsif.interfacedemo;

//Function Interface:
//An interface which contains an exactly one abstract 
//method the that interface is known as functional interface

//below annotation ensures that we have to use 
//exactly one abstract method inside an interface

@FunctionalInterface
public interface PopCorn {
	//abstract method
	void displayReceipe();
	
	//void display();

}
