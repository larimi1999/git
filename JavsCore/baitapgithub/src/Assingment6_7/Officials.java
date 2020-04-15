package Assingment6_7;

import java.util.Scanner;

public class Officials extends Staffs {
	private String department, position;
	private float working_time, allowance;

	

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public float getWorking_time() {
		return working_time;
	}

	public void setWorking_time(float working_time) {
		this.working_time = working_time;
	}

	public float getAllowance() {
		return allowance;
	}

	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}

	@Override
	public double getSalary() {
		return getSalaryMultiplier() * 730 + getAllowance() + getWorking_time() * 30;
	}

	@Override
	public void input() {
		super.input();
		int loai, loai1;
		boolean kt = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Put in department : ");
		setDepartment(sc.nextLine());
		System.out.println("Put in working time : ");
		setWorking_time(sc.nextFloat());
		do {
			System.out.println("Choose Kind of position : ");
			System.out.println("1.Department head . ");
			System.out.println("2.Vice head . ");
			System.out.println("3.Staff . ");
			loai = sc.nextInt();
			switch (loai) {
			case 1: {
				setPosition("Department head");
				kt = true;
				break;
			}
			case 2: {
				setPosition("Vice head");
				kt = true;
				break;
			}
			case 3: {
				setPosition("Staff");
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
		do {
			System.out.println("Choose Kind of Allowance : ");
			System.out.println("1.Bachelor .");
			System.out.println("2.Master .");
			System.out.println("3.Doctor .");
			System.out.println("4.Department head .");
			System.out.println("5.Vice head .");
			System.out.println("6.Staff .");
			loai1 = sc.nextInt();
			switch (loai1) {
			case 1: {
				setAllowance(300);
				kt = true;
				break;
			}
			case 2: {
				setAllowance(500);
				kt = true;
				break;
			}
			case 3: {
				setAllowance(1000);
				kt = true;
				break;
			}
			case 4: {
				setAllowance(2000);
				kt = true;
				break;
			}
			case 5: {
				setAllowance(1000);
				kt = true;
				break;
			}
			case 6: {
				setAllowance(500);
				kt = true;
				break;
			}
			default: {
				System.out.println("Error!!!");
				kt = false;
				break;

			}
			}

		} while (kt == false);

	}
	@Override
	public void print() {
		super.print();
		System.out.println("Department : " + getDepartment());
		System.out.println("Working Time : "+ getWorking_time());
		System.out.println("Allowance : " + getAllowance());
		System.out.println("Position : " + getPosition());
		
	}

}
