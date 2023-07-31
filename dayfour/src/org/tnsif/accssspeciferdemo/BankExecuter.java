package org.tnsif.accssspeciferdemo;
import org.tnsif.accessspecifier.*;
import org.tnsif.accessspecifier.Bank;
public class BankExecuter {

	public static void main(String[] args) {
		Bank b= new Bank();
		b.bankName="SBI";
		b.displayPublic();
		
		//pinNO and displayPrivate() method are private, so we can't access into another class and another package, only we can access private data members inside the same class
		//b.pinNo;
		//b.displayPrivate();
		
		//acoountNo and displayDefault() method are defaultthat's why, we are not able to access into another package, only we can access within the same package
		//b.accountNo;
		//b.displayDefault();
		
	}

}
