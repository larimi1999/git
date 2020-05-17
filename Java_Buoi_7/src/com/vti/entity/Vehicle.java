package com.vti.entity;

import java.io.Serializable;

public class Vehicle implements Serializable{

	private String name;
	private String color;
	private String brand;
	public Vehicle(String name, String color, String brand) {		
		this.name = name;
		this.color = color;
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getBrand() {
		return brand;
	}
	



	
}
