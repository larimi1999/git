//
package com.vti.backend.business;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

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
public interface IManagerService {
	public void createManagers(String FirstName,String LastName, String Phone,String Email,int ExpInYear,String PassWord)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
	
	public boolean login2(String Email, String PassWord)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
}
