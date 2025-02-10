package com.launch.springDataJpa.SpringDataJpaLauncher1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;
import com.launch.springDataJpa.SpringDataJpaLauncher1.repo.IVaccineRepo;

@Service
public class VaccineService implements IVaccineService {
	
	
	private IVaccineRepo repo;
	
	@Autowired
	public void setRepo(IVaccineRepo repo){
		this.repo = repo;
	}

	@Override
	public Vaccine registerSingleVaccine(Vaccine vaccine) {
		return repo.save(vaccine);
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) {
		return repo.saveAll(vaccines);
	}

}
