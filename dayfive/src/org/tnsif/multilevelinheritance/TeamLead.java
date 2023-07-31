package org.tnsif.multilevelinheritance;

//Child class2
//parent class2

public class TeamLead extends Manager{
	
	private String leadName;
	private int empId2;
	private String projectNmae;
	
	
	//getter setter
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmpId2() {
		return empId2;
	}
	public void setEmpId2(int empId2) {
		this.empId2 = empId2;
	}
	public String getProjectNmae() {
		return projectNmae;
	}
	public void setProjectNmae(String projectNmae) {
		this.projectNmae = projectNmae;
	}
	
	
	
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", empId2=" + empId2 + ", projectNmae=" + projectNmae
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	public TeamLead(String depName, String name, int empId, int empId2, String leadName, String projectName) {
		super(depName, name, empId);
		this.empId2=empId2;
		this.leadName=leadName;
		this.projectNmae=projectName;
	}
	
	
	
	
	
	
	/*
	public TeamLead(String depName, String name, int empId, String leadName, String projectName) {
		super(depName, name, empId);
		//this.empId=empId;
		this.leadName=leadName;
		this.projectNmae=projectName;
	}
	*/
	
	
	
	
	
	

}
