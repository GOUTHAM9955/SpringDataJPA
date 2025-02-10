package com.launch.springDataJpa.SpringDataJpaLauncher1.repo;

import org.springframework.data.repository.CrudRepository;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;


public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {

}
