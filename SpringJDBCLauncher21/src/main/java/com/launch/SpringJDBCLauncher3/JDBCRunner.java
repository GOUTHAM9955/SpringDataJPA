package com.launch.SpringJDBCLauncher3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.launch.SpringJDBCLauncher3.dao.Details;
import com.launch.SpringJDBCLauncher3.dao.SpringDataJDBC;

@Component
public class JDBCRunner implements CommandLineRunner {
	
	@Autowired
	SpringDataJDBC jdbc;

	@Override
	public void run(String... args) throws Exception {
		jdbc.input(new Details("GK","GK@Gmail.com",711));

	}

}
