// static keyword is used for memory allocation

package org.tnsif.statickeyword;

//static variable: if any variable is not static and outside the main function and if we want to access that variable inside the main function, then we make that as static

public class StaticVariableExecuter {
	static int num=67;

	public static void main(String[] args) {
		// accessing non-static variable with object

//		StaticVariableExecuter s =new StaticVariableExecuter();
//		System.out.println(s.num);
		System.out.println(num);

	}

}
