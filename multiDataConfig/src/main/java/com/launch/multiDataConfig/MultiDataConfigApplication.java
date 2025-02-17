package com.launch.multiDataConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//REVIST AFTER RESTAPI IS FINISHED 

/*
 * In this project we are going to see how we can connect to multiple DB's at a time
 * 		Dependencies for this project: SpringBoot Web, Dev Tools, DataJpa, PostGreSql, mysql driver
 * 
 * As multiple db's configured using same key in application.properties file, we have to configure it through Java code
 * 
 *  
 */
@SpringBootApplication
public class MultiDataConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiDataConfigApplication.class, args);
	}

}
