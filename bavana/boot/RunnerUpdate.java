package com.xworkz.preprstmt.app.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.preprstmt.app.dto.XworkzDTO;

public class RunnerUpdate {
public static void main(String[] args) {
	
	XworkzDTO xworkzDTO=new XworkzDTO(1,"be","bavanaxworkz","mangaluru",1234);

	
	try {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded successfully");
		

		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bavana","root","Xworkzodc@123");
		System.out.println("----");
		
		String query="Update xworkz set location='belagavi' where id=1";
		
		PreparedStatement statement=connection.prepareStatement(query); 
		
		statement.setInt(1,xworkzDTO.getId());
		statement.setString(2,xworkzDTO.getQualification());
		statement.setString(3,xworkzDTO.getEmail());
		statement.setString(4,xworkzDTO.getLocation());
		statement.setInt(5,xworkzDTO.getContact_no());
		
		int i =statement.executeUpdate();
		if (i !=0) {
			System.out.println("update is done");
		} else {
			System.out.println("update is not done");

			
		}

	} catch (Exception e) {
		// TODO: handle exception
	}
	

}
}
