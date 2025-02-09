package com.launch.SpringJDBCLauncher3.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("repo")
public class SpringDataJDBC {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static final String SQL_QUERY ="INSERT INTO DETAILS(name, email, number) VALUES (? , ?, ?)";
	
	public void input(Details detail) {
		jdbcTemplate.update(SQL_QUERY, detail.getName(),detail.getEmail(),detail.getNumber());
	}
}
