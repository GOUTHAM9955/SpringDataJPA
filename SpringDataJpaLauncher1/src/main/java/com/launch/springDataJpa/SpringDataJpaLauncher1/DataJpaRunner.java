package com.launch.springDataJpa.SpringDataJpaLauncher1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.SampleStudent;
import com.launch.springDataJpa.SpringDataJpaLauncher1.repo.SampleStudentRepo;

@Component
public class DataJpaRunner implements CommandLineRunner {
	
	@Autowired
	private SampleStudentRepo sampleStudentRepo;
	
	//private SampleStudent sanpleStudent;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		sampleStudentRepo.save(new SampleStudent(2,"1234"));
	}

}
