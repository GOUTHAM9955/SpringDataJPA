package com.launch.springDataJpa.SpringDataJpaLauncher1.service;

import java.util.Collection;
import java.util.List;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;


public interface IVaccineService {
	
	public List<Vaccine> fetchByVacineInAndCostBetweenAndVaccineNotLike(Collection<String> names, Double minCost, Double maxCost, String name);

}
