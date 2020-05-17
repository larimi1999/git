package com.vti.backend;

public class Student {
	private final int id;
	private  String name;
	public static String college = "Dai hoc bach khoa";
	public static int money = 300;
	
	
	public Student(int id , String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public int tienconlai(int a)
	{
		return money-a;
	}



	public String getName() {
		return name;
	}

	public static void changeCollege(String a)
	{
		college = a ;
	}
	
    static int noOfObjects = 0; 
	 
	{ 
	    noOfObjects += 1; 
    } 
	
	
    final void  study()
	{
		System.out.println("Dang hoc bai");
	}
	 
	 

	@Override
	public String toString() {
		return "Id: "+getId()+"Name: "+getName()+" College: "+college;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
