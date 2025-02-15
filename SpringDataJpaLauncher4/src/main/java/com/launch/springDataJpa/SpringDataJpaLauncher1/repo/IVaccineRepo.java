package com.launch.springDataJpa.SpringDataJpaLauncher1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;
import com.launch.springDataJpa.SpringDataJpaLauncher1.staticView.IStaticVaccineResult;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	
	List<IStaticVaccineResult> findBycostLessThan(Double cost);

}
