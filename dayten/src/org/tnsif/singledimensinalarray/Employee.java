package org.tnsif.singledimensinalarray;

public class Employee {
	
	private int ID;
	private String name;
	private double salary;
	
	
	//parameterized constructor
		public Employee(int iD, String name, double salary) {
			super();
			ID = iD;
			this.name = name;
			this.salary = salary;
		}
	
	
	//getter setter
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	

}
