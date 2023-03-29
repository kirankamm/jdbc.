package com.xworkz.cricket.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.cricket.app.dto.CricketDTO;

public class CricketRepositoryIMPL implements CricketRepository {

	String query;  //Direct go to the string
	
     public CricketRepositoryIMPL() {
		// TODO Auto-generated constructor stub
	System.out.println("CricketRepositoryIMPL");
		
	}
	
     public CricketRepositoryIMPL(String query) {
 		// TODO Auto-generated constructor stub
     this.query=query;
 		
 	}
     
     {
    	 System.out.println("repository impl");
     }
	
	
	@Override
	public boolean onSave(CricketDTO dto) {
		// TODO Auto-generated method stub
		
		try {
			
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded successfully");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","Xworkzodc@123");
		System.out.println("----");
		
		String query="insert into ipl values(?,?,?,?,?)";

		PreparedStatement statement=connection.prepareStatement(query); 
		

		
		statement.setInt(1,dto.getId());

		statement.setInt(2,dto.getTeams());
		statement.setInt(3,dto.getPlayers());
		
		statement.setString(4,dto.getFev_team());
		statement.setString(5,dto.getFev_flayer());
		statement.setInt(6,dto.getStart_month());
		statement.setInt(7,dto.getEnd_month());
		statement.setString(8,dto.getFev_ground());
		
		int i=statement.executeUpdate();
		
		if(i!=0) {
			
			System.out.println("data is Save");
		}
		else {
			System.out.println("data not save");
		}
		/* System.out.println("this is onSave"); */
			
	 
		} catch (Exception e) {
			// TODO: handle exception
		
			System.out.println("classNotFoundExcetpion");
		
		}
		return true;
	}
	
}
