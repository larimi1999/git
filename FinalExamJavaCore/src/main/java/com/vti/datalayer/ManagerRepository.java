//
package com.vti.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.utils.JdbcUtils;

/**
 * This class is Manager Repository. 
 * 
 * @Description: .
 * @author: NTNhat
 * @create_date: Jun 1, 2020
 * @version: 1.0
 * @modifer: 
 * @modifer_date: Jun 1, 2020
 */
public class ManagerRepository implements IManagerRepository {
	private JdbcUtils jdbcUtils;

	public ManagerRepository() throws IOException {
		jdbcUtils = new JdbcUtils();
	}

	public void createManagers(String FirstName,String LastName, String Phone,String Email,int ExpInYear,String PassWord)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {

		// Step 2 : get a Database Connection
		Connection connection = jdbcUtils.connect();
		System.out.println("Connect success");

		// B2: write statement
		String sqlStatement = "INSERT INTO Manager(`FirstName`, `LastName`, `Phone`,`Email`,`ExpInYear`,`PassWord`) "+
							  "VALUES 			  (	?, 			?,		   ?,		?,			? ,			 ?    )";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);

		// set parameter
		preparedStatement.setString(1, 	FirstName);
		preparedStatement.setString(2,	LastName);
		preparedStatement.setString(3, 	Phone);
		preparedStatement.setString(4,  Email);
		preparedStatement.setInt   (5,  ExpInYear);		
		preparedStatement.setString(6,  PassWord);
		
		// Step 4 : Execute SQL query
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println("Effected Record Amount :" + effectedRecordAmount);
		jdbcUtils.disconnect();
	}

	public boolean login2(String Email, String PassWord)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection connection = jdbcUtils.connect();
		System.out.println("Connect success");
		// create a statement object
		String sql = "SELECT email,`password` FROM manager WHERE email = ? AND `password` = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// set parameter
		preparedStatement.setString(1, Email);
		preparedStatement.setString(2, PassWord);

		// Step 4 : Execute SQL query
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			if (resultSet.getString("email").equals(Email) && resultSet.getString("password").equals(PassWord)) {
				System.out.println("Login Successfully");
				jdbcUtils.disconnect();
				return true;
			}

		}

		System.out.println("Incorrect Email or Password");
		jdbcUtils.disconnect();
		return false;

	}
	
}
