package com.nit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class TechnicalJobs 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer jobId;
	@Column(length = 30)
	@NonNull
	private String jobName;
	@NonNull
	private Double minSalary;
	@NonNull
	private Double maxSalary;
	@NonNull
	private Integer vacancisCount;
	
	@ManyToOne(targetEntity = Company.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "company_id", referencedColumnName = "cId")
	private Company company;
	
	public TechnicalJobs()
	{
		System.out.println("TechnicalJobs-0-Param Constructor");
		
	}

	@Override
	public String toString() {
		return "TechnicalJobs [jobId=" + jobId + ", jobName=" + jobName + ", minSalary=" + minSalary + ", maxSalary="
				+ maxSalary + ", vacancisCount=" + vacancisCount + ", company=" + company + "]";
	}
	
	
}
