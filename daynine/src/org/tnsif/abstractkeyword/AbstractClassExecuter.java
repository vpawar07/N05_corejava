package org.tnsif.abstractkeyword;

public class AbstractClassExecuter {

	public static void main(String[] args) {
		//we can't create an object for an abstract class
		//Operator o =new Operator();
		Addition a= new Addition();
		
		a.operation();
		a.print(2, 3);

	}

}
