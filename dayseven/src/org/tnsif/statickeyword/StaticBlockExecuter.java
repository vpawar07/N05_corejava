package org.tnsif.statickeyword;

public class StaticBlockExecuter {
	static float salary=65786.89f;
	String companyName;
	
	//static block is used to initialize the static variable we can't assign a value for any non-static variable inside the static block
	static {
		//companyName = "Accenture";
		salary=57658.90f;
		
	}
	
	static void print() {
		System.out.println(salary);
	}

	public static void main(String[] args) {
		print();

	}

}
