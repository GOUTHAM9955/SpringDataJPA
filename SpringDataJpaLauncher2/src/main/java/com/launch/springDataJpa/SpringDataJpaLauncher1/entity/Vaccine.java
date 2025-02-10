package com.launch.springDataJpa.SpringDataJpaLauncher1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String Vaccine;
	
	private String CompanyName;
	
	private Double cost;


	public Vaccine( String vaccine, String companyName, Double cost) {
		super();
		Vaccine = vaccine;
		CompanyName = companyName;
		this.cost = cost;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getVaccine() {
		return Vaccine;
	}


	public void setVaccine(String vaccine) {
		Vaccine = vaccine;
	}


	public String getCompanyName() {
		return CompanyName;
	}


	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}


	public Double getCost() {
		return cost;
	}


	public void setCost(Double cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", Vaccine=" + Vaccine + ", CompanyName=" + CompanyName + ", cost=" + cost + "]";
	}
	
	
	
	
	
	

}
