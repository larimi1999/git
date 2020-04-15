package com.vti.assgnment9.backend.presiontationLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.assignment9.businessLayer.FresherServiceImpl;
import com.vti.assignment9.businessLayer.IFresherService;

public class FresherController {
	private IFresherService service;
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: Ngo Trung Nhat
	 * @create_date: Mar 24, 2020
	 * @version: 1.0
	 * @modifer: Ngo Trung Nhat
	 * @modifer_date: Mar 24, 2020
	 * @param userName
	 */
	public FresherController(){
		service = new FresherServiceImpl();
	}
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: Ngo Trung Nhat
	 * @create_date: Mar 24, 2020
	 * @version: 1.0
	 * @modifer: Ngo Trung Nhat
	 * @modifer_date: Mar 24, 2020
	 * @param userName
	 */
	public void createFresher(String account,String firstName , String lastName,String email)   throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		service.createFresher(account, firstName, lastName, email);
	} 
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: Ngo Trung Nhat
	 * @create_date: Mar 24, 2020
	 * @version: 1.0
	 * @modifer:Ngo Trung Nhat
	 * @modifer_date: Mar 24, 2020
	 * @param userName
	 */
	
    public void modifyFresher(String account, String firstName, String lastName, String email)	throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		 service.modifyFresher(account, firstName, lastName, email);
	}
}
