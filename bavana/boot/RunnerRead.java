package com.xworkz.preprstmt.app.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.preprstmt.app.dto.XworkzDTO;

public class RunnerRead {

	public static void main(String[] args) {
		
		XworkzDTO xworkzDTO=new XworkzDTO(1,"be","bavanaxworkz","mangaluru",1234);
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully");
			

			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bavana","root","Xworkzodc@123");
			System.out.println("----");
			
			String query="select * from xworkz";
			
			PreparedStatement statement=connection.prepareStatement(query); 
			
			statement.setInt(1,xworkzDTO.getId());
			statement.setString(2,xworkzDTO.getQualification());
			statement.setString(3,xworkzDTO.getEmail());
			statement.setString(4,xworkzDTO.getLocation());
			statement.setInt(5,xworkzDTO.getContact_no());
			
			ResultSet result=statement.executeUpdate();
			while (result.next()) {
				
				System.out.println(result.getId(1)+" "+result.getQualification(2)+" "+
						result.getEmail(3)+" "+result.getLocation(4)+" "+result.getContact_no(5));
			}
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
}
