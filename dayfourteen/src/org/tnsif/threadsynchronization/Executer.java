package org.tnsif.threadsynchronization;

public class Executer {
	

	public static void main(String[] args) {

		Account acc = new Account(111, "Amit", 12000);
		AccountThread threadOne=new AccountThread(acc,8000);
		AccountThread threadTwo=new AccountThread(acc,5000);
		threadOne.start();
		threadTwo.start();
		System.out.println(acc);
		/*
		 * try { System.out.println(acc); acc.deposit(7000); System.out.println(acc);
		 * acc.withdraw(22000); System.out.println(acc); } catch
		 * (DepositLimitExceedsException e) { System.out.println(e.getMessage()); }
		 * catch (InsufficientBalanceException e) { System.out.println(e.getMessage());
		 * }
		 */

	}
	
	
	
	
//	int n;
//	static int n1;
//	final int n2;
//	public Executer() {
//		n2=10;
//	}
//	
//	static final int n3;
//	static {
//		n3=12;
//	}
//	
//	
//
//	public static void main(String[] args) {
//		
//		
//		
//		
////		try {
////			throw new InsufficiantBalanceExeption();
////			
////		}
////		catch(InsufficiantBalanceExeption e) {
////			
////		}
//
//	}
	
	
	

}
