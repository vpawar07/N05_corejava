package org.tnsif.interfacedemo;
//Drive class
//program to demonstrate on an interface
public class InterfaceExecuter {

	public static void main(String[] args) {
		//we can't instantiate an interface
		//DebitCard d=new DebitCard();
		
		SBIDebitCard s = new SBIDebitCard();
		s.displayCardDetails();
		
		//We call default method of an interface using the obj.
		//of implementable class
		s.display();
		
		//print() is static method inside an interface
		//to call print() method, we have to use interfacename.method
		//name();
		DebitCard.print();
		
		
		
		
		CheesePopCorn c= new CheesePopCorn();
		c.displayReceipe();
		
		
		Person p =new Person();
		p.showDrinkName();
	}

}
