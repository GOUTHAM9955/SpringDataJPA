package com.launch.springDataJpa.SpringDataJpaLauncher1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.launch.springDataJpa.SpringDataJpaLauncher1.dynamicView.IDynamicVaccineResult;
import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	
	public<T extends IDynamicVaccineResult> List<T> findBycostLessThan(Double cost, Class<T> cls);

}
