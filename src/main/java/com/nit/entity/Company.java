package com.nit.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Company 
{
	@Id
	@SequenceGenerator(name = "gen1", initialValue = 100, sequenceName = "COMPID_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer cId;
	@Column(length = 30)
	@NonNull
	private String cName;
	@Column(length = 30)
	@NonNull
	private String address;
	@NonNull
	private Long pinCode;
	
	@OneToMany(targetEntity = TechnicalJobs.class, cascade = CascadeType.ALL, mappedBy = "company")
	//@JoinColumn(name = "company_id", referencedColumnName = "cId")
	private Set<TechnicalJobs> openings; // 1 to M mapping
	
	
	@Override
	public String toString() {
		return "TechnicalJobs [cId=" + cId + ", cName=" + cName + ", address=" + address + ", pinCode=" + pinCode
				+ "]";
	}


	public Company()
	{
		System.out.println("TechnicalJobs- 0 Param Constructor");
	}
	
	
}
