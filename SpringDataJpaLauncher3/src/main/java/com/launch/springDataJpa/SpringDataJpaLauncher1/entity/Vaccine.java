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
	
	private String vaccine;
	
	private String companyName;
	
	private Double cost;


	public Vaccine() {
		System.out.println("Creating Vaccine Object ");
	}
	public Vaccine( String vaccine, String companyName, Double cost) {
		super();
		this.vaccine = vaccine;
		this.companyName = companyName;
		this.cost = cost;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getVaccine() {
		return vaccine;
	}


	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public Double getCost() {
		return cost;
	}


	public void setCost(Double cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", Vaccine=" + vaccine + ", CompanyName=" + companyName + ", cost=" + cost + "]";
	}
	
	


}
