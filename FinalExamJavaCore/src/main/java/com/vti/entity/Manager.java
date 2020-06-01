package com.vti.entity;

public class Manager extends User{
	private int expinyear;
	public Manager(String firstname, String lastname, String phone, String email,int expinyear) {
		super(firstname, lastname, phone, email);
		this.expinyear = expinyear;
	}

}
