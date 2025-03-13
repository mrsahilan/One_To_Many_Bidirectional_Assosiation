package com.nit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.repository.CompanyRepositoryI;
import com.nit.service.CompanyMgmtServiceI;

@Component
public class OneToMannyTestRunners implements CommandLineRunner
{
	@Autowired
	private CompanyMgmtServiceI companyMgmtServiceI;
	
	@Override
	public void run(String... args) throws Exception 
	{
		// for parent class object
		/*
		try
		{
			String msg = companyMgmtServiceI.saveDataUsingParrent();
			System.out.println("Company data is saved parent object: " + msg);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		*/
		
		// for child class object
		/*
		try
		{
			String msg = companyMgmtServiceI.saveDataUsingChild();
			System.out.println("Company data is saved with child object : " + msg);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		*/
		
		// load data using parent
		/*
		companyMgmtServiceI.loadDataUsingParent();
		*/
		
		// load data using child
		/*
		companyMgmtServiceI.loadDataUsingChild();
		*/
		
		// delete parent object by id
		/*
		companyMgmtServiceI.deleteDataUsingParent(102);
		*/
		
		// delete parent object by id
		companyMgmtServiceI.deleteDataUsingChild(101);
	}

}
