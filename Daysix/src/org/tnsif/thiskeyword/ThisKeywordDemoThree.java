package org.tnsif.thiskeyword;
//this keyword as an argument to method call
public class ThisKeywordDemoThree {
	
	
	void print(ThisKeywordDemoThree t) {
		System.out.println("Hey there, I am using 'this' keyword");
	}
	
	void display() {
		//when you call any parameterize method inside non-parameterize method then, we get an error, to overcome that we have to use this keyword as an argument in method call
		print(this);
	}

	public static void main(String[] args) {
		ThisKeywordDemoThree t = new ThisKeywordDemoThree();
		t.display();

	}

}
