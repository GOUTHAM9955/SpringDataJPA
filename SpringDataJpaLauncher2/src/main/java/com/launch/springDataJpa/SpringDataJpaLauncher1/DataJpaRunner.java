package com.launch.springDataJpa.SpringDataJpaLauncher1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;
import com.launch.springDataJpa.SpringDataJpaLauncher1.service.VaccineService;

@Component
public class DataJpaRunner implements CommandLineRunner {
	@Autowired
	private VaccineService vaccineservice;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		
		System.out.println("The Id of saved vaccine is"+
				vaccineservice.registerSingleVaccine(new Vaccine("Abc", "Reddy's", 1234.5)).getId());

	}

}
