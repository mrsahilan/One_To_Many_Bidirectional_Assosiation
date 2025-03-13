package com.nit.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Company;
import com.nit.entity.TechnicalJobs;
import com.nit.repository.CompanyRepositoryI;
import com.nit.repository.TechnicalJobRepositoryI;

@Service
public class CompanyMgmtServiceImpl implements CompanyMgmtServiceI 
{
	@Autowired
	private CompanyRepositoryI companyRepositoryI;
	@Autowired
	private TechnicalJobRepositoryI technicalJobRepositoryI;
	
	@Override
	public String saveDataUsingParrent() 
	{
		
		// prepare parent object
		Company cmp1 = new Company("HCL", "Hyderabad", 500038L);
		
		// prepare child object
		TechnicalJobs tJob = new TechnicalJobs("Developer", 45000.0, 75000.0, 5);
		TechnicalJobs tJob2 = new TechnicalJobs("Tester", 25000.0, 55000.0, 5);
		
		// set child to parent
		tJob.setCompany(cmp1);
		tJob2.setCompany(cmp1);
		
		// set parent to child
		cmp1.setOpenings(Set.of(tJob,tJob2));
		
		// save the object
		companyRepositoryI.save(cmp1);
		return "Company object is saved.....";
	
	}

	@Override
	public String saveDataUsingChild() 
	{
		Company cmp1 = new Company("TCS", "Delhi", 326021L);

		// prepare child object
		TechnicalJobs tJob = new TechnicalJobs("HR", 45000.0, 85000.0, 2);
		TechnicalJobs tJob2 = new TechnicalJobs("Sales", 15000.0, 35000.0, 10);

		// set child to parent
		tJob.setCompany(cmp1);
		tJob2.setCompany(cmp1);

		// set parent to child
		cmp1.setOpenings(Set.of(tJob, tJob2));

		// save the object
		technicalJobRepositoryI.save(tJob);
		technicalJobRepositoryI.save(tJob2);
		return "Technical_Jobs object is saved with child.....";
	}

	@Override
	public void loadDataUsingParent()
	{
		List<Company> list = companyRepositoryI.findAll();
		list.forEach(comp -> {
			System.out.println("Parent -> " + comp);
			Set<TechnicalJobs> set = comp.getOpenings();
			set.forEach(tecJob -> {
				System.out.println("Child ->" + tecJob);
			});
			System.out.println("-------------------------------------------------------------");
		});
	}
	
	@Override
	public void loadDataUsingChild() 
	{
		List<TechnicalJobs> list = technicalJobRepositoryI.findAll();
		list.forEach(techJob -> {
			System.out.println("Child --> " + techJob);
			
			Company cmp = techJob.getCompany();
			System.out.println("Parent --> " + cmp);	
		});
	}
	
	@Override
	public String deleteDataUsingParent(Integer id)
	{
		Optional<Company> cmp = companyRepositoryI.findById(id);
		if(cmp.isPresent())
		{
			companyRepositoryI.delete(cmp.get());
			return "Parent and its associated is deleted";
		}
		return "Id not found try again....";
	}
	
	@Override
	public String deleteDataUsingChild(int id) 
	{
		Optional<TechnicalJobs> opt = technicalJobRepositoryI.findById(id);
		if(opt.isPresent())
		{
			technicalJobRepositoryI.delete(opt.get());
			return "Child object with its associated method is deleted....";
		}
		return "Id not found try again......";
	}
}
