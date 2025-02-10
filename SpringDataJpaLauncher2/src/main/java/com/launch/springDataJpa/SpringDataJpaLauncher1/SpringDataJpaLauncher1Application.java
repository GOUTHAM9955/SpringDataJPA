package com.launch.springDataJpa.SpringDataJpaLauncher1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@SpringBootApplication

/*
 * In this project we are going to develop vaccine application which has both service and Repository layer
 * 
 * Points to note:
 * 	>> We used @GeneratedValue(strategy = GenerationType.AUTO) for auto genreation of primary key ID. GenetationType.Auto works with any DB
 * 
 * 	>> We didn't use Id field in constructor as it is auto incremented
 * 
 *  >> To register multiple vaccines we used Iterable which is parent of all the collections
 *  
 *  >> If the method from crudrepository has to return multiple objects it returns of type Iterable 
 *  >> We have following methods in CurdRepository for following operations
 *  	1) save -> To save an entity object in DB
 *  	2) saveAll -> To save multiple objects at a time passed as collection object 
 *  	3) count -> To get number of records in DB 
 *  	4) existsById -> To check if that Id exists in DB
 *  	5) findAll -> To get all the data from that table 
 *      6) findAllById -> We can pass multiple id's and get the rows associated
 *      7) findById -> Returns row with Id (Returns Optional Object of type Entity)
 *      	For Optional object to check if object is present >> optional.isPresent()
 *      	If value is present, to retrieve the object present in it >> optional.get()
 *      8) Usually to delete a record by Id we can get optional object and check if record is there by findById method and delete it
 *      		or get boolean from existsById and delete if the recors exists 
 */

public class SpringDataJpaLauncher1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaLauncher1Application.class, args);
	}

}
