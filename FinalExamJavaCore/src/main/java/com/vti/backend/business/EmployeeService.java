//
package com.vti.backend.business;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.datalayer.EmployeeRepository;
import com.vti.datalayer.IEmployeeRepository;

/**
 * This class is .
 * 
 * @Description: .
 * @author: NTNhat
 * @create_date: Jun 1, 2020
 * @version: 1.0
 * @modifer:
 * @modifer_date: Jun 1, 2020
 */
public class EmployeeService implements IEmployeeService {
	private IEmployeeRepository repository;

	public EmployeeService() throws IOException {
		repository = new EmployeeRepository();
	}

	/*
	 * @see com.vti.backend.business.IEmployeeService#login1(java.lang.String,
	 * java.lang.String)
	 */
	public boolean login1(String Email, String PassWord)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return repository.login1(Email, PassWord);
	}

	/*
	 * @see com.vti.backend.business.IEmployeeService#createEmployees(java.lang.
	 * String, java.lang.String, java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	public void createEmployees(String FirstName, String LastName, String Phone, String Email, String projectName,
			String ProSkill, String PassWord)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		repository.createEmployees(FirstName, LastName, Phone, Email, projectName, ProSkill, PassWord);
	}
}
