package org.tnsif.abstractkeyword;

public abstract class Operator {
	//abstract
	
	int d=65;
	abstract void operation();
	//if abstract class contain more than one method, then provide the implementation to all the abstract method of that class inside child class
	abstract void multiplication();
	
	void print(int a, int b) {
		System.out.println(a+b);
	}

}
