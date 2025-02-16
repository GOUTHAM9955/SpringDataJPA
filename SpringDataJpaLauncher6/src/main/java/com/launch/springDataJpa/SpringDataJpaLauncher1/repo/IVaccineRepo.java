package com.launch.springDataJpa.SpringDataJpaLauncher1.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;


public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	
	public List<Vaccine> findByVaccineInAndCostBetweenAndVaccineNotLike(Collection<String> names, Double minCost, Double maxCost, String name);
	

}
