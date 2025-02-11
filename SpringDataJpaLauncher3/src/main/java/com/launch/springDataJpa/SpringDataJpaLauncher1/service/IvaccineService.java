package com.launch.springDataJpa.SpringDataJpaLauncher1.service;

import org.springframework.stereotype.Service;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;

@Service
public interface IvaccineService {
	public Iterable<Vaccine> fetchDetailsBySorting(boolean status, String... properties);
	
	public void fetchDetailsByPaging();
	
}
