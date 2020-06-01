package com.vti.entity;

public class Employee extends User{
	private String projectname;
	private String proskill;
	public Employee(String firstname, String lastname, String phone, String email,String projectname,String proskill) {
		super(firstname, lastname, phone, email);
		this.projectname = projectname;
		this.proskill = proskill;
	}
	
	

}
