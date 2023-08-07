package org.tnsif.finalkeyword;

public class FinalKeywordExecuter {

	public static void main(String[] args) {
		FinalVariable f= new FinalVariable();
		//We can't change the value f final variable
		//f.salary=35433.65f;
		f.print();
		
		Circle c =new Circle();
		c.printShapeType();
		c.printShapeType(c.area);

	}

}
