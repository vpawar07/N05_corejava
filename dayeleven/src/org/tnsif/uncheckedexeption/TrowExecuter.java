package org.tnsif.uncheckedexeption;

import java.io.IOException;

public class TrowExecuter {
	
	static void isEligible(int age, int weight)throws IOException {
		if(age>18 && weight>50) {
			System.out.println("Eligible to denote the blood");
		}
		else {
			throw new IOException("age and weight ceiteria is not fulfilled");
		}
	}

	public static void main(String[] args) throws IOException {

		isEligible(12,45);

	}

}
