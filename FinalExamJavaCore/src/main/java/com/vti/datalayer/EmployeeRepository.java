package com.vti.datalayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.vti.utils.JdbcUtils;

/**
 * This class is Employee Repository.
 * 
 * @Description: .
 * @author: NTNhat
 * @create_date: Jun 1, 2020
 * @version: 1.0
 * @modifer:
 * @modifer_date: Jun 1, 2020
 */
public class EmployeeRepository implements IEmployeeRepository {

	private JdbcUtils jdbcUtils;

	public EmployeeRepository() throws IOException {
		jdbcUtils = new JdbcUtils();
	}

	public void createEmployees(String FirstName,String LastName, String Phone,String Email,String projectName,String ProSkill,String PassWord)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {

		// Step 2 : get a Database Connection
		Connection connection = jdbcUtils.connect();
		System.out.println("Connect success");

		// B2: write statement
		String sqlStatement = "INSERT INTO Employee(`FirstName`, `LastName`, `Phone`,`Email`,`projectName`,`ProSkill`,`PassWord`) "+
							  "VALUES 				(	?, 			?,		   ?,		?,			? ,			?,		?)";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);

		// set parameter
		preparedStatement.setString(1, 	FirstName);
		preparedStatement.setString(2,	LastName);
		preparedStatement.setString(3, 	Phone);
		preparedStatement.setString(4,  Email);
		preparedStatement.setString(5,  projectName);
		preparedStatement.setString(6,  ProSkill);			
		preparedStatement.setString(7,  PassWord);
		
		// Step 4 : Execute SQL query
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println("Effected Record Amount :" + effectedRecordAmount);
		jdbcUtils.disconnect();
	}

	public boolean login1(String Email, String PassWord)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection connection = jdbcUtils.connect();
		System.out.println("Connect success");
		// create a statement object
		String sql = "SELECT email,`password` FROM employee WHERE email = ? AND `password` = ?";

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
