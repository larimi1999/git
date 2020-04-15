package com.vti.assignment9.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.vti.assgnment9.backend.presiontationLayer.FresherController;
import com.vti.assignment9.utils.ScannerUtils;

public class Function {
	private FresherController controller;
	private Scanner scanner;
	private ScannerUtils scannerUtils;
	
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: Ngo Trung Nhat
	 * @create_date: Mar 24, 2020
	 * @version: 1.0
	 * @modifer: Ngo Trung nhat
	 * @modifer_date: Mar 24, 2020
	 * @param userName
	 */
	public Function() {
		controller = new FresherController();
		scanner = new Scanner(System.in);	
	}
	
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: Ngo Trung Nhat
	 * @create_date: Mar 24, 2020
	 * @version: 1.0
	 * @modifer: hung34atp
	 * @modifer_date: Mar 24, 2020
	 * @param userName
	 */

	public void createFresher() {
		try {
			System.out.println("Please input account;");
			String account = ScannerUtils.readString(scanner,"");

			System.out.println("Please input firstName");
			String firstName = ScannerUtils.readString(scanner,"");

			System.out.println("Please input lastName;");
			String lastName = ScannerUtils.readString(scanner,"");

			System.out.println("Please input email;");
			String email = ScannerUtils.readString(scanner,"");

			controller.createFresher(account, firstName, lastName, email);
			System.out.println("create Successfully");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("There is a error occur!");
		}
	}
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: Ngo Trung Nhat
	 * @create_date: Mar 24, 2020
	 * @version: 1.0
	 * @modifer: Ngo trung Nhat
	 * @modifer_date: Mar 24, 2020
	 * @param userName
	 */
	public void modifyFresher() {
		try {
			System.out.println("Please input account;");
			String account = ScannerUtils.readString(scanner,"");

			System.out.println("Please input firstName");
			String firstName = ScannerUtils.readString(scanner,"");

			System.out.println("Please input lastName;");
			String lastName = ScannerUtils.readString(scanner,"");

			System.out.println("Please input email;");
			String email = ScannerUtils.readString(scanner,"");

			controller.modifyFresher(account, firstName, lastName, email);
			System.out.println("create Successfully");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("There is a error occur!");
		}
	}
	
	
}
