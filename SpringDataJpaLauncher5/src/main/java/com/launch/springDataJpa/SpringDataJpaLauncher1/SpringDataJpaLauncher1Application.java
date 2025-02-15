package com.launch.springDataJpa.SpringDataJpaLauncher1;

import java.util.List;

import org.springframework.boot.SpringApplication;

import com.launch.springDataJpa.SpringDataJpaLauncher1.dynamicView.IResult1;
import com.launch.springDataJpa.SpringDataJpaLauncher1.dynamicView.IResult2;
import com.launch.springDataJpa.SpringDataJpaLauncher1.dynamicView.IResult3;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.launch.springDataJpa.SpringDataJpaLauncher1.service.VaccineService;


@SpringBootApplication

/*
 * In this project we are going to explore Dynamic projects using JpaRepository
 * 	>>For dynamically getting data with desired fields we created 3 interfaces extending IDynamicVaccineResult interface
 *  >> Each of those 3 interfaces Interface have their own get methods for example IResult3 has getCompanyName and getCost methods
 *           so, this will return only those two columns when used
 *  >> We used generics concepts to dynamicall pass any of these three Interfaces based on our needs
 *  		check IVaccineRepository and IVaccineService classes
 *  			syntax we used: 
 *  			public<T extends IDynamicVaccineResult> List<T> findBycostLessThan(Double cost, Class<T> cls); 
 */

public class SpringDataJpaLauncher1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringDataJpaLauncher1Application.class, args);
		VaccineService vaccineService = context.getBean(VaccineService.class);
		
		System.out.println("Result1####################################");
		vaccineService.findByCost(130.0, IResult1.class).forEach(v ->  
				System.out.println(v.getId()+",  "+v.getVaccine()+",  "+v.getCompanyName()+",  "+v.getCost()));
		

		System.out.println("Result2####################################");
		vaccineService.findByCost(130.0, IResult2.class).forEach(v ->  
		System.out.println(v.getVaccine()+",  "+v.getCompanyName()));

		
		System.out.println("Result3####################################");
		
		vaccineService.findByCost(130.0, IResult3.class).forEach(v ->  
		System.out.println(v.getVaccine()+",  "+v.getCompanyName()+",  "+v.getCost()));
		
		
		
	}

}
