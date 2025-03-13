package com.nit.service;

public interface CompanyMgmtServiceI
{
	public String saveDataUsingParrent();
	
	public String saveDataUsingChild();
	
	public void loadDataUsingParent();
	
	public void loadDataUsingChild();
	
	public String deleteDataUsingParent(Integer id);
	
	public String deleteDataUsingChild(int id);
}
