package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Company;

public interface CompanyRepositoryI extends JpaRepository<Company, Integer> 
{

}
