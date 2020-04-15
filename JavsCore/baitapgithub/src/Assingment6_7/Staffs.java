package Assingment6_7;

import java.util.Scanner;

public class Staffs {
	protected String fullName;
	protected float salaryMultiplier;

	public double getSalary() {
		return 0;
	}

	

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getSalaryMultiplier() {
		return salaryMultiplier;
	}

	public void setSalaryMultiplier(float salaryMultiplier) {
		this.salaryMultiplier = salaryMultiplier;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Put in full name : ");
		setFullName(sc.nextLine());
		System.out.println("Put in Salary_Multiplier : ");
		setSalaryMultiplier(sc.nextFloat());
	}

	public void print() {
		System.out.println("Fullname :"			  + getFullName());
		System.out.println("Salary_Multiplier : " + getSalaryMultiplier());

	}


}

