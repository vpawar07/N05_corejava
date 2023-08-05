package org.tnsif.thiskeyword;
//this can be passed as argument in the constructor call
public class ThisKeywordDemoTwo {
	
	//default variable
	int x,y;	

	public ThisKeywordDemoTwo(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	void display() {
		System.out.println(x+" "+y);
		
	}



	public static void main(String[] args) {
		ThisKeywordDemoTwo t = new ThisKeywordDemoTwo(2,3);
		
		t.display();
		
		
	}

}
