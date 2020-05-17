package com.vti.frondend;

import java.io.IOException;

import com.vti.backend.IOManager;
import com.vti.entity.Vehicle;

public class Exercise4 {
	public static void main(String[] args) {
		//Question2();
		Question4();
	}
	static void Question1()
	{
		IOManager iom = new IOManager();		
		try {
			String a = iom.readFile("C:\\Users\\Admin\\Desktop\\nhat3.txt");
			System.out.println(a);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void Question2()
	{
		IOManager iom = new IOManager();	
		try {
			iom.writeFile("C:\\Users\\Admin\\Desktop\\nhat3.txt", "Nhat FA");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void Question3()
	{
		IOManager iom = new IOManager();
		Vehicle veh = new Vehicle("CRV","RED","HONDA");
		iom.WriteObjectToFile(veh, "C:\\Users\\Admin\\Desktop\\Car.ser");
	}
	
	static void Question4()
	{
		
		IOManager iom = new IOManager();
	    Vehicle vehicle =(Vehicle)iom.ReadObjectFromFile("C:\\Users\\Admin\\Desktop\\Car.ser");
	    System.out.println(vehicle.getBrand());
	    System.out.println(vehicle.getColor());
	    System.out.println(vehicle.getName());
	}
}
