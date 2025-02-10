package com.launch.springDataJpa.SpringDataJpaLauncher1.service;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;

public interface IVaccineService {
	public Vaccine registerSingleVaccine(Vaccine vaccine);
	
	public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);
}
