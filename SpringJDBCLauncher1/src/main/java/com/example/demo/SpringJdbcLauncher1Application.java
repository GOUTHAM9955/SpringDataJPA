package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
 * Spring Boot:
	
	Advantages of SpringBoot
		Simplying the build(either Maven/Gradle) using starter pom

		Autoconfiguration:
			-> Component scanning
			-> Intializing IOC Container
			-> Creating connection pooling(Default is Hikari Connection Pool)
			-> We have default embeded server which is tomcat server
			-> We have actuators to know the status of the application to know how many beans are loaded


	Ways to develop spring boot application
		1) Using spring initializer--> start.spring.io
		2) Using STS


	SpringApplication.run() contains logic to start Spring IOC container

	Different classes will be used based on the application(what we specify as dependency ex: boot-stater, boot-starter-web. boot-starter-webflux etc) to genrate an ApplicationContext container

	@SpringBootApplication annotation is equivalent to: component scan + enable auto configuration + configuration
		(right click + open declaration)
		
	All the classes under this primary package will be considered while doing component scanning so for any new package where we want to do component scanning
		it has to be under this hierarchy.
		
	To remove spring banner, we can go to resources-> application.properties
		When we specify anything in application.properties, automatically all the configurations will be loaded by spring
		We can define DB connection, port at which the application is deployed etc..
		The data should be given the form of key- value pair
		# Check the file, we specified spring.main.banner-mode =off and no spring banner is created
		We can create our own banner by creating a text file in resources with that name and loading it using spring.main.banner-mode = banner.txt(zetcode is website to generate text)
		
******************************************************
*
* Spring JDBC: 
* 	In spring Boot we hav e 3 different options to store Data in database
* 		1) JDBC API
* 		2) Spring JDBC
* 		3) Spring DataJPA
* 
* 	In spring JDBC API we have to write all the bolierplate code(loading driver, establishing connection, writing query etc..) that we practised in JDBC
* 	In spring JDBC we use JDBC Template class avoiding all the code which we wrote in JDBC ut we still need to write the queries
* 	If we want to avoid all the above steps including writing queries we use SpringDataJPA which inturn use hibernate
 */

/*
 * All the changable configurations(like DB, ApacheKafka, Redis) are usually written either in application.properties or application.yaml file
 * In application.properties, the values in given in key value pair, in case of SpringJDBC we can find all the properties form spring documentation
 * 
 * 
 */

@SpringBootApplication
public class SpringJdbcLauncher1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcLauncher1Application.class, args);
	}

}
