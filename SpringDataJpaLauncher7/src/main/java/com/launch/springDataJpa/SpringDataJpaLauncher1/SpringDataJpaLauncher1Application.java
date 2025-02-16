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
 * Custom finder methods are only for select queries for non select operations we have Custom Query option in DataJPA
 * 		We can write queries by implementation of
 * 			1) JPQL(One of the implementation id HQL)
 * 				JPQL uses Entity Classe and propery names
 * 			2) NativeSql Query	
 * 				It uses Table name and column names
 * 		
 * 		When we are retriving entire row from a table we need not write select in case of HQL. But if we are selecing fields then we need to start HQL with >>select field1, field2.....
 *    
 *    In Repository Interface check for custom queries check how we are using @Param annotation when the parameter name doesn't match with name in query
 *    
 *    
 *    GO AND CHECK IT (IVaccineRepo)
 *    Also implemented multiple use cases like to pass multiple values at a time, use Between key word, inserting objects etc... GO AND CHECK IT
 */

public class SpringDataJpaLauncher1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringDataJpaLauncher1Application.class, args);	

		VaccineService vaccineService = context.getBean(VaccineService.class);
		
		// Get list of vaccine by company name
		vaccineService.searchByVaccineCompany("Divi").forEach(v-> System.out.println(v));
		
		
		// Get vaccine name and vaccine company for list of given vaccine company names
		vaccineService.searchByVaccineCompanys("Reddy's", "Divi").forEach(v-> System.out.println(v));
		
		//Get vaccines which lie between cost 
		vaccineService.searchByCost(100.0, 2000.0).forEach(v-> System.out.println(v));
		
		
		//Insert values using Native_SQL(See implementation)
		int rows_effected = vaccineService.insertValues(5,"dhe1","OUT",121.3);
		
		if (rows_effected !=0){
			System.out.println("Inserted sucessfully");
		}
		
		else System.out.println("Insertion Failed");
		
		
		// Update cost of a vaccine
		rows_effected = vaccineService.updateVaccinePrice("pqr1", 124.4);
		if (rows_effected !=0){
			System.out.println("Updated sucessfully");
		}
		
		else System.out.println("Update Failed");
		
		//Delete vaccines between price range
		rows_effected = vaccineService.deleteVaccineByPriceRange(123.0,124.0);
		
		if (rows_effected !=0){
			System.out.println("Deleted sucessfully");
		}
		
		else System.out.println("Deletion Failed");
		
	}
	

}
