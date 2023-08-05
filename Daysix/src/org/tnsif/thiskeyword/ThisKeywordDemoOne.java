//It can be used to refer instance variable of current class

package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne {	
	
	//default variable
	int x,y;
	
	void setData(int x,int y) {
		this.x=x;						// this keyword is used to avoid the confusion between  
		this.y=y;                       // default variable and method's parameter.
		
	}
	
	void display() {
		System.out.println(x+" "+y);
		
	}
		

	public static void main(String[] args) {
		ThisKeywordDemoOne t = new ThisKeywordDemoOne();
		t.setData(2, 3);
		t.display();
	}

}
