package com.launch.springDataJpa.SpringDataJpaLauncher1.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.SampleStudent;

@Repository
public interface SampleStudentRepo extends CrudRepository<SampleStudent, Integer> {

}
