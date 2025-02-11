package com.launch.springDataJpa.SpringDataJpaLauncher1.service;

import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Repository;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;
import com.launch.springDataJpa.SpringDataJpaLauncher1.repo.IVaccineRepo;

@Repository
public class VaccineService implements IvaccineService {
	
	private IVaccineRepo vaccineRepo;
	
	@Autowired
	public void setVaccineRepo(IVaccineRepo vaccineRepo) {
		this.vaccineRepo = vaccineRepo;
	}

	@Override
	public Iterable<Vaccine> fetchDetailsBySorting(boolean status, String... properties) {
		Sort sort= Sort.by(status?Direction.ASC:Direction.DESC, properties);
		return vaccineRepo.findAll(sort);
		
	}

	@Override
	public void fetchDetailsByPaging() {
		int pageCount = 4;
		for (int i=0; i<= pageCount; i++) {
		PageRequest page = PageRequest.of(i, 1);
		 vaccineRepo.findAll(page).getContent().forEach(v->System.out.println(v));
		 System.out.println("_________________________");
		}
	}

}
