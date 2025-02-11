package com.launch.springDataJpa.SpringDataJpaLauncher1.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;


@Repository
public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine, Integer> {

}
