package org.tnsif.finalkeyword;

public class Circle extends Shape {
	
	final float area=34.6f;
	//final method
	//can't override the final method from shape
	/*void printShapeType() {
		System.out.println(area+"sq.cm");
	}*/
	
	public void printShapeType(float area) {
		System.out.println(area+"sq.cm");
	}

}
