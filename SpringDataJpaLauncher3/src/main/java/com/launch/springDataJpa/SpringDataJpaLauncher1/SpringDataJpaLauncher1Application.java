package com.launch.springDataJpa.SpringDataJpaLauncher1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.launch.springDataJpa.SpringDataJpaLauncher1.service.VaccineService;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@SpringBootApplication

/*
 * In this class we are going to exploare SortingAndPaginationRepository
 * 	It consists of two methods
 * 		1) findAll(Sort sort)
 * 			To create a sort object with Sort.by(direction, properties) method.
 * 			Check how we are using trinary operation for direction
 * 			And VartArgs to pass property values so that we can pass any coulmns on which we can sort
 *      2) findAll(Pagable pagable)
 *     		 We can get Pagable class using PageRequest.of() method
 *     		Sort and Direction are optional here
 *      		For pagination we have two more parameters along with status and poperties
 *      			1) for total no:of page numbers
 *      			2) For page size 
 *      		
 */

public class SpringDataJpaLauncher1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringDataJpaLauncher1Application.class, args);
		VaccineService vaccineService = context.getBean(VaccineService.class);
		
		//vaccineService.fetchDetailsBySorting(true,"cost").forEach(v -> System.out.println(v));;
		
		vaccineService.fetchDetailsByPaging();
	}

}
