package com.launch.springDataJpa.SpringDataJpaLauncher1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

/*
 * In this project we are going to start using Spring Data JPA 
 * 	>> Spring Data JPA behind the scenes uses Hibernate which is a ORM framework build on top of JDBC
 * 
 * 		Problems we came accross in 
 * 			 In JDBC we have to query SQL code by ourserlves
 * 		     If we have to one DAO class for every single table which we will comeacross in the project
 * 			 We are writing multiple CURD operations again and again to perform DB actions
 * 
 * 	>> To overcome this we have 3 important interfaces. We specify what to implement interface and spring will take care of it
 * 		1) CurdRepository
 * 		2) JpaRepository
 * 		3) Paging AndSortingRepository
 * Repository is the parent class of all the above interfaces
 * 
 *  >> In application properties we are gogin to specify the Database configurations
 *  
 *  >> We create pojo classes and specify that that class is a table in DB using @Entity annotation and set primary keys using @Id 
 * 
 *  >> We create a class in Repository layer which extends CrudRepository which has 10 predefined methods which we can make use of and
 *     spring will write sql queries for us making use of it. This CrudRepository takes entity class and it's primary key data type as parameters
 *  
 *   >> It's better to annotate this interface with @Repository annotation
 *   
 *   >> We are using save() method from CrudRepository which acts as both update and create method.
 *   
 */

public class SpringDataJpaLauncher1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaLauncher1Application.class, args);
	}

}
