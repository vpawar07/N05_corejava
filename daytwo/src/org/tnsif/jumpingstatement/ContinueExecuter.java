package org.tnsif.jumpingstatement;

public class ContinueExecuter {

	public static void main(String[] args) {
		int n =10;
		for(int i=1; i<=n; i++) {
			if(i==5)
				continue;
			else
				System.out.println(i+" ");
		}
	}

}
