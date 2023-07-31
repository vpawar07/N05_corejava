package org.tnsif.singleinheritance;

public class Student extends Citizen {
	
	//private data members 
	private int rollNo;
	private String collageName;
	
	
	
	public Student() {
		super();
		System.out.println("Child class-Default Constructor");
	}



	public Student(String city, int pincode, long aadharNo, long contactNo, int rollNo, String collageName) {
		super(city, pincode, aadharNo, contactNo);
		this.rollNo=rollNo;
		this.collageName=collageName;
	}



	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public String getCollageName() {
		return collageName;
	}



	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collageName=" + collageName + ", toString()=" + super.toString() + "]";
	}
	
	



	
	
	
	
	
	
}
