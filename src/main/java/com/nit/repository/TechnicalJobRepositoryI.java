package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.TechnicalJobs;

public interface TechnicalJobRepositoryI extends JpaRepository<TechnicalJobs, Integer> 
{

}
