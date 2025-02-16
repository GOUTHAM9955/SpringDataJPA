package com.launch.springDataJpa.SpringDataJpaLauncher1.service;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;
import com.launch.springDataJpa.SpringDataJpaLauncher1.repo.IVaccineRepo;

@Service
public class VaccineService implements IVaccineService {
	
	@Autowired
	IVaccineRepo iVaccineRepo;

	@Override
	public List<Vaccine> searchByVaccineCompany(String company) {
		// TODO Auto-generated method stub
		return iVaccineRepo.searchByVaccineCompany(company);
	}

	@Override
	public List<String> searchByVaccineCompanys(String company1, String company2) {
		// TODO Auto-generated method stub
		return iVaccineRepo.searchByVaccineCompanys(company1, company2);
	}

	@Override
	public List<Vaccine> searchByCost(Double price1, Double price2) {
		// TODO Auto-generated method stub
		return iVaccineRepo.searchByCost(price1, price2);
	}
	
	public int updateVaccinePrice(String vaccineName, Double price) {
		return iVaccineRepo.updateVaccinePrice(vaccineName, price);
	}

	@Override
	public int deleteVaccineByPriceRange(Double price1, Double price2) {
		// TODO Auto-generated method stub
		return iVaccineRepo.deleteVaccineByPriceRange(price1, price2);
	}

	public int insertValues(int id, String vaccine, String company_name, Double cost) {
		return iVaccineRepo.insertValues(id,vaccine,company_name, cost);
	}

	
}
