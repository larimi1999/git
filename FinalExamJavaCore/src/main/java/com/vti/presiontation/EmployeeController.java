//
package com.vti.presiontation;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.business.EmployeeService;
import com.vti.backend.business.IEmployeeService;
import com.vti.utils.EmailValidator;

import java.util.Scanner;

/**
 * This class is LOGIN,CREATE 1 EMPLOYEEE
 * .
 * 
 * @Description: .
 * @author: NTNhat
 * @create_date: Jun 1, 2020
 * @version: 1.0
 * @modifer:
 * @modifer_date: Jun 1, 2020
 */
public class EmployeeController {
	private IEmployeeService service;

	public EmployeeController() throws IOException {
		service = new EmployeeService();
	}

	public void createEmployees(String FirstName, String LastName, String Phone, String Email, String projectName,
			String ProSkill, String PassWord)
			throws Exception {
		EmailValidator validator = new EmailValidator();
		if(Phone.length()>12||Phone.length()<9)
		{
			throw new Exception("Phone Incorrectly!");
		}
		
		if (validator.validate(Email)) {

		} else {
			throw new Exception("Email KHONG HOP LE");
		}
		
		if(!projectName.equals("Testing System")||!projectName.equals("CRM")||!projectName.equals("TimeSheet"))
		{
			throw new Exception("Project Name Wrong!");
		}
		
		service.createEmployees(FirstName, LastName, Phone, Email, projectName, ProSkill, PassWord);
	}

	public void login(String Email, String PassWord) throws Exception {

		EmailValidator validator = new EmailValidator();

		if (validator.validate(Email)) {

		} else {
			throw new Exception("Email KHONG HOP LE");
		}

		int dem = isUpperCase(PassWord);

		if (dem == 0) {
			throw new Exception("Your PassWord have to have one Chu In Hoa");
		}

		if (PassWord == null || PassWord.length() > 20 || PassWord.length() < 6) {
			throw new Exception("Group Name must be greater than 6 characters and less than 20 characters");
		}

		service.login1(Email, PassWord);
	}

	public static int isUpperCase(String Pass) {

		int count = 0;
		String a[] = Pass.split("");
		String b[] = Pass.split("");
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("0") || a[i].equals("1") || a[i].equals("2") || a[i].equals("3") || a[i].equals("4")
					|| a[i].equals("5") || a[i].equals("6") || a[i].equals("7") || a[i].equals("8")
					|| a[i].equals("9")) {
				continue;
			}
			for (int j = 0; j < b.length; j++)

				if (a[i].toUpperCase().equals(b[j]) == true) {

					count++;
				}
		}

		return count;

	}

}
