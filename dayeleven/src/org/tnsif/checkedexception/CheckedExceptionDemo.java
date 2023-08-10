package org.tnsif.checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			FileInputStream f= new FileInputStream("C:\\Users\\VISHAL\\Desktop\\TNS\\Demo.txt");
			System.out.println("File has found");
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Exist "+e);
		}

	}

}
