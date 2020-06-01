package com.vti.frontend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.vti.presiontation.EmployeeController;
import com.vti.presiontation.ManagerController;
import com.vti.utils.EmailValidator;
import com.vti.utils.ScannerUtils;

/**
 * This class is . Main
 * 
 * @Description: .
 * @author: NTNhat
 * @create_date: Jun 1, 2020
 * @version: 1.0
 * @modifer: 
 * @modifer_date: Jun 1, 2020
 */
public class Program {
	public static void main(String[] args) throws Exception {
	 
		EmployeeController emp = new EmployeeController();
		ManagerController man  = new ManagerController();
		Scanner sc = new Scanner(System.in);		
		
		while(true)
		{
			System.out.println("Plase input your Choose :");
			System.out.println("1.Insert Manager.");
			System.out.println("2.Insert Employee.");
			System.out.println("3.Login use Manager Account.");
			System.out.println("4.Login use Employee Account.");
			System.out.println("5.Exit");
			int choose = sc.nextInt();
			if(choose==1)
			{
				System.out.println("Nhap vao FirstName: ");
				String FirstName = ScannerUtils.readString(sc, "Nhap lai");
				
				System.out.println("Nhap vao LastName: ");
				String LastName = ScannerUtils.readString(sc, "Nhap lai");
				
				System.out.println("Nhap vao Phone: ");
				String Phone = ScannerUtils.readString(sc, "Nhap lai");
				
				System.out.println("Nhap vao Email: ");
				String Email = ScannerUtils.readString(sc, "Nhap lai");
				
				System.out.println("Nhap vao ExpInYear :  ");
				int ExpInYear = ScannerUtils.readInt(sc, "Nhap lai");
				
				System.out.println("Nhap vao PassWord: ");
				String PassWord = ScannerUtils.readString(sc, "Nhap lai");
								
				man.createManagers(FirstName, LastName, Phone, Email, ExpInYear, PassWord);
			}
			
			if(choose==2)
			{
				System.out.println("Nhap vao FirstName: ");
				String FirstName = ScannerUtils.readString(sc, "Nhap lai");
				
				System.out.println("Nhap vao LastName: ");
				String LastName = ScannerUtils.readString(sc, "Nhap lai");
				
				System.out.println("Nhap vao Phone: ");
				String Phone = ScannerUtils.readString(sc, "Nhap lai");
				
				System.out.println("Nhap vao Email: ");
				String Email = ScannerUtils.readString(sc, "Nhap lai");
				
				System.out.println("Nhap vao Project Name: ");
				String projectName = ScannerUtils.readString(sc, "Nhap lai");
				
				System.out.println("Nhap vao ProSkill: ");
				String ProSkill = ScannerUtils.readString(sc, "Nhap lai");
				
				System.out.println("Nhap vao PassWord: ");
				String PassWord = ScannerUtils.readString(sc, "Nhap lai");
								
				emp.createEmployees(FirstName, LastName, Phone, Email, projectName, ProSkill, PassWord);
			}
			if(choose==3)
			{
				System.out.println("Nhap vao Email : ");
				String Email = ScannerUtils.readString(sc, "Xin hay nhap lai");
				System.out.println("Nhap vao PassWord : ");
				String PassWord = ScannerUtils.readString(sc, "Xin hay nhap lai");	
				man.login2(Email, PassWord);
				break;
			}
			if(choose==4)
			{
				System.out.println("Nhap vao Email : ");
				String Email = ScannerUtils.readString(sc, "Xin hay nhap lai");
				System.out.println("Nhap vao PassWord : ");
				String PassWord = ScannerUtils.readString(sc, "Xin hay nhap lai");	
				emp.login(Email, PassWord);
				break;
			}
			if(choose==5)
			{
				System.exit(0);
			}
		}
	
	}
}
