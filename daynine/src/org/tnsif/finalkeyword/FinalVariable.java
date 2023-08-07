package org.tnsif.finalkeyword;
//program to demonstrate to final keyword with variable
public class FinalVariable {
	
	//The blank final NUM may not have been initialized
	//final int NUM;
	
	final float salary=7800.67f;
	
	public void print() {
		
		//We can't change the value f final variable
		//salary =98000.56f;
		System.out.println("Salary is: "+salary);
	}

}
