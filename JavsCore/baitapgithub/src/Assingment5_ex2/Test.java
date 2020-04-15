package Assingment5_ex2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner  scanner= new Scanner(System.in);
		//Create instance of class NormalEmployee
		NormalEmployee normal = new NormalEmployee();
		System.out.println("Nhap vao ten cua nhan vien");
		String nm = scanner.nextLine();
		normal.setName(nm);
		
		
		System.out.println("Nhap vao dia chi cua nhan vien");
		String add = scanner.nextLine();
		normal.setAddress(add);
		
		System.out.println("Nhap vao luong co ban cua nhan vien");
		int sal = scanner.nextInt();
		normal.setBasicSalary(sal);
		
		System.out.println("Thong tin cua nhan vien la : ");
		System.out.println("Ten nhan vien : "+normal.getName());
		System.out.println("Dia chi cua nhan vien : "+normal.getAddress());
		System.out.println("Luong co ban : "+normal.getBasicSalary());
		System.out.println("Luong hang thang : "+normal.getMonthlySalary());
		
		//Create instance of class BonusEmployee 
		BonusEmployee bonus = new BonusEmployee();
		
		//Nhap vao cac gia tri 
		
		bonus.setName("Nga");
		bonus.setAddress("Quang Ninh");
		bonus.setBonusSalary(200);
		bonus.setBasicSalary(3000);
		
		//setting values of bemp 
		System.out.println("Thong tin cua nhan vien duoc them luong");
		System.out.println("Ten nhan vien : "				+ bonus.getName());
		System.out.println("Dia chi cua nhan vien : "		+ bonus.getAddress());
		System.out.println("Luong co ban cua nhan vien: "	+bonus.getBasicSalary());
		System.out.println("Luong cong them: "			    +bonus.getBonusSalary());
		System.out.println("Luong moi thang cua nhan vien: "+bonus.getMonthlySalary());
		
		
		
		
	}

}
