//
package com.vti.presiontation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.business.EmployeeService;
import com.vti.backend.business.IEmployeeService;
import com.vti.backend.business.IManagerService;
import com.vti.backend.business.ManagerService;
import com.vti.utils.EmailValidator;

/**
 * This class is Manager Controller. 
 * 
 * @Description: .
 * @author: NTNhat
 * @create_date: Jun 1, 2020
 * @version: 1.0
 * @modifer: 
 * @modifer_date: Jun 1, 2020
 */
public class ManagerController {
	private IManagerService service;

	public ManagerController() throws IOException {
		service = new ManagerService();
	}
	
	public void createManagers(String FirstName,String LastName, String Phone,String Email,int ExpInYear,String PassWord)
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
		
		if(ExpInYear<0 || ExpInYear>20)
		{
			throw new Exception("ExpInYear KHONG HOP LE");
		}
		service.createManagers(FirstName, LastName, Phone, Email, ExpInYear, PassWord);
	}
	
	public void login2(String Email, String PassWord)
			throws Exception {
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
		service.login2(Email, PassWord);
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
