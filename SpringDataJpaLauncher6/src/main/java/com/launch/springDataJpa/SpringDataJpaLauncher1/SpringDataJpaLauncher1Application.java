package com.launch.springDataJpa.SpringDataJpaLauncher1;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.launch.springDataJpa.SpringDataJpaLauncher1.service.VaccineService;


@SpringBootApplication

/*
 * In this project we are going to explore more on Custom Finder Methods
 * 
 *    Let us create a custom finder method which checks if the vaccine name is in list of vaccines, cost is between given range and vaccine name is not like %pq%
 *    	The abstract method name for it in Repository layer will be 
 *    		findBy+VaccineNameIn+And+CostBetween+And+VaccineNotLike
 *    		=> findByVacineNameInAndCostBetweenAndVaccineNotLike(Collection<String> names, Double minCost, Double maxCost, String name);
 */



public class SpringDataJpaLauncher1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringDataJpaLauncher1Application.class, args);	

		VaccineService vaccineService = context.getBean(VaccineService.class);
		
		Collection<String> coll = new HashSet<String> ();
		coll.add("Abc");
		coll.add("pqr");
		coll.add("pqr1");
		coll.add("dhe2");
		
		vaccineService.fetchByVacineInAndCostBetweenAndVaccineNotLike(coll, 100.0, 2000.0,"%pq%").forEach(v->System.out.println(v.getVaccine()));
		
	}

}
