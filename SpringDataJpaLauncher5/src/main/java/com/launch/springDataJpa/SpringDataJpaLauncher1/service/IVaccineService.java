package com.launch.springDataJpa.SpringDataJpaLauncher1.service;

import java.util.List;

import com.launch.springDataJpa.SpringDataJpaLauncher1.dynamicView.IDynamicVaccineResult;

public interface IVaccineService {
	
	public<T extends IDynamicVaccineResult> List<T> findByCost(Double cost, Class<T> cls);

}
