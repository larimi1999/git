package com.vti.backend;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) throws InValidHCNException {
		Question8();
	
		
		
				
		//Question1_2(); 
		//Question3(5,6);
		//Question4();
		//Question5();
		//Question6();
		
	
	}
	
	static void Question1_2()
	{
		Student student1 = new Student(1,"Nguyen Van A");
		Student student2 = new Student(2,"Nguyen Van B");
		Student student3 = new Student(3,"Nguyen Van C");
		//B1:300k
		//B2:
		 Student.money =  student1.tienconlai(50);
		 System.out.println(Student.money);
		 Student.money = student2.tienconlai(20);
		 System.out.println( Student.money);
		 Student.money = student3.tienconlai(150);
		 System.out.println(Student.money);
		 System.out.println("So tien con lai la : ");
		 Student.money	=  Student.money+50*3;
		 System.out.println( Student.money);
		 
		 
	
		
		//Student[] students = {student1,student2,student3};
		//Student.college="Dai hoc cong nghe";
		//Student.college = "Dai hoc cong nghe";
		//for(int i = 0 ; i <students.length;i++)
		//{
			//System.out.println(students[i].toString());
		//}
	}
	
	static void Question3(int a,int b)
	{
		MyMath mymath = new MyMath();
		int z = mymath.math(a, b);
		System.out.println(z);
	}
	
	static void Question4()
	{
		Student.changeCollege("Dai Hoc thuy loi");
		System.out.println(Student.college);
		//b Khong hieu
	}
	
	
	static void Question5()
	{
		System.out.println(Student.noOfObjects); 
	}
	static void Question6()
	{
		if((PrimaryStudent.noOfObjects1+SecondaryStudent.noOfObjects2)<=7)
		{
		System.out.println(PrimaryStudent.noOfObjects1);
		System.out.println(SecondaryStudent.noOfObjects2);
		}
		else
		{
			System.out.println("Toi da 7 hoc sinh ");
		}
	}
	
	static void Question7()
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n>7)
		{
			System.out.println("Khong hop le !");
		}
		else
		{
			Student[] student = new Student[n];
			for(int i = 0;i<n;i++)
			{
				
			}
		}
		
		
		sc.close();
	}
	
	static void Question8() throws InValidHCNException
	{
		HinhTron    ht1 = new HinhTron();
		HinhTron    ht2  = new HinhTron();
		HinhTron    ht3  = new HinhTron();
		HinhChuNhat hcn1 = new HinhChuNhat();
		HinhChuNhat hcn2 = new HinhChuNhat();
		HinhChuNhat hcn3 = new HinhChuNhat();
		
		int count = HinhChuNhat.count1+HinhTron.count2;
		if(count<6)
		{
			System.out.println();
		}
		if(count == 6)
		{
			throw new InValidHCNException("Khong hop le");
		}
		
	}
	
	
	
	
}
