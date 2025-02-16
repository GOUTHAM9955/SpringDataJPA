package com.launch.springDataJpa.SpringDataJpaLauncher1.service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;


public interface IVaccineService {
	

	public List<Vaccine> searchByVaccineCompany(String company);
	

	public List<String> searchByVaccineCompanys(String company1, String company2);
	
	public List<Vaccine> searchByCost(Double price1, Double price2);
	
	public int updateVaccinePrice(String vaccineName, Double price);
	
	public int deleteVaccineByPriceRange(Double price1, Double price2);
	
	public int insertValues(int id,String vaccine, String company_name, Double cost);
}
