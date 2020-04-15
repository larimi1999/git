package Assingment6_7;

import java.util.Scanner;

public class Professors extends Staffs {

	private String faculty;
	private String academicDegree;
	private int monthlyTeachingTime, allowance;

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getAcademicDegree() {
		return academicDegree;
	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

	public int getMonthlyTeachingTime() {
		return monthlyTeachingTime;
	}

	public void setMonthlyTeachingTime(int monthlyTeachingTime) {
		this.monthlyTeachingTime = monthlyTeachingTime;
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}

	@Override
	public double getSalary() {
		return getSalaryMultiplier() * 730 + getAllowance() + getMonthlyTeachingTime() * 45;
	}

	@Override
	public void input() {
		super.input();
		int loai;
		boolean kt = false;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Put in faculty : ");
			System.out.println("1.Bachelor");
			System.out.println("2.Master");
			System.out.println("3.Doctor");
			loai = sc.nextInt();
			switch (loai) {
			case 1: {
				setAcademicDegree("Bachelor");
				kt = true;
				break;
			}
			case 2: {
				setAcademicDegree("Master");
				kt = true;
				break;
			}
			case 3: {
				setAcademicDegree("doctor");
				kt = true;
				break;
			}
			default: {
				System.out.println("Please Input Again !!!");
				kt = false;
				break;
			}

			}
		} while (kt == false);
		System.out.println("Put in allowance : ");
		setAllowance(sc.nextInt());
		System.out.println("Put in monthy teaching time : ");
		setMonthlyTeachingTime(sc.nextInt());

	}

	@Override
	public void print() {
		super.print();
		System.out.println("Faculty : " 			  + getFaculty());
		System.out.println("Academic degree : " 	  + getAcademicDegree());
		System.out.println("Allowance : " 			  + getAllowance());
		System.out.println("Monthly teaching time : " + getMonthlyTeachingTime());
	}

}
