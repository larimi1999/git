package com.vti.assingment9.backend.dataLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * This class is .
 * 
 * @Description: .
 * @author: Ngo Trung Nhat
 * @create_date: April 13, 2020
 * @version: 1.0
 * @modifer: Ngo Trung nhat
 * @modifer_date: Apirl 13, 2020
 */

public class FresherRepository {
	/*
	 * @see com.vti.jdbc.backend.datalayer.
	 */
	
	private Connection getDatabaseConnection() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
		// get property
		Properties propertiesFile = new Properties();
		propertiesFile.load(new FileInputStream("src/main/resource/database.properties"));

		String url 		= propertiesFile.getProperty("connectionString");
		String user 	= propertiesFile.getProperty("username");
		String password = propertiesFile.getProperty("password");
		String driver	= propertiesFile.getProperty("driverSQLName");

		Class.forName(driver);

		// B1: get a Database Connection
		return DriverManager.getConnection(url, user, password);

		
	}
	public void createFresher(String account,String firstName, String lastName,String email) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{
		
				/*
				 * @see com.vti.jdbc.backend.datalayer.
				 */
				//B1 : get a Database Connection
				Connection connection = getDatabaseConnection();
				
		
		
				// B2: write statement
				String sqlStatement = "INSERT INTO fresher(`account`, `firstName`,`lastName`,`email`) "+
									  "VALUES 				(	?, 			?,		?,			?)";
				
				PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);

				// set parameter
				preparedStatement.setString(1, account);
				preparedStatement.setString(2, firstName);
				preparedStatement.setString(3, lastName);
				preparedStatement.setString(4, email);
				

				// execute Query Update
				preparedStatement.executeUpdate();
				

				// close connection
				connection.close();
	}
	
	public void modifyFresher(String account,String firstName, String lastName,String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		/*
		 * @see com.vti.jdbc.backend.datalayer.
		 */
		//B1 : get a Database Connection
		Connection connection = getDatabaseConnection();
		//B2:write statement
		String sqlStatement ="UPDATE fresher SET firstName=?,lastName=?,email=?"+ "WHERE account=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);
		preparedStatement.setString(1,firstName);
		preparedStatement.setString(2,lastName);
		preparedStatement.setString(3,email);
		preparedStatement.setString(4,account);
		
		//execute Query Update
		preparedStatement.executeUpdate();
		
		//close connection
		connection.close();
		
	}
	
	
	
}
