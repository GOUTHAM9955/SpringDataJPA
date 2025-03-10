package com.launch.SpringJDBCLauncher2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.launch.SpringJDBCLauncher2.model.Details;

@Repository("dao")
public class DetailsImplementationDao implements InterfaceDetailsDao{
	
	@Autowired
	private DataSource dataSource;
	private String SQL_QUERY = "SELECT * FROM details";
	
	private List<Details> details = new ArrayList<>();
	
	@Override
	public List<Details> getMydetailsInfo() {
		try {
			System.out.println("Data source implementation class name :" +dataSource.getClass().getName());
			Connection connection = dataSource.getConnection();
			System.out.println("Connection name from Hikari CP" +connection.getClass().getName());
			PreparedStatement psmt = connection.prepareStatement(SQL_QUERY);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				Details detail = new Details();
				detail.setName(rs.getString(1));
				detail.setEmail(rs.getString(2));
				detail.setNumber(rs.getInt(3));
				details.add(detail);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return details;
	}

}
