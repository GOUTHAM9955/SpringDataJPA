package com.launch.springDataJpa.SpringDataJpaLauncher1.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.launch.springDataJpa.SpringDataJpaLauncher1.dynamicView.IDynamicVaccineResult;
import com.launch.springDataJpa.SpringDataJpaLauncher1.repo.IVaccineRepo;

@Service
public class VaccineService implements IVaccineService {
	
	@Autowired
	IVaccineRepo iVaccineRepo;

	@Override
	public<T extends IDynamicVaccineResult> List<T> findByCost(Double cost, Class<T> clas) {
		// TODO Auto-generated method stub
		
		return iVaccineRepo.findBycostLessThan(cost, clas);
	}

}
