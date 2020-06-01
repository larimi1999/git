//
package com.vti.backend.business;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.datalayer.EmployeeRepository;
import com.vti.datalayer.IEmployeeRepository;
import com.vti.datalayer.IManagerRepository;
import com.vti.datalayer.ManagerRepository;

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
public class ManagerService implements IManagerService {
	
	
	private IManagerRepository repository;

	public ManagerService() throws IOException {
		repository = new ManagerRepository();
	}
	/* 
	* @see com.vti.backend.business.IManagerService#createManagers(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String)
	*/
	public void createManagers(String FirstName, String LastName, String Phone, String Email, int ExpInYear,
			String PassWord) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		    repository.createManagers(FirstName, LastName, Phone, Email, ExpInYear, PassWord);
	}

	/* 
	* @see com.vti.backend.business.IManagerService#login2(java.lang.String, java.lang.String)
	*/
	public boolean login2(String Email, String PassWord)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return repository.login2(Email, PassWord);
	}

}
