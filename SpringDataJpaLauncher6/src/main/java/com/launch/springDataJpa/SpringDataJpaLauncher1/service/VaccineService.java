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
	public List<Vaccine> fetchByVacineInAndCostBetweenAndVaccineNotLike(Collection<String> names, Double minCost, Double maxCost, String name) {
		
		
		return iVaccineRepo.findByVaccineInAndCostBetweenAndVaccineNotLike(names, minCost, maxCost,name);
	}


}
