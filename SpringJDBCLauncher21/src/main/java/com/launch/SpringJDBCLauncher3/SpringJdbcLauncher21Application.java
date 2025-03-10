package com.launch.SpringJDBCLauncher3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/*
 * In this project we are going to implement small Spring Data JDBC concept using in memory H2 Database
 * 
 *  
 * Using Spring Boot we can set an in memory Database called H2 Database . While downloading the project we have to add the following dependencies
 * 	1) H2 Database
 * 	2) Spring Web (Since we acces it through console we have to add it)
 *  3) Spring Data JDBC
 * 	
 *    We have to specify the port on which the web server(Tomcat embeded server will be there by default) has to run
 *    	 and enable h2 console in application properties file
 * 		
 *    Set datasource url (jdbc:h2:mem:details) since it is embeded DB we use "mem" and details is the DB name 
 * 
 * URL To access H2 DB console:  http://localhost:8485/h2-console
 * 
 * We are going to use The JdbcTemplate class in Spring Framework is a core component that simplifies working with relational databases 
 * 	using JDBC (Java Database Connectivity). It handles the boilerplate code for managing database resources such as connections, statements, and result sets, 
 * 		allowing developers to focus on the SQL queries and data processing.
 * 
 * We are using sql Editor(From Eclipse Market Place) to create a .sql file for table creation in h2-db by creating schema in application properties
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
		 * We implemented runner class(JDBCRunner) which implements CommandLineRunner 
		 * 		>> When the run() method of SpringApplication it will execute the class which implements CommandLineRunner
		 * 		>> And in that class, the run method will get execcuted first and we don't need to call it explicitly
		 */
		
		//SpringDataJDBC jdbc = container.getBean(SpringDataJDBC.class);
		
		//jdbc.input(new Details("GK","GK@Gmail.com",711));
		
	}

}
