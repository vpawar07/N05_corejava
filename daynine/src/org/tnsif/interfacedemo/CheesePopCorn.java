package org.tnsif.interfacedemo;
//Implementable class for a functional interface

public class CheesePopCorn implements PopCorn {
	
	@Override
	public void displayReceipe() {
		System.out.println("Take PopCorn Packets"+
					 " from shop and cook it in high "
					 +"fire inside a coocker.");
	}

}
