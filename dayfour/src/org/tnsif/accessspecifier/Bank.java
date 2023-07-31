package org.tnsif.accessspecifier;

public class Bank {
	
	//different access specifier
	public String bankName;
	private int pinNo;
	long accountNo=123456789012L;
	
	//public method
	public void displayPublic() {
		System.out.println("Bank name is: "+bankName);
	}
	
	//private method
	private void displayPrivate() {
		System.out.println("Pin No is:"+pinNo);
	}
	
	//default method
	void displayDefault() {
		System.out.println("Account No is: "+accountNo);
	}

}
