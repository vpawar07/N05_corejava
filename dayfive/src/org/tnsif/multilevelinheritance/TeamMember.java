package org.tnsif.multilevelinheritance;

public class TeamMember extends TeamLead {
	

	private int size;
	private int duration;
	
	
	
	
	public TeamMember(String depName, String name, int empId, int empId2, String leadName, String projectName, int size, int duration) {
		super(depName, name, empId, empId2, leadName, projectName);
		this.size=size;
		this.duration=duration;
		
	}
	
	
	
	
	
	
	
	
	
	

}
