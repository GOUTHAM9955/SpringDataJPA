package com.launch.springDataJpa.SpringDataJpaLauncher1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.launch.springDataJpa.SpringDataJpaLauncher1.service.VaccineService;

import ch.qos.logback.core.net.SyslogOutputStream;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@SpringBootApplication

/*
 * In this project we are going to explore JpaRepository
 * 
 * JpaRepository extends ListCrudRepository and ListSortingAndPagingRpository whose return type is List
 * It has methods of both CurdRepository 
 * It has findAll(Sort) mehod from SortingAndPagingRepository not findAll(Paging) method
 * Few methods such as findAll() expects Example object as parameter
 * 		This helps in dynamic querying. We can create an Example object like Page object
 * 		Example<Type> example = Example.of(Type);	
 * 
 * >>Coming to delete operation, JpaRepository has few more methods which deletes by batch(single query will get generated)
 * 	>>deleteAllByIdInBatch() method will delete all the id's from the table 
 *    if any Id isn't tere it will skip it but won't through an error
 *   >>This will create a single query unlike in CurdRepository delete methods
 *   	 it will create multiple queries in background 
 *   
 * Lets start the journey of CUSTOM FINDER methods where we want to create our own customised methods and spring will give it's implementation.  
 *  The basic syntax of custom finder methods is
 *  	//fingBy+propertyName+keyword
 *  	There are multiple keywords for custom finder methods like "and","or", "between" etc..
 *  
 *  STATIC and DYNAMIC PROJECTS
 *  	Static and Dynamic projects are used to retrieve only desired columns from the DB rows
 *  	Static Projects:
 *  		
 *   In this project we created a new Interface called IStaticVaccineResult and created abstract get methods for the attributes which we want to print
 *   	>> In repo class extending JpaRepository  we created a method using the above syntax findyBy+cost+LessThan => findBycostLessThan for which SpringDataJpa gave implementation
 *      >> The methods reference type is of IStaticVaccineResult and using this we created a method fidByCost in service layed and autowired IVaccineRepo interface
 *   
 *   This is static projection where we are using defining how many attributes we want to retrive in an interface 
 *
 *      		
 */

public class SpringDataJpaLauncher1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringDataJpaLauncher1Application.class, args);
		VaccineService vaccineService = context.getBean(VaccineService.class);
		vaccineService.findByCost(130.0).forEach(v ->  System.out.println(v.getVaccine()));
		
		
		
	}

}
