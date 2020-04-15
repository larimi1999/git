package com.vti.assignment9.businessLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.assingment9.backend.dataLayer.FresherRepository;

public class FresherServiceImpl implements IFresherService {
	private FresherRepository repository;
	
	

	public FresherServiceImpl(){
		repository = new FresherRepository();
	}

	public void createFresher(String account, String firstName, String lastName, String email) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException 
	{
		repository.createFresher(account, firstName, lastName, email);
	}

	
	public void modifyFresher(String account, String firstName, String lastName, String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		repository.modifyFresher(account, firstName, lastName, email);
	}

}
