package org.tnsif.customexcepton;

public class LoginCredential extends Exception {
	
	//private data member
	private String str;
	
	//getter setter
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	//parameterized constructor
	public LoginCredential(String str) {
		super();
		this.str = str;
	}
	
	
	
	@Override
	public String toString() {
		return "LoginCredential [str=" + str + "]";
	}
	
	
	
	

}
