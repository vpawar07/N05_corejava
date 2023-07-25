package org.tnsif.jumpingstatement;

public class BreakExecuter {

	public static void main(String[] args) {
		int n =10;
		for(int i=1; i<=n; i++) {
			if(i==5)
				break;
			else
				System.out.println(i+" ");
		}

	}
}

