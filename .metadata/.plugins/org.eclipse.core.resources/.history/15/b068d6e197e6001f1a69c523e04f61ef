package com.launch.SpringJDBCLauncher3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/*
 * In this project we are going to implement small Spring Data JDBC concept using in memory H2 Database
 * 		We set the port and enable h2 console in application properties file
 * 		Set datasource url
 * 
 * URL To access H2 DB console:  http://localhost:8485/h2-console
 * 
 * We are going to use The JdbcTemplate class in Spring Framework is a core component that simplifies working with relational databases 
 * 	using JDBC (Java Database Connectivity). It handles the boilerplate code for managing database resources such as connections, statements, and result sets, 
 * 		allowing developers to focus on the SQL queries and data processing.
 * 
 * We are using sql Editor to create table in h2-db by creating schema in application properties
 * 		The name should be schema.sql
 * 
 * ## EXPLORE MORE ON run() METHOD IMPLEMTING CommandLineRunner INTERFACE (watch 2nd slide of 06-07)
 */

import com.launch.SpringJDBCLauncher3.dao.Details;
import com.launch.SpringJDBCLauncher3.dao.SpringDataJDBC;

@SpringBootApplication
public class SpringJdbcLauncher21Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringJdbcLauncher21Application.class, args);
		
		/*
		 * We implemented runner class which implements CommandLineRunner
		 * 		>> When the run() method of SpringApplication it will execute the class which implements CommandLineRunner
		 * 		>> And in that class, the run method will get execcuted first and we don't need to call it explicitly
		 */
		
		//SpringDataJDBC jdbc = container.getBean(SpringDataJDBC.class);
		
		//jdbc.input(new Details("GK","GK@Gmail.com",711));
		
	}

}
