package com.launch.springDataJpa.SpringDataJpaLauncher1.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.launch.springDataJpa.SpringDataJpaLauncher1.entity.Vaccine;

import jakarta.transaction.Transactional;


public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	/* 
	 * 
	 *In the below code we need not use @Param annotation as it comany in query mathes with parametername company
	@Query("FROM Vaccine WHERE companyName=:company")
	public List<Vaccine> searchByVaccineCompany(String company);
	*/
	
	// Use of @Parm 
	@Query("FROM Vaccine WHERE companyName=:companyName")
	public List<Vaccine> searchByVaccineCompany(@Param("companyName")String company);
	
	//Passing multiple company names and retrieve only desired columns 
	@Query("SELECT vaccine, companyName FROM Vaccine WHERE companyName IN(:company1, :company2)")
	public List<String> searchByVaccineCompanys(String company1, String company2);
	
	@Query("FROM Vaccine where cost BETWEEN :price1 AND :price2")
	public List<Vaccine> searchByCost(Double price1, Double price2);
	
	
	/*
	 * We are using NativeSql in this example to insert values
	 * While inserting using NativeSql we have to add an one mpore parameter
	 * 		Single we are passing multiple values in parameters, we have to name it unlike the above(value for SQL query)
	 *
	 */
	
	/*
	 * For any non select operation it's mandatory to use two annotations
	 * 	@Modification:
	 * 		Tells Spring Data JPA that the query modifies data instead of just reading it.
	 * 		Without it, Spring will assume the query is a SELECT, leading to an error
	 * 		Ensures the return type can be an integer (number of affected rows)
	 * 
	 * 	@Transactional:
	 * 		If an operation fails, it rolls back all changes.
	 * Reduces unnecessary commit/rollback operations.
	 */	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO vaccine(id,vaccine,company_name,cost) VALUES (?,?,?,?)",nativeQuery = true)
	public int insertValues(int id,String vaccine, String company_name, Double cost);
	
	
	
	@Transactional
	@Modifying
	@Query("UPDATE Vaccine SET cost=:price WHERE vaccine=:vaccineName")
	public int updateVaccinePrice(String vaccineName, Double price);
	
	
	
	@Transactional
	@Modifying
	@Query("DELETE Vaccine WHERE cost BETWEEN :price1 AND :price2")
	public int deleteVaccineByPriceRange(Double price1, Double price2);

}
