package com.xworkz.wedding.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xworkz.wedding.app.dto.WeddingDTO;

public class WeddingRepositoryIMPL implements WeddingRepository {

	String query;

	public WeddingRepositoryIMPL() {
		System.out.println(" WeddingRepositoryIMPL");
	}

	public WeddingRepositoryIMPL(String query) {
		this.query = query;
	}

	@Override
	public boolean onSave(WeddingDTO dto) {
		// TODO Auto-generated method stub

		System.out.println("inside update method (onSave(FestivalDTO dto)) ");
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully  (onSave)");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wedding", "root",
					"Xworkzodc@123");
			System.out.println("----");

			
			
			String query = "insert into dinner values(?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getPeoples());

			statement.setInt(2, dto.getMens());
			statement.setInt(3, dto.getWomens());

			statement.setString(4, dto.getLocation());
			statement.setString(5, dto.getSweet_name());

			int i = statement.executeUpdate();

			if (i != 0) {

				System.out.println("data is Save   (onSave(FestivalDTO dto))");
			} else {
				System.out.println("data not save   (onSave(FestivalDTO dto))");
			}
			/* System.out.println("this is onSave"); */

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("    onSave(FestivalDTO dto) ended");

		}
		return true;
	}

	@Override
	public boolean onUpdate(int pepoles) {
		// TODO Auto-generated method stub
		System.out.println("inside  update method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wedding", "root",
					"Xworkzodc@123");

			String query = "update dinner set location='belagavi' where peoples=peoples";
			Statement statement = connection.createStatement();

			int i = statement.executeUpdate(query);

			if (i != 0) {

				System.out.println("updated");
			} else {
				System.out.println("not updated");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean onRead() {
		// TODO Auto-generated method stub
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wedding", "root",
					"Xworkzodc@123");

			String query = "select * from dinner";

			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				System.out.println("peoples =" + resultSet.getInt(1) + "," + "mens =" + resultSet.getInt(2)+"," 
			+ "womens ="+ resultSet.getInt(3)+"," + "location =" + resultSet.getString(4)+","+"sweet_name =" + resultSet.getString(5));

		

			
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		
	}
		return false;

	}
}
