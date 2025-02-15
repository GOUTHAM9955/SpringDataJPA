package com.launch.springDataJpa.SpringDataJpaLauncher1.service;

import java.util.List;

import com.launch.springDataJpa.SpringDataJpaLauncher1.staticView.IStaticVaccineResult;

public interface IVaccineService {
	
	public List<IStaticVaccineResult> findByCost(Double cost);

}
