package com.vti.assignment9.businessLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface IFresherService {
	public void createFresher(String account,String firstName , String lastName,String email) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	public void modifyFresher(String account,String firstName, String lastName,String email)  throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	
}
