package org.tnsif.multilevelinheritance;

public class Manager {
	
	private String depName;
	private String name;
	private int empId;
	
	
	public Manager() {
		super();
		System.out.println("Default Constructor-Manager");
	}
	

	//paramiterized
	public Manager(String depName, String name, int empId) {
		super();
		this.depName = depName;
		this.name = name;
		this.empId = empId;
	}


	@Override
	public String toString() {
		return "Manager [depName=" + depName + ", name=" + name + ", empId=" + empId + "]";
	}


	public String getDepName() {
		return depName;
	}


	public void setDepName(String depName) {
		this.depName = depName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	
	
	

}
